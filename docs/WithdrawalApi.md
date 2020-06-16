# WithdrawalApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**withdraw**](WithdrawalApi.md#withdraw) | **POST** /withdrawals | Withdraw


<a name="withdraw"></a>
# **withdraw**
> LedgerRecord withdraw(ledgerRecord)

Withdraw

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WithdrawalApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
WithdrawalApi apiInstance = new WithdrawalApi(client);
LedgerRecord ledgerRecord = new LedgerRecord(); // LedgerRecord | 
try {
    LedgerRecord result = apiInstance.withdraw(ledgerRecord);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WithdrawalApi#withdraw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ledgerRecord** | [**LedgerRecord**](LedgerRecord.md)|  |

### Return type

[**LedgerRecord**](LedgerRecord.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

