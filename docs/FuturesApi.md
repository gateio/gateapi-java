# FuturesApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFuturesContracts**](FuturesApi.md#listFuturesContracts) | **GET** /futures/{settle}/contracts | List all futures contracts
[**getFuturesContract**](FuturesApi.md#getFuturesContract) | **GET** /futures/{settle}/contracts/{contract} | Get a single contract
[**listFuturesOrderBook**](FuturesApi.md#listFuturesOrderBook) | **GET** /futures/{settle}/order_book | Futures order book
[**listFuturesTrades**](FuturesApi.md#listFuturesTrades) | **GET** /futures/{settle}/trades | Futures trading history
[**listFuturesCandlesticks**](FuturesApi.md#listFuturesCandlesticks) | **GET** /futures/{settle}/candlesticks | Get futures candlesticks
[**listFuturesPremiumIndex**](FuturesApi.md#listFuturesPremiumIndex) | **GET** /futures/{settle}/premium_index | Premium Index K-Line
[**listFuturesTickers**](FuturesApi.md#listFuturesTickers) | **GET** /futures/{settle}/tickers | List futures tickers
[**listFuturesFundingRateHistory**](FuturesApi.md#listFuturesFundingRateHistory) | **GET** /futures/{settle}/funding_rate | Funding rate history
[**listFuturesInsuranceLedger**](FuturesApi.md#listFuturesInsuranceLedger) | **GET** /futures/{settle}/insurance | Futures insurance balance history
[**listContractStats**](FuturesApi.md#listContractStats) | **GET** /futures/{settle}/contract_stats | Futures stats
[**getIndexConstituents**](FuturesApi.md#getIndexConstituents) | **GET** /futures/{settle}/index_constituents/{index} | Get index constituents
[**listLiquidatedOrders**](FuturesApi.md#listLiquidatedOrders) | **GET** /futures/{settle}/liq_orders | Retrieve liquidation history
[**listFuturesAccounts**](FuturesApi.md#listFuturesAccounts) | **GET** /futures/{settle}/accounts | Query futures account
[**listFuturesAccountBook**](FuturesApi.md#listFuturesAccountBook) | **GET** /futures/{settle}/account_book | Query account book
[**listPositions**](FuturesApi.md#listPositions) | **GET** /futures/{settle}/positions | List all positions of a user
[**getPosition**](FuturesApi.md#getPosition) | **GET** /futures/{settle}/positions/{contract} | Get single position
[**updatePositionMargin**](FuturesApi.md#updatePositionMargin) | **POST** /futures/{settle}/positions/{contract}/margin | Update position margin
[**updatePositionLeverage**](FuturesApi.md#updatePositionLeverage) | **POST** /futures/{settle}/positions/{contract}/leverage | Update position leverage
[**updatePositionRiskLimit**](FuturesApi.md#updatePositionRiskLimit) | **POST** /futures/{settle}/positions/{contract}/risk_limit | Update position risk limit
[**setDualMode**](FuturesApi.md#setDualMode) | **POST** /futures/{settle}/dual_mode | Enable or disable dual mode
[**getDualModePosition**](FuturesApi.md#getDualModePosition) | **GET** /futures/{settle}/dual_comp/positions/{contract} | Retrieve position detail in dual mode
[**updateDualModePositionMargin**](FuturesApi.md#updateDualModePositionMargin) | **POST** /futures/{settle}/dual_comp/positions/{contract}/margin | Update position margin in dual mode
[**updateDualModePositionLeverage**](FuturesApi.md#updateDualModePositionLeverage) | **POST** /futures/{settle}/dual_comp/positions/{contract}/leverage | Update position leverage in dual mode
[**updateDualModePositionRiskLimit**](FuturesApi.md#updateDualModePositionRiskLimit) | **POST** /futures/{settle}/dual_comp/positions/{contract}/risk_limit | Update position risk limit in dual mode
[**listFuturesOrders**](FuturesApi.md#listFuturesOrders) | **GET** /futures/{settle}/orders | List futures orders
[**createFuturesOrder**](FuturesApi.md#createFuturesOrder) | **POST** /futures/{settle}/orders | Create a futures order
[**cancelFuturesOrders**](FuturesApi.md#cancelFuturesOrders) | **DELETE** /futures/{settle}/orders | Cancel all &#x60;open&#x60; orders matched
[**getOrdersWithTimeRange**](FuturesApi.md#getOrdersWithTimeRange) | **GET** /futures/{settle}/orders_timerange | List Futures Orders By Time Range
[**createBatchFuturesOrder**](FuturesApi.md#createBatchFuturesOrder) | **POST** /futures/{settle}/batch_orders | Create a batch of futures orders
[**getFuturesOrder**](FuturesApi.md#getFuturesOrder) | **GET** /futures/{settle}/orders/{order_id} | Get a single order
[**amendFuturesOrder**](FuturesApi.md#amendFuturesOrder) | **PUT** /futures/{settle}/orders/{order_id} | Amend an order
[**cancelFuturesOrder**](FuturesApi.md#cancelFuturesOrder) | **DELETE** /futures/{settle}/orders/{order_id} | Cancel a single order
[**getMyTrades**](FuturesApi.md#getMyTrades) | **GET** /futures/{settle}/my_trades | List personal trading history
[**getMyTradesWithTimeRange**](FuturesApi.md#getMyTradesWithTimeRange) | **GET** /futures/{settle}/my_trades_timerange | List personal trading history by time range
[**listPositionClose**](FuturesApi.md#listPositionClose) | **GET** /futures/{settle}/position_close | List position close history
[**listLiquidates**](FuturesApi.md#listLiquidates) | **GET** /futures/{settle}/liquidates | List liquidation history
[**listAutoDeleverages**](FuturesApi.md#listAutoDeleverages) | **GET** /futures/{settle}/auto_deleverages | List Auto-Deleveraging History
[**countdownCancelAllFutures**](FuturesApi.md#countdownCancelAllFutures) | **POST** /futures/{settle}/countdown_cancel_all | Countdown cancel orders
[**getFuturesFee**](FuturesApi.md#getFuturesFee) | **GET** /futures/{settle}/fee | Query user trading fee rates
[**listPriceTriggeredOrders**](FuturesApi.md#listPriceTriggeredOrders) | **GET** /futures/{settle}/price_orders | List all auto orders
[**createPriceTriggeredOrder**](FuturesApi.md#createPriceTriggeredOrder) | **POST** /futures/{settle}/price_orders | Create a price-triggered order
[**cancelPriceTriggeredOrderList**](FuturesApi.md#cancelPriceTriggeredOrderList) | **DELETE** /futures/{settle}/price_orders | Cancel all open orders
[**getPriceTriggeredOrder**](FuturesApi.md#getPriceTriggeredOrder) | **GET** /futures/{settle}/price_orders/{order_id} | Get a price-triggered order
[**cancelPriceTriggeredOrder**](FuturesApi.md#cancelPriceTriggeredOrder) | **DELETE** /futures/{settle}/price_orders/{order_id} | cancel a price-triggered order


<a name="listFuturesContracts"></a>
# **listFuturesContracts**
> List&lt;Contract&gt; listFuturesContracts(settle)

List all futures contracts

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        try {
            List<Contract> result = apiInstance.listFuturesContracts(settle);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesContracts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]

### Return type

[**List&lt;Contract&gt;**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getFuturesContract"></a>
# **getFuturesContract**
> Contract getFuturesContract(settle, contract)

Get a single contract

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        try {
            Contract result = apiInstance.getFuturesContract(settle, contract);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getFuturesContract");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |

### Return type

[**Contract**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Contract information |  -  |

<a name="listFuturesOrderBook"></a>
# **listFuturesOrderBook**
> FuturesOrderBook listFuturesOrderBook(settle, contract).interval(interval).limit(limit).withId(withId).execute();

Futures order book

Bids will be sorted by price from high to low, while asks sorted reversely

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        String interval = "0"; // String | Order depth. 0 means no aggregation is applied. default to 0
        Integer limit = 10; // Integer | Maximum number of order depth data in asks or bids
        Boolean withId = false; // Boolean | Whether the order book update ID will be returned. This ID increases by 1 on every order book update
        try {
            FuturesOrderBook result = apiInstance.listFuturesOrderBook(settle, contract)
                        .interval(interval)
                        .limit(limit)
                        .withId(withId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesOrderBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **interval** | **String**| Order depth. 0 means no aggregation is applied. default to 0 | [optional] [default to 0] [enum: 0, 0.1, 0.01]
 **limit** | **Integer**| Maximum number of order depth data in asks or bids | [optional] [default to 10]
 **withId** | **Boolean**| Whether the order book update ID will be returned. This ID increases by 1 on every order book update | [optional] [default to false]

### Return type

[**FuturesOrderBook**](FuturesOrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order book retrieved |  -  |

<a name="listFuturesTrades"></a>
# **listFuturesTrades**
> List&lt;FuturesTrade&gt; listFuturesTrades(settle, contract).limit(limit).offset(offset).lastId(lastId).from(from).to(to).execute();

Futures trading history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String lastId = "12345"; // String | Specify the starting point for this list based on a previously retrieved id  This parameter is deprecated. Use `from` and `to` instead to limit time range
        Long from = 1546905600L; // Long | Specify starting time in Unix seconds. If not specified, `to` and `limit` will be used to limit response items. If items between `from` and `to` are more than `limit`, only `limit` number will be returned. 
        Long to = 1546935600L; // Long | Specify end time in Unix seconds, default to current time
        try {
            List<FuturesTrade> result = apiInstance.listFuturesTrades(settle, contract)
                        .limit(limit)
                        .offset(offset)
                        .lastId(lastId)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesTrades");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Specify the starting point for this list based on a previously retrieved id  This parameter is deprecated. Use &#x60;from&#x60; and &#x60;to&#x60; instead to limit time range | [optional]
 **from** | **Long**| Specify starting time in Unix seconds. If not specified, &#x60;to&#x60; and &#x60;limit&#x60; will be used to limit response items. If items between &#x60;from&#x60; and &#x60;to&#x60; are more than &#x60;limit&#x60;, only &#x60;limit&#x60; number will be returned.  | [optional]
 **to** | **Long**| Specify end time in Unix seconds, default to current time | [optional]

### Return type

[**List&lt;FuturesTrade&gt;**](FuturesTrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listFuturesCandlesticks"></a>
# **listFuturesCandlesticks**
> List&lt;FuturesCandlestick&gt; listFuturesCandlesticks(settle, contract).from(from).to(to).limit(limit).interval(interval).execute();

Get futures candlesticks

Return specified contract candlesticks. If prefix &#x60;contract&#x60; with &#x60;mark_&#x60;, the contract&#39;s mark price candlesticks are returned; if prefix with &#x60;index_&#x60;, index price candlesticks will be returned.  Maximum of 2000 points are returned in one query. Be sure not to exceed the limit when specifying &#x60;from&#x60;, &#x60;to&#x60; and &#x60;interval&#x60;

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        Long from = 1546905600L; // Long | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
        Long to = 1546935600L; // Long | End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time
        Integer limit = 100; // Integer | Maximum recent data points to return. `limit` is conflicted with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
        String interval = "5m"; // String | Interval time between data points. Note that `1w` means natual week(Mon-Sun), while `7d` means every 7d since unix 0.  Note that 30d means 1 natual month, not 30 days
        try {
            List<FuturesCandlestick> result = apiInstance.listFuturesCandlesticks(settle, contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .interval(interval)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesCandlesticks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **from** | **Long**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to&#x60;to - 100 * interval&#x60; if not specified | [optional]
 **to** | **Long**| End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time | [optional]
 **limit** | **Integer**| Maximum recent data points to return. &#x60;limit&#x60; is conflicted with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected. | [optional] [default to 100]
 **interval** | **String**| Interval time between data points. Note that &#x60;1w&#x60; means natual week(Mon-Sun), while &#x60;7d&#x60; means every 7d since unix 0.  Note that 30d means 1 natual month, not 30 days | [optional] [default to 5m] [enum: 10s, 30s, 1m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 7d, 1w, 30d]

### Return type

[**List&lt;FuturesCandlestick&gt;**](FuturesCandlestick.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listFuturesPremiumIndex"></a>
# **listFuturesPremiumIndex**
> List&lt;FuturesPremiumIndex&gt; listFuturesPremiumIndex(settle, contract).from(from).to(to).limit(limit).interval(interval).execute();

Premium Index K-Line

Maximum of 1000 points can be returned in a query. Be sure not to exceed the limit when specifying from, to and interval

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        Long from = 1546905600L; // Long | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
        Long to = 1546935600L; // Long | End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time
        Integer limit = 100; // Integer | Maximum recent data points to return. `limit` is conflicted with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
        String interval = "5m"; // String | Interval time between data points
        try {
            List<FuturesPremiumIndex> result = apiInstance.listFuturesPremiumIndex(settle, contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .interval(interval)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesPremiumIndex");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **from** | **Long**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to&#x60;to - 100 * interval&#x60; if not specified | [optional]
 **to** | **Long**| End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time | [optional]
 **limit** | **Integer**| Maximum recent data points to return. &#x60;limit&#x60; is conflicted with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected. | [optional] [default to 100]
 **interval** | **String**| Interval time between data points | [optional] [default to 5m] [enum: 1m, 5m, 15m, 30m, 1h, 4h, 6h, 8h, 1d, 7d, 30d]

### Return type

[**List&lt;FuturesPremiumIndex&gt;**](FuturesPremiumIndex.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listFuturesTickers"></a>
# **listFuturesTickers**
> List&lt;FuturesTicker&gt; listFuturesTickers(settle).contract(contract).execute();

List futures tickers

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        try {
            List<FuturesTicker> result = apiInstance.listFuturesTickers(settle)
                        .contract(contract)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesTickers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]

### Return type

[**List&lt;FuturesTicker&gt;**](FuturesTicker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listFuturesFundingRateHistory"></a>
# **listFuturesFundingRateHistory**
> List&lt;FundingRateRecord&gt; listFuturesFundingRateHistory(settle, contract).limit(limit).execute();

Funding rate history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        try {
            List<FundingRateRecord> result = apiInstance.listFuturesFundingRateHistory(settle, contract)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesFundingRateHistory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]

### Return type

[**List&lt;FundingRateRecord&gt;**](FundingRateRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | History retrieved |  -  |

<a name="listFuturesInsuranceLedger"></a>
# **listFuturesInsuranceLedger**
> List&lt;InsuranceRecord&gt; listFuturesInsuranceLedger(settle).limit(limit).execute();

Futures insurance balance history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        try {
            List<InsuranceRecord> result = apiInstance.listFuturesInsuranceLedger(settle)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesInsuranceLedger");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]

### Return type

[**List&lt;InsuranceRecord&gt;**](InsuranceRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listContractStats"></a>
# **listContractStats**
> List&lt;ContractStat&gt; listContractStats(settle, contract).from(from).interval(interval).limit(limit).execute();

Futures stats

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        Long from = 1604561000L; // Long | Start timestamp
        String interval = "5m"; // String | 
        Integer limit = 30; // Integer | 
        try {
            List<ContractStat> result = apiInstance.listContractStats(settle, contract)
                        .from(from)
                        .interval(interval)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listContractStats");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **from** | **Long**| Start timestamp | [optional]
 **interval** | **String**|  | [optional] [default to 5m] [enum: 5m, 15m, 30m, 1h, 4h, 1d]
 **limit** | **Integer**|  | [optional] [default to 30]

### Return type

[**List&lt;ContractStat&gt;**](ContractStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getIndexConstituents"></a>
# **getIndexConstituents**
> FuturesIndexConstituents getIndexConstituents(settle, index)

Get index constituents

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String index = "BTC_USDT"; // String | Index name
        try {
            FuturesIndexConstituents result = apiInstance.getIndexConstituents(settle, index);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getIndexConstituents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **index** | **String**| Index name |

### Return type

[**FuturesIndexConstituents**](FuturesIndexConstituents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listLiquidatedOrders"></a>
# **listLiquidatedOrders**
> List&lt;FuturesLiqOrder&gt; listLiquidatedOrders(settle).contract(contract).from(from).to(to).limit(limit).execute();

Retrieve liquidation history

Interval between &#x60;from&#x60; and &#x60;to&#x60; cannot exceeds 3600. Some private fields will not be returned in public endpoints. Refer to field description for detail.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Long from = 1547706332L; // Long | Start timestamp
        Long to = 1547706332L; // Long | End timestamp
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        try {
            List<FuturesLiqOrder> result = apiInstance.listLiquidatedOrders(settle)
                        .contract(contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listLiquidatedOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]

### Return type

[**List&lt;FuturesLiqOrder&gt;**](FuturesLiqOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listFuturesAccounts"></a>
# **listFuturesAccounts**
> FuturesAccount listFuturesAccounts(settle)

Query futures account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        try {
            FuturesAccount result = apiInstance.listFuturesAccounts(settle);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]

### Return type

[**FuturesAccount**](FuturesAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listFuturesAccountBook"></a>
# **listFuturesAccountBook**
> List&lt;FuturesAccountBook&gt; listFuturesAccountBook(settle).contract(contract).limit(limit).from(from).to(to).type(type).execute();

Query account book

If the &#x60;contract&#x60; field is provided, it can only filter records that include this field after 2023-10-30.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Long from = 1547706332L; // Long | Start timestamp
        Long to = 1547706332L; // Long | End timestamp
        String type = "dnw"; // String | Changing Type: - dnw: Deposit & Withdraw - pnl: Profit & Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: POINT Deposit & Withdraw - point_fee: POINT Trading fee - point_refr: POINT Referrer rebate
        try {
            List<FuturesAccountBook> result = apiInstance.listFuturesAccountBook(settle)
                        .contract(contract)
                        .limit(limit)
                        .from(from)
                        .to(to)
                        .type(type)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesAccountBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]
 **type** | **String**| Changing Type: - dnw: Deposit &amp; Withdraw - pnl: Profit &amp; Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: POINT Deposit &amp; Withdraw - point_fee: POINT Trading fee - point_refr: POINT Referrer rebate | [optional] [enum: dnw, pnl, fee, refr, fund, point_dnw, point_fee, point_refr]

### Return type

[**List&lt;FuturesAccountBook&gt;**](FuturesAccountBook.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listPositions"></a>
# **listPositions**
> List&lt;Position&gt; listPositions(settle).holding(holding).execute();

List all positions of a user

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        Boolean holding = true; // Boolean | Return only real positions - true, return all - false.
        try {
            List<Position> result = apiInstance.listPositions(settle)
                        .holding(holding)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listPositions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **holding** | **Boolean**| Return only real positions - true, return all - false. | [optional]

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getPosition"></a>
# **getPosition**
> Position getPosition(settle, contract)

Get single position

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        try {
            Position result = apiInstance.getPosition(settle, contract);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getPosition");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="updatePositionMargin"></a>
# **updatePositionMargin**
> Position updatePositionMargin(settle, contract, change)

Update position margin

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        String change = "0.01"; // String | Margin change. Use positive number to increase margin, negative number otherwise.
        try {
            Position result = apiInstance.updatePositionMargin(settle, contract, change);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updatePositionMargin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **change** | **String**| Margin change. Use positive number to increase margin, negative number otherwise. |

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="updatePositionLeverage"></a>
# **updatePositionLeverage**
> Position updatePositionLeverage(settle, contract, leverage, crossLeverageLimit)

Update position leverage

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        String leverage = "10"; // String | New position leverage
        String crossLeverageLimit = "10"; // String | Cross margin leverage(valid only when `leverage` is 0)
        try {
            Position result = apiInstance.updatePositionLeverage(settle, contract, leverage, crossLeverageLimit);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updatePositionLeverage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **leverage** | **String**| New position leverage |
 **crossLeverageLimit** | **String**| Cross margin leverage(valid only when &#x60;leverage&#x60; is 0) | [optional]

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="updatePositionRiskLimit"></a>
# **updatePositionRiskLimit**
> Position updatePositionRiskLimit(settle, contract, riskLimit)

Update position risk limit

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        String riskLimit = "10"; // String | New position risk limit
        try {
            Position result = apiInstance.updatePositionRiskLimit(settle, contract, riskLimit);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updatePositionRiskLimit");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **riskLimit** | **String**| New position risk limit |

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="setDualMode"></a>
# **setDualMode**
> FuturesAccount setDualMode(settle, dualMode)

Enable or disable dual mode

Before setting dual mode, make sure all positions are closed and no orders are open

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        Boolean dualMode = true; // Boolean | Whether to enable dual mode
        try {
            FuturesAccount result = apiInstance.setDualMode(settle, dualMode);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#setDualMode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **dualMode** | **Boolean**| Whether to enable dual mode |

### Return type

[**FuturesAccount**](FuturesAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated |  -  |

<a name="getDualModePosition"></a>
# **getDualModePosition**
> List&lt;Position&gt; getDualModePosition(settle, contract)

Retrieve position detail in dual mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        try {
            List<Position> result = apiInstance.getDualModePosition(settle, contract);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getDualModePosition");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="updateDualModePositionMargin"></a>
# **updateDualModePositionMargin**
> List&lt;Position&gt; updateDualModePositionMargin(settle, contract, change, dualSide)

Update position margin in dual mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        String change = "0.01"; // String | Margin change. Use positive number to increase margin, negative number otherwise.
        String dualSide = "dual_long"; // String | Long or short position
        try {
            List<Position> result = apiInstance.updateDualModePositionMargin(settle, contract, change, dualSide);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updateDualModePositionMargin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **change** | **String**| Margin change. Use positive number to increase margin, negative number otherwise. |
 **dualSide** | **String**| Long or short position | [enum: dual_long, dual_short]

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="updateDualModePositionLeverage"></a>
# **updateDualModePositionLeverage**
> List&lt;Position&gt; updateDualModePositionLeverage(settle, contract, leverage, crossLeverageLimit)

Update position leverage in dual mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        String leverage = "10"; // String | New position leverage
        String crossLeverageLimit = "10"; // String | Cross margin leverage(valid only when `leverage` is 0)
        try {
            List<Position> result = apiInstance.updateDualModePositionLeverage(settle, contract, leverage, crossLeverageLimit);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updateDualModePositionLeverage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **leverage** | **String**| New position leverage |
 **crossLeverageLimit** | **String**| Cross margin leverage(valid only when &#x60;leverage&#x60; is 0) | [optional]

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="updateDualModePositionRiskLimit"></a>
# **updateDualModePositionRiskLimit**
> List&lt;Position&gt; updateDualModePositionRiskLimit(settle, contract, riskLimit)

Update position risk limit in dual mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        String riskLimit = "10"; // String | New position risk limit
        try {
            List<Position> result = apiInstance.updateDualModePositionRiskLimit(settle, contract, riskLimit);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updateDualModePositionRiskLimit");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **riskLimit** | **String**| New position risk limit |

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listFuturesOrders"></a>
# **listFuturesOrders**
> List&lt;FuturesOrder&gt; listFuturesOrders(settle, status).contract(contract).limit(limit).offset(offset).lastId(lastId).execute();

List futures orders

- Zero-fill order cannot be retrieved for 10 minutes after cancellation - Historical orders, by default, only data within the past 6 months is supported.  If you need to query data for a longer period, please use &#x60;GET /futures/{settle}/orders_timerange&#x60;.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String status = "open"; // String | Only list the orders with this status
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String lastId = "12345"; // String | Specify list staring point using the `id` of last record in previous list-query results
        try {
            List<FuturesOrder> result = apiInstance.listFuturesOrders(settle, status)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .lastId(lastId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **status** | **String**| Only list the orders with this status | [enum: open, finished]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Specify list staring point using the &#x60;id&#x60; of last record in previous list-query results | [optional]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  * X-Pagination-Limit - Request limit specified <br>  * X-Pagination-Offset - Request offset specified <br>  |

<a name="createFuturesOrder"></a>
# **createFuturesOrder**
> FuturesOrder createFuturesOrder(settle, futuresOrder)

Create a futures order

- Creating futures orders requires &#x60;size&#x60;, which is number of contracts instead of currency amount. You can use &#x60;quanto_multiplier&#x60; in contract detail response to know how much currency 1 size contract represents - Zero-filled order cannot be retrieved 10 minutes after order cancellation. You will get a 404 not found for such orders - Set &#x60;reduce_only&#x60; to &#x60;true&#x60; can keep the position from changing side when reducing position size - In single position mode, to close a position, you need to set &#x60;size&#x60; to 0 and &#x60;close&#x60; to &#x60;true&#x60; - In dual position mode, to close one side position, you need to set &#x60;auto_size&#x60; side, &#x60;reduce_only&#x60; to true and &#x60;size&#x60; to 0 - Set &#x60;stp_act&#x60; to decide the strategy of self-trade prevention. For detailed usage, refer to the &#x60;stp_act&#x60; parameter in request body 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        FuturesOrder futuresOrder = new FuturesOrder(); // FuturesOrder | 
        try {
            FuturesOrder result = apiInstance.createFuturesOrder(settle, futuresOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#createFuturesOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **futuresOrder** | [**FuturesOrder**](FuturesOrder.md)|  |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Order details |  -  |

<a name="cancelFuturesOrders"></a>
# **cancelFuturesOrders**
> List&lt;FuturesOrder&gt; cancelFuturesOrders(settle, contract, side)

Cancel all &#x60;open&#x60; orders matched

Zero-filled order cannot be retrieved 10 minutes after order cancellation

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        String side = "ask"; // String | All bids or asks. Both included if not specified
        try {
            List<FuturesOrder> result = apiInstance.cancelFuturesOrders(settle, contract, side);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#cancelFuturesOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |
 **side** | **String**| All bids or asks. Both included if not specified | [optional] [enum: ask, bid]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | All orders matched cancelled |  -  |

<a name="getOrdersWithTimeRange"></a>
# **getOrdersWithTimeRange**
> List&lt;FuturesOrder&gt; getOrdersWithTimeRange(settle).contract(contract).from(from).to(to).limit(limit).offset(offset).execute();

List Futures Orders By Time Range

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Long from = 1547706332L; // Long | Start timestamp
        Long to = 1547706332L; // Long | End timestamp
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<FuturesOrder> result = apiInstance.getOrdersWithTimeRange(settle)
                        .contract(contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getOrdersWithTimeRange");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  * X-Pagination-Limit - Request limit specified <br>  * X-Pagination-Offset - Request offset specified <br>  |

<a name="createBatchFuturesOrder"></a>
# **createBatchFuturesOrder**
> List&lt;BatchFuturesOrder&gt; createBatchFuturesOrder(settle, futuresOrder)

Create a batch of futures orders

- Up to 10 orders per request - If any of the order&#39;s parameters are missing or in the wrong format, all of them will not be executed, and a http status 400 error will be returned directly - If the parameters are checked and passed, all are executed. Even if there is a business logic error in the middle (such as insufficient funds), it will not affect other execution orders - The returned result is in array format, and the order corresponds to the orders in the request body - In the returned result, the &#x60;succeeded&#x60; field of type bool indicates whether the execution was successful or not - If the execution is successful, the normal order content is included; if the execution fails, the &#x60;label&#x60; field is included to indicate the cause of the error - In the rate limiting, each order is counted individually

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        List<FuturesOrder> futuresOrder = Arrays.asList(); // List<FuturesOrder> | 
        try {
            List<BatchFuturesOrder> result = apiInstance.createBatchFuturesOrder(settle, futuresOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#createBatchFuturesOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **futuresOrder** | [**List&lt;FuturesOrder&gt;**](FuturesOrder.md)|  |

### Return type

[**List&lt;BatchFuturesOrder&gt;**](BatchFuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request is completed |  -  |

<a name="getFuturesOrder"></a>
# **getFuturesOrder**
> FuturesOrder getFuturesOrder(settle, orderId)

Get a single order

- Zero-fill order cannot be retrieved for 10 minutes after cancellation - Historical orders, by default, only data within the past 6 months is supported.  

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String orderId = "12345"; // String | Order ID returned, or user custom ID(i.e., `text` field). Operations based on custom ID can only be checked when the order is in orderbook.  When the order is finished, it can be checked within 60 seconds after the end of the order.  After that, only order ID is accepted.
        try {
            FuturesOrder result = apiInstance.getFuturesOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getFuturesOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **orderId** | **String**| Order ID returned, or user custom ID(i.e., &#x60;text&#x60; field). Operations based on custom ID can only be checked when the order is in orderbook.  When the order is finished, it can be checked within 60 seconds after the end of the order.  After that, only order ID is accepted. |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order details |  -  |

<a name="amendFuturesOrder"></a>
# **amendFuturesOrder**
> FuturesOrder amendFuturesOrder(settle, orderId, futuresOrderAmendment)

Amend an order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String orderId = "12345"; // String | Order ID returned, or user custom ID(i.e., `text` field). Operations based on custom ID can only be checked when the order is in orderbook.  When the order is finished, it can be checked within 60 seconds after the end of the order.  After that, only order ID is accepted.
        FuturesOrderAmendment futuresOrderAmendment = new FuturesOrderAmendment(); // FuturesOrderAmendment | 
        try {
            FuturesOrder result = apiInstance.amendFuturesOrder(settle, orderId, futuresOrderAmendment);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#amendFuturesOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **orderId** | **String**| Order ID returned, or user custom ID(i.e., &#x60;text&#x60; field). Operations based on custom ID can only be checked when the order is in orderbook.  When the order is finished, it can be checked within 60 seconds after the end of the order.  After that, only order ID is accepted. |
 **futuresOrderAmendment** | [**FuturesOrderAmendment**](FuturesOrderAmendment.md)|  |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order details |  -  |

<a name="cancelFuturesOrder"></a>
# **cancelFuturesOrder**
> FuturesOrder cancelFuturesOrder(settle, orderId)

Cancel a single order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String orderId = "12345"; // String | Order ID returned, or user custom ID(i.e., `text` field). Operations based on custom ID can only be checked when the order is in orderbook.  When the order is finished, it can be checked within 60 seconds after the end of the order.  After that, only order ID is accepted.
        try {
            FuturesOrder result = apiInstance.cancelFuturesOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#cancelFuturesOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **orderId** | **String**| Order ID returned, or user custom ID(i.e., &#x60;text&#x60; field). Operations based on custom ID can only be checked when the order is in orderbook.  When the order is finished, it can be checked within 60 seconds after the end of the order.  After that, only order ID is accepted. |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order details |  -  |

<a name="getMyTrades"></a>
# **getMyTrades**
> List&lt;MyFuturesTrade&gt; getMyTrades(settle).contract(contract).order(order).limit(limit).offset(offset).lastId(lastId).execute();

List personal trading history

By default, only data within the past 6 months is supported.  If you need to query data for a longer period, please use &#x60;GET /futures/{settle}/my_trades_timerange&#x60;.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Long order = 12345L; // Long | Futures order ID, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String lastId = "12345"; // String | Specify the starting point for this list based on a previously retrieved id  This parameter is deprecated. If you need to iterate through and retrieve more records, we recommend using 'GET /futures/{settle}/my_trades_timerange'.
        try {
            List<MyFuturesTrade> result = apiInstance.getMyTrades(settle)
                        .contract(contract)
                        .order(order)
                        .limit(limit)
                        .offset(offset)
                        .lastId(lastId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getMyTrades");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **order** | **Long**| Futures order ID, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Specify the starting point for this list based on a previously retrieved id  This parameter is deprecated. If you need to iterate through and retrieve more records, we recommend using &#39;GET /futures/{settle}/my_trades_timerange&#39;. | [optional]

### Return type

[**List&lt;MyFuturesTrade&gt;**](MyFuturesTrade.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  * X-Pagination-Limit - Request limit specified <br>  * X-Pagination-Offset - Request offset specified <br>  |

<a name="getMyTradesWithTimeRange"></a>
# **getMyTradesWithTimeRange**
> List&lt;MyFuturesTradeTimeRange&gt; getMyTradesWithTimeRange(settle).contract(contract).from(from).to(to).limit(limit).offset(offset).role(role).execute();

List personal trading history by time range

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Long from = 1547706332L; // Long | Start timestamp
        Long to = 1547706332L; // Long | End timestamp
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String role = "maker"; // String | Query role, maker or taker.
        try {
            List<MyFuturesTradeTimeRange> result = apiInstance.getMyTradesWithTimeRange(settle)
                        .contract(contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .role(role)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getMyTradesWithTimeRange");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **role** | **String**| Query role, maker or taker. | [optional]

### Return type

[**List&lt;MyFuturesTradeTimeRange&gt;**](MyFuturesTradeTimeRange.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  * X-Pagination-Limit - Request limit specified <br>  * X-Pagination-Offset - Request offset specified <br>  |

<a name="listPositionClose"></a>
# **listPositionClose**
> List&lt;PositionClose&gt; listPositionClose(settle).contract(contract).limit(limit).offset(offset).from(from).to(to).side(side).pnl(pnl).execute();

List position close history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Long from = 1547706332L; // Long | Start timestamp
        Long to = 1547706332L; // Long | End timestamp
        String side = "short"; // String | Query side.  long or shot
        String pnl = "profit"; // String | Query profit or loss
        try {
            List<PositionClose> result = apiInstance.listPositionClose(settle)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .from(from)
                        .to(to)
                        .side(side)
                        .pnl(pnl)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listPositionClose");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]
 **side** | **String**| Query side.  long or shot | [optional]
 **pnl** | **String**| Query profit or loss | [optional]

### Return type

[**List&lt;PositionClose&gt;**](PositionClose.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listLiquidates"></a>
# **listLiquidates**
> List&lt;FuturesLiquidate&gt; listLiquidates(settle).contract(contract).limit(limit).at(at).execute();

List liquidation history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer at = 0; // Integer | Specify a liquidation timestamp
        try {
            List<FuturesLiquidate> result = apiInstance.listLiquidates(settle)
                        .contract(contract)
                        .limit(limit)
                        .at(at)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listLiquidates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **at** | **Integer**| Specify a liquidation timestamp | [optional] [default to 0]

### Return type

[**List&lt;FuturesLiquidate&gt;**](FuturesLiquidate.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listAutoDeleverages"></a>
# **listAutoDeleverages**
> List&lt;FuturesAutoDeleverage&gt; listAutoDeleverages(settle).contract(contract).limit(limit).at(at).execute();

List Auto-Deleveraging History

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer at = 0; // Integer | Specify an auto-deleveraging timestamp
        try {
            List<FuturesAutoDeleverage> result = apiInstance.listAutoDeleverages(settle)
                        .contract(contract)
                        .limit(limit)
                        .at(at)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listAutoDeleverages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **at** | **Integer**| Specify an auto-deleveraging timestamp | [optional] [default to 0]

### Return type

[**List&lt;FuturesAutoDeleverage&gt;**](FuturesAutoDeleverage.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="countdownCancelAllFutures"></a>
# **countdownCancelAllFutures**
> TriggerTime countdownCancelAllFutures(settle, countdownCancelAllFuturesTask)

Countdown cancel orders

When the timeout set by the user is reached, if there is no cancel or set a new countdown, the related pending orders will be automatically cancelled.  This endpoint can be called repeatedly to set a new countdown or cancel the countdown. For example, call this endpoint at 30s intervals, each countdown&#x60;timeout&#x60; is set to 30s. If this endpoint is not called again within 30 seconds, all pending orders on the specified &#x60;market&#x60; will be automatically cancelled, if no &#x60;market&#x60; is specified, all market pending orders will be cancelled. If the &#x60;timeout&#x60; is set to 0 within 30 seconds, the countdown timer will expire and the cacnel function will be cancelled.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        CountdownCancelAllFuturesTask countdownCancelAllFuturesTask = new CountdownCancelAllFuturesTask(); // CountdownCancelAllFuturesTask | 
        try {
            TriggerTime result = apiInstance.countdownCancelAllFutures(settle, countdownCancelAllFuturesTask);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#countdownCancelAllFutures");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **countdownCancelAllFuturesTask** | [**CountdownCancelAllFuturesTask**](CountdownCancelAllFuturesTask.md)|  |

### Return type

[**TriggerTime**](TriggerTime.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Set countdown successfully |  -  |

<a name="getFuturesFee"></a>
# **getFuturesFee**
> Map&lt;String, FuturesFee&gt; getFuturesFee(settle).contract(contract).execute();

Query user trading fee rates

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        try {
            Map<String, FuturesFee> result = apiInstance.getFuturesFee(settle)
                        .contract(contract)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getFuturesFee");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]

### Return type

[**Map&lt;String, FuturesFee&gt;**](FuturesFee.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listPriceTriggeredOrders"></a>
# **listPriceTriggeredOrders**
> List&lt;FuturesPriceTriggeredOrder&gt; listPriceTriggeredOrders(settle, status).contract(contract).limit(limit).offset(offset).execute();

List all auto orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String status = "status_example"; // String | Only list the orders with this status
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<FuturesPriceTriggeredOrder> result = apiInstance.listPriceTriggeredOrders(settle, status)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listPriceTriggeredOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **status** | **String**| Only list the orders with this status | [enum: open, finished]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;FuturesPriceTriggeredOrder&gt;**](FuturesPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="createPriceTriggeredOrder"></a>
# **createPriceTriggeredOrder**
> TriggerOrderResponse createPriceTriggeredOrder(settle, futuresPriceTriggeredOrder)

Create a price-triggered order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        FuturesPriceTriggeredOrder futuresPriceTriggeredOrder = new FuturesPriceTriggeredOrder(); // FuturesPriceTriggeredOrder | 
        try {
            TriggerOrderResponse result = apiInstance.createPriceTriggeredOrder(settle, futuresPriceTriggeredOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#createPriceTriggeredOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **futuresPriceTriggeredOrder** | [**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)|  |

### Return type

[**TriggerOrderResponse**](TriggerOrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Order created |  -  |

<a name="cancelPriceTriggeredOrderList"></a>
# **cancelPriceTriggeredOrderList**
> List&lt;FuturesPriceTriggeredOrder&gt; cancelPriceTriggeredOrderList(settle, contract)

Cancel all open orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        try {
            List<FuturesPriceTriggeredOrder> result = apiInstance.cancelPriceTriggeredOrderList(settle, contract);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#cancelPriceTriggeredOrderList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **contract** | **String**| Futures contract |

### Return type

[**List&lt;FuturesPriceTriggeredOrder&gt;**](FuturesPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch cancellation request accepted. Query order status by listing orders |  -  |

<a name="getPriceTriggeredOrder"></a>
# **getPriceTriggeredOrder**
> FuturesPriceTriggeredOrder getPriceTriggeredOrder(settle, orderId)

Get a price-triggered order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String orderId = "orderId_example"; // String | Retrieve the data of the order with the specified ID
        try {
            FuturesPriceTriggeredOrder result = apiInstance.getPriceTriggeredOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getPriceTriggeredOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **orderId** | **String**| Retrieve the data of the order with the specified ID |

### Return type

[**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Auto order detail |  -  |

<a name="cancelPriceTriggeredOrder"></a>
# **cancelPriceTriggeredOrder**
> FuturesPriceTriggeredOrder cancelPriceTriggeredOrder(settle, orderId)

cancel a price-triggered order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String orderId = "orderId_example"; // String | Retrieve the data of the order with the specified ID
        try {
            FuturesPriceTriggeredOrder result = apiInstance.cancelPriceTriggeredOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#cancelPriceTriggeredOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]
 **orderId** | **String**| Retrieve the data of the order with the specified ID |

### Return type

[**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Auto order detail |  -  |

