# SpotApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCurrencies**](SpotApi.md#listCurrencies) | **GET** /spot/currencies | List all currencies&#39; details.
[**getCurrency**](SpotApi.md#getCurrency) | **GET** /spot/currencies/{currency} | Get details of a specific currency.
[**listCurrencyPairs**](SpotApi.md#listCurrencyPairs) | **GET** /spot/currency_pairs | List all currency pairs supported.
[**getCurrencyPair**](SpotApi.md#getCurrencyPair) | **GET** /spot/currency_pairs/{currency_pair} | Get details of a specifc currency pair.
[**listTickers**](SpotApi.md#listTickers) | **GET** /spot/tickers | Retrieve ticker information.
[**listOrderBook**](SpotApi.md#listOrderBook) | **GET** /spot/order_book | Retrieve order book.
[**listTrades**](SpotApi.md#listTrades) | **GET** /spot/trades | Retrieve market trades.
[**listCandlesticks**](SpotApi.md#listCandlesticks) | **GET** /spot/candlesticks | Market candlesticks.
[**getFee**](SpotApi.md#getFee) | **GET** /spot/fee | Query user trading fee rates.
[**getBatchSpotFee**](SpotApi.md#getBatchSpotFee) | **GET** /spot/batch_fee | Query a batch of user trading fee rates.
[**listSpotAccounts**](SpotApi.md#listSpotAccounts) | **GET** /spot/accounts | List spot accounts.
[**listSpotAccountBook**](SpotApi.md#listSpotAccountBook) | **GET** /spot/account_book | Query account book.
[**createBatchOrders**](SpotApi.md#createBatchOrders) | **POST** /spot/batch_orders | Create a batch of orders.
[**listAllOpenOrders**](SpotApi.md#listAllOpenOrders) | **GET** /spot/open_orders | List all open orders.
[**createCrossLiquidateOrder**](SpotApi.md#createCrossLiquidateOrder) | **POST** /spot/cross_liquidate_orders | close position when cross-currency is disabled.
[**listOrders**](SpotApi.md#listOrders) | **GET** /spot/orders | List orders.
[**createOrder**](SpotApi.md#createOrder) | **POST** /spot/orders | Create an order.
[**cancelOrders**](SpotApi.md#cancelOrders) | **DELETE** /spot/orders | Cancel all &#x60;open&#x60; orders in specified currency pair.
[**cancelBatchOrders**](SpotApi.md#cancelBatchOrders) | **POST** /spot/cancel_batch_orders | Cancel a batch of orders with an ID list.
[**getOrder**](SpotApi.md#getOrder) | **GET** /spot/orders/{order_id} | Get a single order.
[**cancelOrder**](SpotApi.md#cancelOrder) | **DELETE** /spot/orders/{order_id} | Cancel a single order.
[**amendOrder**](SpotApi.md#amendOrder) | **PATCH** /spot/orders/{order_id} | Amend an order.
[**listMyTrades**](SpotApi.md#listMyTrades) | **GET** /spot/my_trades | List personal trading history.
[**getSystemTime**](SpotApi.md#getSystemTime) | **GET** /spot/time | Get server current time.
[**countdownCancelAllSpot**](SpotApi.md#countdownCancelAllSpot) | **POST** /spot/countdown_cancel_all | Countdown cancel orders.
[**amendBatchOrders**](SpotApi.md#amendBatchOrders) | **POST** /spot/amend_batch_orders | Batch modification of orders.
[**getSpotInsuranceHistory**](SpotApi.md#getSpotInsuranceHistory) | **GET** /spot/insurance_history | Query spot insurance fund historical data.
[**listSpotPriceTriggeredOrders**](SpotApi.md#listSpotPriceTriggeredOrders) | **GET** /spot/price_orders | Retrieve running auto order list.
[**createSpotPriceTriggeredOrder**](SpotApi.md#createSpotPriceTriggeredOrder) | **POST** /spot/price_orders | Create a price-triggered order.
[**cancelSpotPriceTriggeredOrderList**](SpotApi.md#cancelSpotPriceTriggeredOrderList) | **DELETE** /spot/price_orders | Cancel All Price-triggered Orders.
[**getSpotPriceTriggeredOrder**](SpotApi.md#getSpotPriceTriggeredOrder) | **GET** /spot/price_orders/{order_id} | Get a price-triggered order.
[**cancelSpotPriceTriggeredOrder**](SpotApi.md#cancelSpotPriceTriggeredOrder) | **DELETE** /spot/price_orders/{order_id} | cancel a price-triggered order.


<a name="listCurrencies"></a>
# **listCurrencies**
> List&lt;Currency&gt; listCurrencies()

List all currencies&#39; details.

When a currency corresponds to multiple chains, you can query the information of multiple chains through the &#x60;chains&#x60; field, such as the charging and recharge status, identification, etc. of the chain.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        try {
            List<Currency> result = apiInstance.listCurrencies();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listCurrencies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Currency&gt;**](Currency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="getCurrency"></a>
# **getCurrency**
> Currency getCurrency(currency)

Get details of a specific currency.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currency = "GT"; // String | Currency name.
        try {
            Currency result = apiInstance.getCurrency(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getCurrency");
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
 **currency** | **String**| Currency name. |

### Return type

[**Currency**](Currency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="listCurrencyPairs"></a>
# **listCurrencyPairs**
> List&lt;CurrencyPair&gt; listCurrencyPairs()

List all currency pairs supported.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        try {
            List<CurrencyPair> result = apiInstance.listCurrencyPairs();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listCurrencyPairs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CurrencyPair&gt;**](CurrencyPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | All currency pairs retrieved. |  -  |

<a name="getCurrencyPair"></a>
# **getCurrencyPair**
> CurrencyPair getCurrencyPair(currencyPair)

Get details of a specifc currency pair.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "ETH_BTC"; // String | Currency pair.
        try {
            CurrencyPair result = apiInstance.getCurrencyPair(currencyPair);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getCurrencyPair");
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
 **currencyPair** | **String**| Currency pair. |

### Return type

[**CurrencyPair**](CurrencyPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="listTickers"></a>
# **listTickers**
> List&lt;Ticker&gt; listTickers().currencyPair(currencyPair).timezone(timezone).execute();

Retrieve ticker information.

Return only related data if &#x60;currency_pair&#x60; is specified; otherwise return all of them

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair.
        String timezone = "utc0"; // String | Timezone.
        try {
            List<Ticker> result = apiInstance.listTickers()
                        .currencyPair(currencyPair)
                        .timezone(timezone)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listTickers");
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
 **currencyPair** | **String**| Currency pair. | [optional]
 **timezone** | **String**| Timezone. | [optional] [enum: utc0, utc8, all]

### Return type

[**List&lt;Ticker&gt;**](Ticker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="listOrderBook"></a>
# **listOrderBook**
> OrderBook listOrderBook(currencyPair).interval(interval).limit(limit).withId(withId).execute();

Retrieve order book.

Market depth buy orders are sorted by price from high to low, sell orders are reversed

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair.
        String interval = "\"0\""; // String | Order depth. 0 means no aggregation is applied. default to 0.
        Integer limit = 10; // Integer | Maximum number of order depth data in asks or bids.
        Boolean withId = false; // Boolean | Return order book ID.
        try {
            OrderBook result = apiInstance.listOrderBook(currencyPair)
                        .interval(interval)
                        .limit(limit)
                        .withId(withId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listOrderBook");
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
 **currencyPair** | **String**| Currency pair. |
 **interval** | **String**| Order depth. 0 means no aggregation is applied. default to 0. | [optional] [default to &quot;0&quot;]
 **limit** | **Integer**| Maximum number of order depth data in asks or bids. | [optional] [default to 10]
 **withId** | **Boolean**| Return order book ID. | [optional] [default to false]

### Return type

[**OrderBook**](OrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="listTrades"></a>
# **listTrades**
> List&lt;Trade&gt; listTrades(currencyPair).limit(limit).lastId(lastId).reverse(reverse).from(from).to(to).page(page).execute();

Retrieve market trades.

Supports &#x60;from&#x60; and &#x60;to&#x60; by time range query or page-turn query based on &#x60;last_id&#x60;. By default, is the last 30 days.  The query method based on &#x60;last_id&#x60; page turn is no longer recommended. If &#x60;last_id&#x60; is specified, the time range query parameters will be ignored.  The maximum number of pages when searching data using limit&amp;page paging function is 100,0, that is, limit * (page - 1) &lt;&#x3D; 100,0.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair.
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list. Default: 100, Minimum: 1, Maximum: 1000
        String lastId = "12345"; // String | Specify the currency name to query in batches, and support up to 100 pass parameters at a time.
        Boolean reverse = false; // Boolean | Whether the id of records to be retrieved should be less than the last_id specified. Default to false.  When `last_id` is specified. Set `reverse` to `true` to trace back trading history; `false` to retrieve latest tradings.  No effect if `last_id` is not specified.
        Long from = 1627706330L; // Long | Start timestamp of the query.
        Long to = 1635329650L; // Long | Time range ending, default to current time.
        Integer page = 1; // Integer | Page number.
        try {
            List<Trade> result = apiInstance.listTrades(currencyPair)
                        .limit(limit)
                        .lastId(lastId)
                        .reverse(reverse)
                        .from(from)
                        .to(to)
                        .page(page)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listTrades");
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
 **currencyPair** | **String**| Currency pair. |
 **limit** | **Integer**| Maximum number of records to be returned in a single list. Default: 100, Minimum: 1, Maximum: 1000 | [optional] [default to 100]
 **lastId** | **String**| Specify the currency name to query in batches, and support up to 100 pass parameters at a time. | [optional]
 **reverse** | **Boolean**| Whether the id of records to be retrieved should be less than the last_id specified. Default to false.  When &#x60;last_id&#x60; is specified. Set &#x60;reverse&#x60; to &#x60;true&#x60; to trace back trading history; &#x60;false&#x60; to retrieve latest tradings.  No effect if &#x60;last_id&#x60; is not specified. | [optional] [default to false]
 **from** | **Long**| Start timestamp of the query. | [optional]
 **to** | **Long**| Time range ending, default to current time. | [optional]
 **page** | **Integer**| Page number. | [optional] [default to 1]

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="listCandlesticks"></a>
# **listCandlesticks**
> List&lt;List&lt;String&gt;&gt; listCandlesticks(currencyPair).limit(limit).from(from).to(to).interval(interval).execute();

Market candlesticks.

Maximum of 1000 points can be returned in a query. Be sure not to exceed the limit when specifying from, to and interval

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair.
        Integer limit = 100; // Integer | Maximum recent data points to return. `limit` is conflicted with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
        Long from = 1546905600L; // Long | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
        Long to = 1546935600L; // Long | Specify the end time of the K-line chart, defaults to current time if not specified, note that the time format is Unix timestamp with second precision specified
        String interval = "30m"; // String | Interval time between data points. Note that `30d` means 1 natual month, not 30 days
        try {
            List<List<String>> result = apiInstance.listCandlesticks(currencyPair)
                        .limit(limit)
                        .from(from)
                        .to(to)
                        .interval(interval)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listCandlesticks");
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
 **currencyPair** | **String**| Currency pair. |
 **limit** | **Integer**| Maximum recent data points to return. &#x60;limit&#x60; is conflicted with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected. | [optional] [default to 100]
 **from** | **Long**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to&#x60;to - 100 * interval&#x60; if not specified | [optional]
 **to** | **Long**| Specify the end time of the K-line chart, defaults to current time if not specified, note that the time format is Unix timestamp with second precision specified | [optional]
 **interval** | **String**| Interval time between data points. Note that &#x60;30d&#x60; means 1 natual month, not 30 days | [optional] [default to 30m] [enum: 1s, 10s, 1m, 5m, 15m, 30m, 1h, 4h, 8h, 1d, 7d, 30d]

### Return type

[**List&lt;List&lt;String&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="getFee"></a>
# **getFee**
> SpotFee getFee().currencyPair(currencyPair).execute();

Query user trading fee rates.

This API is deprecated in favour of new fee retrieving API &#x60;/wallet/fee&#x60;.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Specify a currency pair to retrieve precise fee rate  This field is optional. In most cases, the fee rate is identical among all currency pairs
        try {
            SpotFee result = apiInstance.getFee()
                        .currencyPair(currencyPair)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getFee");
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
 **currencyPair** | **String**| Specify a currency pair to retrieve precise fee rate  This field is optional. In most cases, the fee rate is identical among all currency pairs | [optional]

### Return type

[**SpotFee**](SpotFee.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="getBatchSpotFee"></a>
# **getBatchSpotFee**
> Map&lt;String, SpotFee&gt; getBatchSpotFee(currencyPairs)

Query a batch of user trading fee rates.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPairs = "BTC_USDT,ETH_USDT"; // String | A request can only query up to 50 currency pairs.
        try {
            Map<String, SpotFee> result = apiInstance.getBatchSpotFee(currencyPairs);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getBatchSpotFee");
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
 **currencyPairs** | **String**| A request can only query up to 50 currency pairs. |

### Return type

[**Map&lt;String, SpotFee&gt;**](SpotFee.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="listSpotAccounts"></a>
# **listSpotAccounts**
> List&lt;SpotAccount&gt; listSpotAccounts().currency(currency).execute();

List spot accounts.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency.
        try {
            List<SpotAccount> result = apiInstance.listSpotAccounts()
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listSpotAccounts");
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
 **currency** | **String**| Retrieve data of the specified currency. | [optional]

### Return type

[**List&lt;SpotAccount&gt;**](SpotAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="listSpotAccountBook"></a>
# **listSpotAccountBook**
> List&lt;SpotAccountBook&gt; listSpotAccountBook().currency(currency).from(from).to(to).page(page).limit(limit).type(type).code(code).execute();

Query account book.

Record query time range is not allowed to exceed 30 days.  The maximum number of pages when searching data using limit&amp;page paging function is 100,0, that is, limit * (page - 1) &lt;&#x3D; 100,0.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency.
        Long from = 1627706330L; // Long | Start timestamp of the query.
        Long to = 1635329650L; // Long | Time range ending, default to current time.
        Integer page = 1; // Integer | Page number.
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list.
        String type = "lend"; // String | Only retrieve changes of the specified type. All types will be returned if not specified.
        String code = "code_example"; // String | Specify account change code query, if not specified, all change types are included, and the priority is higher than `type`
        try {
            List<SpotAccountBook> result = apiInstance.listSpotAccountBook()
                        .currency(currency)
                        .from(from)
                        .to(to)
                        .page(page)
                        .limit(limit)
                        .type(type)
                        .code(code)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listSpotAccountBook");
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
 **currency** | **String**| Retrieve data of the specified currency. | [optional]
 **from** | **Long**| Start timestamp of the query. | [optional]
 **to** | **Long**| Time range ending, default to current time. | [optional]
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned in a single list. | [optional] [default to 100]
 **type** | **String**| Only retrieve changes of the specified type. All types will be returned if not specified. | [optional]
 **code** | **String**| Specify account change code query, if not specified, all change types are included, and the priority is higher than &#x60;type&#x60; | [optional]

### Return type

[**List&lt;SpotAccountBook&gt;**](SpotAccountBook.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="createBatchOrders"></a>
# **createBatchOrders**
> List&lt;BatchOrder&gt; createBatchOrders(order, xGateExptime)

Create a batch of orders.

Batch orders requirements:  1. custom order field &#x60;text&#x60; is required 2. At most 4 currency pairs, maximum 10 orders each, are allowed in one request 3. No mixture of spot orders and margin orders, i.e. &#x60;account&#x60; must be identical for all orders 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        List<Order> order = Arrays.asList(); // List<Order> | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            List<BatchOrder> result = apiInstance.createBatchOrders(order, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#createBatchOrders");
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
 **order** | [**List&lt;Order&gt;**](Order.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**List&lt;BatchOrder&gt;**](BatchOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request is completed. |  -  |

<a name="listAllOpenOrders"></a>
# **listAllOpenOrders**
> List&lt;OpenOrders&gt; listAllOpenOrders().page(page).limit(limit).account(account).execute();

List all open orders.

Query the current order list of all trading pairs. Please note that the paging parameter controls the number of pending orders in each trading pair. There is no paging control trading pairs. All trading pairs with pending orders will be returned.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer limit = 100; // Integer | Maximum number of records returned in one page in each currency pair.
        String account = "spot"; // String | Specify query account.
        try {
            List<OpenOrders> result = apiInstance.listAllOpenOrders()
                        .page(page)
                        .limit(limit)
                        .account(account)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listAllOpenOrders");
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
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in one page in each currency pair. | [optional] [default to 100]
 **account** | **String**| Specify query account. | [optional]

### Return type

[**List&lt;OpenOrders&gt;**](OpenOrders.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="createCrossLiquidateOrder"></a>
# **createCrossLiquidateOrder**
> Order createCrossLiquidateOrder(liquidateOrder)

close position when cross-currency is disabled.

Currently, only cross-margin accounts are supported to close position when cross currencies are disabled.  Maximum buy quantity &#x3D; (unpaid principal and interest - currency balance - the amount of the currency in the order book) / 0.998

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        LiquidateOrder liquidateOrder = new LiquidateOrder(); // LiquidateOrder | 
        try {
            Order result = apiInstance.createCrossLiquidateOrder(liquidateOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#createCrossLiquidateOrder");
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
 **liquidateOrder** | [**LiquidateOrder**](LiquidateOrder.md)|  |

### Return type

[**Order**](Order.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | order created. |  -  |

<a name="listOrders"></a>
# **listOrders**
> List&lt;Order&gt; listOrders(currencyPair, status).page(page).limit(limit).account(account).from(from).to(to).side(side).execute();

List orders.

Note that the query results are spot order lists for spot, unified account and warehouse-by-site leverage accounts by default.  &#x60;status&#x60; is set to &#x60;open&#x60;, that is, when querying the pending order list, only pagination control of &#x60;page&#x60; and &#x60;limit&#x60; is supported. &#x60;limit&#x60; Maximum setting is only allowed to 100 . The &#x60;side&#x60; and &#x60;from&#x60;, &#x60;to&#x60; parameters for time range query are not supported.  &#x60;status&#x60; when querying historical delegations, in addition to pagination queries, &#x60;from&#x60; and &#x60;to&#x60; are also supported by time range queries. In addition, it supports setting the &#x60;side&#x60; parameter to filter one-side history.  The parameters of the time range filtering are processed according to the order end time.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Retrieve results with specified currency pair. It is required for open orders, but optional for finished ones.
        String status = "open"; // String | List orders based on status  `open` - order is waiting to be filled `finished` - order has been filled or cancelled 
        Integer page = 1; // Integer | Page number.
        Integer limit = 100; // Integer | Maximum number of records to be returned. If `status` is `open`, maximum of `limit` is 100
        String account = "spot"; // String | Specify query account.
        Long from = 1627706330L; // Long | Start timestamp of the query.
        Long to = 1635329650L; // Long | Time range ending, default to current time.
        String side = "sell"; // String | All bids or asks. Both included if not specified.
        try {
            List<Order> result = apiInstance.listOrders(currencyPair, status)
                        .page(page)
                        .limit(limit)
                        .account(account)
                        .from(from)
                        .to(to)
                        .side(side)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listOrders");
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
 **currencyPair** | **String**| Retrieve results with specified currency pair. It is required for open orders, but optional for finished ones. |
 **status** | **String**| List orders based on status  &#x60;open&#x60; - order is waiting to be filled &#x60;finished&#x60; - order has been filled or cancelled  |
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned. If &#x60;status&#x60; is &#x60;open&#x60;, maximum of &#x60;limit&#x60; is 100 | [optional] [default to 100]
 **account** | **String**| Specify query account. | [optional]
 **from** | **Long**| Start timestamp of the query. | [optional]
 **to** | **Long**| Time range ending, default to current time. | [optional]
 **side** | **String**| All bids or asks. Both included if not specified. | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(order, xGateExptime)

Create an order.

Support spot, margin, leverage, and full-position leverage orders. Use different accounts through the &#x60;account&#x60; field, default is &#x60;spot&#x60;, that is, use the spot account to place an order if the user is &#x60;unified&#x60; account, default is to place an order with a unified account  When using leveraged account trading, that is, when &#x60;account&#x60; is set to &#x60;margin&#x60;, you can set &#x60;auto_borrow&#x60; to &#x60;true&#x60;, In the case of insufficient account balance, the system will automatically execute the &#x60;POST /margin/uni/loans&#x60; to borrow the insufficient part. Whether the assets obtained after the leveraged order is automatically used to return the borrowing orders of the leveraged account in a position-by-store leverage account depends on the automatic repayment settings of the user&#39;s position-by-store leverage account**, The account automatic repayment settings can be queried and set through &#x60;/margin/auto_repay&#x60;.  Use unified is set to &#x60;unified&#x60;, &#x60;auto_borrow&#x60; \&quot; can also be enableTo realize the insufficient part of automatic borrowing, but unlike the leverage account, whether the entrustment of a unified account is automatically repayable depends on the   when placing an order&#x60;auto_repay&#x60; setting, this setting is only effective for the current entrustment, that is, only the assets obtained after the entrustment transaction will be used to repay the borrowing orders of the full-position leverage account. Unified account ordering currently supports &#x60;auto_borrow&#x60; and &#x60;auto_repay&#x60; at the same time.  Auto repayment will be triggered at the end of the order, i.e. &#x60;status&#x60; is &#x60;cancelled&#x60; or &#x60;closed&#x60; .  **Delegation Status**  The entrustment status in the pending order is &#x60;open&#x60;, which remains at &#x60;open&#x60; until all the quantity is traded. If it is eaten, the order ends and the status becomes &#x60;closed&#x60;. If the order is cancelled before all transactions are completed, regardless of whether there are partial transactions, the status will become &#x60;cancelled&#x60;  **Iceberg Entrustment**  &#x60;iceberg&#x60; is used to set the number of iceberg delegations displayed, and does not support complete hiding. Note that when hidden part of the transaction is charged according to the taker&#39;s handling rate.  **Restrict user transactions**  Set &#x60;stp_act&#x60; to decide to use strategies that limit user transactions

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        Order order = new Order(); // Order | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            Order result = apiInstance.createOrder(order, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#createOrder");
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
 **order** | [**Order**](Order.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Order created. |  -  |

<a name="cancelOrders"></a>
# **cancelOrders**
> List&lt;OrderCancel&gt; cancelOrders(currencyPair, side, account, actionMode, xGateExptime)

Cancel all &#x60;open&#x60; orders in specified currency pair.

When the &#x60;account&#x60; parameter is not specified, all pending orders including spot, unified account, and position-by-position leverage will be cancelled. When transaction pairs are revoked You can specify a certain account separately to cancel all orders under the specified account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair.
        String side = "sell"; // String | All bids or asks. Both included if not specified.
        String account = "spot"; // String | Specify account type  Classic account: All are included if not specified Unified account: Specify unified
        String actionMode = "ACK"; // String | Processing Mode  When placing an order, different fields are returned based on the action_mode  - ACK: Asynchronous mode, returns only key order fields - RESULT: No clearing information - FULL: Full mode (default)
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            List<OrderCancel> result = apiInstance.cancelOrders(currencyPair, side, account, actionMode, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#cancelOrders");
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
 **currencyPair** | **String**| Currency pair. | [optional]
 **side** | **String**| All bids or asks. Both included if not specified. | [optional]
 **account** | **String**| Specify account type  Classic account: All are included if not specified Unified account: Specify unified | [optional]
 **actionMode** | **String**| Processing Mode  When placing an order, different fields are returned based on the action_mode  - ACK: Asynchronous mode, returns only key order fields - RESULT: No clearing information - FULL: Full mode (default) | [optional]
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**List&lt;OrderCancel&gt;**](OrderCancel.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch cancellation request accepted. Query order status by listing orders. |  -  |

<a name="cancelBatchOrders"></a>
# **cancelBatchOrders**
> List&lt;CancelOrderResult&gt; cancelBatchOrders(cancelBatchOrder, xGateExptime)

Cancel a batch of orders with an ID list.

Multiple currency pairs can be specified, but maximum 20 orders are allowed per request

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        List<CancelBatchOrder> cancelBatchOrder = Arrays.asList(); // List<CancelBatchOrder> | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            List<CancelOrderResult> result = apiInstance.cancelBatchOrders(cancelBatchOrder, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#cancelBatchOrders");
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
 **cancelBatchOrder** | [**List&lt;CancelBatchOrder&gt;**](CancelBatchOrder.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**List&lt;CancelOrderResult&gt;**](CancelOrderResult.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch cancellation completed. |  -  |

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(orderId, currencyPair, account)

Get a single order.

By default, orders for spot, unified account and warehouse-by-site leverage account are checked.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String orderId = "12345"; // String | The order ID returned when the order was successfully created or the custom ID specified by the user's creation (i.e. the `text` field). Operations based on custom IDs can only be checked in pending orders. Only order ID can be used after the order is finished (transaction/cancel)
        String currencyPair = "BTC_USDT"; // String | Specify the transaction pair to query. If you are querying pending order records, this field is traded records, this field can be left blank.
        String account = "spot"; // String | Specify query account.
        try {
            Order result = apiInstance.getOrder(orderId, currencyPair, account);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getOrder");
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
 **orderId** | **String**| The order ID returned when the order was successfully created or the custom ID specified by the user&#39;s creation (i.e. the &#x60;text&#x60; field). Operations based on custom IDs can only be checked in pending orders. Only order ID can be used after the order is finished (transaction/cancel) |
 **currencyPair** | **String**| Specify the transaction pair to query. If you are querying pending order records, this field is traded records, this field can be left blank. |
 **account** | **String**| Specify query account. | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Detail retrieved. |  -  |

<a name="cancelOrder"></a>
# **cancelOrder**
> Order cancelOrder(orderId, currencyPair, account, actionMode, xGateExptime)

Cancel a single order.

By default, orders for spot, unified accounts and leveraged accounts are revoked.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String orderId = "12345"; // String | The order ID returned when the order was successfully created or the custom ID specified by the user's creation (i.e. the `text` field). Operations based on custom IDs can only be checked in pending orders. Only order ID can be used after the order is finished (transaction/cancel)
        String currencyPair = "BTC_USDT"; // String | Currency pair.
        String account = "spot"; // String | Specify query account.
        String actionMode = "ACK"; // String | Processing Mode  When placing an order, different fields are returned based on the action_mode  - ACK: Asynchronous mode, returns only key order fields - RESULT: No clearing information - FULL: Full mode (default)
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            Order result = apiInstance.cancelOrder(orderId, currencyPair, account, actionMode, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#cancelOrder");
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
 **orderId** | **String**| The order ID returned when the order was successfully created or the custom ID specified by the user&#39;s creation (i.e. the &#x60;text&#x60; field). Operations based on custom IDs can only be checked in pending orders. Only order ID can be used after the order is finished (transaction/cancel) |
 **currencyPair** | **String**| Currency pair. |
 **account** | **String**| Specify query account. | [optional]
 **actionMode** | **String**| Processing Mode  When placing an order, different fields are returned based on the action_mode  - ACK: Asynchronous mode, returns only key order fields - RESULT: No clearing information - FULL: Full mode (default) | [optional]
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order cancelled. |  -  |

<a name="amendOrder"></a>
# **amendOrder**
> Order amendOrder(orderId, orderPatch, currencyPair, account, xGateExptime)

Amend an order.

Modify orders in spot, unified account and isolated margin account by default.  Currently both request body and query support currency_pair and account parameters, but request body has higher priority.  currency_pair must be filled in one of the request body or query parameters.  About rate limit: Order modification and order creation share the same rate limit rules.  About matching priority: Only reducing the quantity does not affect the matching priority. Modifying the price or increasing the quantity will adjust the priority to the end of the new price level.  Note: Modifying the quantity to be less than the filled quantity will trigger a cancellation and isolated margin account by default.  Currently both request body and query support currency_pair and account parameters, but request body has higher priority.  currency_pair must be filled in one of the request body or query parameters.  About rate limit: Order modification and order creation share the same rate limit rules.  About matching priority: Only reducing the quantity does not affect the matching priority. Modifying the price or increasing the quantity will adjust the priority to the end of the new price level.  Note: Modifying the quantity to be less than the filled quantity will trigger a cancellation operation.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String orderId = "12345"; // String | The order ID returned when the order was successfully created or the custom ID specified by the user's creation (i.e. the `text` field). Operations based on custom IDs can only be checked in pending orders. Only order ID can be used after the order is finished (transaction/cancel)
        OrderPatch orderPatch = new OrderPatch(); // OrderPatch | 
        String currencyPair = "BTC_USDT"; // String | Currency pair.
        String account = "spot"; // String | Specify query account.
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            Order result = apiInstance.amendOrder(orderId, orderPatch, currencyPair, account, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#amendOrder");
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
 **orderId** | **String**| The order ID returned when the order was successfully created or the custom ID specified by the user&#39;s creation (i.e. the &#x60;text&#x60; field). Operations based on custom IDs can only be checked in pending orders. Only order ID can be used after the order is finished (transaction/cancel) |
 **orderPatch** | [**OrderPatch**](OrderPatch.md)|  |
 **currencyPair** | **String**| Currency pair. | [optional]
 **account** | **String**| Specify query account. | [optional]
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated. |  -  |

<a name="listMyTrades"></a>
# **listMyTrades**
> List&lt;Trade&gt; listMyTrades().currencyPair(currencyPair).limit(limit).page(page).orderId(orderId).account(account).from(from).to(to).execute();

List personal trading history.

By default query of transaction records for spot, unified account and warehouse-by-site leverage accounts.  The history within a specified time range can be queried by specifying &#x60;from&#x60; or (and) &#x60;to&#x60;.  - If no time parameters are specified, only data for the last 7 days can be obtained. - If only any parameter of &#x60;from&#x60; or &#x60;to&#x60; is specified, only 7-day data from the start (or end) of the specified time is returned. - The range not allowed to exceed 30 days.  The parameters of the time range filter are processed according to the order end time.  The maximum number of pages when searching data using limit&amp;page paging function is 100,0, that is, limit * (page - 1) &lt;&#x3D; 100,0.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Retrieve results with specified currency pair.
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list. Default: 100, Minimum: 1, Maximum: 1000
        Integer page = 1; // Integer | Page number.
        String orderId = "12345"; // String | Filter trades with specified order ID. `currency_pair` is also required if this field is present
        String account = "spot"; // String | Specify query account.
        Long from = 1627706330L; // Long | Start timestamp of the query.
        Long to = 1635329650L; // Long | Time range ending, default to current time.
        try {
            List<Trade> result = apiInstance.listMyTrades()
                        .currencyPair(currencyPair)
                        .limit(limit)
                        .page(page)
                        .orderId(orderId)
                        .account(account)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listMyTrades");
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
 **currencyPair** | **String**| Retrieve results with specified currency pair. | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list. Default: 100, Minimum: 1, Maximum: 1000 | [optional] [default to 100]
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **orderId** | **String**| Filter trades with specified order ID. &#x60;currency_pair&#x60; is also required if this field is present | [optional]
 **account** | **String**| Specify query account. | [optional]
 **from** | **Long**| Start timestamp of the query. | [optional]
 **to** | **Long**| Time range ending, default to current time. | [optional]

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="getSystemTime"></a>
# **getSystemTime**
> SystemTime getSystemTime()

Get server current time.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        try {
            SystemTime result = apiInstance.getSystemTime();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getSystemTime");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemTime**](SystemTime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="countdownCancelAllSpot"></a>
# **countdownCancelAllSpot**
> TriggerTime countdownCancelAllSpot(countdownCancelAllSpotTask)

Countdown cancel orders.

Spot order heartbeat detection. If there is no \&quot;cancel existing countdown\&quot; or \&quot;set new countdown\&quot; when the user-set &#x60;timeout&#x60; time is reached, the related &#x60;spot pending orders&#x60; will be automatically cancelled. This interface can be called repeatedly to set a new countdown or cancel the countdown. Usage example: Repeat this interface at 30s intervals, setting the countdown &#x60;timeout&#x60; to &#x60;30 (seconds)&#x60; each time. If this interface is not called again within 30 seconds, all pending orders on the &#x60;market&#x60; you specified will be automatically cancelled. If no &#x60;market&#x60; is specified, all market cancelled. If the &#x60;timeout&#x60; is set to 0 within 30 seconds, the countdown timer will be terminated and the automatic order cancellation function will be cancelled.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        CountdownCancelAllSpotTask countdownCancelAllSpotTask = new CountdownCancelAllSpotTask(); // CountdownCancelAllSpotTask | 
        try {
            TriggerTime result = apiInstance.countdownCancelAllSpot(countdownCancelAllSpotTask);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#countdownCancelAllSpot");
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
 **countdownCancelAllSpotTask** | [**CountdownCancelAllSpotTask**](CountdownCancelAllSpotTask.md)|  |

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
**200** | Set countdown successfully. |  -  |

<a name="amendBatchOrders"></a>
# **amendBatchOrders**
> List&lt;BatchOrder&gt; amendBatchOrders(batchAmendItem, xGateExptime)

Batch modification of orders.

Modify orders in spot, unified account and isolated margin account by default. Modify uncompleted orders, up to 5 orders can be modified at a time. Request parameters should be passed in array format. If there are order modification failures during the batch modification process, the modification of the next order will continue to be executed, and the execution will return with the corresponding order failure information. The call order of batch modification orders is consistent with the order list order. The return is consistent with the order list order.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        List<BatchAmendItem> batchAmendItem = Arrays.asList(); // List<BatchAmendItem> | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            List<BatchOrder> result = apiInstance.amendBatchOrders(batchAmendItem, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#amendBatchOrders");
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
 **batchAmendItem** | [**List&lt;BatchAmendItem&gt;**](BatchAmendItem.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**List&lt;BatchOrder&gt;**](BatchOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order modification executed successfully. |  -  |

<a name="getSpotInsuranceHistory"></a>
# **getSpotInsuranceHistory**
> List&lt;SpotInsuranceHistory&gt; getSpotInsuranceHistory(business, currency, from, to).page(page).limit(limit).execute();

Query spot insurance fund historical data.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String business = "margin"; // String | Leverage business, margin - position by position; unified - unified account
        String currency = "BTC"; // String | Currency.
        Long from = 1547706332L; // Long | Start timestamp, seconds.
        Long to = 1547706332L; // Long | End timestamp, in seconds.
        Integer page = 1; // Integer | Page number.
        Integer limit = 30; // Integer | The maximum number of items returned in the list, the default value is 30.
        try {
            List<SpotInsuranceHistory> result = apiInstance.getSpotInsuranceHistory(business, currency, from, to)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getSpotInsuranceHistory");
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
 **business** | **String**| Leverage business, margin - position by position; unified - unified account |
 **currency** | **String**| Currency. |
 **from** | **Long**| Start timestamp, seconds. |
 **to** | **Long**| End timestamp, in seconds. |
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| The maximum number of items returned in the list, the default value is 30. | [optional] [default to 30]

### Return type

[**List&lt;SpotInsuranceHistory&gt;**](SpotInsuranceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="listSpotPriceTriggeredOrders"></a>
# **listSpotPriceTriggeredOrders**
> List&lt;SpotPriceTriggeredOrder&gt; listSpotPriceTriggeredOrders(status).market(market).account(account).limit(limit).offset(offset).execute();

Retrieve running auto order list.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String status = "status_example"; // String | Only list the orders with this status.
        String market = "BTC_USDT"; // String | Currency pair.
        String account = "account_example"; // String | Trading account type. Portfolio margin account must set to `unified`.
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list.
        Integer offset = 0; // Integer | List offset, starting from 0.
        try {
            List<SpotPriceTriggeredOrder> result = apiInstance.listSpotPriceTriggeredOrders(status)
                        .market(market)
                        .account(account)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listSpotPriceTriggeredOrders");
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
 **status** | **String**| Only list the orders with this status. | [enum: open, finished]
 **market** | **String**| Currency pair. | [optional]
 **account** | **String**| Trading account type. Portfolio margin account must set to &#x60;unified&#x60;. | [optional] [enum: normal, margin, unified]
 **limit** | **Integer**| Maximum number of records to be returned in a single list. | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0. | [optional] [default to 0]

### Return type

[**List&lt;SpotPriceTriggeredOrder&gt;**](SpotPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="createSpotPriceTriggeredOrder"></a>
# **createSpotPriceTriggeredOrder**
> TriggerOrderResponse createSpotPriceTriggeredOrder(spotPriceTriggeredOrder)

Create a price-triggered order.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        SpotPriceTriggeredOrder spotPriceTriggeredOrder = new SpotPriceTriggeredOrder(); // SpotPriceTriggeredOrder | 
        try {
            TriggerOrderResponse result = apiInstance.createSpotPriceTriggeredOrder(spotPriceTriggeredOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#createSpotPriceTriggeredOrder");
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
 **spotPriceTriggeredOrder** | [**SpotPriceTriggeredOrder**](SpotPriceTriggeredOrder.md)|  |

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
**201** | Order created. |  -  |

<a name="cancelSpotPriceTriggeredOrderList"></a>
# **cancelSpotPriceTriggeredOrderList**
> List&lt;SpotPriceTriggeredOrder&gt; cancelSpotPriceTriggeredOrderList(market, account)

Cancel All Price-triggered Orders.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String market = "BTC_USDT"; // String | Currency pair.
        String account = "account_example"; // String | Trading account type. Portfolio margin account must set to `unified`.
        try {
            List<SpotPriceTriggeredOrder> result = apiInstance.cancelSpotPriceTriggeredOrderList(market, account);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#cancelSpotPriceTriggeredOrderList");
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
 **market** | **String**| Currency pair. | [optional]
 **account** | **String**| Trading account type. Portfolio margin account must set to &#x60;unified&#x60;. | [optional] [enum: normal, margin, unified]

### Return type

[**List&lt;SpotPriceTriggeredOrder&gt;**](SpotPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch cancellation request accepted. Query order status by listing orders. |  -  |

<a name="getSpotPriceTriggeredOrder"></a>
# **getSpotPriceTriggeredOrder**
> SpotPriceTriggeredOrder getSpotPriceTriggeredOrder(orderId)

Get a price-triggered order.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String orderId = "orderId_example"; // String | Retrieve the data of the order with the specified ID.
        try {
            SpotPriceTriggeredOrder result = apiInstance.getSpotPriceTriggeredOrder(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getSpotPriceTriggeredOrder");
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
 **orderId** | **String**| Retrieve the data of the order with the specified ID. |

### Return type

[**SpotPriceTriggeredOrder**](SpotPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Auto order detail. |  -  |

<a name="cancelSpotPriceTriggeredOrder"></a>
# **cancelSpotPriceTriggeredOrder**
> SpotPriceTriggeredOrder cancelSpotPriceTriggeredOrder(orderId)

cancel a price-triggered order.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String orderId = "orderId_example"; // String | Retrieve the data of the order with the specified ID.
        try {
            SpotPriceTriggeredOrder result = apiInstance.cancelSpotPriceTriggeredOrder(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#cancelSpotPriceTriggeredOrder");
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
 **orderId** | **String**| Retrieve the data of the order with the specified ID. |

### Return type

[**SpotPriceTriggeredOrder**](SpotPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Auto order detail. |  -  |

