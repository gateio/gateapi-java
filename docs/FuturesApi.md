# FuturesApi

All URIs are relative to *https://fx-api.gateio.io/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](FuturesApi.md#cancelOrder) | **DELETE** /futures/orders/{order_id} | Cancel a single order
[**cancelOrders**](FuturesApi.md#cancelOrders) | **DELETE** /futures/orders | Cancel all &#x60;open&#x60; orders matched
[**createOrder**](FuturesApi.md#createOrder) | **POST** /futures/orders | Create a futures order
[**getMyTrades**](FuturesApi.md#getMyTrades) | **GET** /futures/my_trades | List personal trading history
[**getOrder**](FuturesApi.md#getOrder) | **GET** /futures/orders/{order_id} | Get a single order
[**listFuturesAccounts**](FuturesApi.md#listFuturesAccounts) | **GET** /futures/accounts | Query futures account
[**listFuturesCandlesticks**](FuturesApi.md#listFuturesCandlesticks) | **GET** /futures/candlesticks | Get futures candlesticks
[**listFuturesContracts**](FuturesApi.md#listFuturesContracts) | **GET** /futures/contracts | List all futures contracts
[**listFuturesFundingRateHistory**](FuturesApi.md#listFuturesFundingRateHistory) | **GET** /futures/funding_rate | Funding rate history
[**listFuturesInsuranceLedger**](FuturesApi.md#listFuturesInsuranceLedger) | **GET** /futures/insurance | Futures insurance balance history
[**listFuturesOrderBook**](FuturesApi.md#listFuturesOrderBook) | **GET** /futures/order_book | Futures order book
[**listFuturesTickers**](FuturesApi.md#listFuturesTickers) | **GET** /futures/tickers | List futures tickers
[**listFuturesTrades**](FuturesApi.md#listFuturesTrades) | **GET** /futures/trades | Futures trading history
[**listOrders**](FuturesApi.md#listOrders) | **GET** /futures/orders | List futures orders
[**listPositions**](FuturesApi.md#listPositions) | **GET** /futures/positions | List all positions
[**updatePositionLeverage**](FuturesApi.md#updatePositionLeverage) | **POST** /futures/positions/{contract}/leverage | Update position leverage
[**updatePositionMargin**](FuturesApi.md#updatePositionMargin) | **POST** /futures/positions/{contract}/margin | Update position margin
[**updatePositionRiskLimit**](FuturesApi.md#updatePositionRiskLimit) | **POST** /futures/positions/{contract}/risk_limit | Update poisition risk limit


<a name="cancelOrder"></a>
# **cancelOrder**
> cancelOrder(orderId)

Cancel a single order

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
String orderId = "orderId_example"; // String | order id
try {
    apiInstance.cancelOrder(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#cancelOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| order id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cancelOrders"></a>
# **cancelOrders**
> cancelOrders(contract, side)

Cancel all &#x60;open&#x60; orders matched

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract
String side = "side_example"; // String | All bids or asks. Both included in not specfied
try {
    apiInstance.cancelOrders(contract, side);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#cancelOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract |
 **side** | **String**| All bids or asks. Both included in not specfied | [optional] [enum: ask, bid]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createOrder"></a>
# **createOrder**
> FuturesOrder createOrder(futuresOrder)

Create a futures order

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
FuturesOrder futuresOrder = {"$ref":"examples/mercury/FuturesOrder.json"}; // FuturesOrder | 
try {
    FuturesOrder result = apiInstance.createOrder(futuresOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **futuresOrder** | [**FuturesOrder**](FuturesOrder.md)|  | [optional]

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMyTrades"></a>
# **getMyTrades**
> List&lt;MyFuturesTrade&gt; getMyTrades(contract, limit, lastId)

List personal trading history

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract. If specified, return only data related to the contract
Integer limit = 100; // Integer | maximum number of data returned in one request
String lastId = "lastId_example"; // String | specify list staring record. Use the `id` in every last record of one list-query request to achieve consecutive list query
try {
    List<MyFuturesTrade> result = apiInstance.getMyTrades(contract, limit, lastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#getMyTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract. If specified, return only data related to the contract | [optional]
 **limit** | **Integer**| maximum number of data returned in one request | [optional] [default to 100]
 **lastId** | **String**| specify list staring record. Use the &#x60;id&#x60; in every last record of one list-query request to achieve consecutive list query | [optional]

### Return type

[**List&lt;MyFuturesTrade&gt;**](MyFuturesTrade.md)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrder"></a>
# **getOrder**
> FuturesOrder getOrder(orderId)

Get a single order

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
String orderId = "orderId_example"; // String | order id
try {
    FuturesOrder result = apiInstance.getOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| order id |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesAccounts"></a>
# **listFuturesAccounts**
> FuturesAccount listFuturesAccounts()

Query futures account

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
try {
    FuturesAccount result = apiInstance.listFuturesAccounts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesAccounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FuturesAccount**](FuturesAccount.md)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesCandlesticks"></a>
# **listFuturesCandlesticks**
> FuturesCandlestick listFuturesCandlesticks(contract, from, to, limit, interval)

Get futures candlesticks

Return specified contract candlesticks. If prefix &#x60;contract&#x60; with &#x60;mark_&#x60;, the contract&#39;s mark price candlesticks are returned; if prefix with &#x60;index_&#x60;, index price candlesticks will be returned.  Maximum of 2000 points are returned in one query. Be sure not to exceed the limit when specifying &#x60;from&#x60;, &#x60;to&#x60; and &#x60;interval&#x60; 

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.api.FuturesApi;


FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract
BigDecimal from = new BigDecimal(); // BigDecimal | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to `to - 100 * interval` if not specified 
BigDecimal to = new BigDecimal(); // BigDecimal | End time of candlesticsk, formatted in Unix timestamp in seconds. Default to current time 
Integer limit = 100; // Integer | Maximum recent data points returned. `limit` is conflicted with `from` and `to`. If either `from` or `to` is specified, request will be rejected. 
String interval = "5m"; // String | interval time between data points
try {
    FuturesCandlestick result = apiInstance.listFuturesCandlesticks(contract, from, to, limit, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesCandlesticks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract |
 **from** | **BigDecimal**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to &#x60;to - 100 * interval&#x60; if not specified  | [optional]
 **to** | **BigDecimal**| End time of candlesticsk, formatted in Unix timestamp in seconds. Default to current time  | [optional]
 **limit** | **Integer**| Maximum recent data points returned. &#x60;limit&#x60; is conflicted with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected.  | [optional] [default to 100]
 **interval** | **String**| interval time between data points | [optional] [default to 5m] [enum: 10s, 1m, 5m, 15m, 30m, 1h, 4h, 8h, 1d, 7d]

### Return type

[**FuturesCandlestick**](FuturesCandlestick.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesContracts"></a>
# **listFuturesContracts**
> List&lt;Contract&gt; listFuturesContracts()

List all futures contracts

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.api.FuturesApi;


FuturesApi apiInstance = new FuturesApi();
try {
    List<Contract> result = apiInstance.listFuturesContracts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesContracts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Contract&gt;**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesFundingRateHistory"></a>
# **listFuturesFundingRateHistory**
> FundingRateRecord listFuturesFundingRateHistory(contract, limit)

Funding rate history

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.api.FuturesApi;


FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract
Integer limit = 100; // Integer | maximum number of data returned in one request
try {
    FundingRateRecord result = apiInstance.listFuturesFundingRateHistory(contract, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesFundingRateHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract |
 **limit** | **Integer**| maximum number of data returned in one request | [optional] [default to 100]

### Return type

[**FundingRateRecord**](FundingRateRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesInsuranceLedger"></a>
# **listFuturesInsuranceLedger**
> InsuranceRecord listFuturesInsuranceLedger(limit)

Futures insurance balance history

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.api.FuturesApi;


FuturesApi apiInstance = new FuturesApi();
Integer limit = 100; // Integer | maximum number of data returned in one request
try {
    InsuranceRecord result = apiInstance.listFuturesInsuranceLedger(limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesInsuranceLedger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| maximum number of data returned in one request | [optional] [default to 100]

### Return type

[**InsuranceRecord**](InsuranceRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesOrderBook"></a>
# **listFuturesOrderBook**
> FuturesOrderBook listFuturesOrderBook(contract, interval, limit)

Futures order book

bids will be sorted by price from high to low, while asks sorted reversely

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.api.FuturesApi;


FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract
String interval = "0"; // String | order depth. 0 means no aggregation is applied. default to 0
Integer limit = 10; // Integer | maximum number of order depth data in asks or bids
try {
    FuturesOrderBook result = apiInstance.listFuturesOrderBook(contract, interval, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesOrderBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract |
 **interval** | **String**| order depth. 0 means no aggregation is applied. default to 0 | [optional] [default to 0] [enum: 0, 0.1, 0.01]
 **limit** | **Integer**| maximum number of order depth data in asks or bids | [optional] [default to 10]

### Return type

[**FuturesOrderBook**](FuturesOrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesTickers"></a>
# **listFuturesTickers**
> List&lt;FuturesTicker&gt; listFuturesTickers(contract)

List futures tickers

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.api.FuturesApi;


FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract. If specified, return only data related to the contract
try {
    List<FuturesTicker> result = apiInstance.listFuturesTickers(contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesTickers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract. If specified, return only data related to the contract | [optional]

### Return type

[**List&lt;FuturesTicker&gt;**](FuturesTicker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesTrades"></a>
# **listFuturesTrades**
> List&lt;FuturesTrade&gt; listFuturesTrades(contract, limit, lastId)

Futures trading history

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.api.FuturesApi;


FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract
Integer limit = 100; // Integer | maximum number of data returned in one request
String lastId = "lastId_example"; // String | specify list staring record. Use the `id` in every last record of one list-query request to achieve consecutive list query
try {
    List<FuturesTrade> result = apiInstance.listFuturesTrades(contract, limit, lastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract |
 **limit** | **Integer**| maximum number of data returned in one request | [optional] [default to 100]
 **lastId** | **String**| specify list staring record. Use the &#x60;id&#x60; in every last record of one list-query request to achieve consecutive list query | [optional]

### Return type

[**List&lt;FuturesTrade&gt;**](FuturesTrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrders"></a>
# **listOrders**
> List&lt;FuturesOrder&gt; listOrders(contract, status, limit, lastId)

List futures orders

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract
String status = "status_example"; // String | order status
Integer limit = 100; // Integer | maximum number of data returned in one request
String lastId = "lastId_example"; // String | specify list staring record. Use the `id` in every last record of one list-query request to achieve consecutive list query
try {
    List<FuturesOrder> result = apiInstance.listOrders(contract, status, limit, lastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract |
 **status** | **String**| order status | [enum: open, finished]
 **limit** | **Integer**| maximum number of data returned in one request | [optional] [default to 100]
 **lastId** | **String**| specify list staring record. Use the &#x60;id&#x60; in every last record of one list-query request to achieve consecutive list query | [optional]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPositions"></a>
# **listPositions**
> List&lt;Position&gt; listPositions()

List all positions

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
try {
    List<Position> result = apiInstance.listPositions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listPositions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePositionLeverage"></a>
# **updatePositionLeverage**
> Position updatePositionLeverage(contract, leverage)

Update position leverage

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract
String leverage = "leverage_example"; // String | new leverage of position
try {
    Position result = apiInstance.updatePositionLeverage(contract, leverage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#updatePositionLeverage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract |
 **leverage** | **String**| new leverage of position |

### Return type

[**Position**](Position.md)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePositionMargin"></a>
# **updatePositionMargin**
> Position updatePositionMargin(contract, change)

Update position margin

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract
String change = "change_example"; // String | margin change. Use positive number to increase margin, negative number otherwise.
try {
    Position result = apiInstance.updatePositionMargin(contract, change);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#updatePositionMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract |
 **change** | **String**| margin change. Use positive number to increase margin, negative number otherwise. |

### Return type

[**Position**](Position.md)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePositionRiskLimit"></a>
# **updatePositionRiskLimit**
> Position updatePositionRiskLimit(contract, riskLimit)

Update poisition risk limit

### Example
```java
// Import classes:
//import io.gate.gateclient.ApiClient;
//import io.gate.gateclient.ApiException;
//import io.gate.gateclient.Configuration;
//import io.gate.gateclient.auth.*;
//import io.gate.gateclient.api.FuturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_sign
ApiKeyAuth api_sign = (ApiKeyAuth) defaultClient.getAuthentication("api_sign");
api_sign.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_sign.setApiKeyPrefix("Token");

// Configure API key authorization: api_timestamp
ApiKeyAuth api_timestamp = (ApiKeyAuth) defaultClient.getAuthentication("api_timestamp");
api_timestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_timestamp.setApiKeyPrefix("Token");

FuturesApi apiInstance = new FuturesApi();
String contract = "contract_example"; // String | futures contract
String riskLimit = "riskLimit_example"; // String | new risk limit of position
try {
    Position result = apiInstance.updatePositionRiskLimit(contract, riskLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#updatePositionRiskLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| futures contract |
 **riskLimit** | **String**| new risk limit of position |

### Return type

[**Position**](Position.md)

### Authorization

[api_key](../README.md#api_key), [api_sign](../README.md#api_sign), [api_timestamp](../README.md#api_timestamp)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

