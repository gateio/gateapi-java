# AccountApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountDetail**](AccountApi.md#getAccountDetail) | **GET** /account/detail | Get account detail
[**getAccountRateLimit**](AccountApi.md#getAccountRateLimit) | **GET** /account/rate_limit | Get user transaction rate limit information
[**listSTPGroups**](AccountApi.md#listSTPGroups) | **GET** /account/stp_groups | List STP Groups
[**createSTPGroup**](AccountApi.md#createSTPGroup) | **POST** /account/stp_groups | Create STP Group
[**listSTPGroupsUsers**](AccountApi.md#listSTPGroupsUsers) | **GET** /account/stp_groups/{stp_id}/users | List users of the STP group
[**addSTPGroupUsers**](AccountApi.md#addSTPGroupUsers) | **POST** /account/stp_groups/{stp_id}/users | Add users to the STP group
[**deleteSTPGroupUsers**](AccountApi.md#deleteSTPGroupUsers) | **DELETE** /account/stp_groups/{stp_id}/users | Delete the user in the STP group
[**getDebitFee**](AccountApi.md#getDebitFee) | **GET** /account/debit_fee | Query GT deduction configuration.
[**setDebitFee**](AccountApi.md#setDebitFee) | **POST** /account/debit_fee | Set GT deduction.


<a name="getAccountDetail"></a>
# **getAccountDetail**
> AccountDetail getAccountDetail()

Get account detail

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      AccountDetail result = apiInstance.getAccountDetail();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getAccountDetail");
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

[**AccountDetail**](AccountDetail.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |

<a name="getAccountRateLimit"></a>
# **getAccountRateLimit**
> List&lt;AccountRateLimit&gt; getAccountRateLimit()

Get user transaction rate limit information

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      List<AccountRateLimit> result = apiInstance.getAccountRateLimit();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getAccountRateLimit");
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

[**List&lt;AccountRateLimit&gt;**](AccountRateLimit.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |

<a name="listSTPGroups"></a>
# **listSTPGroups**
> List&lt;StpGroup&gt; listSTPGroups().name(name).execute();

List STP Groups

Retrieve the list of STP groups created by the main account user only

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String name = "group"; // String | Perform a fuzzy search based on the name
    try {
      List<StpGroup> result = apiInstance.listSTPGroups()
            .name(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listSTPGroups");
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
 **name** | **String**| Perform a fuzzy search based on the name | [optional]

### Return type

[**List&lt;StpGroup&gt;**](StpGroup.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="createSTPGroup"></a>
# **createSTPGroup**
> StpGroup createSTPGroup(stpGroup)

Create STP Group

Only the main account is allowed to create a new STP user group

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    StpGroup stpGroup = new StpGroup(); // StpGroup | 
    try {
      StpGroup result = apiInstance.createSTPGroup(stpGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createSTPGroup");
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
 **stpGroup** | [**StpGroup**](StpGroup.md)|  |

### Return type

[**StpGroup**](StpGroup.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User added successfully. Returning the current users within the STP group. |  -  |

<a name="listSTPGroupsUsers"></a>
# **listSTPGroupsUsers**
> List&lt;StpGroupUser&gt; listSTPGroupsUsers(stpId)

List users of the STP group

Only the main account that created this STP group is allowed to list the user ID of the STP group

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long stpId = 1L; // Long | STP Group ID
    try {
      List<StpGroupUser> result = apiInstance.listSTPGroupsUsers(stpId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listSTPGroupsUsers");
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
 **stpId** | **Long**| STP Group ID |

### Return type

[**List&lt;StpGroupUser&gt;**](StpGroupUser.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="addSTPGroupUsers"></a>
# **addSTPGroupUsers**
> List&lt;StpGroupUser&gt; addSTPGroupUsers(stpId, requestBody)

Add users to the STP group

- Only the master account that created the STP user group is allowed to add users to the STP user group.- Only accounts under the main account are allowed to be added. Cross-account is not permitted

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long stpId = 1L; // Long | STP Group ID
    List<Long> requestBody = Arrays.asList(); // List<Long> | User ID
    try {
      List<StpGroupUser> result = apiInstance.addSTPGroupUsers(stpId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#addSTPGroupUsers");
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
 **stpId** | **Long**| STP Group ID |
 **requestBody** | [**List&lt;Long&gt;**](Long.md)| User ID |

### Return type

[**List&lt;StpGroupUser&gt;**](StpGroupUser.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User added successfully. Returning the current users within the STP group. |  -  |

<a name="deleteSTPGroupUsers"></a>
# **deleteSTPGroupUsers**
> List&lt;StpGroupUser&gt; deleteSTPGroupUsers(stpId, userId)

Delete the user in the STP group

- Only the main account that created this STP group is allowed to delete users from the STP user group - Deletion is limited to accounts under the current main account; cross-account deletion is not permitted

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long stpId = 1L; // Long | STP Group ID
    Long userId = 1L; // Long | STP user ID, multiple can be separated by commas
    try {
      List<StpGroupUser> result = apiInstance.deleteSTPGroupUsers(stpId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deleteSTPGroupUsers");
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
 **stpId** | **Long**| STP Group ID |
 **userId** | **Long**| STP user ID, multiple can be separated by commas |

### Return type

[**List&lt;StpGroupUser&gt;**](StpGroupUser.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getDebitFee"></a>
# **getDebitFee**
> InlineResponse2001 getDebitFee()

Query GT deduction configuration.

Query the current GT deduction configuration for the account.

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      InlineResponse2001 result = apiInstance.getDebitFee();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getDebitFee");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="setDebitFee"></a>
# **setDebitFee**
> setDebitFee(inlineObject)

Set GT deduction.

Enable or disable GT deduction for the current account.

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      apiInstance.setDebitFee(inlineObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#setDebitFee");
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

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
**200** | Success |  -  |

