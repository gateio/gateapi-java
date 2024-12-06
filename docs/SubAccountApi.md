# SubAccountApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSubAccounts**](SubAccountApi.md#listSubAccounts) | **GET** /sub_accounts | List sub-accounts
[**createSubAccounts**](SubAccountApi.md#createSubAccounts) | **POST** /sub_accounts | Create a new sub-account
[**getSubAccount**](SubAccountApi.md#getSubAccount) | **GET** /sub_accounts/{user_id} | Get the sub-account
[**listSubAccountKeys**](SubAccountApi.md#listSubAccountKeys) | **GET** /sub_accounts/{user_id}/keys | List all API Key of the sub-account
[**createSubAccountKeys**](SubAccountApi.md#createSubAccountKeys) | **POST** /sub_accounts/{user_id}/keys | Create API Key of the sub-account
[**getSubAccountKey**](SubAccountApi.md#getSubAccountKey) | **GET** /sub_accounts/{user_id}/keys/{key} | Get the API Key of the sub-account
[**updateSubAccountKeys**](SubAccountApi.md#updateSubAccountKeys) | **PUT** /sub_accounts/{user_id}/keys/{key} | Update API key of the sub-account
[**deleteSubAccountKeys**](SubAccountApi.md#deleteSubAccountKeys) | **DELETE** /sub_accounts/{user_id}/keys/{key} | Delete API key of the sub-account
[**lockSubAccount**](SubAccountApi.md#lockSubAccount) | **POST** /sub_accounts/{user_id}/lock | Lock the sub-account
[**unlockSubAccount**](SubAccountApi.md#unlockSubAccount) | **POST** /sub_accounts/{user_id}/unlock | Unlock the sub-account
[**listUnifiedMode**](SubAccountApi.md#listUnifiedMode) | **GET** /sub_accounts/unified_mode | Get sub-account mode


<a name="listSubAccounts"></a>
# **listSubAccounts**
> List&lt;SubAccount&gt; listSubAccounts().type(type).execute();

List sub-accounts

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    String type = "0"; // String | `0` to list all types of sub-accounts (currently supporting cross margin accounts and sub-accounts).  `1` to list sub-accounts only. If no parameter is passed, only sub-accounts will be listed by default.
    try {
      List<SubAccount> result = apiInstance.listSubAccounts()
            .type(type)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#listSubAccounts");
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
 **type** | **String**| &#x60;0&#x60; to list all types of sub-accounts (currently supporting cross margin accounts and sub-accounts).  &#x60;1&#x60; to list sub-accounts only. If no parameter is passed, only sub-accounts will be listed by default. | [optional]

### Return type

[**List&lt;SubAccount&gt;**](SubAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="createSubAccounts"></a>
# **createSubAccounts**
> SubAccount createSubAccounts(subAccount)

Create a new sub-account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    SubAccount subAccount = new SubAccount(); // SubAccount | 
    try {
      SubAccount result = apiInstance.createSubAccounts(subAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#createSubAccounts");
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
 **subAccount** | [**SubAccount**](SubAccount.md)|  |

### Return type

[**SubAccount**](SubAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created Successfully |  -  |

<a name="getSubAccount"></a>
# **getSubAccount**
> SubAccount getSubAccount(userId)

Get the sub-account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    Long userId = 56L; // Long | Sub-account user id
    try {
      SubAccount result = apiInstance.getSubAccount(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#getSubAccount");
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
 **userId** | **Long**| Sub-account user id |

### Return type

[**SubAccount**](SubAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |

<a name="listSubAccountKeys"></a>
# **listSubAccountKeys**
> List&lt;SubAccountKey&gt; listSubAccountKeys(userId)

List all API Key of the sub-account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    Integer userId = 56; // Integer | Sub-account user id
    try {
      List<SubAccountKey> result = apiInstance.listSubAccountKeys(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#listSubAccountKeys");
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
 **userId** | **Integer**| Sub-account user id |

### Return type

[**List&lt;SubAccountKey&gt;**](SubAccountKey.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="createSubAccountKeys"></a>
# **createSubAccountKeys**
> List&lt;SubAccountKey&gt; createSubAccountKeys(userId, subAccountKey)

Create API Key of the sub-account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    Long userId = 56L; // Long | Sub-account user id
    SubAccountKey subAccountKey = new SubAccountKey(); // SubAccountKey | 
    try {
      List<SubAccountKey> result = apiInstance.createSubAccountKeys(userId, subAccountKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#createSubAccountKeys");
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
 **userId** | **Long**| Sub-account user id |
 **subAccountKey** | [**SubAccountKey**](SubAccountKey.md)|  |

### Return type

[**List&lt;SubAccountKey&gt;**](SubAccountKey.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Created Successfully |  -  |

<a name="getSubAccountKey"></a>
# **getSubAccountKey**
> SubAccountKey getSubAccountKey(userId, key)

Get the API Key of the sub-account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    Integer userId = 56; // Integer | Sub-account user id
    String key = "key_example"; // String | The API Key of the sub-account
    try {
      SubAccountKey result = apiInstance.getSubAccountKey(userId, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#getSubAccountKey");
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
 **userId** | **Integer**| Sub-account user id |
 **key** | **String**| The API Key of the sub-account |

### Return type

[**SubAccountKey**](SubAccountKey.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |

<a name="updateSubAccountKeys"></a>
# **updateSubAccountKeys**
> updateSubAccountKeys(userId, key, subAccountKey)

Update API key of the sub-account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    Integer userId = 56; // Integer | Sub-account user id
    String key = "key_example"; // String | The API Key of the sub-account
    SubAccountKey subAccountKey = new SubAccountKey(); // SubAccountKey | 
    try {
      apiInstance.updateSubAccountKeys(userId, key, subAccountKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#updateSubAccountKeys");
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
 **userId** | **Integer**| Sub-account user id |
 **key** | **String**| The API Key of the sub-account |
 **subAccountKey** | [**SubAccountKey**](SubAccountKey.md)|  |

### Return type

null (empty response body)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Updated |  -  |

<a name="deleteSubAccountKeys"></a>
# **deleteSubAccountKeys**
> deleteSubAccountKeys(userId, key)

Delete API key of the sub-account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    Integer userId = 56; // Integer | Sub-account user id
    String key = "key_example"; // String | The API Key of the sub-account
    try {
      apiInstance.deleteSubAccountKeys(userId, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#deleteSubAccountKeys");
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
 **userId** | **Integer**| Sub-account user id |
 **key** | **String**| The API Key of the sub-account |

### Return type

null (empty response body)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Delete successfully |  -  |

<a name="lockSubAccount"></a>
# **lockSubAccount**
> lockSubAccount(userId)

Lock the sub-account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    Long userId = 56L; // Long | The user id of the sub-account
    try {
      apiInstance.lockSubAccount(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#lockSubAccount");
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
 **userId** | **Long**| The user id of the sub-account |

### Return type

null (empty response body)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Lock successfully |  -  |

<a name="unlockSubAccount"></a>
# **unlockSubAccount**
> unlockSubAccount(userId)

Unlock the sub-account

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    Long userId = 56L; // Long | The user id of the sub-account
    try {
      apiInstance.unlockSubAccount(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#unlockSubAccount");
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
 **userId** | **Long**| The user id of the sub-account |

### Return type

null (empty response body)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Unlock successfully |  -  |

<a name="listUnifiedMode"></a>
# **listUnifiedMode**
> List&lt;SubUserMode&gt; listUnifiedMode()

Get sub-account mode

Unified account mode： - &#x60;classic&#x60;: Classic account mode - &#x60;multi_currency&#x60;: Multi-currency margin mode - &#x60;portfolio&#x60;: Portfolio margin mode

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    SubAccountApi apiInstance = new SubAccountApi(defaultClient);
    try {
      List<SubUserMode> result = apiInstance.listUnifiedMode();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountApi#listUnifiedMode");
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

[**List&lt;SubUserMode&gt;**](SubUserMode.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

