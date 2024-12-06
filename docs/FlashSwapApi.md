# FlashSwapApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFlashSwapCurrencies**](FlashSwapApi.md#listFlashSwapCurrencies) | **GET** /flash_swap/currencies | List All Supported Currencies In Flash Swap (deprecated)
[**listFlashSwapCurrencyPair**](FlashSwapApi.md#listFlashSwapCurrencyPair) | **GET** /flash_swap/currency_pairs | List All Supported Currency Pairs In Flash Swap
[**listFlashSwapOrders**](FlashSwapApi.md#listFlashSwapOrders) | **GET** /flash_swap/orders | List all flash swap orders
[**createFlashSwapOrder**](FlashSwapApi.md#createFlashSwapOrder) | **POST** /flash_swap/orders | Create a flash swap order
[**getFlashSwapOrder**](FlashSwapApi.md#getFlashSwapOrder) | **GET** /flash_swap/orders/{order_id} | Get a single flash swap order&#39;s detail
[**previewFlashSwapOrder**](FlashSwapApi.md#previewFlashSwapOrder) | **POST** /flash_swap/orders/preview | Initiate a flash swap order preview


<a name="listFlashSwapCurrencies"></a>
# **listFlashSwapCurrencies**
> List&lt;FlashSwapCurrency&gt; listFlashSwapCurrencies()

List All Supported Currencies In Flash Swap (deprecated)

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
    try {
      List<FlashSwapCurrency> result = apiInstance.listFlashSwapCurrencies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlashSwapApi#listFlashSwapCurrencies");
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

[**List&lt;FlashSwapCurrency&gt;**](FlashSwapCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listFlashSwapCurrencyPair"></a>
# **listFlashSwapCurrencyPair**
> List&lt;FlashSwapCurrencyPair&gt; listFlashSwapCurrencyPair().currency(currency).page(page).limit(limit).execute();

List All Supported Currency Pairs In Flash Swap

&#x60;BTC_GT&#x60; represents selling BTC and buying GT. The limits for each currency may vary across different currency pairs.  It is not necessary that two currencies that can be swapped instantaneously can be exchanged with each other. For example, it is possible to sell BTC and buy GT, but it does not necessarily mean that GT can be sold to buy BTC.

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");

    FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
    String currency = "BTC"; // String | Retrieve data of the specified currency
    Integer page = 1; // Integer | Page number
    Integer limit = 1000; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 1000
    try {
      List<FlashSwapCurrencyPair> result = apiInstance.listFlashSwapCurrencyPair()
            .currency(currency)
            .page(page)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlashSwapApi#listFlashSwapCurrencyPair");
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
 **currency** | **String**| Retrieve data of the specified currency | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum response items.  Default: 100, minimum: 1, Maximum: 1000 | [optional] [default to 1000]

### Return type

[**List&lt;FlashSwapCurrencyPair&gt;**](FlashSwapCurrencyPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listFlashSwapOrders"></a>
# **listFlashSwapOrders**
> List&lt;FlashSwapOrder&gt; listFlashSwapOrders().status(status).sellCurrency(sellCurrency).buyCurrency(buyCurrency).reverse(reverse).limit(limit).page(page).execute();

List all flash swap orders

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
    Integer status = 1; // Integer | Flash swap order status  `1` - success `2` - failure
    String sellCurrency = "BTC"; // String | Currency to sell which can be retrieved from supported currency list API `GET /flash_swap/currencies`
    String buyCurrency = "BTC"; // String | Currency to buy which can be retrieved from supported currency list API `GET /flash_swap/currencies`
    Boolean reverse = true; // Boolean | If results are sorted by id in reverse order. Default to `true`  - `true`: sort by id in descending order(recent first) - `false`: sort by id in ascending order(oldest first)
    Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
    Integer page = 1; // Integer | Page number
    try {
      List<FlashSwapOrder> result = apiInstance.listFlashSwapOrders()
            .status(status)
            .sellCurrency(sellCurrency)
            .buyCurrency(buyCurrency)
            .reverse(reverse)
            .limit(limit)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlashSwapApi#listFlashSwapOrders");
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
 **status** | **Integer**| Flash swap order status  &#x60;1&#x60; - success &#x60;2&#x60; - failure | [optional]
 **sellCurrency** | **String**| Currency to sell which can be retrieved from supported currency list API &#x60;GET /flash_swap/currencies&#x60; | [optional]
 **buyCurrency** | **String**| Currency to buy which can be retrieved from supported currency list API &#x60;GET /flash_swap/currencies&#x60; | [optional]
 **reverse** | **Boolean**| If results are sorted by id in reverse order. Default to &#x60;true&#x60;  - &#x60;true&#x60;: sort by id in descending order(recent first) - &#x60;false&#x60;: sort by id in ascending order(oldest first) | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**List&lt;FlashSwapOrder&gt;**](FlashSwapOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="createFlashSwapOrder"></a>
# **createFlashSwapOrder**
> FlashSwapOrder createFlashSwapOrder(flashSwapOrderRequest)

Create a flash swap order

Initiate a flash swap preview in advance because order creation requires a preview result

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
    FlashSwapOrderRequest flashSwapOrderRequest = new FlashSwapOrderRequest(); // FlashSwapOrderRequest | 
    try {
      FlashSwapOrder result = apiInstance.createFlashSwapOrder(flashSwapOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlashSwapApi#createFlashSwapOrder");
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
 **flashSwapOrderRequest** | [**FlashSwapOrderRequest**](FlashSwapOrderRequest.md)|  |

### Return type

[**FlashSwapOrder**](FlashSwapOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The flash swap order is created successfully |  -  |

<a name="getFlashSwapOrder"></a>
# **getFlashSwapOrder**
> FlashSwapOrder getFlashSwapOrder(orderId)

Get a single flash swap order&#39;s detail

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
    Integer orderId = 1; // Integer | Flash swap order ID
    try {
      FlashSwapOrder result = apiInstance.getFlashSwapOrder(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlashSwapApi#getFlashSwapOrder");
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
 **orderId** | **Integer**| Flash swap order ID |

### Return type

[**FlashSwapOrder**](FlashSwapOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="previewFlashSwapOrder"></a>
# **previewFlashSwapOrder**
> FlashSwapOrderPreview previewFlashSwapOrder(flashSwapPreviewRequest)

Initiate a flash swap order preview

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
    FlashSwapPreviewRequest flashSwapPreviewRequest = new FlashSwapPreviewRequest(); // FlashSwapPreviewRequest | 
    try {
      FlashSwapOrderPreview result = apiInstance.previewFlashSwapOrder(flashSwapPreviewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlashSwapApi#previewFlashSwapOrder");
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
 **flashSwapPreviewRequest** | [**FlashSwapPreviewRequest**](FlashSwapPreviewRequest.md)|  |

### Return type

[**FlashSwapOrderPreview**](FlashSwapOrderPreview.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The flash swap order successfully previewed |  -  |

