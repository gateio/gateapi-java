# OptionsApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOptionsUnderlyings**](OptionsApi.md#listOptionsUnderlyings) | **GET** /options/underlyings | List all underlyings
[**listOptionsExpirations**](OptionsApi.md#listOptionsExpirations) | **GET** /options/expirations | List all expiration times
[**listOptionsContracts**](OptionsApi.md#listOptionsContracts) | **GET** /options/contracts | List all the contracts with specified underlying and expiration time
[**getOptionsContract**](OptionsApi.md#getOptionsContract) | **GET** /options/contracts/{contract} | Query specified contract detail
[**listOptionsSettlements**](OptionsApi.md#listOptionsSettlements) | **GET** /options/settlements | List settlement history
[**getOptionsSettlement**](OptionsApi.md#getOptionsSettlement) | **GET** /options/settlements/{contract} | Get specified contract&#39;s settlement
[**listMyOptionsSettlements**](OptionsApi.md#listMyOptionsSettlements) | **GET** /options/my_settlements | List my options settlements
[**listOptionsOrderBook**](OptionsApi.md#listOptionsOrderBook) | **GET** /options/order_book | Options order book
[**listOptionsTickers**](OptionsApi.md#listOptionsTickers) | **GET** /options/tickers | List tickers of options contracts
[**listOptionsUnderlyingTickers**](OptionsApi.md#listOptionsUnderlyingTickers) | **GET** /options/underlying/tickers/{underlying} | Get underlying ticker
[**listOptionsCandlesticks**](OptionsApi.md#listOptionsCandlesticks) | **GET** /options/candlesticks | Get options candlesticks
[**listOptionsUnderlyingCandlesticks**](OptionsApi.md#listOptionsUnderlyingCandlesticks) | **GET** /options/underlying/candlesticks | Mark price candlesticks of an underlying
[**listOptionsTrades**](OptionsApi.md#listOptionsTrades) | **GET** /options/trades | Options trade history
[**listOptionsAccount**](OptionsApi.md#listOptionsAccount) | **GET** /options/accounts | List options account
[**listOptionsAccountBook**](OptionsApi.md#listOptionsAccountBook) | **GET** /options/account_book | List account changing history
[**listOptionsPositions**](OptionsApi.md#listOptionsPositions) | **GET** /options/positions | List user&#39;s positions of specified underlying
[**getOptionsPosition**](OptionsApi.md#getOptionsPosition) | **GET** /options/positions/{contract} | Get specified contract position
[**listOptionsPositionClose**](OptionsApi.md#listOptionsPositionClose) | **GET** /options/position_close | List user&#39;s liquidation history of specified underlying
[**listOptionsOrders**](OptionsApi.md#listOptionsOrders) | **GET** /options/orders | List options orders
[**createOptionsOrder**](OptionsApi.md#createOptionsOrder) | **POST** /options/orders | Create an options order
[**cancelOptionsOrders**](OptionsApi.md#cancelOptionsOrders) | **DELETE** /options/orders | Cancel all &#x60;open&#x60; orders matched
[**getOptionsOrder**](OptionsApi.md#getOptionsOrder) | **GET** /options/orders/{order_id} | Get a single order
[**cancelOptionsOrder**](OptionsApi.md#cancelOptionsOrder) | **DELETE** /options/orders/{order_id} | Cancel a single order
[**countdownCancelAllOptions**](OptionsApi.md#countdownCancelAllOptions) | **POST** /options/countdown_cancel_all | Countdown cancel orders
[**listMyOptionsTrades**](OptionsApi.md#listMyOptionsTrades) | **GET** /options/my_trades | List personal trading history
[**getOptionsMMP**](OptionsApi.md#getOptionsMMP) | **GET** /options/mmp | MMP Query
[**setOptionsMMP**](OptionsApi.md#setOptionsMMP) | **POST** /options/mmp | MMP Settings
[**resetOptionsMMP**](OptionsApi.md#resetOptionsMMP) | **POST** /options/mmp/reset | MMP Reset


<a name="listOptionsUnderlyings"></a>
# **listOptionsUnderlyings**
> List&lt;OptionsUnderlying&gt; listOptionsUnderlyings()

List all underlyings

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    try {
      List<OptionsUnderlying> result = apiInstance.listOptionsUnderlyings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsUnderlyings");
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

[**List&lt;OptionsUnderlying&gt;**](OptionsUnderlying.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listOptionsExpirations"></a>
# **listOptionsExpirations**
> List&lt;Long&gt; listOptionsExpirations(underlying)

List all expiration times

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying (Obtained by listing underlying endpoint)
    try {
      List<Long> result = apiInstance.listOptionsExpirations(underlying);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsExpirations");
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
 **underlying** | **String**| Underlying (Obtained by listing underlying endpoint) |

### Return type

**List&lt;Long&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List expiration times of specified underlying |  -  |

<a name="listOptionsContracts"></a>
# **listOptionsContracts**
> List&lt;OptionsContract&gt; listOptionsContracts(underlying).expiration(expiration).execute();

List all the contracts with specified underlying and expiration time

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying (Obtained by listing underlying endpoint)
    Long expiration = 1636588800L; // Long | Unix timestamp of the expiration time
    try {
      List<OptionsContract> result = apiInstance.listOptionsContracts(underlying)
            .expiration(expiration)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsContracts");
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
 **underlying** | **String**| Underlying (Obtained by listing underlying endpoint) |
 **expiration** | **Long**| Unix timestamp of the expiration time | [optional]

### Return type

[**List&lt;OptionsContract&gt;**](OptionsContract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getOptionsContract"></a>
# **getOptionsContract**
> OptionsContract getOptionsContract(contract)

Query specified contract detail

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String contract = "BTC_USDT-20211130-65000-C"; // String | 
    try {
      OptionsContract result = apiInstance.getOptionsContract(contract);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getOptionsContract");
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
 **contract** | **String**|  |

### Return type

[**OptionsContract**](OptionsContract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listOptionsSettlements"></a>
# **listOptionsSettlements**
> List&lt;OptionsSettlement&gt; listOptionsSettlements(underlying).limit(limit).offset(offset).from(from).to(to).execute();

List settlement history

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying (Obtained by listing underlying endpoint)
    Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
    Integer offset = 0; // Integer | List offset, starting from 0
    Long from = 1547706332L; // Long | Start timestamp
    Long to = 1547706332L; // Long | End timestamp
    try {
      List<OptionsSettlement> result = apiInstance.listOptionsSettlements(underlying)
            .limit(limit)
            .offset(offset)
            .from(from)
            .to(to)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsSettlements");
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
 **underlying** | **String**| Underlying (Obtained by listing underlying endpoint) |
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]

### Return type

[**List&lt;OptionsSettlement&gt;**](OptionsSettlement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getOptionsSettlement"></a>
# **getOptionsSettlement**
> OptionsSettlement getOptionsSettlement(contract, underlying, at)

Get specified contract&#39;s settlement

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String contract = "BTC_USDT-20211130-65000-C"; // String | 
    String underlying = "BTC_USDT"; // String | Underlying (Obtained by listing underlying endpoint)
    Long at = 56L; // Long | 
    try {
      OptionsSettlement result = apiInstance.getOptionsSettlement(contract, underlying, at);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getOptionsSettlement");
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
 **contract** | **String**|  |
 **underlying** | **String**| Underlying (Obtained by listing underlying endpoint) |
 **at** | **Long**|  |

### Return type

[**OptionsSettlement**](OptionsSettlement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listMyOptionsSettlements"></a>
# **listMyOptionsSettlements**
> List&lt;OptionsMySettlements&gt; listMyOptionsSettlements(underlying).contract(contract).limit(limit).offset(offset).from(from).to(to).execute();

List my options settlements

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying (Obtained by listing underlying endpoint)
    String contract = "BTC_USDT-20210916-5000-C"; // String | Options contract name
    Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
    Integer offset = 0; // Integer | List offset, starting from 0
    Long from = 1547706332L; // Long | Start timestamp
    Long to = 1547706332L; // Long | End timestamp
    try {
      List<OptionsMySettlements> result = apiInstance.listMyOptionsSettlements(underlying)
            .contract(contract)
            .limit(limit)
            .offset(offset)
            .from(from)
            .to(to)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listMyOptionsSettlements");
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
 **underlying** | **String**| Underlying (Obtained by listing underlying endpoint) |
 **contract** | **String**| Options contract name | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]

### Return type

[**List&lt;OptionsMySettlements&gt;**](OptionsMySettlements.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listOptionsOrderBook"></a>
# **listOptionsOrderBook**
> FuturesOrderBook listOptionsOrderBook(contract).interval(interval).limit(limit).withId(withId).execute();

Options order book

Bids will be sorted by price from high to low, while asks sorted reversely

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String contract = "BTC_USDT-20210916-5000-C"; // String | Options contract name
    String interval = "0"; // String | Order depth. 0 means no aggregation is applied. default to 0
    Integer limit = 10; // Integer | Maximum number of order depth data in asks or bids
    Boolean withId = false; // Boolean | Whether the order book update ID will be returned. This ID increases by 1 on every order book update
    try {
      FuturesOrderBook result = apiInstance.listOptionsOrderBook(contract)
            .interval(interval)
            .limit(limit)
            .withId(withId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsOrderBook");
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
 **contract** | **String**| Options contract name |
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

<a name="listOptionsTickers"></a>
# **listOptionsTickers**
> List&lt;OptionsTicker&gt; listOptionsTickers(underlying)

List tickers of options contracts

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying (Obtained by listing underlying endpoint)
    try {
      List<OptionsTicker> result = apiInstance.listOptionsTickers(underlying);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsTickers");
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
 **underlying** | **String**| Underlying (Obtained by listing underlying endpoint) |

### Return type

[**List&lt;OptionsTicker&gt;**](OptionsTicker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listOptionsUnderlyingTickers"></a>
# **listOptionsUnderlyingTickers**
> OptionsUnderlyingTicker listOptionsUnderlyingTickers(underlying)

Get underlying ticker

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying
    try {
      OptionsUnderlyingTicker result = apiInstance.listOptionsUnderlyingTickers(underlying);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsUnderlyingTickers");
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
 **underlying** | **String**| Underlying |

### Return type

[**OptionsUnderlyingTicker**](OptionsUnderlyingTicker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listOptionsCandlesticks"></a>
# **listOptionsCandlesticks**
> List&lt;OptionsCandlestick&gt; listOptionsCandlesticks(contract).limit(limit).from(from).to(to).interval(interval).execute();

Get options candlesticks

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String contract = "BTC_USDT-20210916-5000-C"; // String | Options contract name
    Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
    Long from = 1547706332L; // Long | Start timestamp
    Long to = 1547706332L; // Long | End timestamp
    String interval = "5m"; // String | Interval time between data points
    try {
      List<OptionsCandlestick> result = apiInstance.listOptionsCandlesticks(contract)
            .limit(limit)
            .from(from)
            .to(to)
            .interval(interval)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsCandlesticks");
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
 **contract** | **String**| Options contract name |
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]
 **interval** | **String**| Interval time between data points | [optional] [default to 5m] [enum: 1m, 5m, 15m, 30m, 1h]

### Return type

[**List&lt;OptionsCandlestick&gt;**](OptionsCandlestick.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listOptionsUnderlyingCandlesticks"></a>
# **listOptionsUnderlyingCandlesticks**
> List&lt;FuturesCandlestick&gt; listOptionsUnderlyingCandlesticks(underlying).limit(limit).from(from).to(to).interval(interval).execute();

Mark price candlesticks of an underlying

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying (Obtained by listing underlying endpoint)
    Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
    Long from = 1547706332L; // Long | Start timestamp
    Long to = 1547706332L; // Long | End timestamp
    String interval = "5m"; // String | Interval time between data points
    try {
      List<FuturesCandlestick> result = apiInstance.listOptionsUnderlyingCandlesticks(underlying)
            .limit(limit)
            .from(from)
            .to(to)
            .interval(interval)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsUnderlyingCandlesticks");
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
 **underlying** | **String**| Underlying (Obtained by listing underlying endpoint) |
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]
 **interval** | **String**| Interval time between data points | [optional] [default to 5m] [enum: 1m, 5m, 15m, 30m, 1h]

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

<a name="listOptionsTrades"></a>
# **listOptionsTrades**
> List&lt;FuturesTrade&gt; listOptionsTrades().contract(contract).type(type).limit(limit).offset(offset).from(from).to(to).execute();

Options trade history

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String contract = "BTC_USDT-20210916-5000-C"; // String | Options contract name
    String type = "1546935600"; // String | `C` is call, while `P` is put
    Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
    Integer offset = 0; // Integer | List offset, starting from 0
    Long from = 1547706332L; // Long | Start timestamp
    Long to = 1547706332L; // Long | End timestamp
    try {
      List<FuturesTrade> result = apiInstance.listOptionsTrades()
            .contract(contract)
            .type(type)
            .limit(limit)
            .offset(offset)
            .from(from)
            .to(to)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsTrades");
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
 **contract** | **String**| Options contract name | [optional]
 **type** | **String**| &#x60;C&#x60; is call, while &#x60;P&#x60; is put | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]

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

<a name="listOptionsAccount"></a>
# **listOptionsAccount**
> OptionsAccount listOptionsAccount()

List options account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    try {
      OptionsAccount result = apiInstance.listOptionsAccount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsAccount");
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

[**OptionsAccount**](OptionsAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listOptionsAccountBook"></a>
# **listOptionsAccountBook**
> List&lt;OptionsAccountBook&gt; listOptionsAccountBook().limit(limit).offset(offset).from(from).to(to).type(type).execute();

List account changing history

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
    Integer offset = 0; // Integer | List offset, starting from 0
    Long from = 1547706332L; // Long | Start timestamp
    Long to = 1547706332L; // Long | End timestamp
    String type = "dnw"; // String | Changing Type: - dnw: Deposit & Withdraw - prem: Trading premium - fee: Trading fee - refr: Referrer rebate - set: settlement PNL 
    try {
      List<OptionsAccountBook> result = apiInstance.listOptionsAccountBook()
            .limit(limit)
            .offset(offset)
            .from(from)
            .to(to)
            .type(type)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsAccountBook");
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
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]
 **type** | **String**| Changing Type: - dnw: Deposit &amp; Withdraw - prem: Trading premium - fee: Trading fee - refr: Referrer rebate - set: settlement PNL  | [optional] [enum: dnw, prem, fee, refr, set]

### Return type

[**List&lt;OptionsAccountBook&gt;**](OptionsAccountBook.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listOptionsPositions"></a>
# **listOptionsPositions**
> List&lt;OptionsPosition&gt; listOptionsPositions().underlying(underlying).execute();

List user&#39;s positions of specified underlying

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying
    try {
      List<OptionsPosition> result = apiInstance.listOptionsPositions()
            .underlying(underlying)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsPositions");
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
 **underlying** | **String**| Underlying | [optional]

### Return type

[**List&lt;OptionsPosition&gt;**](OptionsPosition.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getOptionsPosition"></a>
# **getOptionsPosition**
> OptionsPosition getOptionsPosition(contract)

Get specified contract position

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String contract = "BTC_USDT-20211130-65000-C"; // String | 
    try {
      OptionsPosition result = apiInstance.getOptionsPosition(contract);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getOptionsPosition");
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
 **contract** | **String**|  |

### Return type

[**OptionsPosition**](OptionsPosition.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listOptionsPositionClose"></a>
# **listOptionsPositionClose**
> List&lt;OptionsPositionClose&gt; listOptionsPositionClose(underlying).contract(contract).execute();

List user&#39;s liquidation history of specified underlying

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying (Obtained by listing underlying endpoint)
    String contract = "BTC_USDT-20210916-5000-C"; // String | Options contract name
    try {
      List<OptionsPositionClose> result = apiInstance.listOptionsPositionClose(underlying)
            .contract(contract)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsPositionClose");
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
 **underlying** | **String**| Underlying (Obtained by listing underlying endpoint) |
 **contract** | **String**| Options contract name | [optional]

### Return type

[**List&lt;OptionsPositionClose&gt;**](OptionsPositionClose.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listOptionsOrders"></a>
# **listOptionsOrders**
> List&lt;OptionsOrder&gt; listOptionsOrders(status).contract(contract).underlying(underlying).limit(limit).offset(offset).from(from).to(to).execute();

List options orders

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String status = "open"; // String | Only list the orders with this status
    String contract = "BTC_USDT-20210916-5000-C"; // String | Options contract name
    String underlying = "BTC_USDT"; // String | Underlying
    Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
    Integer offset = 0; // Integer | List offset, starting from 0
    Long from = 1547706332L; // Long | Start timestamp
    Long to = 1547706332L; // Long | End timestamp
    try {
      List<OptionsOrder> result = apiInstance.listOptionsOrders(status)
            .contract(contract)
            .underlying(underlying)
            .limit(limit)
            .offset(offset)
            .from(from)
            .to(to)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listOptionsOrders");
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
 **status** | **String**| Only list the orders with this status | [enum: open, finished]
 **contract** | **String**| Options contract name | [optional]
 **underlying** | **String**| Underlying | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]

### Return type

[**List&lt;OptionsOrder&gt;**](OptionsOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="createOptionsOrder"></a>
# **createOptionsOrder**
> OptionsOrder createOptionsOrder(optionsOrder)

Create an options order

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    OptionsOrder optionsOrder = new OptionsOrder(); // OptionsOrder | 
    try {
      OptionsOrder result = apiInstance.createOptionsOrder(optionsOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#createOptionsOrder");
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
 **optionsOrder** | [**OptionsOrder**](OptionsOrder.md)|  |

### Return type

[**OptionsOrder**](OptionsOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Order detail |  -  |

<a name="cancelOptionsOrders"></a>
# **cancelOptionsOrders**
> List&lt;OptionsOrder&gt; cancelOptionsOrders(contract, underlying, side)

Cancel all &#x60;open&#x60; orders matched

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String contract = "BTC_USDT-20210916-5000-C"; // String | Options contract name
    String underlying = "BTC_USDT"; // String | Underlying
    String side = "ask"; // String | All bids or asks. Both included if not specified
    try {
      List<OptionsOrder> result = apiInstance.cancelOptionsOrders(contract, underlying, side);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#cancelOptionsOrders");
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
 **contract** | **String**| Options contract name | [optional]
 **underlying** | **String**| Underlying | [optional]
 **side** | **String**| All bids or asks. Both included if not specified | [optional] [enum: ask, bid]

### Return type

[**List&lt;OptionsOrder&gt;**](OptionsOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | All orders matched cancelled |  -  |

<a name="getOptionsOrder"></a>
# **getOptionsOrder**
> OptionsOrder getOptionsOrder(orderId)

Get a single order

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    Long orderId = 12345L; // Long | Order ID returned on successful order creation
    try {
      OptionsOrder result = apiInstance.getOptionsOrder(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getOptionsOrder");
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
 **orderId** | **Long**| Order ID returned on successful order creation |

### Return type

[**OptionsOrder**](OptionsOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order detail |  -  |

<a name="cancelOptionsOrder"></a>
# **cancelOptionsOrder**
> OptionsOrder cancelOptionsOrder(orderId)

Cancel a single order

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    Long orderId = 12345L; // Long | Order ID returned on successful order creation
    try {
      OptionsOrder result = apiInstance.cancelOptionsOrder(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#cancelOptionsOrder");
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
 **orderId** | **Long**| Order ID returned on successful order creation |

### Return type

[**OptionsOrder**](OptionsOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order detail |  -  |

<a name="countdownCancelAllOptions"></a>
# **countdownCancelAllOptions**
> TriggerTime countdownCancelAllOptions(countdownCancelAllOptionsTask)

Countdown cancel orders

Option order heartbeat detection, when the &#x60;timeout&#x60; time set by the user is reached, if the existing countdown is not canceled or a new countdown is set, the related &#x60;option pending order&#x60; will be automatically canceled.  This interface can be called repeatedly to set a new countdown or cancel the countdown.  Usage example: Repeat this interface at intervals of 30 seconds, with each countdown &#x60;timeout&#x60; set to 30 (seconds).  If this interface is not called again within 30 seconds, all pending orders on the &#x60;underlying&#x60; &#x60;contract&#x60; you specified will be automatically cancelled. If &#x60;underlying&#x60; &#x60;contract&#x60; is not specified, all pending orders of the user will be automatically cancelled  If &#x60;timeout&#x60; is set to 0 within 30 seconds, the countdown timer will expire and the automatic order cancellation function will be cancelled.

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    CountdownCancelAllOptionsTask countdownCancelAllOptionsTask = new CountdownCancelAllOptionsTask(); // CountdownCancelAllOptionsTask | 
    try {
      TriggerTime result = apiInstance.countdownCancelAllOptions(countdownCancelAllOptionsTask);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#countdownCancelAllOptions");
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
 **countdownCancelAllOptionsTask** | [**CountdownCancelAllOptionsTask**](CountdownCancelAllOptionsTask.md)|  |

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

<a name="listMyOptionsTrades"></a>
# **listMyOptionsTrades**
> List&lt;OptionsMyTrade&gt; listMyOptionsTrades(underlying).contract(contract).limit(limit).offset(offset).from(from).to(to).execute();

List personal trading history

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying (Obtained by listing underlying endpoint)
    String contract = "BTC_USDT-20210916-5000-C"; // String | Options contract name
    Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
    Integer offset = 0; // Integer | List offset, starting from 0
    Long from = 1547706332L; // Long | Start timestamp
    Long to = 1547706332L; // Long | End timestamp
    try {
      List<OptionsMyTrade> result = apiInstance.listMyOptionsTrades(underlying)
            .contract(contract)
            .limit(limit)
            .offset(offset)
            .from(from)
            .to(to)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#listMyOptionsTrades");
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
 **underlying** | **String**| Underlying (Obtained by listing underlying endpoint) |
 **contract** | **String**| Options contract name | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]

### Return type

[**List&lt;OptionsMyTrade&gt;**](OptionsMyTrade.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getOptionsMMP"></a>
# **getOptionsMMP**
> List&lt;OptionsMMP&gt; getOptionsMMP().underlying(underlying).execute();

MMP Query

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    String underlying = "BTC_USDT"; // String | Underlying
    try {
      List<OptionsMMP> result = apiInstance.getOptionsMMP()
            .underlying(underlying)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#getOptionsMMP");
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
 **underlying** | **String**| Underlying | [optional]

### Return type

[**List&lt;OptionsMMP&gt;**](OptionsMMP.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="setOptionsMMP"></a>
# **setOptionsMMP**
> OptionsMMP setOptionsMMP(optionsMMP)

MMP Settings

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    OptionsMMP optionsMMP = new OptionsMMP(); // OptionsMMP | 
    try {
      OptionsMMP result = apiInstance.setOptionsMMP(optionsMMP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#setOptionsMMP");
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
 **optionsMMP** | [**OptionsMMP**](OptionsMMP.md)|  |

### Return type

[**OptionsMMP**](OptionsMMP.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | MMP Information |  -  |

<a name="resetOptionsMMP"></a>
# **resetOptionsMMP**
> OptionsMMP resetOptionsMMP(optionsMMPReset)

MMP Reset

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    OptionsApi apiInstance = new OptionsApi(defaultClient);
    OptionsMMPReset optionsMMPReset = new OptionsMMPReset(); // OptionsMMPReset | 
    try {
      OptionsMMP result = apiInstance.resetOptionsMMP(optionsMMPReset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionsApi#resetOptionsMMP");
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
 **optionsMMPReset** | [**OptionsMMPReset**](OptionsMMPReset.md)|  |

### Return type

[**OptionsMMP**](OptionsMMP.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | MMP Information |  -  |

