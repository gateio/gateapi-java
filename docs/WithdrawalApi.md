# WithdrawalApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**withdraw**](WithdrawalApi.md#withdraw) | **POST** /withdrawals | Withdraw
[**withdrawPushOrder**](WithdrawalApi.md#withdrawPushOrder) | **POST** /withdrawals/push | UID transfer
[**cancelWithdrawal**](WithdrawalApi.md#cancelWithdrawal) | **DELETE** /withdrawals/{withdrawal_id} | Cancel withdrawal with specified ID


<a name="withdraw"></a>
# **withdraw**
> LedgerRecord withdraw(ledgerRecord)

Withdraw

Withdrawals to Gate addresses do not incur transaction fees.

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WithdrawalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    WithdrawalApi apiInstance = new WithdrawalApi(defaultClient);
    LedgerRecord ledgerRecord = new LedgerRecord(); // LedgerRecord | 
    try {
      LedgerRecord result = apiInstance.withdraw(ledgerRecord);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WithdrawalApi#withdraw");
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
 **ledgerRecord** | [**LedgerRecord**](LedgerRecord.md)|  |

### Return type

[**LedgerRecord**](LedgerRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Withdraw request is accepted. Refer to withdrawal records for status |  -  |

<a name="withdrawPushOrder"></a>
# **withdrawPushOrder**
> UidPushWithdrawalResp withdrawPushOrder(uidPushWithdrawal)

UID transfer

Transfers between main spot accounts are allowed; however, both parties cannot be sub-accounts

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WithdrawalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    WithdrawalApi apiInstance = new WithdrawalApi(defaultClient);
    UidPushWithdrawal uidPushWithdrawal = new UidPushWithdrawal(); // UidPushWithdrawal | 
    try {
      UidPushWithdrawalResp result = apiInstance.withdrawPushOrder(uidPushWithdrawal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WithdrawalApi#withdrawPushOrder");
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
 **uidPushWithdrawal** | [**UidPushWithdrawal**](UidPushWithdrawal.md)|  |

### Return type

[**UidPushWithdrawalResp**](UidPushWithdrawalResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been accepted. Check the withdrawal record status for the processing result. |  -  |

<a name="cancelWithdrawal"></a>
# **cancelWithdrawal**
> LedgerRecord cancelWithdrawal(withdrawalId)

Cancel withdrawal with specified ID

### Example
```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WithdrawalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gateio.ws/api/v4");
    
    // Configure API key authorization: apiv4
    ApiKeyAuth apiv4 = (ApiKeyAuth) defaultClient.getAuthentication("apiv4");
    apiv4.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiv4.setApiKeyPrefix("Token");

    WithdrawalApi apiInstance = new WithdrawalApi(defaultClient);
    String withdrawalId = "210496"; // String | 
    try {
      LedgerRecord result = apiInstance.cancelWithdrawal(withdrawalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WithdrawalApi#cancelWithdrawal");
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
 **withdrawalId** | **String**|  |

### Return type

[**LedgerRecord**](LedgerRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Cancellation accepted. Refer to record status for the cancellation result |  -  |

