# gate-api

Gate API v4

- API version: 4.16.1
- SDK version: 5.16.1

APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.

  For more information, please visit [https://www.gate.io/page/contacts](https://www.gate.io/page/contacts)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Versioning

Trying our best to follow the [semantic versioning](https://semver.org/), while enjoying recent features
provided by programming language and libraries, from 4.15.2, one major versioning difference will be
introduced:

If extra code rewrite is required when you upgrade the SDK, such as:

- some outdated programming language version support is dropped
- API method signature has breaking changes.

**the MAJOR version will be incremented, but the MINOR and PATCH version are still following REST API's
instead of resetting to 0**, so that you can recognize it has some breaking changes, but still getting
the idea of from which REST API version the change is introduced.

For example, the previous REST API and SDK version are both 4.14.0. But if we decide to introduce
some breaking changes in SDK along with REST API 4.15.2 upgrade, then the version of next SDK release
will be 5.15.2(the MAJOR version is incremented to denote breaking changes, but the MINOR and PATCH
version are identical to REST API's instead of resetting them to 0)

If MAJOR version is incremented, make sure you read the release note on
[Releases](https://github.com/gateio/gateapi-java/releases)
page

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.gate</groupId>
    <artifactId>gate-api</artifactId>
    <version>5.16.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.gate:gate-api:5.16.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/gate-api-5.16.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:


```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        try {
            List<DeliveryContract> result = apiInstance.listDeliveryContracts(settle);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryContracts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

For a more complete API usage example, refer to the demo application in [example](example) directory

## Documentation for API Endpoints

All URIs are relative to *https://api.gateio.ws/api/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DeliveryApi* | [**listDeliveryContracts**](docs/DeliveryApi.md#listDeliveryContracts) | **GET** /delivery/{settle}/contracts | List all futures contracts
*DeliveryApi* | [**getDeliveryContract**](docs/DeliveryApi.md#getDeliveryContract) | **GET** /delivery/{settle}/contracts/{contract} | Get a single contract
*DeliveryApi* | [**listDeliveryOrderBook**](docs/DeliveryApi.md#listDeliveryOrderBook) | **GET** /delivery/{settle}/order_book | Futures order book
*DeliveryApi* | [**listDeliveryTrades**](docs/DeliveryApi.md#listDeliveryTrades) | **GET** /delivery/{settle}/trades | Futures trading history
*DeliveryApi* | [**listDeliveryCandlesticks**](docs/DeliveryApi.md#listDeliveryCandlesticks) | **GET** /delivery/{settle}/candlesticks | Get futures candlesticks
*DeliveryApi* | [**listDeliveryTickers**](docs/DeliveryApi.md#listDeliveryTickers) | **GET** /delivery/{settle}/tickers | List futures tickers
*DeliveryApi* | [**listDeliveryInsuranceLedger**](docs/DeliveryApi.md#listDeliveryInsuranceLedger) | **GET** /delivery/{settle}/insurance | Futures insurance balance history
*DeliveryApi* | [**listDeliveryAccounts**](docs/DeliveryApi.md#listDeliveryAccounts) | **GET** /delivery/{settle}/accounts | Query futures account
*DeliveryApi* | [**listDeliveryAccountBook**](docs/DeliveryApi.md#listDeliveryAccountBook) | **GET** /delivery/{settle}/account_book | Query account book
*DeliveryApi* | [**listDeliveryPositions**](docs/DeliveryApi.md#listDeliveryPositions) | **GET** /delivery/{settle}/positions | List all positions of a user
*DeliveryApi* | [**getDeliveryPosition**](docs/DeliveryApi.md#getDeliveryPosition) | **GET** /delivery/{settle}/positions/{contract} | Get single position
*DeliveryApi* | [**updateDeliveryPositionMargin**](docs/DeliveryApi.md#updateDeliveryPositionMargin) | **POST** /delivery/{settle}/positions/{contract}/margin | Update position margin
*DeliveryApi* | [**updateDeliveryPositionLeverage**](docs/DeliveryApi.md#updateDeliveryPositionLeverage) | **POST** /delivery/{settle}/positions/{contract}/leverage | Update position leverage
*DeliveryApi* | [**updateDeliveryPositionRiskLimit**](docs/DeliveryApi.md#updateDeliveryPositionRiskLimit) | **POST** /delivery/{settle}/positions/{contract}/risk_limit | Update position risk limit
*DeliveryApi* | [**listDeliveryOrders**](docs/DeliveryApi.md#listDeliveryOrders) | **GET** /delivery/{settle}/orders | List futures orders
*DeliveryApi* | [**createDeliveryOrder**](docs/DeliveryApi.md#createDeliveryOrder) | **POST** /delivery/{settle}/orders | Create a futures order
*DeliveryApi* | [**cancelDeliveryOrders**](docs/DeliveryApi.md#cancelDeliveryOrders) | **DELETE** /delivery/{settle}/orders | Cancel all &#x60;open&#x60; orders matched
*DeliveryApi* | [**getDeliveryOrder**](docs/DeliveryApi.md#getDeliveryOrder) | **GET** /delivery/{settle}/orders/{order_id} | Get a single order
*DeliveryApi* | [**cancelDeliveryOrder**](docs/DeliveryApi.md#cancelDeliveryOrder) | **DELETE** /delivery/{settle}/orders/{order_id} | Cancel a single order
*DeliveryApi* | [**getMyDeliveryTrades**](docs/DeliveryApi.md#getMyDeliveryTrades) | **GET** /delivery/{settle}/my_trades | List personal trading history
*DeliveryApi* | [**listDeliveryPositionClose**](docs/DeliveryApi.md#listDeliveryPositionClose) | **GET** /delivery/{settle}/position_close | List position close history
*DeliveryApi* | [**listDeliveryLiquidates**](docs/DeliveryApi.md#listDeliveryLiquidates) | **GET** /delivery/{settle}/liquidates | List liquidation history
*DeliveryApi* | [**listDeliverySettlements**](docs/DeliveryApi.md#listDeliverySettlements) | **GET** /delivery/{settle}/settlements | List settlement history
*DeliveryApi* | [**listPriceTriggeredDeliveryOrders**](docs/DeliveryApi.md#listPriceTriggeredDeliveryOrders) | **GET** /delivery/{settle}/price_orders | List all auto orders
*DeliveryApi* | [**createPriceTriggeredDeliveryOrder**](docs/DeliveryApi.md#createPriceTriggeredDeliveryOrder) | **POST** /delivery/{settle}/price_orders | Create a price-triggered order
*DeliveryApi* | [**cancelPriceTriggeredDeliveryOrderList**](docs/DeliveryApi.md#cancelPriceTriggeredDeliveryOrderList) | **DELETE** /delivery/{settle}/price_orders | Cancel all open orders
*DeliveryApi* | [**getPriceTriggeredDeliveryOrder**](docs/DeliveryApi.md#getPriceTriggeredDeliveryOrder) | **GET** /delivery/{settle}/price_orders/{order_id} | Get a single order
*DeliveryApi* | [**cancelPriceTriggeredDeliveryOrder**](docs/DeliveryApi.md#cancelPriceTriggeredDeliveryOrder) | **DELETE** /delivery/{settle}/price_orders/{order_id} | Cancel a single order
*FuturesApi* | [**listFuturesContracts**](docs/FuturesApi.md#listFuturesContracts) | **GET** /futures/{settle}/contracts | List all futures contracts
*FuturesApi* | [**getFuturesContract**](docs/FuturesApi.md#getFuturesContract) | **GET** /futures/{settle}/contracts/{contract} | Get a single contract
*FuturesApi* | [**listFuturesOrderBook**](docs/FuturesApi.md#listFuturesOrderBook) | **GET** /futures/{settle}/order_book | Futures order book
*FuturesApi* | [**listFuturesTrades**](docs/FuturesApi.md#listFuturesTrades) | **GET** /futures/{settle}/trades | Futures trading history
*FuturesApi* | [**listFuturesCandlesticks**](docs/FuturesApi.md#listFuturesCandlesticks) | **GET** /futures/{settle}/candlesticks | Get futures candlesticks
*FuturesApi* | [**listFuturesTickers**](docs/FuturesApi.md#listFuturesTickers) | **GET** /futures/{settle}/tickers | List futures tickers
*FuturesApi* | [**listFuturesFundingRateHistory**](docs/FuturesApi.md#listFuturesFundingRateHistory) | **GET** /futures/{settle}/funding_rate | Funding rate history
*FuturesApi* | [**listFuturesInsuranceLedger**](docs/FuturesApi.md#listFuturesInsuranceLedger) | **GET** /futures/{settle}/insurance | Futures insurance balance history
*FuturesApi* | [**listContractStats**](docs/FuturesApi.md#listContractStats) | **GET** /futures/{settle}/contract_stats | Futures stats
*FuturesApi* | [**listLiquidatedOrders**](docs/FuturesApi.md#listLiquidatedOrders) | **GET** /futures/{settle}/liq_orders | Retrieve liquidation history
*FuturesApi* | [**listFuturesAccounts**](docs/FuturesApi.md#listFuturesAccounts) | **GET** /futures/{settle}/accounts | Query futures account
*FuturesApi* | [**listFuturesAccountBook**](docs/FuturesApi.md#listFuturesAccountBook) | **GET** /futures/{settle}/account_book | Query account book
*FuturesApi* | [**listPositions**](docs/FuturesApi.md#listPositions) | **GET** /futures/{settle}/positions | List all positions of a user
*FuturesApi* | [**getPosition**](docs/FuturesApi.md#getPosition) | **GET** /futures/{settle}/positions/{contract} | Get single position
*FuturesApi* | [**updatePositionMargin**](docs/FuturesApi.md#updatePositionMargin) | **POST** /futures/{settle}/positions/{contract}/margin | Update position margin
*FuturesApi* | [**updatePositionLeverage**](docs/FuturesApi.md#updatePositionLeverage) | **POST** /futures/{settle}/positions/{contract}/leverage | Update position leverage
*FuturesApi* | [**updatePositionRiskLimit**](docs/FuturesApi.md#updatePositionRiskLimit) | **POST** /futures/{settle}/positions/{contract}/risk_limit | Update position risk limit
*FuturesApi* | [**setDualMode**](docs/FuturesApi.md#setDualMode) | **POST** /futures/{settle}/dual_mode | Enable or disable dual mode
*FuturesApi* | [**getDualModePosition**](docs/FuturesApi.md#getDualModePosition) | **GET** /futures/{settle}/dual_comp/positions/{contract} | Retrieve position detail in dual mode
*FuturesApi* | [**updateDualModePositionMargin**](docs/FuturesApi.md#updateDualModePositionMargin) | **POST** /futures/{settle}/dual_comp/positions/{contract}/margin | Update position margin in dual mode
*FuturesApi* | [**updateDualModePositionLeverage**](docs/FuturesApi.md#updateDualModePositionLeverage) | **POST** /futures/{settle}/dual_comp/positions/{contract}/leverage | Update position leverage in dual mode
*FuturesApi* | [**updateDualModePositionRiskLimit**](docs/FuturesApi.md#updateDualModePositionRiskLimit) | **POST** /futures/{settle}/dual_comp/positions/{contract}/risk_limit | Update position risk limit in dual mode
*FuturesApi* | [**listFuturesOrders**](docs/FuturesApi.md#listFuturesOrders) | **GET** /futures/{settle}/orders | List futures orders
*FuturesApi* | [**createFuturesOrder**](docs/FuturesApi.md#createFuturesOrder) | **POST** /futures/{settle}/orders | Create a futures order
*FuturesApi* | [**cancelFuturesOrders**](docs/FuturesApi.md#cancelFuturesOrders) | **DELETE** /futures/{settle}/orders | Cancel all &#x60;open&#x60; orders matched
*FuturesApi* | [**getFuturesOrder**](docs/FuturesApi.md#getFuturesOrder) | **GET** /futures/{settle}/orders/{order_id} | Get a single order
*FuturesApi* | [**cancelFuturesOrder**](docs/FuturesApi.md#cancelFuturesOrder) | **DELETE** /futures/{settle}/orders/{order_id} | Cancel a single order
*FuturesApi* | [**getMyTrades**](docs/FuturesApi.md#getMyTrades) | **GET** /futures/{settle}/my_trades | List personal trading history
*FuturesApi* | [**listPositionClose**](docs/FuturesApi.md#listPositionClose) | **GET** /futures/{settle}/position_close | List position close history
*FuturesApi* | [**listLiquidates**](docs/FuturesApi.md#listLiquidates) | **GET** /futures/{settle}/liquidates | List liquidation history
*FuturesApi* | [**listPriceTriggeredOrders**](docs/FuturesApi.md#listPriceTriggeredOrders) | **GET** /futures/{settle}/price_orders | List all auto orders
*FuturesApi* | [**createPriceTriggeredOrder**](docs/FuturesApi.md#createPriceTriggeredOrder) | **POST** /futures/{settle}/price_orders | Create a price-triggered order
*FuturesApi* | [**cancelPriceTriggeredOrderList**](docs/FuturesApi.md#cancelPriceTriggeredOrderList) | **DELETE** /futures/{settle}/price_orders | Cancel all open orders
*FuturesApi* | [**getPriceTriggeredOrder**](docs/FuturesApi.md#getPriceTriggeredOrder) | **GET** /futures/{settle}/price_orders/{order_id} | Get a single order
*FuturesApi* | [**cancelPriceTriggeredOrder**](docs/FuturesApi.md#cancelPriceTriggeredOrder) | **DELETE** /futures/{settle}/price_orders/{order_id} | Cancel a single order
*MarginApi* | [**listMarginCurrencyPairs**](docs/MarginApi.md#listMarginCurrencyPairs) | **GET** /margin/currency_pairs | List all supported currency pairs supported in margin trading
*MarginApi* | [**getMarginCurrencyPair**](docs/MarginApi.md#getMarginCurrencyPair) | **GET** /margin/currency_pairs/{currency_pair} | Query one single margin currency pair
*MarginApi* | [**listFundingBook**](docs/MarginApi.md#listFundingBook) | **GET** /margin/funding_book | Order book of lending loans
*MarginApi* | [**listMarginAccounts**](docs/MarginApi.md#listMarginAccounts) | **GET** /margin/accounts | Margin account list
*MarginApi* | [**listMarginAccountBook**](docs/MarginApi.md#listMarginAccountBook) | **GET** /margin/account_book | List margin account balance change history
*MarginApi* | [**listFundingAccounts**](docs/MarginApi.md#listFundingAccounts) | **GET** /margin/funding_accounts | Funding account list
*MarginApi* | [**listLoans**](docs/MarginApi.md#listLoans) | **GET** /margin/loans | List all loans
*MarginApi* | [**createLoan**](docs/MarginApi.md#createLoan) | **POST** /margin/loans | Lend or borrow
*MarginApi* | [**mergeLoans**](docs/MarginApi.md#mergeLoans) | **POST** /margin/merged_loans | Merge multiple lending loans
*MarginApi* | [**getLoan**](docs/MarginApi.md#getLoan) | **GET** /margin/loans/{loan_id} | Retrieve one single loan detail
*MarginApi* | [**cancelLoan**](docs/MarginApi.md#cancelLoan) | **DELETE** /margin/loans/{loan_id} | Cancel lending loan
*MarginApi* | [**updateLoan**](docs/MarginApi.md#updateLoan) | **PATCH** /margin/loans/{loan_id} | Modify a loan
*MarginApi* | [**listLoanRepayments**](docs/MarginApi.md#listLoanRepayments) | **GET** /margin/loans/{loan_id}/repayment | List loan repayment records
*MarginApi* | [**repayLoan**](docs/MarginApi.md#repayLoan) | **POST** /margin/loans/{loan_id}/repayment | Repay a loan
*MarginApi* | [**listLoanRecords**](docs/MarginApi.md#listLoanRecords) | **GET** /margin/loan_records | List repayment records of specified loan
*MarginApi* | [**getLoanRecord**](docs/MarginApi.md#getLoanRecord) | **GET** /margin/loan_records/{loan_record_id} | Get one single loan record
*MarginApi* | [**updateLoanRecord**](docs/MarginApi.md#updateLoanRecord) | **PATCH** /margin/loan_records/{loan_record_id} | Modify a loan record
*SpotApi* | [**listCurrencyPairs**](docs/SpotApi.md#listCurrencyPairs) | **GET** /spot/currency_pairs | List all currency pairs supported
*SpotApi* | [**getCurrencyPair**](docs/SpotApi.md#getCurrencyPair) | **GET** /spot/currency_pairs/{currency_pair} | Get detail of one single order
*SpotApi* | [**listTickers**](docs/SpotApi.md#listTickers) | **GET** /spot/tickers | Retrieve ticker information
*SpotApi* | [**listOrderBook**](docs/SpotApi.md#listOrderBook) | **GET** /spot/order_book | Retrieve order book
*SpotApi* | [**listTrades**](docs/SpotApi.md#listTrades) | **GET** /spot/trades | Retrieve market trades
*SpotApi* | [**listCandlesticks**](docs/SpotApi.md#listCandlesticks) | **GET** /spot/candlesticks | Market candlesticks
*SpotApi* | [**getFee**](docs/SpotApi.md#getFee) | **GET** /spot/fee | Query user trading fee rates
*SpotApi* | [**listSpotAccounts**](docs/SpotApi.md#listSpotAccounts) | **GET** /spot/accounts | List spot accounts
*SpotApi* | [**createBatchOrders**](docs/SpotApi.md#createBatchOrders) | **POST** /spot/batch_orders | Create a batch of orders
*SpotApi* | [**listAllOpenOrders**](docs/SpotApi.md#listAllOpenOrders) | **GET** /spot/open_orders | List all open orders
*SpotApi* | [**listOrders**](docs/SpotApi.md#listOrders) | **GET** /spot/orders | List orders
*SpotApi* | [**createOrder**](docs/SpotApi.md#createOrder) | **POST** /spot/orders | Create an order
*SpotApi* | [**cancelOrders**](docs/SpotApi.md#cancelOrders) | **DELETE** /spot/orders | Cancel all &#x60;open&#x60; orders in specified currency pair
*SpotApi* | [**cancelBatchOrders**](docs/SpotApi.md#cancelBatchOrders) | **POST** /spot/cancel_batch_orders | Cancel a batch of orders with an ID list
*SpotApi* | [**getOrder**](docs/SpotApi.md#getOrder) | **GET** /spot/orders/{order_id} | Get a single order
*SpotApi* | [**cancelOrder**](docs/SpotApi.md#cancelOrder) | **DELETE** /spot/orders/{order_id} | Cancel a single order
*SpotApi* | [**listMyTrades**](docs/SpotApi.md#listMyTrades) | **GET** /spot/my_trades | List personal trading history
*WalletApi* | [**getDepositAddress**](docs/WalletApi.md#getDepositAddress) | **GET** /wallet/deposit_address | Generate currency deposit address
*WalletApi* | [**listWithdrawals**](docs/WalletApi.md#listWithdrawals) | **GET** /wallet/withdrawals | Retrieve withdrawal records
*WalletApi* | [**listDeposits**](docs/WalletApi.md#listDeposits) | **GET** /wallet/deposits | Retrieve deposit records
*WalletApi* | [**transfer**](docs/WalletApi.md#transfer) | **POST** /wallet/transfers | Transfer between trading accounts
*WalletApi* | [**listSubAccountTransfers**](docs/WalletApi.md#listSubAccountTransfers) | **GET** /wallet/sub_account_transfers | Transfer records between main and sub accounts
*WalletApi* | [**transferWithSubAccount**](docs/WalletApi.md#transferWithSubAccount) | **POST** /wallet/sub_account_transfers | Transfer between main and sub accounts
*WalletApi* | [**listWithdrawStatus**](docs/WalletApi.md#listWithdrawStatus) | **GET** /wallet/withdraw_status | Retrieve withdrawal status
*WithdrawalApi* | [**withdraw**](docs/WithdrawalApi.md#withdraw) | **POST** /withdrawals | Withdraw


## Documentation for Models

 - [BatchOrder](docs/BatchOrder.md)
 - [CancelOrder](docs/CancelOrder.md)
 - [CancelOrderResult](docs/CancelOrderResult.md)
 - [Contract](docs/Contract.md)
 - [ContractStat](docs/ContractStat.md)
 - [CurrencyPair](docs/CurrencyPair.md)
 - [DeliveryContract](docs/DeliveryContract.md)
 - [DeliverySettlement](docs/DeliverySettlement.md)
 - [DepositAddress](docs/DepositAddress.md)
 - [FundingAccount](docs/FundingAccount.md)
 - [FundingBookItem](docs/FundingBookItem.md)
 - [FundingRateRecord](docs/FundingRateRecord.md)
 - [FuturesAccount](docs/FuturesAccount.md)
 - [FuturesAccountBook](docs/FuturesAccountBook.md)
 - [FuturesCandlestick](docs/FuturesCandlestick.md)
 - [FuturesInitialOrder](docs/FuturesInitialOrder.md)
 - [FuturesLiquidate](docs/FuturesLiquidate.md)
 - [FuturesOrder](docs/FuturesOrder.md)
 - [FuturesOrderBook](docs/FuturesOrderBook.md)
 - [FuturesOrderBookItem](docs/FuturesOrderBookItem.md)
 - [FuturesPriceTrigger](docs/FuturesPriceTrigger.md)
 - [FuturesPriceTriggeredOrder](docs/FuturesPriceTriggeredOrder.md)
 - [FuturesTicker](docs/FuturesTicker.md)
 - [FuturesTrade](docs/FuturesTrade.md)
 - [InsuranceRecord](docs/InsuranceRecord.md)
 - [LedgerRecord](docs/LedgerRecord.md)
 - [Loan](docs/Loan.md)
 - [LoanPatch](docs/LoanPatch.md)
 - [LoanRecord](docs/LoanRecord.md)
 - [MarginAccount](docs/MarginAccount.md)
 - [MarginAccountBook](docs/MarginAccountBook.md)
 - [MarginAccountCurrency](docs/MarginAccountCurrency.md)
 - [MarginCurrencyPair](docs/MarginCurrencyPair.md)
 - [MyFuturesTrade](docs/MyFuturesTrade.md)
 - [OpenOrders](docs/OpenOrders.md)
 - [Order](docs/Order.md)
 - [OrderBook](docs/OrderBook.md)
 - [Position](docs/Position.md)
 - [PositionClose](docs/PositionClose.md)
 - [PositionCloseOrder](docs/PositionCloseOrder.md)
 - [RepayRequest](docs/RepayRequest.md)
 - [Repayment](docs/Repayment.md)
 - [SpotAccount](docs/SpotAccount.md)
 - [SubAccountTransfer](docs/SubAccountTransfer.md)
 - [Ticker](docs/Ticker.md)
 - [Trade](docs/Trade.md)
 - [TradeFee](docs/TradeFee.md)
 - [Transfer](docs/Transfer.md)
 - [TriggerOrderResponse](docs/TriggerOrderResponse.md)
 - [WithdrawStatus](docs/WithdrawStatus.md)


## Documentation for Authorization

Authentication schemes defined for the API:

### apiv4

- **Type**: Gate APIv4

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multi-threaded environment to avoid any potential issues.

## Author

support@mail.gate.io

