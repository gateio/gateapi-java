package io.gate.apidemo;

import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.api.SpotApi;
import io.gate.gateapi.models.*;

import java.math.BigDecimal;
import java.util.List;

class SpotTest {

    private final RunConfig config;

    SpotTest(RunConfig config) {
        this.config = config;
    }

    public void run() throws ApiException {
        String currencyPair = "GT_USDT";
        String currency = currencyPair.split("_")[1];

        // Initialize API client
        ApiClient client = new ApiClient();
        client.setApiKeySecret(this.config.getApiKey(), this.config.getApiSecret());
        // Setting basePath is optional. It defaults to https://api.gateio.ws/api/v4
        client.setBasePath(this.config.getHostUsed());

        SpotApi spotApi = new SpotApi(client);
        CurrencyPair pair = spotApi.getCurrencyPair(currencyPair);
        System.out.println("testing against currency pair: " + currencyPair);
        String minAmount = pair.getMinQuoteAmount();

        // get last price
        List<Ticker> tickers = spotApi.listTickers().currencyPair(currencyPair).execute();
        assert tickers.size() == 1;
        String lastPrice = tickers.get(0).getLast();
        assert lastPrice != null;

        // make sure balance is enough
        BigDecimal orderAmount = new BigDecimal(minAmount).multiply(new BigDecimal("2"));
        List<SpotAccount> accounts = spotApi.listSpotAccounts().currency(currency).execute();
        assert accounts.size() == 1;
        BigDecimal available = new BigDecimal(accounts.get(0).getAvailable());
        System.out.printf("Account available: %s %s\n", available.toPlainString(), currency);
        if (available.compareTo(orderAmount) < 0) {
            System.err.println("Account balance not enough");
            return;
        }

        // create spot order
        Order order = new Order();
        order.setAccount(Order.AccountEnum.SPOT);
        order.setAutoBorrow(false);
        order.setTimeInForce(Order.TimeInForceEnum.GTC);
        order.setType(Order.TypeEnum.LIMIT);
        order.setAmount(orderAmount.toPlainString());
        order.setPrice(lastPrice);
        order.setSide(Order.SideEnum.BUY);
        order.setCurrencyPair(currencyPair);
        System.out.printf("place a spot %s order in %s with amount %s and price %s\n", order.getSide(), order.getCurrencyPair(),
                          order.getAmount(), order.getPrice());
        Order created = spotApi.createOrder(order);
        System.out.printf("order created with id %s, status %s\n", created.getId(), created.getStatus());
        if (Order.StatusEnum.OPEN.equals(created.getStatus())) {
            Order orderResult = spotApi.getOrder(created.getId(), currencyPair);
            System.out.printf("order %s filled: %s, left: %s\n", orderResult.getId(), orderResult.getFilledTotal(), orderResult.getLeft());

            Order result = spotApi.cancelOrder(orderResult.getId(), currencyPair);
            if (Order.StatusEnum.CANCELLED.equals(result.getStatus())) {
                System.out.println("order " + orderResult.getId() + " canceled\n");
            }
        } else {
            // Thread.sleep(5000);
            List<Trade> trades = spotApi.listMyTrades(currencyPair).orderId(created.getId()).execute();
            assert trades.size() > 0;
            for (Trade t : trades) {
                System.out.printf("order %s filled %s with price %s\n", t.getOrderId(), t.getAmount(), t.getPrice());
            }
        }
    }
}

