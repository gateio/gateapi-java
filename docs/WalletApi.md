# WalletApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transfer**](WalletApi.md#transfer) | **POST** /wallet/transfers | Transfer between accounts


<a name="transfer"></a>
# **transfer**
> transfer(transfer)

Transfer between accounts

Transfer between different accounts. Currently support transfers between the following:  1. spot - margin

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
WalletApi apiInstance = new WalletApi(client);
Transfer transfer = new Transfer(); // Transfer | 
try {
    apiInstance.transfer(transfer);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#transfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | [**Transfer**](Transfer.md)|  |

### Return type

null (empty response body)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

