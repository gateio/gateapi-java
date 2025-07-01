# AlphaApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAlphaAccounts**](AlphaApi.md#listAlphaAccounts) | **GET** /alpha/accounts | API for Alpha Accounts
[**listAlphaAccountBook**](AlphaApi.md#listAlphaAccountBook) | **GET** /alpha/account_book | Alpha Asset Transaction API
[**quoteAlphaOrder**](AlphaApi.md#quoteAlphaOrder) | **POST** /alpha/quote | Alpha Quotation API
[**listAlphaOrder**](AlphaApi.md#listAlphaOrder) | **GET** /alpha/orders | Alpha 查询订单列表接口
[**placeAlphaOrder**](AlphaApi.md#placeAlphaOrder) | **POST** /alpha/orders | Alpha Order Placement API
[**getAlphaOrder**](AlphaApi.md#getAlphaOrder) | **GET** /alpha/order | Alpha 查询单个订单接口
[**listAlphaCurrencies**](AlphaApi.md#listAlphaCurrencies) | **GET** /alpha/currencies | 查询币种信息
[**listAlphaTickers**](AlphaApi.md#listAlphaTickers) | **GET** /alpha/tickers | 查询币种ticker


<a name="listAlphaAccounts"></a>
# **listAlphaAccounts**
> List&lt;AccountsResponse&gt; listAlphaAccounts()

API for Alpha Accounts

Query Position Assets

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AlphaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AlphaApi apiInstance = new AlphaApi(defaultClient);
        try {
            List<AccountsResponse> result = apiInstance.listAlphaAccounts();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AlphaApi#listAlphaAccounts");
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

[**List&lt;AccountsResponse&gt;**](AccountsResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 查询持仓成功 |  -  |

<a name="listAlphaAccountBook"></a>
# **listAlphaAccountBook**
> List&lt;AccountBookResponse&gt; listAlphaAccountBook(from).to(to).page(page).limit(limit).execute();

Alpha Asset Transaction API

Query Asset Transactions

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AlphaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AlphaApi apiInstance = new AlphaApi(defaultClient);
        Long from = 56L; // Long | Start timestamp of the query
        Long to = 56L; // Long | Time range ending, default to current time
        Integer page = 56; // Integer | Page number
        Integer limit = 56; // Integer | The maximum number of items per page is 100
        try {
            List<AccountBookResponse> result = apiInstance.listAlphaAccountBook(from)
                        .to(to)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AlphaApi#listAlphaAccountBook");
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
 **from** | **Long**| Start timestamp of the query |
 **to** | **Long**| Time range ending, default to current time | [optional]
 **page** | **Integer**| Page number | [optional]
 **limit** | **Integer**| The maximum number of items per page is 100 | [optional]

### Return type

[**List&lt;AccountBookResponse&gt;**](AccountBookResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 查询流水成功 |  -  |

<a name="quoteAlphaOrder"></a>
# **quoteAlphaOrder**
> QuoteResponse quoteAlphaOrder(quoteRequest)

Alpha Quotation API

The quote_id returned by the quotation API is valid for one minute.You must place the order within this time window;otherwise, the quote will expire and a new quotation request is required

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AlphaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AlphaApi apiInstance = new AlphaApi(defaultClient);
        QuoteRequest quoteRequest = new QuoteRequest(); // QuoteRequest | 
        try {
            QuoteResponse result = apiInstance.quoteAlphaOrder(quoteRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AlphaApi#quoteAlphaOrder");
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
 **quoteRequest** | [**QuoteRequest**](QuoteRequest.md)|  |

### Return type

[**QuoteResponse**](QuoteResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 询价成功 |  -  |

<a name="listAlphaOrder"></a>
# **listAlphaOrder**
> List&lt;OrderResponse&gt; listAlphaOrder(currency, side, status).from(from).to(to).limit(limit).page(page).execute();

Alpha 查询订单列表接口

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AlphaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AlphaApi apiInstance = new AlphaApi(defaultClient);
        String currency = "memeboxsst"; // String | Trading Symbol
        String side = "buy"; // String | 买单或者卖单 - buy - sell
        Integer status = 2; // Integer | Order Status - `0` : All - `1` : Processing - `2` : Successful - `3` : Failed - `4` : Canceled - `5` : Buy order placed but transfer not completed - `6` : Cancelled order with transfer not complete
        Long from = 1627706330L; // Long | 查询订单的起始时间
        Long to = 1635329650L; // Long | 查询订单的结束时间，不指定则默认为当前时间
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        Integer page = 1; // Integer | Page number
        try {
            List<OrderResponse> result = apiInstance.listAlphaOrder(currency, side, status)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .page(page)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AlphaApi#listAlphaOrder");
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
 **currency** | **String**| Trading Symbol |
 **side** | **String**| 买单或者卖单 - buy - sell |
 **status** | **Integer**| Order Status - &#x60;0&#x60; : All - &#x60;1&#x60; : Processing - &#x60;2&#x60; : Successful - &#x60;3&#x60; : Failed - &#x60;4&#x60; : Canceled - &#x60;5&#x60; : Buy order placed but transfer not completed - &#x60;6&#x60; : Cancelled order with transfer not complete |
 **from** | **Long**| 查询订单的起始时间 | [optional]
 **to** | **Long**| 查询订单的结束时间，不指定则默认为当前时间 | [optional]
 **limit** | **Integer**| Maximum response items.  Default: 100, minimum: 1, Maximum: 100 | [optional] [default to 100]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**List&lt;OrderResponse&gt;**](OrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="placeAlphaOrder"></a>
# **placeAlphaOrder**
> PlaceOrderResponse placeAlphaOrder(placeOrderRequest)

Alpha Order Placement API

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AlphaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AlphaApi apiInstance = new AlphaApi(defaultClient);
        PlaceOrderRequest placeOrderRequest = new PlaceOrderRequest(); // PlaceOrderRequest | 
        try {
            PlaceOrderResponse result = apiInstance.placeAlphaOrder(placeOrderRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AlphaApi#placeAlphaOrder");
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
 **placeOrderRequest** | [**PlaceOrderRequest**](PlaceOrderRequest.md)|  |

### Return type

[**PlaceOrderResponse**](PlaceOrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getAlphaOrder"></a>
# **getAlphaOrder**
> OrderResponse getAlphaOrder(orderId)

Alpha 查询单个订单接口

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AlphaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AlphaApi apiInstance = new AlphaApi(defaultClient);
        String orderId = "fdaf12321"; // String | Order ID
        try {
            OrderResponse result = apiInstance.getAlphaOrder(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AlphaApi#getAlphaOrder");
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
 **orderId** | **String**| Order ID |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 订单查询成功 |  -  |

<a name="listAlphaCurrencies"></a>
# **listAlphaCurrencies**
> List&lt;Currency2&gt; listAlphaCurrencies().currency(currency).limit(limit).page(page).execute();

查询币种信息

When the currency parameter is provided, query and return information for the specified currency. When the currency parameter is not provided, return a paginated list of currencies.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AlphaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        AlphaApi apiInstance = new AlphaApi(defaultClient);
        String currency = "memeboxtrump"; // String | 根据币种符号查询币种信息
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer page = 1; // Integer | Page number
        try {
            List<Currency2> result = apiInstance.listAlphaCurrencies()
                        .currency(currency)
                        .limit(limit)
                        .page(page)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AlphaApi#listAlphaCurrencies");
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
 **currency** | **String**| 根据币种符号查询币种信息 | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**List&lt;Currency2&gt;**](Currency2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listAlphaTickers"></a>
# **listAlphaTickers**
> List&lt;Ticker2&gt; listAlphaTickers().currency(currency).limit(limit).page(page).execute();

查询币种ticker

When the currency parameter is provided, query and return information for the specified ticker, When the currency parameter is not provided, return a paginated list of tickers.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AlphaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        AlphaApi apiInstance = new AlphaApi(defaultClient);
        String currency = "memeboxtrump"; // String | Retrieve data of the specified currency
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer page = 1; // Integer | Page number
        try {
            List<Ticker2> result = apiInstance.listAlphaTickers()
                        .currency(currency)
                        .limit(limit)
                        .page(page)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AlphaApi#listAlphaTickers");
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
 **currency** | **String**| Retrieve data of the specified currency | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**List&lt;Ticker2&gt;**](Ticker2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

