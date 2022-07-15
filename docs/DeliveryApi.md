# DeliveryApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDeliveryContracts**](DeliveryApi.md#listDeliveryContracts) | **GET** /delivery/{settle}/contracts | List all futures contracts
[**getDeliveryContract**](DeliveryApi.md#getDeliveryContract) | **GET** /delivery/{settle}/contracts/{contract} | Get a single contract
[**listDeliveryOrderBook**](DeliveryApi.md#listDeliveryOrderBook) | **GET** /delivery/{settle}/order_book | Futures order book
[**listDeliveryTrades**](DeliveryApi.md#listDeliveryTrades) | **GET** /delivery/{settle}/trades | Futures trading history
[**listDeliveryCandlesticks**](DeliveryApi.md#listDeliveryCandlesticks) | **GET** /delivery/{settle}/candlesticks | Get futures candlesticks
[**listDeliveryTickers**](DeliveryApi.md#listDeliveryTickers) | **GET** /delivery/{settle}/tickers | List futures tickers
[**listDeliveryInsuranceLedger**](DeliveryApi.md#listDeliveryInsuranceLedger) | **GET** /delivery/{settle}/insurance | Futures insurance balance history
[**listDeliveryAccounts**](DeliveryApi.md#listDeliveryAccounts) | **GET** /delivery/{settle}/accounts | Query futures account
[**listDeliveryAccountBook**](DeliveryApi.md#listDeliveryAccountBook) | **GET** /delivery/{settle}/account_book | Query account book
[**listDeliveryPositions**](DeliveryApi.md#listDeliveryPositions) | **GET** /delivery/{settle}/positions | List all positions of a user
[**getDeliveryPosition**](DeliveryApi.md#getDeliveryPosition) | **GET** /delivery/{settle}/positions/{contract} | Get single position
[**updateDeliveryPositionMargin**](DeliveryApi.md#updateDeliveryPositionMargin) | **POST** /delivery/{settle}/positions/{contract}/margin | Update position margin
[**updateDeliveryPositionLeverage**](DeliveryApi.md#updateDeliveryPositionLeverage) | **POST** /delivery/{settle}/positions/{contract}/leverage | Update position leverage
[**updateDeliveryPositionRiskLimit**](DeliveryApi.md#updateDeliveryPositionRiskLimit) | **POST** /delivery/{settle}/positions/{contract}/risk_limit | Update position risk limit
[**listDeliveryOrders**](DeliveryApi.md#listDeliveryOrders) | **GET** /delivery/{settle}/orders | List futures orders
[**createDeliveryOrder**](DeliveryApi.md#createDeliveryOrder) | **POST** /delivery/{settle}/orders | Create a futures order
[**cancelDeliveryOrders**](DeliveryApi.md#cancelDeliveryOrders) | **DELETE** /delivery/{settle}/orders | Cancel all &#x60;open&#x60; orders matched
[**getDeliveryOrder**](DeliveryApi.md#getDeliveryOrder) | **GET** /delivery/{settle}/orders/{order_id} | Get a single order
[**cancelDeliveryOrder**](DeliveryApi.md#cancelDeliveryOrder) | **DELETE** /delivery/{settle}/orders/{order_id} | Cancel a single order
[**getMyDeliveryTrades**](DeliveryApi.md#getMyDeliveryTrades) | **GET** /delivery/{settle}/my_trades | List personal trading history
[**listDeliveryPositionClose**](DeliveryApi.md#listDeliveryPositionClose) | **GET** /delivery/{settle}/position_close | List position close history
[**listDeliveryLiquidates**](DeliveryApi.md#listDeliveryLiquidates) | **GET** /delivery/{settle}/liquidates | List liquidation history
[**listDeliverySettlements**](DeliveryApi.md#listDeliverySettlements) | **GET** /delivery/{settle}/settlements | List settlement history
[**listPriceTriggeredDeliveryOrders**](DeliveryApi.md#listPriceTriggeredDeliveryOrders) | **GET** /delivery/{settle}/price_orders | List all auto orders
[**createPriceTriggeredDeliveryOrder**](DeliveryApi.md#createPriceTriggeredDeliveryOrder) | **POST** /delivery/{settle}/price_orders | Create a price-triggered order
[**cancelPriceTriggeredDeliveryOrderList**](DeliveryApi.md#cancelPriceTriggeredDeliveryOrderList) | **DELETE** /delivery/{settle}/price_orders | Cancel all open orders
[**getPriceTriggeredDeliveryOrder**](DeliveryApi.md#getPriceTriggeredDeliveryOrder) | **GET** /delivery/{settle}/price_orders/{order_id} | Get a single order
[**cancelPriceTriggeredDeliveryOrder**](DeliveryApi.md#cancelPriceTriggeredDeliveryOrder) | **DELETE** /delivery/{settle}/price_orders/{order_id} | cancel a price-triggered order


<a name="listDeliveryContracts"></a>
# **listDeliveryContracts**
> List&lt;DeliveryContract&gt; listDeliveryContracts(settle)

List all futures contracts

### Example

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settle** | **String**| Settle currency | [enum: btc, usdt, usd]

### Return type

[**List&lt;DeliveryContract&gt;**](DeliveryContract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getDeliveryContract"></a>
# **getDeliveryContract**
> DeliveryContract getDeliveryContract(settle, contract)

Get a single contract

### Example

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
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        try {
            DeliveryContract result = apiInstance.getDeliveryContract(settle, contract);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#getDeliveryContract");
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

[**DeliveryContract**](DeliveryContract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Contract information |  -  |

<a name="listDeliveryOrderBook"></a>
# **listDeliveryOrderBook**
> FuturesOrderBook listDeliveryOrderBook(settle, contract).interval(interval).limit(limit).withId(withId).execute();

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        String interval = "0"; // String | Order depth. 0 means no aggregation is applied. default to 0
        Integer limit = 10; // Integer | Maximum number of order depth data in asks or bids
        Boolean withId = false; // Boolean | Whether the order book update ID will be returned. This ID increases by 1 on every order book update
        try {
            FuturesOrderBook result = apiInstance.listDeliveryOrderBook(settle, contract)
                        .interval(interval)
                        .limit(limit)
                        .withId(withId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryOrderBook");
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

<a name="listDeliveryTrades"></a>
# **listDeliveryTrades**
> List&lt;FuturesTrade&gt; listDeliveryTrades(settle, contract).limit(limit).lastId(lastId).from(from).to(to).execute();

Futures trading history

### Example

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
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        String lastId = "12345"; // String | Specify the starting point for this list based on a previously retrieved id  This parameter is deprecated. Use `from` and `to` instead to limit time range
        Long from = 1546905600L; // Long | Specify starting time in Unix seconds. If not specified, `to` and `limit` will be used to limit response items. If items between `from` and `to` are more than `limit`, only `limit` number will be returned. 
        Long to = 1546935600L; // Long | Specify end time in Unix seconds, default to current time
        try {
            List<FuturesTrade> result = apiInstance.listDeliveryTrades(settle, contract)
                        .limit(limit)
                        .lastId(lastId)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryTrades");
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

<a name="listDeliveryCandlesticks"></a>
# **listDeliveryCandlesticks**
> List&lt;FuturesCandlestick&gt; listDeliveryCandlesticks(settle, contract).from(from).to(to).limit(limit).interval(interval).execute();

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        Long from = 1546905600L; // Long | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
        Long to = 1546935600L; // Long | End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time
        Integer limit = 100; // Integer | Maximum recent data points to return. `limit` is conflicted with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
        String interval = "5m"; // String | Interval time between data points. Note that `1w` means natual week(Mon-Sun), while `7d` means every 7d since unix 0
        try {
            List<FuturesCandlestick> result = apiInstance.listDeliveryCandlesticks(settle, contract)
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
            System.err.println("Exception when calling DeliveryApi#listDeliveryCandlesticks");
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
 **interval** | **String**| Interval time between data points. Note that &#x60;1w&#x60; means natual week(Mon-Sun), while &#x60;7d&#x60; means every 7d since unix 0 | [optional] [default to 5m] [enum: 10s, 30s, 1m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 7d, 1w, 30d]

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

<a name="listDeliveryTickers"></a>
# **listDeliveryTickers**
> List&lt;FuturesTicker&gt; listDeliveryTickers(settle).contract(contract).execute();

List futures tickers

### Example

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
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        try {
            List<FuturesTicker> result = apiInstance.listDeliveryTickers(settle)
                        .contract(contract)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryTickers");
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
 **contract** | **String**| Futures contract | [optional]

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

<a name="listDeliveryInsuranceLedger"></a>
# **listDeliveryInsuranceLedger**
> List&lt;InsuranceRecord&gt; listDeliveryInsuranceLedger(settle).limit(limit).execute();

Futures insurance balance history

### Example

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
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        try {
            List<InsuranceRecord> result = apiInstance.listDeliveryInsuranceLedger(settle)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryInsuranceLedger");
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

<a name="listDeliveryAccounts"></a>
# **listDeliveryAccounts**
> FuturesAccount listDeliveryAccounts(settle)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        try {
            FuturesAccount result = apiInstance.listDeliveryAccounts(settle);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryAccounts");
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

<a name="listDeliveryAccountBook"></a>
# **listDeliveryAccountBook**
> List&lt;FuturesAccountBook&gt; listDeliveryAccountBook(settle).limit(limit).from(from).to(to).type(type).execute();

Query account book

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Long from = 1547706332L; // Long | Start timestamp
        Long to = 1547706332L; // Long | End timestamp
        String type = "dnw"; // String | Changing Type: - dnw: Deposit & Withdraw - pnl: Profit & Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: POINT Deposit & Withdraw - point_fee: POINT Trading fee - point_refr: POINT Referrer rebate
        try {
            List<FuturesAccountBook> result = apiInstance.listDeliveryAccountBook(settle)
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
            System.err.println("Exception when calling DeliveryApi#listDeliveryAccountBook");
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

<a name="listDeliveryPositions"></a>
# **listDeliveryPositions**
> List&lt;Position&gt; listDeliveryPositions(settle)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        try {
            List<Position> result = apiInstance.listDeliveryPositions(settle);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryPositions");
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

<a name="getDeliveryPosition"></a>
# **getDeliveryPosition**
> Position getDeliveryPosition(settle, contract)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        try {
            Position result = apiInstance.getDeliveryPosition(settle, contract);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#getDeliveryPosition");
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

<a name="updateDeliveryPositionMargin"></a>
# **updateDeliveryPositionMargin**
> Position updateDeliveryPositionMargin(settle, contract, change)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        String change = "0.01"; // String | Margin change. Use positive number to increase margin, negative number otherwise.
        try {
            Position result = apiInstance.updateDeliveryPositionMargin(settle, contract, change);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#updateDeliveryPositionMargin");
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

<a name="updateDeliveryPositionLeverage"></a>
# **updateDeliveryPositionLeverage**
> Position updateDeliveryPositionLeverage(settle, contract, leverage)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        String leverage = "10"; // String | New position leverage
        try {
            Position result = apiInstance.updateDeliveryPositionLeverage(settle, contract, leverage);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#updateDeliveryPositionLeverage");
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

<a name="updateDeliveryPositionRiskLimit"></a>
# **updateDeliveryPositionRiskLimit**
> Position updateDeliveryPositionRiskLimit(settle, contract, riskLimit)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        String riskLimit = "10"; // String | New position risk limit
        try {
            Position result = apiInstance.updateDeliveryPositionRiskLimit(settle, contract, riskLimit);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#updateDeliveryPositionRiskLimit");
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

<a name="listDeliveryOrders"></a>
# **listDeliveryOrders**
> List&lt;FuturesOrder&gt; listDeliveryOrders(settle, status).contract(contract).limit(limit).offset(offset).lastId(lastId).countTotal(countTotal).execute();

List futures orders

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String status = "open"; // String | Only list the orders with this status
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String lastId = "12345"; // String | Specify list staring point using the `id` of last record in previous list-query results
        Integer countTotal = 0; // Integer | Whether to return total number matched. Default to 0(no return)
        try {
            List<FuturesOrder> result = apiInstance.listDeliveryOrders(settle, status)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .lastId(lastId)
                        .countTotal(countTotal)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryOrders");
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
 **contract** | **String**| Futures contract | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Specify list staring point using the &#x60;id&#x60; of last record in previous list-query results | [optional]
 **countTotal** | **Integer**| Whether to return total number matched. Default to 0(no return) | [optional] [default to 0] [enum: 0, 1]

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
**200** | List retrieved |  * X-Pagination-Limit - Request limit specified <br>  * X-Pagination-Offset - Request offset specified <br>  * X-Pagination-Total - Total number matched. Only returned if &#x60;count_total&#x60; set to 1 <br>  |

<a name="createDeliveryOrder"></a>
# **createDeliveryOrder**
> FuturesOrder createDeliveryOrder(settle, futuresOrder)

Create a futures order

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        FuturesOrder futuresOrder = new FuturesOrder(); // FuturesOrder | 
        try {
            FuturesOrder result = apiInstance.createDeliveryOrder(settle, futuresOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#createDeliveryOrder");
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

<a name="cancelDeliveryOrders"></a>
# **cancelDeliveryOrders**
> List&lt;FuturesOrder&gt; cancelDeliveryOrders(settle, contract, side)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        String side = "ask"; // String | All bids or asks. Both included if not specified
        try {
            List<FuturesOrder> result = apiInstance.cancelDeliveryOrders(settle, contract, side);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#cancelDeliveryOrders");
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

<a name="getDeliveryOrder"></a>
# **getDeliveryOrder**
> FuturesOrder getDeliveryOrder(settle, orderId)

Get a single order

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String orderId = "12345"; // String | Retrieve the data of the order with the specified ID
        try {
            FuturesOrder result = apiInstance.getDeliveryOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#getDeliveryOrder");
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

<a name="cancelDeliveryOrder"></a>
# **cancelDeliveryOrder**
> FuturesOrder cancelDeliveryOrder(settle, orderId)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String orderId = "12345"; // String | Retrieve the data of the order with the specified ID
        try {
            FuturesOrder result = apiInstance.cancelDeliveryOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#cancelDeliveryOrder");
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

<a name="getMyDeliveryTrades"></a>
# **getMyDeliveryTrades**
> List&lt;MyFuturesTrade&gt; getMyDeliveryTrades(settle).contract(contract).order(order).limit(limit).offset(offset).lastId(lastId).countTotal(countTotal).execute();

List personal trading history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        Long order = 12345L; // Long | Futures order ID, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String lastId = "12345"; // String | Specify list staring point using the `id` of last record in previous list-query results
        Integer countTotal = 0; // Integer | Whether to return total number matched. Default to 0(no return)
        try {
            List<MyFuturesTrade> result = apiInstance.getMyDeliveryTrades(settle)
                        .contract(contract)
                        .order(order)
                        .limit(limit)
                        .offset(offset)
                        .lastId(lastId)
                        .countTotal(countTotal)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#getMyDeliveryTrades");
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
 **contract** | **String**| Futures contract | [optional]
 **order** | **Long**| Futures order ID, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Specify list staring point using the &#x60;id&#x60; of last record in previous list-query results | [optional]
 **countTotal** | **Integer**| Whether to return total number matched. Default to 0(no return) | [optional] [default to 0] [enum: 0, 1]

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
**200** | List retrieved |  * X-Pagination-Limit - Request limit specified <br>  * X-Pagination-Offset - Request offset specified <br>  * X-Pagination-Total - Total number matched. Only returned if &#x60;count_total&#x60; set to 1 <br>  |

<a name="listDeliveryPositionClose"></a>
# **listDeliveryPositionClose**
> List&lt;PositionClose&gt; listDeliveryPositionClose(settle).contract(contract).limit(limit).execute();

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        try {
            List<PositionClose> result = apiInstance.listDeliveryPositionClose(settle)
                        .contract(contract)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryPositionClose");
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
 **contract** | **String**| Futures contract | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]

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

<a name="listDeliveryLiquidates"></a>
# **listDeliveryLiquidates**
> List&lt;FuturesLiquidate&gt; listDeliveryLiquidates(settle).contract(contract).limit(limit).at(at).execute();

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer at = 0; // Integer | Specify a liquidation timestamp
        try {
            List<FuturesLiquidate> result = apiInstance.listDeliveryLiquidates(settle)
                        .contract(contract)
                        .limit(limit)
                        .at(at)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliveryLiquidates");
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
 **contract** | **String**| Futures contract | [optional]
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

<a name="listDeliverySettlements"></a>
# **listDeliverySettlements**
> List&lt;DeliverySettlement&gt; listDeliverySettlements(settle).contract(contract).limit(limit).at(at).execute();

List settlement history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT_20200814"; // String | Futures contract
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer at = 0; // Integer | Specify a settlement timestamp
        try {
            List<DeliverySettlement> result = apiInstance.listDeliverySettlements(settle)
                        .contract(contract)
                        .limit(limit)
                        .at(at)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listDeliverySettlements");
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
 **contract** | **String**| Futures contract | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **at** | **Integer**| Specify a settlement timestamp | [optional] [default to 0]

### Return type

[**List&lt;DeliverySettlement&gt;**](DeliverySettlement.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listPriceTriggeredDeliveryOrders"></a>
# **listPriceTriggeredDeliveryOrders**
> List&lt;FuturesPriceTriggeredOrder&gt; listPriceTriggeredDeliveryOrders(settle, status).contract(contract).limit(limit).offset(offset).execute();

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String status = "status_example"; // String | Only list the orders with this status
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<FuturesPriceTriggeredOrder> result = apiInstance.listPriceTriggeredDeliveryOrders(settle, status)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#listPriceTriggeredDeliveryOrders");
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
 **settle** | **String**| Settle currency | [enum: usdt, btc]
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

<a name="createPriceTriggeredDeliveryOrder"></a>
# **createPriceTriggeredDeliveryOrder**
> TriggerOrderResponse createPriceTriggeredDeliveryOrder(settle, futuresPriceTriggeredOrder)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        FuturesPriceTriggeredOrder futuresPriceTriggeredOrder = new FuturesPriceTriggeredOrder(); // FuturesPriceTriggeredOrder | 
        try {
            TriggerOrderResponse result = apiInstance.createPriceTriggeredDeliveryOrder(settle, futuresPriceTriggeredOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#createPriceTriggeredDeliveryOrder");
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
 **settle** | **String**| Settle currency | [enum: usdt, btc]
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

<a name="cancelPriceTriggeredDeliveryOrderList"></a>
# **cancelPriceTriggeredDeliveryOrderList**
> List&lt;FuturesPriceTriggeredOrder&gt; cancelPriceTriggeredDeliveryOrderList(settle, contract)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String contract = "BTC_USDT"; // String | Futures contract
        try {
            List<FuturesPriceTriggeredOrder> result = apiInstance.cancelPriceTriggeredDeliveryOrderList(settle, contract);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#cancelPriceTriggeredDeliveryOrderList");
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
 **settle** | **String**| Settle currency | [enum: usdt, btc]
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

<a name="getPriceTriggeredDeliveryOrder"></a>
# **getPriceTriggeredDeliveryOrder**
> FuturesPriceTriggeredOrder getPriceTriggeredDeliveryOrder(settle, orderId)

Get a single order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String orderId = "orderId_example"; // String | Retrieve the data of the order with the specified ID
        try {
            FuturesPriceTriggeredOrder result = apiInstance.getPriceTriggeredDeliveryOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#getPriceTriggeredDeliveryOrder");
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
 **settle** | **String**| Settle currency | [enum: usdt, btc]
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

<a name="cancelPriceTriggeredDeliveryOrder"></a>
# **cancelPriceTriggeredDeliveryOrder**
> FuturesPriceTriggeredOrder cancelPriceTriggeredDeliveryOrder(settle, orderId)

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
import io.gate.gateapi.api.DeliveryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        DeliveryApi apiInstance = new DeliveryApi(defaultClient);
        String settle = "usdt"; // String | Settle currency
        String orderId = "orderId_example"; // String | Retrieve the data of the order with the specified ID
        try {
            FuturesPriceTriggeredOrder result = apiInstance.cancelPriceTriggeredDeliveryOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryApi#cancelPriceTriggeredDeliveryOrder");
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
 **settle** | **String**| Settle currency | [enum: usdt, btc]
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

