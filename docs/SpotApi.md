# SpotApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCurrencyPairs**](SpotApi.md#listCurrencyPairs) | **GET** /spot/currency_pairs | List all currency pairs supported
[**getCurrencyPair**](SpotApi.md#getCurrencyPair) | **GET** /spot/currency_pairs/{currency_pair} | Get detail of one single order
[**listTickers**](SpotApi.md#listTickers) | **GET** /spot/tickers | Retrieve ticker information
[**listOrderBook**](SpotApi.md#listOrderBook) | **GET** /spot/order_book | Retrieve order book
[**listTrades**](SpotApi.md#listTrades) | **GET** /spot/trades | Retrieve market trades
[**listCandlesticks**](SpotApi.md#listCandlesticks) | **GET** /spot/candlesticks | Market candlesticks
[**getFee**](SpotApi.md#getFee) | **GET** /spot/fee | Query user trading fee rates
[**listSpotAccounts**](SpotApi.md#listSpotAccounts) | **GET** /spot/accounts | List spot accounts
[**createBatchOrders**](SpotApi.md#createBatchOrders) | **POST** /spot/batch_orders | Create a batch of orders
[**listAllOpenOrders**](SpotApi.md#listAllOpenOrders) | **GET** /spot/open_orders | List all open orders
[**listOrders**](SpotApi.md#listOrders) | **GET** /spot/orders | List orders
[**createOrder**](SpotApi.md#createOrder) | **POST** /spot/orders | Create an order
[**cancelOrders**](SpotApi.md#cancelOrders) | **DELETE** /spot/orders | Cancel all &#x60;open&#x60; orders in specified currency pair
[**cancelBatchOrders**](SpotApi.md#cancelBatchOrders) | **POST** /spot/cancel_batch_orders | Cancel a batch of orders with an ID list
[**getOrder**](SpotApi.md#getOrder) | **GET** /spot/orders/{order_id} | Get a single order
[**cancelOrder**](SpotApi.md#cancelOrder) | **DELETE** /spot/orders/{order_id} | Cancel a single order
[**listMyTrades**](SpotApi.md#listMyTrades) | **GET** /spot/my_trades | List personal trading history


<a name="listCurrencyPairs"></a>
# **listCurrencyPairs**
> List&lt;CurrencyPair&gt; listCurrencyPairs()

List all currency pairs supported

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listCurrencyPairs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

Get detail of one single order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getCurrencyPair");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
**200** | Successfully retrieved |  -  |

<a name="listTickers"></a>
# **listTickers**
> List&lt;Ticker&gt; listTickers().currencyPair(currencyPair).execute();

Retrieve ticker information

Return only related data if &#x60;currency_pair&#x60; is specified; otherwise return all of them

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair
        try {
            List<Ticker> result = apiInstance.listTickers()
                        .currencyPair(currencyPair)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listTickers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
**200** | Successfully retrieved |  -  |

<a name="listOrderBook"></a>
# **listOrderBook**
> OrderBook listOrderBook(currencyPair).interval(interval).limit(limit).execute();

Retrieve order book

Order book will be sorted by price from high to low on bids; reversed on asks

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair
        String interval = "\"0\""; // String | Order depth. 0 means no aggregation is applied. default to 0
        Integer limit = 10; // Integer | Maximum number of order depth data in asks or bids
        try {
            OrderBook result = apiInstance.listOrderBook(currencyPair)
                        .interval(interval)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listOrderBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
 **interval** | **String**| Order depth. 0 means no aggregation is applied. default to 0 | [optional] [default to &quot;0&quot;]
 **limit** | **Integer**| Maximum number of order depth data in asks or bids | [optional] [default to 10]

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
**200** | Successfully retrieved |  -  |

<a name="listTrades"></a>
# **listTrades**
> List&lt;Trade&gt; listTrades(currencyPair).limit(limit).lastId(lastId).execute();

Retrieve market trades

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair
        Integer limit = 100; // Integer | Maximum number of records returned in one list
        String lastId = "12345"; // String | Specify list staring point using the `id` of last record in previous list-query results
        try {
            List<Trade> result = apiInstance.listTrades(currencyPair)
                        .limit(limit)
                        .lastId(lastId)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listTrades");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]
 **lastId** | **String**| Specify list staring point using the &#x60;id&#x60; of last record in previous list-query results | [optional]

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
**200** | List retrieved |  -  |

<a name="listCandlesticks"></a>
# **listCandlesticks**
> List&lt;List&lt;String&gt;&gt; listCandlesticks(currencyPair).limit(limit).from(from).to(to).interval(interval).execute();

Market candlesticks

Maximum of 1000 points are returned in one query. Be sure not to exceed the limit when specifying &#x60;from&#x60;, &#x60;to&#x60; and &#x60;interval&#x60;

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SpotApi apiInstance = new SpotApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair
        Integer limit = 100; // Integer | Maximum recent data points returned. `limit` is conflicted with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
        Long from = 1546905600L; // Long | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
        Long to = 1546935600L; // Long | End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time
        String interval = "30m"; // String | Interval time between data points
        try {
            List<List<String>> result = apiInstance.listCandlesticks(currencyPair)
                        .limit(limit)
                        .from(from)
                        .to(to)
                        .interval(interval)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listCandlesticks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
 **limit** | **Integer**| Maximum recent data points returned. &#x60;limit&#x60; is conflicted with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected. | [optional] [default to 100]
 **from** | **Long**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to&#x60;to - 100 * interval&#x60; if not specified | [optional]
 **to** | **Long**| End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time | [optional]
 **interval** | **String**| Interval time between data points | [optional] [default to 30m] [enum: 10s, 1m, 5m, 15m, 30m, 1h, 4h, 8h, 1d, 7d]

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
**200** | Successfully retrieved |  -  |

<a name="getFee"></a>
# **getFee**
> TradeFee getFee().currencyPair(currencyPair).execute();

Query user trading fee rates

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
            TradeFee result = apiInstance.getFee()
                        .currencyPair(currencyPair)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getFee");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

[**TradeFee**](TradeFee.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listSpotAccounts"></a>
# **listSpotAccounts**
> List&lt;SpotAccount&gt; listSpotAccounts().currency(currency).execute();

List spot accounts

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        String currency = "BTC"; // String | Retrieved specified currency related data
        try {
            List<SpotAccount> result = apiInstance.listSpotAccounts()
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listSpotAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Retrieved specified currency related data | [optional]

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
**200** | List retrieved |  -  |

<a name="createBatchOrders"></a>
# **createBatchOrders**
> List&lt;BatchOrder&gt; createBatchOrders(order)

Create a batch of orders

Batch orders requirements:  1. custom order field &#x60;text&#x60; is required 2. At most 4 currency pairs, maximum 5 orders each, are allowed in one request 3. No mixture of spot orders and margin orders, i.e. &#x60;account&#x60; must be identical for all orders 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        try {
            List<BatchOrder> result = apiInstance.createBatchOrders(order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#createBatchOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
**200** | Request is completed |  -  |

<a name="listAllOpenOrders"></a>
# **listAllOpenOrders**
> List&lt;OpenOrders&gt; listAllOpenOrders().page(page).limit(limit).execute();

List all open orders

List open orders in all currency pairs.  Note that pagination parameters affect record number in each currency pair&#39;s open order list. No pagination is applied to the number of currency pairs returned. All currency pairs with open orders will be returned

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        try {
            List<OpenOrders> result = apiInstance.listAllOpenOrders()
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listAllOpenOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
**200** | List retrieved |  -  |

<a name="listOrders"></a>
# **listOrders**
> List&lt;Order&gt; listOrders(currencyPair, status).page(page).limit(limit).execute();

List orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        String status = "open"; // String | List orders based on status  `open` - order is waiting to be filled `finished` - order has been filled or cancelled 
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned. If `status` is `open`, maximum of `limit` is 100
        try {
            List<Order> result = apiInstance.listOrders(currencyPair, status)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
 **status** | **String**| List orders based on status  &#x60;open&#x60; - order is waiting to be filled &#x60;finished&#x60; - order has been filled or cancelled  | [enum: open, finished]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned. If &#x60;status&#x60; is &#x60;open&#x60;, maximum of &#x60;limit&#x60; is 100 | [optional] [default to 100]

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
**200** | List retrieved |  -  |

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(order)

Create an order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        try {
            Order result = apiInstance.createOrder(order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#createOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
> List&lt;Order&gt; cancelOrders(currencyPair, side, account)

Cancel all &#x60;open&#x60; orders in specified currency pair

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        String side = "sell"; // String | All bids or asks. Both included in not specified
        String account = "spot"; // String | Specify account type. Default to all account types being included
        try {
            List<Order> result = apiInstance.cancelOrders(currencyPair, side, account);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#cancelOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
 **side** | **String**| All bids or asks. Both included in not specified | [optional] [enum: buy, sell]
 **account** | **String**| Specify account type. Default to all account types being included | [optional] [enum: spot, margin]

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
**200** | Batch cancellation request accepted. Query order status by listing orders |  -  |

<a name="cancelBatchOrders"></a>
# **cancelBatchOrders**
> List&lt;CancelOrderResult&gt; cancelBatchOrders(cancelOrder)

Cancel a batch of orders with an ID list

Multiple currency pairs can be specified, but maximum 20 orders are allowed per request

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        List<CancelOrder> cancelOrder = Arrays.asList(); // List<CancelOrder> | 
        try {
            List<CancelOrderResult> result = apiInstance.cancelBatchOrders(cancelOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#cancelBatchOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancelOrder** | [**List&lt;CancelOrder&gt;**](CancelOrder.md)|  |

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
> Order getOrder(orderId, currencyPair)

Get a single order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        String orderId = "12345"; // String | ID returned on order successfully being created
        String currencyPair = "BTC_USDT"; // String | Currency pair
        try {
            Order result = apiInstance.getOrder(orderId, currencyPair);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#getOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID returned on order successfully being created |
 **currencyPair** | **String**| Currency pair |

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
> Order cancelOrder(orderId, currencyPair)

Cancel a single order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        String orderId = "12345"; // String | ID returned on order successfully being created
        String currencyPair = "BTC_USDT"; // String | Currency pair
        try {
            Order result = apiInstance.cancelOrder(orderId, currencyPair);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#cancelOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID returned on order successfully being created |
 **currencyPair** | **String**| Currency pair |

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

<a name="listMyTrades"></a>
# **listMyTrades**
> List&lt;Trade&gt; listMyTrades(currencyPair).limit(limit).page(page).orderId(orderId).execute();

List personal trading history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
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
        Integer limit = 100; // Integer | Maximum number of records returned in one list
        Integer page = 1; // Integer | Page number
        String orderId = "12345"; // String | List all trades of specified order
        try {
            List<Trade> result = apiInstance.listMyTrades(currencyPair)
                        .limit(limit)
                        .page(page)
                        .orderId(orderId)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpotApi#listMyTrades");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **orderId** | **String**| List all trades of specified order | [optional]

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
**200** | List retrieved |  -  |

