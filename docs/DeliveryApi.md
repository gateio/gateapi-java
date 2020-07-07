# DeliveryApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDeliveryOrder**](DeliveryApi.md#cancelDeliveryOrder) | **DELETE** /delivery/{settle}/orders/{order_id} | Cancel a single order
[**cancelDeliveryOrders**](DeliveryApi.md#cancelDeliveryOrders) | **DELETE** /delivery/{settle}/orders | Cancel all &#x60;open&#x60; orders matched
[**cancelPriceTriggeredDeliveryOrder**](DeliveryApi.md#cancelPriceTriggeredDeliveryOrder) | **DELETE** /delivery/{settle}/price_orders/{order_id} | Cancel a single order
[**cancelPriceTriggeredDeliveryOrderList**](DeliveryApi.md#cancelPriceTriggeredDeliveryOrderList) | **DELETE** /delivery/{settle}/price_orders | Cancel all open orders
[**createDeliveryOrder**](DeliveryApi.md#createDeliveryOrder) | **POST** /delivery/{settle}/orders | Create a futures order
[**createPriceTriggeredDeliveryOrder**](DeliveryApi.md#createPriceTriggeredDeliveryOrder) | **POST** /delivery/{settle}/price_orders | Create a price-triggered order
[**getDeliveryContract**](DeliveryApi.md#getDeliveryContract) | **GET** /delivery/{settle}/contracts/{contract} | Get a single contract
[**getDeliveryOrder**](DeliveryApi.md#getDeliveryOrder) | **GET** /delivery/{settle}/orders/{order_id} | Get a single order
[**getDeliveryPosition**](DeliveryApi.md#getDeliveryPosition) | **GET** /delivery/{settle}/positions/{contract} | Get single position
[**getMyDeliveryTrades**](DeliveryApi.md#getMyDeliveryTrades) | **GET** /delivery/{settle}/my_trades | List personal trading history
[**getPriceTriggeredDeliveryOrder**](DeliveryApi.md#getPriceTriggeredDeliveryOrder) | **GET** /delivery/{settle}/price_orders/{order_id} | Get a single order
[**listDeliveryAccountBook**](DeliveryApi.md#listDeliveryAccountBook) | **GET** /delivery/{settle}/account_book | Query account book
[**listDeliveryAccounts**](DeliveryApi.md#listDeliveryAccounts) | **GET** /delivery/{settle}/accounts | Query futures account
[**listDeliveryCandlesticks**](DeliveryApi.md#listDeliveryCandlesticks) | **GET** /delivery/{settle}/candlesticks | Get futures candlesticks
[**listDeliveryContracts**](DeliveryApi.md#listDeliveryContracts) | **GET** /delivery/{settle}/contracts | List all futures contracts
[**listDeliveryInsuranceLedger**](DeliveryApi.md#listDeliveryInsuranceLedger) | **GET** /delivery/{settle}/insurance | Futures insurance balance history
[**listDeliveryLiquidates**](DeliveryApi.md#listDeliveryLiquidates) | **GET** /delivery/{settle}/liquidates | List liquidation history
[**listDeliveryOrderBook**](DeliveryApi.md#listDeliveryOrderBook) | **GET** /delivery/{settle}/order_book | Futures order book
[**listDeliveryOrders**](DeliveryApi.md#listDeliveryOrders) | **GET** /delivery/{settle}/orders | List futures orders
[**listDeliveryPositionClose**](DeliveryApi.md#listDeliveryPositionClose) | **GET** /delivery/{settle}/position_close | List position close history
[**listDeliveryPositions**](DeliveryApi.md#listDeliveryPositions) | **GET** /delivery/{settle}/positions | List all positions of a user
[**listDeliverySettlements**](DeliveryApi.md#listDeliverySettlements) | **GET** /delivery/{settle}/settlements | List settlement history
[**listDeliveryTickers**](DeliveryApi.md#listDeliveryTickers) | **GET** /delivery/{settle}/tickers | List futures tickers
[**listDeliveryTrades**](DeliveryApi.md#listDeliveryTrades) | **GET** /delivery/{settle}/trades | Futures trading history
[**listPriceTriggeredDeliveryOrders**](DeliveryApi.md#listPriceTriggeredDeliveryOrders) | **GET** /delivery/{settle}/price_orders | List all auto orders
[**updateDeliveryPositionLeverage**](DeliveryApi.md#updateDeliveryPositionLeverage) | **POST** /delivery/{settle}/positions/{contract}/leverage | Update position leverage
[**updateDeliveryPositionMargin**](DeliveryApi.md#updateDeliveryPositionMargin) | **POST** /delivery/{settle}/positions/{contract}/margin | Update position margin
[**updateDeliveryPositionRiskLimit**](DeliveryApi.md#updateDeliveryPositionRiskLimit) | **POST** /delivery/{settle}/positions/{contract}/risk_limit | Update position risk limit


<a name="cancelDeliveryOrder"></a>
# **cancelDeliveryOrder**
> FuturesOrder cancelDeliveryOrder(settle, orderId)

Cancel a single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String orderId = "12345"; // String | ID returned on order successfully being created
try {
    FuturesOrder result = apiInstance.cancelDeliveryOrder(settle, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#cancelDeliveryOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **orderId** | **String**| ID returned on order successfully being created |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelDeliveryOrders"></a>
# **cancelDeliveryOrders**
> List&lt;FuturesOrder&gt; cancelDeliveryOrders(settle, contract, side)

Cancel all &#x60;open&#x60; orders matched

Zero-fill order cannot be retrieved 60 seconds after cancellation

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
String side = "ask"; // String | All bids or asks. Both included in not specified
try {
    List<FuturesOrder> result = apiInstance.cancelDeliveryOrders(settle, contract, side);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#cancelDeliveryOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |
 **side** | **String**| All bids or asks. Both included in not specified | [optional] [enum: ask, bid]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelPriceTriggeredDeliveryOrder"></a>
# **cancelPriceTriggeredDeliveryOrder**
> FuturesPriceTriggeredOrder cancelPriceTriggeredDeliveryOrder(settle, orderId)

Cancel a single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String orderId = "orderId_example"; // String | ID returned on order successfully being created
try {
    FuturesPriceTriggeredOrder result = apiInstance.cancelPriceTriggeredDeliveryOrder(settle, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#cancelPriceTriggeredDeliveryOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **orderId** | **String**| ID returned on order successfully being created |

### Return type

[**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelPriceTriggeredDeliveryOrderList"></a>
# **cancelPriceTriggeredDeliveryOrderList**
> List&lt;FuturesPriceTriggeredOrder&gt; cancelPriceTriggeredDeliveryOrderList(settle, contract)

Cancel all open orders

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USD"; // String | Futures contract
try {
    List<FuturesPriceTriggeredOrder> result = apiInstance.cancelPriceTriggeredDeliveryOrderList(settle, contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#cancelPriceTriggeredDeliveryOrderList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |

### Return type

[**List&lt;FuturesPriceTriggeredOrder&gt;**](FuturesPriceTriggeredOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDeliveryOrder"></a>
# **createDeliveryOrder**
> FuturesOrder createDeliveryOrder(settle, futuresOrder)

Create a futures order

Zero-fill order cannot be retrieved 60 seconds after cancellation

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
FuturesOrder futuresOrder = new FuturesOrder(); // FuturesOrder | 
try {
    FuturesOrder result = apiInstance.createDeliveryOrder(settle, futuresOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#createDeliveryOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **futuresOrder** | [**FuturesOrder**](FuturesOrder.md)|  |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPriceTriggeredDeliveryOrder"></a>
# **createPriceTriggeredDeliveryOrder**
> TriggerOrderResponse createPriceTriggeredDeliveryOrder(settle, futuresPriceTriggeredOrder)

Create a price-triggered order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
FuturesPriceTriggeredOrder futuresPriceTriggeredOrder = new FuturesPriceTriggeredOrder(); // FuturesPriceTriggeredOrder | 
try {
    TriggerOrderResponse result = apiInstance.createPriceTriggeredDeliveryOrder(settle, futuresPriceTriggeredOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#createPriceTriggeredDeliveryOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **futuresPriceTriggeredOrder** | [**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)|  |

### Return type

[**TriggerOrderResponse**](TriggerOrderResponse.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeliveryContract"></a>
# **getDeliveryContract**
> DeliveryContract getDeliveryContract(settle, contract)

Get a single contract

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

DeliveryApi apiInstance = new DeliveryApi();
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
try {
    DeliveryContract result = apiInstance.getDeliveryContract(settle, contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#getDeliveryContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |

### Return type

[**DeliveryContract**](DeliveryContract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeliveryOrder"></a>
# **getDeliveryOrder**
> FuturesOrder getDeliveryOrder(settle, orderId)

Get a single order

Zero-fill order cannot be retrieved 60 seconds after cancellation

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String orderId = "12345"; // String | ID returned on order successfully being created
try {
    FuturesOrder result = apiInstance.getDeliveryOrder(settle, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#getDeliveryOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **orderId** | **String**| ID returned on order successfully being created |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeliveryPosition"></a>
# **getDeliveryPosition**
> Position getDeliveryPosition(settle, contract)

Get single position

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
try {
    Position result = apiInstance.getDeliveryPosition(settle, contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#getDeliveryPosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |

### Return type

[**Position**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMyDeliveryTrades"></a>
# **getMyDeliveryTrades**
> List&lt;MyFuturesTrade&gt; getMyDeliveryTrades(settle, contract, order, limit, offset, lastId, countTotal)

List personal trading history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
Integer order = 12345; // Integer | Futures order ID, return related data only if specified
Integer limit = 100; // Integer | Maximum number of records returned in one list
Integer offset = 0; // Integer | List offset, starting from 0
String lastId = "12345"; // String | Specify list staring point using the `id` of last record in previous list-query results
Integer countTotal = 0; // Integer | Whether to return total number matched. Default to 0(no return)
try {
    List<MyFuturesTrade> result = apiInstance.getMyDeliveryTrades(settle, contract, order, limit, offset, lastId, countTotal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#getMyDeliveryTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract | [optional]
 **order** | **Integer**| Futures order ID, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Specify list staring point using the &#x60;id&#x60; of last record in previous list-query results | [optional]
 **countTotal** | **Integer**| Whether to return total number matched. Default to 0(no return) | [optional] [default to 0] [enum: 0, 1]

### Return type

[**List&lt;MyFuturesTrade&gt;**](MyFuturesTrade.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPriceTriggeredDeliveryOrder"></a>
# **getPriceTriggeredDeliveryOrder**
> FuturesPriceTriggeredOrder getPriceTriggeredDeliveryOrder(settle, orderId)

Get a single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String orderId = "orderId_example"; // String | ID returned on order successfully being created
try {
    FuturesPriceTriggeredOrder result = apiInstance.getPriceTriggeredDeliveryOrder(settle, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#getPriceTriggeredDeliveryOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **orderId** | **String**| ID returned on order successfully being created |

### Return type

[**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryAccountBook"></a>
# **listDeliveryAccountBook**
> List&lt;FuturesAccountBook&gt; listDeliveryAccountBook(settle, limit, from, to, type)

Query account book

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
Integer limit = 100; // Integer | Maximum number of records returned in one list
Integer from = 1547706332; // Integer | Start timestamp
Integer to = 1547706332; // Integer | End timestamp
String type = "dnw"; // String | Changing Type: - dnw: Deposit & Withdraw - pnl: Profit & Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: POINT Deposit & Withdraw - point_fee: POINT Trading fee - point_refr: POINT Referrer rebate
try {
    List<FuturesAccountBook> result = apiInstance.listDeliveryAccountBook(settle, limit, from, to, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryAccountBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]
 **from** | **Integer**| Start timestamp | [optional]
 **to** | **Integer**| End timestamp | [optional]
 **type** | **String**| Changing Type: - dnw: Deposit &amp; Withdraw - pnl: Profit &amp; Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: POINT Deposit &amp; Withdraw - point_fee: POINT Trading fee - point_refr: POINT Referrer rebate | [optional] [enum: dnw, pnl, fee, refr, fund, point_dnw, point_fee, point_refr]

### Return type

[**List&lt;FuturesAccountBook&gt;**](FuturesAccountBook.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryAccounts"></a>
# **listDeliveryAccounts**
> FuturesAccount listDeliveryAccounts(settle)

Query futures account

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
try {
    FuturesAccount result = apiInstance.listDeliveryAccounts(settle);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]

### Return type

[**FuturesAccount**](FuturesAccount.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryCandlesticks"></a>
# **listDeliveryCandlesticks**
> List&lt;FuturesCandlestick&gt; listDeliveryCandlesticks(settle, contract, from, to, limit, interval)

Get futures candlesticks

Return specified contract candlesticks. If prefix &#x60;contract&#x60; with &#x60;mark_&#x60;, the contract&#39;s mark price candlesticks are returned; if prefix with &#x60;index_&#x60;, index price candlesticks will be returned.  Maximum of 2000 points are returned in one query. Be sure not to exceed the limit when specifying &#x60;from&#x60;, &#x60;to&#x60; and &#x60;interval&#x60;

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

DeliveryApi apiInstance = new DeliveryApi();
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
BigDecimal from = new BigDecimal(); // BigDecimal | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
BigDecimal to = new BigDecimal(); // BigDecimal | End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time
Integer limit = 100; // Integer | Maximum recent data points returned. `limit` is conflicted with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
String interval = "5m"; // String | Interval time between data points
try {
    List<FuturesCandlestick> result = apiInstance.listDeliveryCandlesticks(settle, contract, from, to, limit, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryCandlesticks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |
 **from** | **BigDecimal**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to&#x60;to - 100 * interval&#x60; if not specified | [optional]
 **to** | **BigDecimal**| End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time | [optional]
 **limit** | **Integer**| Maximum recent data points returned. &#x60;limit&#x60; is conflicted with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected. | [optional] [default to 100]
 **interval** | **String**| Interval time between data points | [optional] [default to 5m] [enum: 10s, 1m, 5m, 15m, 30m, 1h, 4h, 8h, 1d, 7d]

### Return type

[**List&lt;FuturesCandlestick&gt;**](FuturesCandlestick.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryContracts"></a>
# **listDeliveryContracts**
> List&lt;DeliveryContract&gt; listDeliveryContracts(settle)

List all futures contracts

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

DeliveryApi apiInstance = new DeliveryApi();
String settle = "usdt"; // String | Settle currency
try {
    List<DeliveryContract> result = apiInstance.listDeliveryContracts(settle);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryContracts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]

### Return type

[**List&lt;DeliveryContract&gt;**](DeliveryContract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryInsuranceLedger"></a>
# **listDeliveryInsuranceLedger**
> List&lt;InsuranceRecord&gt; listDeliveryInsuranceLedger(settle, limit)

Futures insurance balance history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

DeliveryApi apiInstance = new DeliveryApi();
String settle = "usdt"; // String | Settle currency
Integer limit = 100; // Integer | Maximum number of records returned in one list
try {
    List<InsuranceRecord> result = apiInstance.listDeliveryInsuranceLedger(settle, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryInsuranceLedger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]

### Return type

[**List&lt;InsuranceRecord&gt;**](InsuranceRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryLiquidates"></a>
# **listDeliveryLiquidates**
> List&lt;FuturesLiquidate&gt; listDeliveryLiquidates(settle, contract, limit, at)

List liquidation history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
Integer limit = 100; // Integer | Maximum number of records returned in one list
Integer at = 0; // Integer | Specify a liquidation timestamp
try {
    List<FuturesLiquidate> result = apiInstance.listDeliveryLiquidates(settle, contract, limit, at);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryLiquidates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract | [optional]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]
 **at** | **Integer**| Specify a liquidation timestamp | [optional] [default to 0]

### Return type

[**List&lt;FuturesLiquidate&gt;**](FuturesLiquidate.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryOrderBook"></a>
# **listDeliveryOrderBook**
> FuturesOrderBook listDeliveryOrderBook(settle, contract, interval, limit)

Futures order book

Bids will be sorted by price from high to low, while asks sorted reversely

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

DeliveryApi apiInstance = new DeliveryApi();
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
String interval = "0"; // String | Order depth. 0 means no aggregation is applied. default to 0
Integer limit = 10; // Integer | Maximum number of order depth data in asks or bids
try {
    FuturesOrderBook result = apiInstance.listDeliveryOrderBook(settle, contract, interval, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryOrderBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |
 **interval** | **String**| Order depth. 0 means no aggregation is applied. default to 0 | [optional] [default to 0] [enum: 0, 0.1, 0.01]
 **limit** | **Integer**| Maximum number of order depth data in asks or bids | [optional] [default to 10]

### Return type

[**FuturesOrderBook**](FuturesOrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryOrders"></a>
# **listDeliveryOrders**
> List&lt;FuturesOrder&gt; listDeliveryOrders(settle, status, contract, limit, offset, lastId, countTotal)

List futures orders

Zero-fill order cannot be retrieved 60 seconds after cancellation

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String status = "open"; // String | List orders based on status
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
Integer limit = 100; // Integer | Maximum number of records returned in one list
Integer offset = 0; // Integer | List offset, starting from 0
String lastId = "12345"; // String | Specify list staring point using the `id` of last record in previous list-query results
Integer countTotal = 0; // Integer | Whether to return total number matched. Default to 0(no return)
try {
    List<FuturesOrder> result = apiInstance.listDeliveryOrders(settle, status, contract, limit, offset, lastId, countTotal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **status** | **String**| List orders based on status | [enum: open, finished]
 **contract** | **String**| Futures contract | [optional]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Specify list staring point using the &#x60;id&#x60; of last record in previous list-query results | [optional]
 **countTotal** | **Integer**| Whether to return total number matched. Default to 0(no return) | [optional] [default to 0] [enum: 0, 1]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryPositionClose"></a>
# **listDeliveryPositionClose**
> List&lt;PositionClose&gt; listDeliveryPositionClose(settle, contract, limit)

List position close history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
Integer limit = 100; // Integer | Maximum number of records returned in one list
try {
    List<PositionClose> result = apiInstance.listDeliveryPositionClose(settle, contract, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryPositionClose");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract | [optional]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]

### Return type

[**List&lt;PositionClose&gt;**](PositionClose.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryPositions"></a>
# **listDeliveryPositions**
> List&lt;Position&gt; listDeliveryPositions(settle)

List all positions of a user

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
try {
    List<Position> result = apiInstance.listDeliveryPositions(settle);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryPositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliverySettlements"></a>
# **listDeliverySettlements**
> List&lt;DeliverySettlement&gt; listDeliverySettlements(settle, contract, limit, at)

List settlement history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
Integer limit = 100; // Integer | Maximum number of records returned in one list
Integer at = 0; // Integer | Specify a settlement timestamp
try {
    List<DeliverySettlement> result = apiInstance.listDeliverySettlements(settle, contract, limit, at);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliverySettlements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract | [optional]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]
 **at** | **Integer**| Specify a settlement timestamp | [optional] [default to 0]

### Return type

[**List&lt;DeliverySettlement&gt;**](DeliverySettlement.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryTickers"></a>
# **listDeliveryTickers**
> List&lt;FuturesTicker&gt; listDeliveryTickers(settle, contract)

List futures tickers

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

DeliveryApi apiInstance = new DeliveryApi();
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
try {
    List<FuturesTicker> result = apiInstance.listDeliveryTickers(settle, contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryTickers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract | [optional]

### Return type

[**List&lt;FuturesTicker&gt;**](FuturesTicker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeliveryTrades"></a>
# **listDeliveryTrades**
> List&lt;FuturesTrade&gt; listDeliveryTrades(settle, contract, limit, lastId, from, to)

Futures trading history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

DeliveryApi apiInstance = new DeliveryApi();
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
Integer limit = 100; // Integer | Maximum number of records returned in one list
String lastId = "12345"; // String | Specify list staring point using the id of last record in previous list-query results  This parameter is deprecated. Use `from` and `to` instead to limit time range
BigDecimal from = new BigDecimal(); // BigDecimal | Specify starting time in Unix seconds. If not specified, `to` and `limit` will be used to limit response items. If items between `from` and `to` are more than `limit`, only `limit` number will be returned. 
BigDecimal to = new BigDecimal(); // BigDecimal | Specify end time in Unix seconds, default to current time
try {
    List<FuturesTrade> result = apiInstance.listDeliveryTrades(settle, contract, limit, lastId, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listDeliveryTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]
 **lastId** | **String**| Specify list staring point using the id of last record in previous list-query results  This parameter is deprecated. Use &#x60;from&#x60; and &#x60;to&#x60; instead to limit time range | [optional]
 **from** | **BigDecimal**| Specify starting time in Unix seconds. If not specified, &#x60;to&#x60; and &#x60;limit&#x60; will be used to limit response items. If items between &#x60;from&#x60; and &#x60;to&#x60; are more than &#x60;limit&#x60;, only &#x60;limit&#x60; number will be returned.  | [optional]
 **to** | **BigDecimal**| Specify end time in Unix seconds, default to current time | [optional]

### Return type

[**List&lt;FuturesTrade&gt;**](FuturesTrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPriceTriggeredDeliveryOrders"></a>
# **listPriceTriggeredDeliveryOrders**
> List&lt;FuturesPriceTriggeredOrder&gt; listPriceTriggeredDeliveryOrders(settle, status, contract, limit, offset)

List all auto orders

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String status = "status_example"; // String | List orders based on status
String contract = "BTC_USD"; // String | Futures contract, return related data only if specified
Integer limit = 100; // Integer | Maximum number of records returned in one list
Integer offset = 0; // Integer | List offset, starting from 0
try {
    List<FuturesPriceTriggeredOrder> result = apiInstance.listPriceTriggeredDeliveryOrders(settle, status, contract, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#listPriceTriggeredDeliveryOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **status** | **String**| List orders based on status | [enum: open, finished]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;FuturesPriceTriggeredOrder&gt;**](FuturesPriceTriggeredOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDeliveryPositionLeverage"></a>
# **updateDeliveryPositionLeverage**
> Position updateDeliveryPositionLeverage(settle, contract, leverage)

Update position leverage

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
String leverage = "10"; // String | New position leverage
try {
    Position result = apiInstance.updateDeliveryPositionLeverage(settle, contract, leverage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#updateDeliveryPositionLeverage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |
 **leverage** | **String**| New position leverage |

### Return type

[**Position**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDeliveryPositionMargin"></a>
# **updateDeliveryPositionMargin**
> Position updateDeliveryPositionMargin(settle, contract, change)

Update position margin

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
String change = "0.01"; // String | Margin change. Use positive number to increase margin, negative number otherwise.
try {
    Position result = apiInstance.updateDeliveryPositionMargin(settle, contract, change);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#updateDeliveryPositionMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |
 **change** | **String**| Margin change. Use positive number to increase margin, negative number otherwise. |

### Return type

[**Position**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDeliveryPositionRiskLimit"></a>
# **updateDeliveryPositionRiskLimit**
> Position updateDeliveryPositionRiskLimit(settle, contract, riskLimit)

Update position risk limit

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
DeliveryApi apiInstance = new DeliveryApi(client);
String settle = "usdt"; // String | Settle currency
String contract = "BTC_USDT_WEEKLY_20200703"; // String | Futures contract
String riskLimit = "10"; // String | New position risk limit
try {
    Position result = apiInstance.updateDeliveryPositionRiskLimit(settle, contract, riskLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#updateDeliveryPositionRiskLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: usdt]
 **contract** | **String**| Futures contract |
 **riskLimit** | **String**| New position risk limit |

### Return type

[**Position**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

