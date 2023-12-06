# UnifiedApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUnifiedAccounts**](UnifiedApi.md#listUnifiedAccounts) | **GET** /unified/accounts | Get unified account information
[**listUnifiedAccountMode**](UnifiedApi.md#listUnifiedAccountMode) | **GET** /unified/account_mode | Query mode of the unified account
[**setUnifiedAccountMode**](UnifiedApi.md#setUnifiedAccountMode) | **POST** /unified/account_mode | Set mode of the unified account
[**getUnifiedBorrowable**](UnifiedApi.md#getUnifiedBorrowable) | **GET** /unified/borrowable | Query about the maximum borrowing for the unified account
[**getUnifiedTransferable**](UnifiedApi.md#getUnifiedTransferable) | **GET** /unified/transferable | Query about the maximum transferable for the unified account
[**listUnifiedLoans**](UnifiedApi.md#listUnifiedLoans) | **GET** /unified/loans | List loans
[**createUnifiedLoan**](UnifiedApi.md#createUnifiedLoan) | **POST** /unified/loans | Borrow or repay
[**listUnifiedLoanRecords**](UnifiedApi.md#listUnifiedLoanRecords) | **GET** /unified/loan_records | Get load records
[**listUnifiedLoanInterestRecords**](UnifiedApi.md#listUnifiedLoanInterestRecords) | **GET** /unified/interest_records | List interest records


<a name="listUnifiedAccounts"></a>
# **listUnifiedAccounts**
> UnifiedAccount listUnifiedAccounts().currency(currency).execute();

Get unified account information

The assets of each currency in the account will be adjusted according to their liquidity, defined by corresponding adjustment coefficients, and then uniformly converted to USD to calculate the total asset value and position value of the account.  You can refer to the [Formula](#portfolio-account) in the documentation

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency
        try {
            UnifiedAccount result = apiInstance.listUnifiedAccounts()
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedAccounts");
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

### Return type

[**UnifiedAccount**](UnifiedAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listUnifiedAccountMode"></a>
# **listUnifiedAccountMode**
> Map&lt;String, Boolean&gt; listUnifiedAccountMode()

Query mode of the unified account

cross_margin - cross margin, usdt_futures - usdt futures

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        try {
            Map<String, Boolean> result = apiInstance.listUnifiedAccountMode();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedAccountMode");
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

**Map&lt;String, Boolean&gt;**

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="setUnifiedAccountMode"></a>
# **setUnifiedAccountMode**
> Map&lt;String, Boolean&gt; setUnifiedAccountMode(unifiedMode)

Set mode of the unified account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        UnifiedMode unifiedMode = new UnifiedMode(); // UnifiedMode | 
        try {
            Map<String, Boolean> result = apiInstance.setUnifiedAccountMode(unifiedMode);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#setUnifiedAccountMode");
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
 **unifiedMode** | [**UnifiedMode**](UnifiedMode.md)|  |

### Return type

**Map&lt;String, Boolean&gt;**

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getUnifiedBorrowable"></a>
# **getUnifiedBorrowable**
> UnifiedBorrowable getUnifiedBorrowable(currency)

Query about the maximum borrowing for the unified account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency
        try {
            UnifiedBorrowable result = apiInstance.getUnifiedBorrowable(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedBorrowable");
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
 **currency** | **String**| Retrieve data of the specified currency |

### Return type

[**UnifiedBorrowable**](UnifiedBorrowable.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getUnifiedTransferable"></a>
# **getUnifiedTransferable**
> UnifiedTransferable getUnifiedTransferable(currency)

Query about the maximum transferable for the unified account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency
        try {
            UnifiedTransferable result = apiInstance.getUnifiedTransferable(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedTransferable");
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
 **currency** | **String**| Retrieve data of the specified currency |

### Return type

[**UnifiedTransferable**](UnifiedTransferable.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listUnifiedLoans"></a>
# **listUnifiedLoans**
> List&lt;UniLoan&gt; listUnifiedLoans().currency(currency).page(page).limit(limit).execute();

List loans

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        try {
            List<UniLoan> result = apiInstance.listUnifiedLoans()
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedLoans");
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
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum response items.  Default: 100, minimum: 1, Maximum: 100 | [optional] [default to 100]

### Return type

[**List&lt;UniLoan&gt;**](UniLoan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="createUnifiedLoan"></a>
# **createUnifiedLoan**
> createUnifiedLoan(unifiedLoan)

Borrow or repay

When borrowing, it is essential to ensure that the borrowed amount is not below the minimum borrowing threshold for the specific cryptocurrency and does not exceed the maximum borrowing limit set by the platform and the user.  The interest on the loan will be automatically deducted from the account at regular intervals. It is the user&#39;s responsibility to manage the repayment of the borrowed amount.  For repayment, the option to repay the entire borrowed amount is available by setting the parameter &#x60;repaid_all&#x3D;true&#x60;

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        UnifiedLoan unifiedLoan = new UnifiedLoan(); // UnifiedLoan | 
        try {
            apiInstance.createUnifiedLoan(unifiedLoan);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#createUnifiedLoan");
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
 **unifiedLoan** | [**UnifiedLoan**](UnifiedLoan.md)|  |

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
**204** | Operated successfully |  -  |

<a name="listUnifiedLoanRecords"></a>
# **listUnifiedLoanRecords**
> List&lt;UnifiedLoanRecord&gt; listUnifiedLoanRecords().type(type).currency(currency).page(page).limit(limit).execute();

Get load records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String type = "type_example"; // String | The types of lending records, borrow - indicates the action of borrowing funds, repay - indicates the action of repaying the borrowed funds
        String currency = "BTC"; // String | Retrieve data of the specified currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        try {
            List<UnifiedLoanRecord> result = apiInstance.listUnifiedLoanRecords()
                        .type(type)
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedLoanRecords");
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
 **type** | **String**| The types of lending records, borrow - indicates the action of borrowing funds, repay - indicates the action of repaying the borrowed funds | [optional] [enum: borrow, repay]
 **currency** | **String**| Retrieve data of the specified currency | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum response items.  Default: 100, minimum: 1, Maximum: 100 | [optional] [default to 100]

### Return type

[**List&lt;UnifiedLoanRecord&gt;**](UnifiedLoanRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listUnifiedLoanInterestRecords"></a>
# **listUnifiedLoanInterestRecords**
> List&lt;UniLoanInterestRecord&gt; listUnifiedLoanInterestRecords().currency(currency).page(page).limit(limit).execute();

List interest records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        try {
            List<UniLoanInterestRecord> result = apiInstance.listUnifiedLoanInterestRecords()
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedLoanInterestRecords");
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
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum response items.  Default: 100, minimum: 1, Maximum: 100 | [optional] [default to 100]

### Return type

[**List&lt;UniLoanInterestRecord&gt;**](UniLoanInterestRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

