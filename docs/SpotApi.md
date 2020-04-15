# SpotApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBatchOrders**](SpotApi.md#cancelBatchOrders) | **POST** /spot/cancel_batch_orders | Cancel a batch of orders with an ID list
[**cancelOrder**](SpotApi.md#cancelOrder) | **DELETE** /spot/orders/{order_id} | Cancel a single order
[**cancelOrders**](SpotApi.md#cancelOrders) | **DELETE** /spot/orders | Cancel all &#x60;open&#x60; orders in specified currency pair
[**createBatchOrders**](SpotApi.md#createBatchOrders) | **POST** /spot/batch_orders | Create a batch of orders
[**createOrder**](SpotApi.md#createOrder) | **POST** /spot/orders | Create an order
[**getCurrencyPair**](SpotApi.md#getCurrencyPair) | **GET** /spot/currency_pairs/{currency_pair} | Get detail of one single order
[**getOrder**](SpotApi.md#getOrder) | **GET** /spot/orders/{order_id} | Get a single order
[**listCandlesticks**](SpotApi.md#listCandlesticks) | **GET** /spot/candlesticks | Market candlesticks
[**listCurrencyPairs**](SpotApi.md#listCurrencyPairs) | **GET** /spot/currency_pairs | List all currency pairs supported
[**listMyTrades**](SpotApi.md#listMyTrades) | **GET** /spot/my_trades | List personal trading history
[**listOrderBook**](SpotApi.md#listOrderBook) | **GET** /spot/order_book | Retrieve order book
[**listOrders**](SpotApi.md#listOrders) | **GET** /spot/orders | List orders
[**listSpotAccounts**](SpotApi.md#listSpotAccounts) | **GET** /spot/accounts | List spot accounts
[**listTickers**](SpotApi.md#listTickers) | **GET** /spot/tickers | Retrieve ticker information
[**listTrades**](SpotApi.md#listTrades) | **GET** /spot/trades | Retrieve market trades


<a name="cancelBatchOrders"></a>
# **cancelBatchOrders**
> List&lt;CancelOrderResult&gt; cancelBatchOrders(cancelOrder)

Cancel a batch of orders with an ID list

Multiple currency pairs can be specified, but maximum 20 orders are allowed per request

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
SpotApi apiInstance = new SpotApi(client);
List<CancelOrder> cancelOrder = new ArrayList<>(); // List<CancelOrder> | 
try {
    List<CancelOrderResult> result = apiInstance.cancelBatchOrders(cancelOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#cancelBatchOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancelOrder** | [**List&lt;CancelOrder&gt;**](CancelOrder.md)|  |

### Return type

[**List&lt;CancelOrderResult&gt;**](CancelOrderResult.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelOrder"></a>
# **cancelOrder**
> Order cancelOrder(orderId, currencyPair)

Cancel a single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
SpotApi apiInstance = new SpotApi(client);
String orderId = "12345"; // String | ID returned on order successfully being created
String currencyPair = "BTC_USDT"; // String | Currency pair
try {
    Order result = apiInstance.cancelOrder(orderId, currencyPair);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#cancelOrder");
    e.printStackTrace();
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

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelOrders"></a>
# **cancelOrders**
> List&lt;Order&gt; cancelOrders(currencyPair, side, account)

Cancel all &#x60;open&#x60; orders in specified currency pair

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
SpotApi apiInstance = new SpotApi(client);
String currencyPair = "BTC_USDT"; // String | Currency pair
String side = "sell"; // String | All bids or asks. Both included in not specified
String account = "spot"; // String | Specify account type. Default to all account types being included
try {
    List<Order> result = apiInstance.cancelOrders(currencyPair, side, account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#cancelOrders");
    e.printStackTrace();
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

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBatchOrders"></a>
# **createBatchOrders**
> List&lt;BatchOrder&gt; createBatchOrders(order)

Create a batch of orders

Batch orders requirements:  1. custom order field &#x60;text&#x60; is required 2. At most 4 currency pairs, maximum 5 orders each, are allowed in one request 3. No mixture of spot orders and margin orders, i.e. &#x60;account&#x60; must be identical for all orders 

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
SpotApi apiInstance = new SpotApi(client);
List<Order> order = new ArrayList<>(); // List<Order> | 
try {
    List<BatchOrder> result = apiInstance.createBatchOrders(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#createBatchOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**List&lt;Order&gt;**](Order.md)|  |

### Return type

[**List&lt;BatchOrder&gt;**](BatchOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(order)

Create an order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
SpotApi apiInstance = new SpotApi(client);
Order order = new Order(); // Order | 
try {
    Order result = apiInstance.createOrder(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)|  |

### Return type

[**Order**](Order.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencyPair"></a>
# **getCurrencyPair**
> CurrencyPair getCurrencyPair(currencyPair)

Get detail of one single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

SpotApi apiInstance = new SpotApi();
String currencyPair = "ETH_BTC"; // String | Currency pair
try {
    CurrencyPair result = apiInstance.getCurrencyPair(currencyPair);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#getCurrencyPair");
    e.printStackTrace();
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

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(orderId, currencyPair)

Get a single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
SpotApi apiInstance = new SpotApi(client);
String orderId = "12345"; // String | ID returned on order successfully being created
String currencyPair = "BTC_USDT"; // String | Currency pair
try {
    Order result = apiInstance.getOrder(orderId, currencyPair);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#getOrder");
    e.printStackTrace();
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

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCandlesticks"></a>
# **listCandlesticks**
> List&lt;List&lt;String&gt;&gt; listCandlesticks(currencyPair, limit, from, to, interval)

Market candlesticks

Maximum of 1000 points are returned in one query. Be sure not to exceed the limit when specifying &#x60;from&#x60;, &#x60;to&#x60; and &#x60;interval&#x60;

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

SpotApi apiInstance = new SpotApi();
String currencyPair = "BTC_USDT"; // String | Currency pair
Integer limit = 100; // Integer | Maximum recent data points returned. `limit` is conflicted with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
Long from = 1546905600; // Long | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
Long to = 1546935600; // Long | End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time
String interval = "30m"; // String | Interval time between data points
try {
    List<List<String>> result = apiInstance.listCandlesticks(currencyPair, limit, from, to, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#listCandlesticks");
    e.printStackTrace();
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

<a name="listCurrencyPairs"></a>
# **listCurrencyPairs**
> List&lt;CurrencyPair&gt; listCurrencyPairs()

List all currency pairs supported

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

SpotApi apiInstance = new SpotApi();
try {
    List<CurrencyPair> result = apiInstance.listCurrencyPairs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#listCurrencyPairs");
    e.printStackTrace();
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

<a name="listMyTrades"></a>
# **listMyTrades**
> List&lt;Trade&gt; listMyTrades(currencyPair, limit, page, orderId)

List personal trading history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
SpotApi apiInstance = new SpotApi(client);
String currencyPair = "BTC_USDT"; // String | Currency pair
Integer limit = 100; // Integer | Maximum number of record returned in one list
Integer page = 1; // Integer | Page number
String orderId = "12345"; // String | List all trades of specified order
try {
    List<Trade> result = apiInstance.listMyTrades(currencyPair, limit, page, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#listMyTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPair** | **String**| Currency pair |
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **orderId** | **String**| List all trades of specified order | [optional]

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrderBook"></a>
# **listOrderBook**
> OrderBook listOrderBook(currencyPair, interval, limit)

Retrieve order book

Order book will be sorted by price from high to low on bids; reversed on asks

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

SpotApi apiInstance = new SpotApi();
String currencyPair = "BTC_USDT"; // String | Currency pair
String interval = "\"0\""; // String | Order depth. 0 means no aggregation is applied. default to 0
Integer limit = 10; // Integer | Maximum number of order depth data in asks or bids
try {
    OrderBook result = apiInstance.listOrderBook(currencyPair, interval, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#listOrderBook");
    e.printStackTrace();
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

<a name="listOrders"></a>
# **listOrders**
> List&lt;Order&gt; listOrders(currencyPair, status, page, limit)

List orders

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
SpotApi apiInstance = new SpotApi(client);
String currencyPair = "BTC_USDT"; // String | Currency pair
String status = "open"; // String | List orders based on status  `open` - order is waiting to be filled `finished` - order has been filled or cancelled 
Integer page = 1; // Integer | Page number
Integer limit = 100; // Integer | Maximum number of record returned in one list
try {
    List<Order> result = apiInstance.listOrders(currencyPair, status, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#listOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPair** | **String**| Currency pair |
 **status** | **String**| List orders based on status  &#x60;open&#x60; - order is waiting to be filled &#x60;finished&#x60; - order has been filled or cancelled  | [enum: open, finished]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpotAccounts"></a>
# **listSpotAccounts**
> List&lt;SpotAccount&gt; listSpotAccounts(currency)

List spot accounts

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
SpotApi apiInstance = new SpotApi(client);
String currency = "BTC"; // String | Retrieved specified currency related data
try {
    List<SpotAccount> result = apiInstance.listSpotAccounts(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#listSpotAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Retrieved specified currency related data | [optional]

### Return type

[**List&lt;SpotAccount&gt;**](SpotAccount.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTickers"></a>
# **listTickers**
> List&lt;Ticker&gt; listTickers(currencyPair)

Retrieve ticker information

Return only related data if &#x60;currency_pair&#x60; is specified; otherwise return all of them

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

SpotApi apiInstance = new SpotApi();
String currencyPair = "BTC_USDT"; // String | Currency pair
try {
    List<Ticker> result = apiInstance.listTickers(currencyPair);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#listTickers");
    e.printStackTrace();
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

<a name="listTrades"></a>
# **listTrades**
> List&lt;Trade&gt; listTrades(currencyPair, limit, lastId)

Retrieve market trades

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SpotApi;

import java.io.File;
import java.util.*;

SpotApi apiInstance = new SpotApi();
String currencyPair = "BTC_USDT"; // String | Currency pair
Integer limit = 100; // Integer | Maximum number of record returned in one list
String lastId = "12345"; // String | Specify list staring point using the `id` of last record in previous list-query results
try {
    List<Trade> result = apiInstance.listTrades(currencyPair, limit, lastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotApi#listTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPair** | **String**| Currency pair |
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **lastId** | **String**| Specify list staring point using the &#x60;id&#x60; of last record in previous list-query results | [optional]

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

