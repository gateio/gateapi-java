# SpotApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCurrencies**](SpotApi.md#listCurrencies) | **GET** /spot/currencies | Query all currency information
[**getCurrency**](SpotApi.md#getCurrency) | **GET** /spot/currencies/{currency} | Query single currency information
[**listCurrencyPairs**](SpotApi.md#listCurrencyPairs) | **GET** /spot/currency_pairs | Query all supported currency pairs
[**getCurrencyPair**](SpotApi.md#getCurrencyPair) | **GET** /spot/currency_pairs/{currency_pair} | Query single currency pair details
[**listTickers**](SpotApi.md#listTickers) | **GET** /spot/tickers | Get currency pair ticker information
[**listOrderBook**](SpotApi.md#listOrderBook) | **GET** /spot/order_book | Get market depth information
[**listTrades**](SpotApi.md#listTrades) | **GET** /spot/trades | Query market transaction records
[**listCandlesticks**](SpotApi.md#listCandlesticks) | **GET** /spot/candlesticks | Market K-line chart
[**getFee**](SpotApi.md#getFee) | **GET** /spot/fee | Query account fee rates
[**getBatchSpotFee**](SpotApi.md#getBatchSpotFee) | **GET** /spot/batch_fee | Batch query account fee rates
[**listSpotAccounts**](SpotApi.md#listSpotAccounts) | **GET** /spot/accounts | List spot trading accounts
[**listSpotAccountBook**](SpotApi.md#listSpotAccountBook) | **GET** /spot/account_book | Query spot account transaction history
[**createBatchOrders**](SpotApi.md#createBatchOrders) | **POST** /spot/batch_orders | Batch place orders
[**listAllOpenOrders**](SpotApi.md#listAllOpenOrders) | **GET** /spot/open_orders | List all open orders
[**createCrossLiquidateOrder**](SpotApi.md#createCrossLiquidateOrder) | **POST** /spot/cross_liquidate_orders | Close position when cross-currency is disabled
[**listOrders**](SpotApi.md#listOrders) | **GET** /spot/orders | List orders
[**createOrder**](SpotApi.md#createOrder) | **POST** /spot/orders | Create an order
[**cancelOrders**](SpotApi.md#cancelOrders) | **DELETE** /spot/orders | Cancel all &#x60;open&#x60; orders in specified currency pair
[**cancelBatchOrders**](SpotApi.md#cancelBatchOrders) | **POST** /spot/cancel_batch_orders | Cancel batch orders by specified ID list
[**getOrder**](SpotApi.md#getOrder) | **GET** /spot/orders/{order_id} | Query single order details
[**cancelOrder**](SpotApi.md#cancelOrder) | **DELETE** /spot/orders/{order_id} | Cancel single order
[**amendOrder**](SpotApi.md#amendOrder) | **PATCH** /spot/orders/{order_id} | Amend single order
[**listMyTrades**](SpotApi.md#listMyTrades) | **GET** /spot/my_trades | Query personal trading records
[**getSystemTime**](SpotApi.md#getSystemTime) | **GET** /spot/time | Get server current time
[**countdownCancelAllSpot**](SpotApi.md#countdownCancelAllSpot) | **POST** /spot/countdown_cancel_all | Countdown cancel orders
[**amendBatchOrders**](SpotApi.md#amendBatchOrders) | **POST** /spot/amend_batch_orders | Batch modification of orders
[**getSpotInsuranceHistory**](SpotApi.md#getSpotInsuranceHistory) | **GET** /spot/insurance_history | Query spot insurance fund historical data
[**listSpotPriceTriggeredOrders**](SpotApi.md#listSpotPriceTriggeredOrders) | **GET** /spot/price_orders | Query running auto order list
[**createSpotPriceTriggeredOrder**](SpotApi.md#createSpotPriceTriggeredOrder) | **POST** /spot/price_orders | Create price-triggered order
[**cancelSpotPriceTriggeredOrderList**](SpotApi.md#cancelSpotPriceTriggeredOrderList) | **DELETE** /spot/price_orders | Cancel all auto orders
[**getSpotPriceTriggeredOrder**](SpotApi.md#getSpotPriceTriggeredOrder) | **GET** /spot/price_orders/{order_id} | Query single auto order details
[**cancelSpotPriceTriggeredOrder**](SpotApi.md#cancelSpotPriceTriggeredOrder) | **DELETE** /spot/price_orders/{order_id} | Cancel single auto order


<a name="listCurrencies"></a>
# **listCurrencies**
> List&lt;Currency&gt; listCurrencies()

Query all currency information

When a currency corresponds to multiple chains, you can query the information of multiple chains through the &#x60;chains&#x60; field, such as the charging and recharge status, identification, etc. of the chain

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
**200** | List retrieved successfully |  -  |

<a name="getCurrency"></a>
# **getCurrency**
> Currency getCurrency(currency)

Query single currency information

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
        String currency = "GT"; // String | Currency name
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
 **currency** | **String**| Currency name |

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
**200** | Query successful |  -  |

<a name="listCurrencyPairs"></a>
# **listCurrencyPairs**
> List&lt;CurrencyPair&gt; listCurrencyPairs()

Query all supported currency pairs

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
**200** | All currency pairs retrieved |  -  |

<a name="getCurrencyPair"></a>
# **getCurrencyPair**
> CurrencyPair getCurrencyPair(currencyPair)

Query single currency pair details

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
        String currencyPair = "ETH_BTC"; // String | Currency pair
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
 **currencyPair** | **String**| Currency pair |

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
**200** | Query successful |  -  |

<a name="listTickers"></a>
# **listTickers**
> List&lt;Ticker&gt; listTickers().currencyPair(currencyPair).timezone(timezone).execute();

Get currency pair ticker information

If &#x60;currency_pair&#x60; is specified, only query that currency pair; otherwise return all information

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
        String currencyPair = "BTC_USDT"; // String | Currency pair
        String timezone = "utc0"; // String | Timezone
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
 **currencyPair** | **String**| Currency pair | [optional]
 **timezone** | **String**| Timezone | [optional] [enum: utc0, utc8, all]

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
**200** | Query successful |  -  |

<a name="listOrderBook"></a>
# **listOrderBook**
> OrderBook listOrderBook(currencyPair).interval(interval).limit(limit).withId(withId).execute();

Get market depth information

Market depth buy orders are sorted by price from high to low, sell orders are sorted from low to high

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
        String currencyPair = "BTC_USDT"; // String | Currency pair
        String interval = "\"0\""; // String | Price precision for depth aggregation, 0 means no aggregation, defaults to 0 if not specified
        Integer limit = 10; // Integer | Number of depth levels
        Boolean withId = false; // Boolean | Return order book update ID
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
 **currencyPair** | **String**| Currency pair |
 **interval** | **String**| Price precision for depth aggregation, 0 means no aggregation, defaults to 0 if not specified | [optional] [default to &quot;0&quot;]
 **limit** | **Integer**| Number of depth levels | [optional] [default to 10]
 **withId** | **Boolean**| Return order book update ID | [optional] [default to false]

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
**200** | Query successful |  -  |

<a name="listTrades"></a>
# **listTrades**
> List&lt;Trade&gt; listTrades(currencyPair).limit(limit).lastId(lastId).reverse(reverse).from(from).to(to).page(page).execute();

Query market transaction records

Supports querying by time range using &#x60;from&#x60; and &#x60;to&#x60; parameters or pagination based on &#x60;last_id&#x60;. By default, queries the last 30 days.  Pagination based on &#x60;last_id&#x60; is no longer recommended. If &#x60;last_id&#x60; is specified, the time range query parameters will be ignored.  When using limit&amp;page pagination to retrieve data, the maximum number of pages is 100,000, that is, limit * (page - 1) &lt;&#x3D; 100,000.

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
        String currencyPair = "BTC_USDT"; // String | Currency pair
        Integer limit = 100; // Integer | Maximum number of items returned in list. Default: 100, minimum: 1, maximum: 1000
        String lastId = "12345"; // String | Specify the currency name to query in batches, and support up to 100 pass parameters at a time
        Boolean reverse = false; // Boolean | Whether to retrieve data less than `last_id`. Default returns records greater than `last_id`.  Set to `true` to trace back market trade records, `false` to get latest trades.  No effect when `last_id` is not set.
        Long from = 1627706330L; // Long | Start timestamp for the query
        Long to = 1635329650L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer page = 1; // Integer | Page number
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
 **currencyPair** | **String**| Currency pair |
 **limit** | **Integer**| Maximum number of items returned in list. Default: 100, minimum: 1, maximum: 1000 | [optional] [default to 100]
 **lastId** | **String**| Specify the currency name to query in batches, and support up to 100 pass parameters at a time | [optional]
 **reverse** | **Boolean**| Whether to retrieve data less than &#x60;last_id&#x60;. Default returns records greater than &#x60;last_id&#x60;.  Set to &#x60;true&#x60; to trace back market trade records, &#x60;false&#x60; to get latest trades.  No effect when &#x60;last_id&#x60; is not set. | [optional] [default to false]
 **from** | **Long**| Start timestamp for the query | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]

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
**200** | List retrieved successfully |  -  |

<a name="listCandlesticks"></a>
# **listCandlesticks**
> List&lt;List&lt;String&gt;&gt; listCandlesticks(currencyPair).limit(limit).from(from).to(to).interval(interval).execute();

Market K-line chart

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
        String currencyPair = "BTC_USDT"; // String | Currency pair
        Integer limit = 100; // Integer | Maximum number of recent data points to return. `limit` conflicts with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
        Long from = 1546905600L; // Long | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
        Long to = 1546935600L; // Long | Specify the end time of the K-line chart, defaults to current time if not specified, note that the time format is Unix timestamp with second precision
        String interval = "30m"; // String | Time interval between data points. Note that `30d` represents a calendar month, not aligned to 30 days
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
 **currencyPair** | **String**| Currency pair |
 **limit** | **Integer**| Maximum number of recent data points to return. &#x60;limit&#x60; conflicts with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected. | [optional] [default to 100]
 **from** | **Long**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to&#x60;to - 100 * interval&#x60; if not specified | [optional]
 **to** | **Long**| Specify the end time of the K-line chart, defaults to current time if not specified, note that the time format is Unix timestamp with second precision | [optional]
 **interval** | **String**| Time interval between data points. Note that &#x60;30d&#x60; represents a calendar month, not aligned to 30 days | [optional] [default to 30m] [enum: 1s, 10s, 1m, 5m, 15m, 30m, 1h, 4h, 8h, 1d, 7d, 30d]

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
**200** | Query successful |  -  |

<a name="getFee"></a>
# **getFee**
> SpotFee getFee().currencyPair(currencyPair).execute();

Query account fee rates

This API is deprecated. The new fee query API is &#x60;/wallet/fee&#x60;

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
        String currencyPair = "BTC_USDT"; // String | Specify currency pair to get more accurate fee settings.  This field is optional. Usually fee settings are the same for all currency pairs.
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
 **currencyPair** | **String**| Specify currency pair to get more accurate fee settings.  This field is optional. Usually fee settings are the same for all currency pairs. | [optional]

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
**200** | Query successful |  -  |

<a name="getBatchSpotFee"></a>
# **getBatchSpotFee**
> Map&lt;String, SpotFee&gt; getBatchSpotFee(currencyPairs)

Batch query account fee rates

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
        String currencyPairs = "BTC_USDT,ETH_USDT"; // String | Maximum 50 currency pairs per request
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
 **currencyPairs** | **String**| Maximum 50 currency pairs per request |

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
**200** | Query successful |  -  |

<a name="listSpotAccounts"></a>
# **listSpotAccounts**
> List&lt;SpotAccount&gt; listSpotAccounts().currency(currency).execute();

List spot trading accounts

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
        String currency = "BTC"; // String | Query by specified currency name
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
 **currency** | **String**| Query by specified currency name | [optional]

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
**200** | List retrieved successfully |  -  |

<a name="listSpotAccountBook"></a>
# **listSpotAccountBook**
> List&lt;SpotAccountBook&gt; listSpotAccountBook().currency(currency).from(from).to(to).page(page).limit(limit).type(type).code(code).execute();

Query spot account transaction history

Record query time range cannot exceed 30 days.  When using limit&amp;page pagination to retrieve data, the maximum number of pages is 100,000, that is, limit * (page - 1) &lt;&#x3D; 100,000.

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
        String currency = "BTC"; // String | Query by specified currency name
        Long from = 1627706330L; // Long | Start timestamp for the query
        Long to = 1635329650L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        String type = "lend"; // String | Query by specified account change type. If not specified, all change types will be included.
        String code = "code_example"; // String | Specify account change code for query. If not specified, all change types are included. This parameter has higher priority than `type`
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
 **currency** | **String**| Query by specified currency name | [optional]
 **from** | **Long**| Start timestamp for the query | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **type** | **String**| Query by specified account change type. If not specified, all change types will be included. | [optional]
 **code** | **String**| Specify account change code for query. If not specified, all change types are included. This parameter has higher priority than &#x60;type&#x60; | [optional]

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
**200** | List retrieved successfully |  -  |

<a name="createBatchOrders"></a>
# **createBatchOrders**
> List&lt;BatchOrder&gt; createBatchOrders(order, xGateExptime)

Batch place orders

Batch order requirements:  1. Custom order field &#x60;text&#x60; must be specified 2. Up to 4 currency pairs per request, with up to 10 orders per currency pair 3. Spot orders and margin orders cannot be mixed; all &#x60;account&#x60; fields in the same request must be identical

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
**200** | Request execution completed |  -  |

<a name="listAllOpenOrders"></a>
# **listAllOpenOrders**
> List&lt;OpenOrders&gt; listAllOpenOrders().page(page).limit(limit).account(account).execute();

List all open orders

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
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned in one page in each currency pair
        String account = "spot"; // String | Specify query account
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
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in one page in each currency pair | [optional] [default to 100]
 **account** | **String**| Specify query account | [optional]

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
**200** | List retrieved successfully |  -  |

<a name="createCrossLiquidateOrder"></a>
# **createCrossLiquidateOrder**
> Order createCrossLiquidateOrder(liquidateOrder)

Close position when cross-currency is disabled

Currently, only cross-margin accounts are supported to place buy orders for disabled currencies. Maximum buy quantity &#x3D; (unpaid principal and interest - currency balance - the amount of the currency in pending orders) / 0.998

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
**201** | Order created successfully |  -  |

<a name="listOrders"></a>
# **listOrders**
> List&lt;Order&gt; listOrders(currencyPair, status).page(page).limit(limit).account(account).from(from).to(to).side(side).execute();

List orders

Note that query results default to spot order lists for spot, unified account, and isolated margin accounts.  When &#x60;status&#x60; is set to &#x60;open&#x60; (i.e., when querying pending order lists), only &#x60;page&#x60; and &#x60;limit&#x60; pagination controls are supported. &#x60;limit&#x60; can only be set to a maximum of 100. The &#x60;side&#x60; parameter and time range query parameters &#x60;from&#x60; and &#x60;to&#x60; are not supported.  When &#x60;status&#x60; is set to &#x60;finished&#x60; (i.e., when querying historical orders), in addition to pagination queries, &#x60;from&#x60; and &#x60;to&#x60; time range queries are also supported. Additionally, the &#x60;side&#x60; parameter can be set to filter one-sided history.  Time range filter parameters are processed according to the order end time.

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
        String currencyPair = "BTC_USDT"; // String | Query by specified currency pair. Required for open orders, optional for filled orders
        String status = "open"; // String | List orders based on status  `open` - order is waiting to be filled `finished` - order has been filled or cancelled 
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records to be returned. If `status` is `open`, maximum of `limit` is 100
        String account = "spot"; // String | Specify query account
        Long from = 1627706330L; // Long | Start timestamp for the query
        Long to = 1635329650L; // Long | End timestamp for the query, defaults to current time if not specified
        String side = "sell"; // String | Specify all bids or all asks, both included if not specified
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
 **currencyPair** | **String**| Query by specified currency pair. Required for open orders, optional for filled orders |
 **status** | **String**| List orders based on status  &#x60;open&#x60; - order is waiting to be filled &#x60;finished&#x60; - order has been filled or cancelled  |
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned. If &#x60;status&#x60; is &#x60;open&#x60;, maximum of &#x60;limit&#x60; is 100 | [optional] [default to 100]
 **account** | **String**| Specify query account | [optional]
 **from** | **Long**| Start timestamp for the query | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **side** | **String**| Specify all bids or all asks, both included if not specified | [optional]

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
**200** | List retrieved successfully |  -  |

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(order, xGateExptime)

Create an order

Supports spot, margin, leverage, and cross-margin leverage orders. Use different accounts through the &#x60;account&#x60; field. Default is &#x60;spot&#x60;, which means using the spot account to place orders. If the user has a &#x60;unified&#x60; account, the default is to place orders with the unified account.  When using leveraged account trading (i.e., when &#x60;account&#x60; is set to &#x60;margin&#x60;), you can set &#x60;auto_borrow&#x60; to &#x60;true&#x60;. In case of insufficient account balance, the system will automatically execute &#x60;POST /margin/uni/loans&#x60; to borrow the insufficient amount. Whether assets obtained after leveraged order execution are automatically used to repay borrowing orders of the isolated margin account depends on the automatic repayment settings of the user&#39;s isolated margin account. Account automatic repayment settings can be queried and set through &#x60;/margin/auto_repay&#x60;.  When using unified account trading (i.e., when &#x60;account&#x60; is set to &#x60;unified&#x60;), &#x60;auto_borrow&#x60; can also be enabled to realize automatic borrowing of insufficient amounts. However, unlike the isolated margin account, whether unified account orders are automatically repaid depends on the &#x60;auto_repay&#x60; setting when placing the order. This setting only applies to the current order, meaning only assets obtained after order execution will be used to repay borrowing orders of the cross-margin account. Unified account ordering currently supports enabling both &#x60;auto_borrow&#x60; and &#x60;auto_repay&#x60; simultaneously.  Auto repayment will be triggered when the order ends, i.e., when &#x60;status&#x60; is &#x60;cancelled&#x60; or &#x60;closed&#x60;.  **Order Status**  The order status in pending orders is &#x60;open&#x60;, which remains &#x60;open&#x60; until all quantity is filled. If fully filled, the order ends and status becomes &#x60;closed&#x60;. If the order is cancelled before all transactions are completed, regardless of partial fills, the status will become &#x60;cancelled&#x60;.  **Iceberg Orders**  &#x60;iceberg&#x60; is used to set the displayed quantity of iceberg orders and does not support complete hiding. Note that hidden portions are charged according to the taker&#39;s fee rate.  **Self-Trade Prevention**  Set &#x60;stp_act&#x60; to determine the self-trade prevention strategy to use

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
**201** | Order created |  -  |

<a name="cancelOrders"></a>
# **cancelOrders**
> List&lt;OrderCancel&gt; cancelOrders(currencyPair, side, account, actionMode, xGateExptime)

Cancel all &#x60;open&#x60; orders in specified currency pair

When the &#x60;account&#x60; parameter is not specified, all pending orders including spot, unified account, and isolated margin will be cancelled. When &#x60;currency_pair&#x60; is not specified, all trading pair pending orders will be cancelled. You can specify a particular account to cancel all pending orders under that account

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
        String currencyPair = "BTC_USDT"; // String | Currency pair
        String side = "sell"; // String | Specify all bids or all asks, both included if not specified
        String account = "spot"; // String | Specify account type  Classic account: All are included if not specified Unified account: Specify `unified`
        String actionMode = "ACK"; // String | Processing Mode  When placing an order, different fields are returned based on the action_mode  - `ACK`: Asynchronous mode, returns only key order fields - `RESULT`: No clearing information - `FULL`: Full mode (default)
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
 **currencyPair** | **String**| Currency pair | [optional]
 **side** | **String**| Specify all bids or all asks, both included if not specified | [optional]
 **account** | **String**| Specify account type  Classic account: All are included if not specified Unified account: Specify &#x60;unified&#x60; | [optional]
 **actionMode** | **String**| Processing Mode  When placing an order, different fields are returned based on the action_mode  - &#x60;ACK&#x60;: Asynchronous mode, returns only key order fields - &#x60;RESULT&#x60;: No clearing information - &#x60;FULL&#x60;: Full mode (default) | [optional]
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
**200** | Batch cancellation request accepted and processed, success determined by order list |  -  |

<a name="cancelBatchOrders"></a>
# **cancelBatchOrders**
> List&lt;CancelOrderResult&gt; cancelBatchOrders(cancelBatchOrder, xGateExptime)

Cancel batch orders by specified ID list

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
**200** | Batch cancellation completed |  -  |

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(orderId, currencyPair, account)

Query single order details

By default, queries orders for spot, unified account, and isolated margin accounts.

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
        String currencyPair = "BTC_USDT"; // String | Specify the trading pair to query. This field is required when querying pending order records. This field can be omitted when querying filled order records.
        String account = "spot"; // String | Specify query account
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
 **currencyPair** | **String**| Specify the trading pair to query. This field is required when querying pending order records. This field can be omitted when querying filled order records. |
 **account** | **String**| Specify query account | [optional]

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
**200** | Detail retrieved |  -  |

<a name="cancelOrder"></a>
# **cancelOrder**
> Order cancelOrder(orderId, currencyPair, account, actionMode, xGateExptime)

Cancel single order

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
        String currencyPair = "BTC_USDT"; // String | Currency pair
        String account = "spot"; // String | Specify query account
        String actionMode = "ACK"; // String | Processing Mode  When placing an order, different fields are returned based on the action_mode  - `ACK`: Asynchronous mode, returns only key order fields - `RESULT`: No clearing information - `FULL`: Full mode (default)
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
 **currencyPair** | **String**| Currency pair |
 **account** | **String**| Specify query account | [optional]
 **actionMode** | **String**| Processing Mode  When placing an order, different fields are returned based on the action_mode  - &#x60;ACK&#x60;: Asynchronous mode, returns only key order fields - &#x60;RESULT&#x60;: No clearing information - &#x60;FULL&#x60;: Full mode (default) | [optional]
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
**200** | Order cancelled |  -  |

<a name="amendOrder"></a>
# **amendOrder**
> Order amendOrder(orderId, orderPatch, currencyPair, account, xGateExptime)

Amend single order

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
        String currencyPair = "BTC_USDT"; // String | Currency pair
        String account = "spot"; // String | Specify query account
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
 **currencyPair** | **String**| Currency pair | [optional]
 **account** | **String**| Specify query account | [optional]
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
**200** | Updated successfully |  -  |

<a name="listMyTrades"></a>
# **listMyTrades**
> List&lt;Trade&gt; listMyTrades().currencyPair(currencyPair).limit(limit).page(page).orderId(orderId).account(account).from(from).to(to).execute();

Query personal trading records

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
        String currencyPair = "BTC_USDT"; // String | Retrieve results with specified currency pair
        Integer limit = 100; // Integer | Maximum number of items returned in list. Default: 100, minimum: 1, maximum: 1000
        Integer page = 1; // Integer | Page number
        String orderId = "12345"; // String | Filter trades with specified order ID. `currency_pair` is also required if this field is present
        String account = "spot"; // String | Specify query account
        Long from = 1627706330L; // Long | Start timestamp for the query
        Long to = 1635329650L; // Long | End timestamp for the query, defaults to current time if not specified
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
 **currencyPair** | **String**| Retrieve results with specified currency pair | [optional]
 **limit** | **Integer**| Maximum number of items returned in list. Default: 100, minimum: 1, maximum: 1000 | [optional] [default to 100]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **orderId** | **String**| Filter trades with specified order ID. &#x60;currency_pair&#x60; is also required if this field is present | [optional]
 **account** | **String**| Specify query account | [optional]
 **from** | **Long**| Start timestamp for the query | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]

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
**200** | List retrieved successfully |  -  |

<a name="getSystemTime"></a>
# **getSystemTime**
> SystemTime getSystemTime()

Get server current time

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
**200** | Query successful |  -  |

<a name="countdownCancelAllSpot"></a>
# **countdownCancelAllSpot**
> TriggerTime countdownCancelAllSpot(countdownCancelAllSpotTask)

Countdown cancel orders

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
**200** | Countdown set successfully |  -  |

<a name="amendBatchOrders"></a>
# **amendBatchOrders**
> List&lt;BatchOrder&gt; amendBatchOrders(batchAmendItem, xGateExptime)

Batch modification of orders

Modify orders in spot, unified account and isolated margin account by default. Modify uncompleted orders, up to 5 orders can be modified at a time. Request parameters should be passed in array format. If there are order modification failures during the batch modification process, the modification of the next order will continue to be executed, and the execution will return with the corresponding order failure information. The call order of batch modification orders is consistent with the order list order. The return content order of batch modification orders is consistent with the order list order.

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
**200** | Order modification executed successfully |  -  |

<a name="getSpotInsuranceHistory"></a>
# **getSpotInsuranceHistory**
> List&lt;SpotInsuranceHistory&gt; getSpotInsuranceHistory(business, currency, from, to).page(page).limit(limit).execute();

Query spot insurance fund historical data

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
        String currency = "BTC"; // String | Currency
        Long from = 1547706332L; // Long | Start timestamp in seconds
        Long to = 1547706332L; // Long | End timestamp in seconds
        Integer page = 1; // Integer | Page number
        Integer limit = 30; // Integer | The maximum number of items returned in the list, the default value is 30
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
 **currency** | **String**| Currency |
 **from** | **Long**| Start timestamp in seconds |
 **to** | **Long**| End timestamp in seconds |
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| The maximum number of items returned in the list, the default value is 30 | [optional] [default to 30]

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
**200** | Query successful |  -  |

<a name="listSpotPriceTriggeredOrders"></a>
# **listSpotPriceTriggeredOrders**
> List&lt;SpotPriceTriggeredOrder&gt; listSpotPriceTriggeredOrders(status).market(market).account(account).limit(limit).offset(offset).execute();

Query running auto order list

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
        String status = "status_example"; // String | Query order list based on status
        String market = "BTC_USDT"; // String | Trading market
        String account = "account_example"; // String | Trading account type. Unified account must be set to `unified`
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
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
 **status** | **String**| Query order list based on status | [enum: open, finished]
 **market** | **String**| Trading market | [optional]
 **account** | **String**| Trading account type. Unified account must be set to &#x60;unified&#x60; | [optional] [enum: normal, margin, unified]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

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
**200** | List retrieved successfully |  -  |

<a name="createSpotPriceTriggeredOrder"></a>
# **createSpotPriceTriggeredOrder**
> TriggerOrderResponse createSpotPriceTriggeredOrder(spotPriceTriggeredOrder)

Create price-triggered order

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
**201** | Order created successfully |  -  |

<a name="cancelSpotPriceTriggeredOrderList"></a>
# **cancelSpotPriceTriggeredOrderList**
> List&lt;SpotPriceTriggeredOrder&gt; cancelSpotPriceTriggeredOrderList(market, account)

Cancel all auto orders

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
        String market = "BTC_USDT"; // String | Trading market
        String account = "account_example"; // String | Trading account type. Unified account must be set to `unified`
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
 **market** | **String**| Trading market | [optional]
 **account** | **String**| Trading account type. Unified account must be set to &#x60;unified&#x60; | [optional] [enum: normal, margin, unified]

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
**200** | Batch cancellation request accepted and processed, success determined by order list |  -  |

<a name="getSpotPriceTriggeredOrder"></a>
# **getSpotPriceTriggeredOrder**
> SpotPriceTriggeredOrder getSpotPriceTriggeredOrder(orderId)

Query single auto order details

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
        String orderId = "orderId_example"; // String | ID returned when order is successfully created
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
 **orderId** | **String**| ID returned when order is successfully created |

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
**200** | Auto order details |  -  |

<a name="cancelSpotPriceTriggeredOrder"></a>
# **cancelSpotPriceTriggeredOrder**
> SpotPriceTriggeredOrder cancelSpotPriceTriggeredOrder(orderId)

Cancel single auto order

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
        String orderId = "orderId_example"; // String | ID returned when order is successfully created
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
 **orderId** | **String**| ID returned when order is successfully created |

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
**200** | Auto order details |  -  |

