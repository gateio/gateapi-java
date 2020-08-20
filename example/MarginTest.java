package io.gate.apidemo;


import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.api.MarginApi;
import io.gate.gateapi.api.SpotApi;
import io.gate.gateapi.api.WalletApi;
import io.gate.gateapi.models.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;

class MarginTest {

    private final RunConfig config;

    MarginTest(RunConfig config) {
        this.config = config;
    }

    public void run() throws ApiException {
        String currencyPair = "BTC_USDT";
        String currency = currencyPair.split("_")[1];

        // Initialize API client
        ApiClient client = new ApiClient();
        client.setApiKeySecret(this.config.getApiKey(), this.config.getApiSecret());
        // Setting basePath is optional. It defaults to https://api.gateio.ws/api/v4
        client.setBasePath(this.config.getHostUsed());

        SpotApi spotApi = new SpotApi(client);
        MarginApi marginApi = new MarginApi(client);
        WalletApi walletApi = new WalletApi(client);

        // Retrieve currency pair last price
        List<Ticker> tickers = spotApi.listTickers().currencyPair(currencyPair).execute();
        assert tickers.size() == 1;
        String lastPrice = tickers.get(0).getLast();
        assert lastPrice != null;
        System.out.printf("Currency pair %s last price: %s\n", currencyPair, lastPrice);

        List<MarginCurrencyPair> pairs = marginApi.listMarginCurrencyPairs();
        MarginCurrencyPair pair = pairs.stream().filter(x -> currencyPair.equals(x.getId())).findFirst().get();
        BigDecimal loanAmount = (pair.getMinQuoteAmount() == null) ? BigDecimal.ZERO : new BigDecimal(pair.getMinQuoteAmount());

        MathContext mc = new MathContext(8, RoundingMode.UP);
        if (pair.getMinBaseAmount() != null) {
            BigDecimal minLoanAmount = new BigDecimal(pair.getMinBaseAmount()).multiply(new BigDecimal(lastPrice), mc);
            if (loanAmount.compareTo(minLoanAmount) < 0) {
                loanAmount = minLoanAmount;
            }
        }
        System.out.printf("minimum loan amount in currency pair %s: %s %s\n", currencyPair, loanAmount.toPlainString(), currency);

        // example to lend
        List<FundingAccount> fundingAccounts = marginApi.listFundingAccounts().currency(currency).execute();
        BigDecimal lendAmount = loanAmount.add(BigDecimal.valueOf(Math.random()), mc);
        if (fundingAccounts.size() == 1 && new BigDecimal(fundingAccounts.get(0).getAvailable()).compareTo(lendAmount) >= 0) {
            // lend with maximum rate
            Loan lendingLoan = new Loan().amount(lendAmount.toPlainString())
                                         .autoRenew(false)
                                         .days(10)
                                         .currency(currency)
                                         .rate("0.002")
                                         .side(Loan.SideEnum.LEND);
            Loan createdLoan = marginApi.createLoan(lendingLoan);
            System.out.printf("Place a lending loan %s with currency %s, rate %s, amount %s\n", createdLoan.getId(),
                              createdLoan.getCurrency(), createdLoan.getRate(), createdLoan.getAmount());
            Loan loanResult = marginApi.getLoan(createdLoan.getId(), Loan.SideEnum.LEND.getValue());
            if (Loan.StatusEnum.LOANED.equals(loanResult.getStatus())) {
                List<LoanRecord> records = marginApi.listLoanRecords(loanResult.getId()).execute();
                for (LoanRecord r : records) {
                    System.out.printf("Loan %s is borrowed with record ID %s, amount %s, current status: %s\n", r.getLoanId(), r.getId(),
                                      r.getAmount(), r.getStatus());
                }
            } else {
                marginApi.cancelLoan(createdLoan.getId(), currency);
                System.out.printf("Lending loan %s is cancelled\n", createdLoan.getId());
            }
        }

        assert pair.getLeverage() != null;
        BigDecimal margin = loanAmount.divide(new BigDecimal(pair.getLeverage() - 1), mc);
        List<MarginAccount> accounts = marginApi.listMarginAccounts().currencyPair(currencyPair).execute();
        assert accounts.size() == 1;
        String available = accounts.get(0).getQuote().getAvailable();
        assert available != null;
        System.out.printf("Available margin balance of currency %s in currency pair %s: %s\n", currency, currencyPair, available);
        if (margin.compareTo(new BigDecimal(available)) > 0) {
            // transfer to margin account
            Transfer transfer = new Transfer();
            transfer.setCurrencyPair(currencyPair);
            transfer.setCurrency(currency);
            transfer.setAmount(margin.subtract(new BigDecimal(available)).toPlainString());
            transfer.setFrom(Transfer.FromEnum.SPOT);
            transfer.setTo(Transfer.ToEnum.MARGIN);
            walletApi.transfer(transfer);
            System.out.printf("Transferred %s %s to margin account\n", transfer.getAmount(), transfer.getCurrency());
        }

        // find minimum rate available
        final BigDecimal minAmount = loanAmount;
        FundingBookItem minRateItem = marginApi.listFundingBook(currency)
                                               .stream()
                                               .filter(x -> x.getRate() != null && minAmount.compareTo(new BigDecimal(x.getAmount())) < 0)
                                               .min(Comparator.comparing(x -> new BigDecimal(x.getRate())))
                                               .get();

        // borrow with minimum loan rate
        BigDecimal borrowAmount = loanAmount.add(BigDecimal.valueOf(Math.random()), mc);
        Loan loan = new Loan();
        loan.side(Loan.SideEnum.BORROW);
        loan.setCurrency(currency);
        loan.setRate(minRateItem.getRate());
        loan.setAmount(borrowAmount.toPlainString());
        loan.setDays(minRateItem.getDays());
        loan.setCurrencyPair(currencyPair);
        Loan borrowed = marginApi.createLoan(loan);
        System.out.printf("Borrowed %s %s in currency pair %s with rate %s, id %s\n", borrowed.getAmount(), borrowed.getCurrency(),
                          borrowed.getCurrencyPair(), borrowed.getRate(), borrowed.getId());
        assert borrowed.getStatus() == Loan.StatusEnum.LOANED;

        // create margin order
        String orderAmount = spotApi.getCurrencyPair(currencyPair).getMinQuoteAmount();
        Order order = new Order();
        order.setAccount(Order.AccountEnum.MARGIN);
        order.setCurrencyPair(currencyPair);
        order.setType(Order.TypeEnum.LIMIT);
        order.setPrice(lastPrice);
        order.setAutoBorrow(false);
        order.setAmount(orderAmount == null ? "1" : orderAmount);
        order.setSide(Order.SideEnum.SELL);
        try {
            Order createdOrder = spotApi.createOrder(order);
            System.out.printf("order created with id %s, status %s\n", createdOrder.getId(), createdOrder.getStatus());
        } catch (GateApiException ex) {
            System.err.printf("failed to create margin order: %s\n", ex);
        }

        RepayRequest repayRequest = new RepayRequest().mode(RepayRequest.ModeEnum.ALL).currency(currency).currencyPair(currencyPair);
        marginApi.repayLoan(borrowed.getId(), repayRequest);
        for (Repayment r : marginApi.listLoanRepayments(borrowed.getId())) {
            System.out.printf("loan %s repaid %s with interest %s\n", borrowed.getId(), r.getPrincipal(), r.getInterest());
        }
    }
}
