# WalletApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDepositAddress**](WalletApi.md#getDepositAddress) | **GET** /wallet/deposit_address | Generate currency deposit address
[**listDeposits**](WalletApi.md#listDeposits) | **GET** /wallet/deposits | Retrieve deposit records. Time range cannot exceed 30 days
[**listWithdrawals**](WalletApi.md#listWithdrawals) | **GET** /wallet/withdrawals | Retrieve withdrawal records. Time range cannot exceed 30 days
[**transfer**](WalletApi.md#transfer) | **POST** /wallet/transfers | Transfer between accounts
[**transferWithSubAccount**](WalletApi.md#transferWithSubAccount) | **POST** /wallet/sub_account_transfers | Transfer between main and sub accounts


<a name="getDepositAddress"></a>
# **getDepositAddress**
> DepositAddress getDepositAddress(currency)

Generate currency deposit address

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
String currency = "currency_example"; // String | Currency name
try {
    DepositAddress result = apiInstance.getDepositAddress(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#getDepositAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency name |

### Return type

[**DepositAddress**](DepositAddress.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeposits"></a>
# **listDeposits**
> List&lt;LedgerRecord&gt; listDeposits(currency, from, to, limit, offset)

Retrieve deposit records. Time range cannot exceed 30 days

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
String currency = "BTC"; // String | Filter by currency. Return all currency records if not specified
Long from = null; // Long | Time range beginning, default to 7 days before current time
Long to = null; // Long | Time range ending, default to current time
Integer limit = 100; // Integer | Maximum number of record returned in one list
Integer offset = 0; // Integer | List offset, starting from 0
try {
    List<LedgerRecord> result = apiInstance.listDeposits(currency, from, to, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#listDeposits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Filter by currency. Return all currency records if not specified | [optional]
 **from** | **Long**| Time range beginning, default to 7 days before current time | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;LedgerRecord&gt;**](LedgerRecord.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWithdrawals"></a>
# **listWithdrawals**
> List&lt;LedgerRecord&gt; listWithdrawals(currency, from, to, limit, offset)

Retrieve withdrawal records. Time range cannot exceed 30 days

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
String currency = "BTC"; // String | Filter by currency. Return all currency records if not specified
Long from = null; // Long | Time range beginning, default to 7 days before current time
Long to = null; // Long | Time range ending, default to current time
Integer limit = 100; // Integer | Maximum number of record returned in one list
Integer offset = 0; // Integer | List offset, starting from 0
try {
    List<LedgerRecord> result = apiInstance.listWithdrawals(currency, from, to, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#listWithdrawals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Filter by currency. Return all currency records if not specified | [optional]
 **from** | **Long**| Time range beginning, default to 7 days before current time | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;LedgerRecord&gt;**](LedgerRecord.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transfer"></a>
# **transfer**
> transfer(transfer)

Transfer between accounts

Transfer between different accounts. Currently support transfers between the following:  1. spot - margin 2. spot - futures

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

<a name="transferWithSubAccount"></a>
# **transferWithSubAccount**
> transferWithSubAccount(subAccountTransfer)

Transfer between main and sub accounts

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
SubAccountTransfer subAccountTransfer = new SubAccountTransfer(); // SubAccountTransfer | 
try {
    apiInstance.transferWithSubAccount(subAccountTransfer);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#transferWithSubAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountTransfer** | [**SubAccountTransfer**](SubAccountTransfer.md)|  |

### Return type

null (empty response body)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

