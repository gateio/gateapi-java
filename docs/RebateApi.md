# RebateApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agencyTransactionHistory**](RebateApi.md#agencyTransactionHistory) | **GET** /rebate/agency/transaction_history | The broker obtains the transaction history of the recommended user
[**agencyCommissionsHistory**](RebateApi.md#agencyCommissionsHistory) | **GET** /rebate/agency/commission_history | The broker obtains the commission history of the recommended user


<a name="agencyTransactionHistory"></a>
# **agencyTransactionHistory**
> List&lt;AgencyTransactionHistory&gt; agencyTransactionHistory().currencyPair(currencyPair).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

The broker obtains the transaction history of the recommended user

Record time range cannot exceed 30 days

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Specify the currency pair, if not specified, return all currency pairs
        String userId = "10003"; // String | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Time range beginning, default to 7 days before current time
        Long to = 1602123600L; // Long | Time range ending, default to current time
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<AgencyTransactionHistory> result = apiInstance.agencyTransactionHistory()
                        .currencyPair(currencyPair)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#agencyTransactionHistory");
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
 **currencyPair** | **String**| Specify the currency pair, if not specified, return all currency pairs | [optional]
 **userId** | **String**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Time range beginning, default to 7 days before current time | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;AgencyTransactionHistory&gt;**](AgencyTransactionHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="agencyCommissionsHistory"></a>
# **agencyCommissionsHistory**
> List&lt;AgencyCommissionHistory&gt; agencyCommissionsHistory().currency(currency).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

The broker obtains the commission history of the recommended user

Record time range cannot exceed 30 days

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        String currency = "BTC"; // String | Filter by currency. Return all currency records if not specified
        String userId = "10003"; // String | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Time range beginning, default to 7 days before current time
        Long to = 1602123600L; // Long | Time range ending, default to current time
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<AgencyCommissionHistory> result = apiInstance.agencyCommissionsHistory()
                        .currency(currency)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#agencyCommissionsHistory");
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
 **currency** | **String**| Filter by currency. Return all currency records if not specified | [optional]
 **userId** | **String**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Time range beginning, default to 7 days before current time | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;AgencyCommissionHistory&gt;**](AgencyCommissionHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

