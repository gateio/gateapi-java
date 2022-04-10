package io.gate.apidemo;

import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.api.FuturesApi;
import io.gate.gateapi.api.WalletApi;
import io.gate.gateapi.models.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class FutureTest {

    private final RunConfig config;

    public FutureTest(RunConfig config) {
        this.config = config;
    }

    public void run() throws ApiException {
        // if testing against TestNet
        boolean useTestNet = this.config.isUseTest();
        // set test contract
        String settle = "usdt";
        String contract = "BTC_USDT";

        // Initialize API client
        ApiClient client = new ApiClient();
        // Setting basePath is optional. It defaults to https://api.gateio.ws/api/v4
        client.setBasePath(this.config.getHostUsed());
        client.setApiKeySecret(this.config.getApiKey(), this.config.getApiSecret());
        FuturesApi futuresApi = new FuturesApi(client);

        // update position leverage
        String leverage = "3";
        futuresApi.updatePositionLeverage(settle, contract, leverage, "0");

        // retrieve position information
        Long positionSize = 0L;
        try {
            Position position = futuresApi.getPosition(settle, contract);
            positionSize = position.getSize();
            assert positionSize != null;
        } catch (GateApiException e) {
            // ignore no position error
            if (!"POSITION_NOT_FOUND".equals(e.getErrorLabel())) {
                throw e;
            }
        }

        // set order size
        Contract futuresContract = futuresApi.getFuturesContract(settle, contract);
        Long orderSize = 10L;
        if (futuresContract.getOrderSizeMin() != null && futuresContract.getOrderSizeMin() > orderSize) {
            orderSize = futuresContract.getOrderSizeMin();
        }
        if (positionSize < 0) {
            // if short, set size to negative
            orderSize = -orderSize;
        }

        // example to update risk limit
        assert futuresContract.getRiskLimitBase() != null;
        assert futuresContract.getRiskLimitStep() != null;
        String riskLimit = new BigDecimal(futuresContract.getRiskLimitBase()).add(new BigDecimal(futuresContract.getRiskLimitStep()))
                                                                             .toPlainString();
        futuresApi.updatePositionRiskLimit(settle, contract, riskLimit);


        // retrieve last price to calculate margin needed
        List<FuturesTicker> tickers = futuresApi.listFuturesTickers(settle).contract(contract).execute();
        String lastPrice = tickers.get(0).getLast();
        assert lastPrice != null;
        System.out.printf("last price of contract %s: %s\n", contract, lastPrice);
        MathContext mc = new MathContext(8, RoundingMode.UP);
        assert futuresContract.getQuantoMultiplier() != null;
        BigDecimal margin = new BigDecimal(orderSize).multiply(new BigDecimal(lastPrice), mc)
                                                     .multiply(new BigDecimal(futuresContract.getQuantoMultiplier()), mc)
                                                     .divide(new BigDecimal(leverage), mc)
                                                     .multiply(new BigDecimal("1.1"));
        System.out.printf("needs margin amount: %s\n", margin.toPlainString());

        // if balance not enough, transfer from spot account
        String available = "0";
        try {
            FuturesAccount futuresAccounts = futuresApi.listFuturesAccounts(settle);
            available = futuresAccounts.getAvailable();
            assert available != null;
        } catch (GateApiException e) {
            if (!"USER_NOT_FOUND".equals(e.getErrorLabel())) {
                throw e;
            }
        }
        System.out.printf("Futures account available %s %s\n", available, settle.toUpperCase());
        if (new BigDecimal(available).compareTo(margin) < 0) {
            if (useTestNet) {
                System.err.println("TestNet account balance not enough, make a transferal on web");
                return;
            }
            // make sure balance is enough
            Transfer transfer = new Transfer().amount(margin.toPlainString())
                                              .currency(settle.toUpperCase())
                                              .from(Transfer.FromEnum.SPOT)
                                              .to(Transfer.ToEnum.FUTURES)
                                              .settle(settle);
            WalletApi walletApi = new WalletApi(client);
            walletApi.transfer(transfer);
        }

        // example to cancel all open orders in contract
        futuresApi.cancelFuturesOrders(settle, contract, "");

        // order using market price
        FuturesOrder futuresOrder = new FuturesOrder();
        futuresOrder.setContract(contract);
        futuresOrder.setSize(orderSize);
        futuresOrder.setPrice("0");
        futuresOrder.setTif(FuturesOrder.TifEnum.IOC);
        FuturesOrder orderResponse;
        try {
            orderResponse = futuresApi.createFuturesOrder(settle, futuresOrder);
        } catch (GateApiException e) {
            System.err.printf("error encountered creating futures order: %s\n", e);
            return;
        }
        assert orderResponse.getId() != null;
        System.out.printf("Order %s created with status: %s\n", orderResponse.getId(), orderResponse.getStatus());

        if (orderResponse.getStatus() == FuturesOrder.StatusEnum.OPEN) {
            FuturesOrder order = futuresApi.getFuturesOrder(settle, orderResponse.getId().toString());
            assert order.getId() != null;
            System.out.printf("Order %s status %s, total size %d, left %s\n", order.getId(), order.getStatus(), order.getSize(),
                              order.getLeft());
            futuresApi.cancelFuturesOrder(settle, order.getId().toString());
            System.out.printf("Order %d cancelled\n", order.getId());
        } else if (orderResponse.getStatus() == FuturesOrder.StatusEnum.FINISHED) {
            List<MyFuturesTrade> orderTrades = futuresApi.getMyTrades(settle).contract(contract).order(orderResponse.getId()).execute();
            assert orderTrades.size() > 0;
            long tradeSize = 0L;
            for (MyFuturesTrade t : orderTrades) {
                assert t.getOrderId() != null && t.getOrderId().equals(orderResponse.getId().toString());
                assert t.getSize() != null;
                tradeSize += t.getSize();
                System.out.printf("Order %s filled size %s with price %s\n", t.getOrderId(), t.getSize(), t.getPrice());
            }
            assert tradeSize == orderSize;

            // example to update position margin
            String change = "0.01";
            futuresApi.updatePositionMargin(settle, contract, change);
        }
    }
}