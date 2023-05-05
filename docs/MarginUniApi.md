# MarginUniApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUniCurrencyPairs**](MarginUniApi.md#listUniCurrencyPairs) | **GET** /margin/uni/currency_pairs | List lending markets
[**getUniCurrencyPair**](MarginUniApi.md#getUniCurrencyPair) | **GET** /margin/uni/currency_pairs/{currency_pair} | Get detail of lending market
[**listUniLoans**](MarginUniApi.md#listUniLoans) | **GET** /margin/uni/loans | List loans
[**createUniLoan**](MarginUniApi.md#createUniLoan) | **POST** /margin/uni/loans | Borrow or repay
[**listUniLoanRecords**](MarginUniApi.md#listUniLoanRecords) | **GET** /margin/uni/loan_records | Get load records
[**listUniLoanInterestRecords**](MarginUniApi.md#listUniLoanInterestRecords) | **GET** /margin/uni/interest_records | List interest records
[**getUniBorrowable**](MarginUniApi.md#getUniBorrowable) | **GET** /margin/uni/borrowable | Get maximum borrowable


<a name="listUniCurrencyPairs"></a>
# **listUniCurrencyPairs**
> List&lt;UniCurrencyPair&gt; listUniCurrencyPairs()

List lending markets

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MarginUniApi apiInstance = new MarginUniApi(defaultClient);
        try {
            List<UniCurrencyPair> result = apiInstance.listUniCurrencyPairs();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginUniApi#listUniCurrencyPairs");
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

[**List&lt;UniCurrencyPair&gt;**](UniCurrencyPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getUniCurrencyPair"></a>
# **getUniCurrencyPair**
> UniCurrencyPair getUniCurrencyPair(currencyPair)

Get detail of lending market

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MarginUniApi apiInstance = new MarginUniApi(defaultClient);
        String currencyPair = "AE_USDT"; // String | Currency pair
        try {
            UniCurrencyPair result = apiInstance.getUniCurrencyPair(currencyPair);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginUniApi#getUniCurrencyPair");
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
 **currencyPair** | **String**| Currency pair |

### Return type

[**UniCurrencyPair**](UniCurrencyPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listUniLoans"></a>
# **listUniLoans**
> List&lt;UniLoan&gt; listUniLoans().currencyPair(currencyPair).currency(currency).page(page).limit(limit).execute();

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
import io.gate.gateapi.api.MarginUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginUniApi apiInstance = new MarginUniApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair
        String currency = "BTC"; // String | Retrieve data of the specified currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        try {
            List<UniLoan> result = apiInstance.listUniLoans()
                        .currencyPair(currencyPair)
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginUniApi#listUniLoans");
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
 **currencyPair** | **String**| Currency pair | [optional]
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

<a name="createUniLoan"></a>
# **createUniLoan**
> createUniLoan(createUniLoan)

Borrow or repay

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginUniApi apiInstance = new MarginUniApi(defaultClient);
        CreateUniLoan createUniLoan = new CreateUniLoan(); // CreateUniLoan | 
        try {
            apiInstance.createUniLoan(createUniLoan);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginUniApi#createUniLoan");
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
 **createUniLoan** | [**CreateUniLoan**](CreateUniLoan.md)|  |

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

<a name="listUniLoanRecords"></a>
# **listUniLoanRecords**
> List&lt;UniLoanRecord&gt; listUniLoanRecords().type(type).currency(currency).currencyPair(currencyPair).page(page).limit(limit).execute();

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
import io.gate.gateapi.api.MarginUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginUniApi apiInstance = new MarginUniApi(defaultClient);
        String type = "type_example"; // String | type: borrow - borrow, repay - repay
        String currency = "BTC"; // String | Retrieve data of the specified currency
        String currencyPair = "BTC_USDT"; // String | Currency pair
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        try {
            List<UniLoanRecord> result = apiInstance.listUniLoanRecords()
                        .type(type)
                        .currency(currency)
                        .currencyPair(currencyPair)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginUniApi#listUniLoanRecords");
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
 **type** | **String**| type: borrow - borrow, repay - repay | [optional] [enum: borrow, repay]
 **currency** | **String**| Retrieve data of the specified currency | [optional]
 **currencyPair** | **String**| Currency pair | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum response items.  Default: 100, minimum: 1, Maximum: 100 | [optional] [default to 100]

### Return type

[**List&lt;UniLoanRecord&gt;**](UniLoanRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listUniLoanInterestRecords"></a>
# **listUniLoanInterestRecords**
> List&lt;UniLoanInterestRecord&gt; listUniLoanInterestRecords().currencyPair(currencyPair).currency(currency).page(page).limit(limit).execute();

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
import io.gate.gateapi.api.MarginUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginUniApi apiInstance = new MarginUniApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair
        String currency = "BTC"; // String | Retrieve data of the specified currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        try {
            List<UniLoanInterestRecord> result = apiInstance.listUniLoanInterestRecords()
                        .currencyPair(currencyPair)
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginUniApi#listUniLoanInterestRecords");
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
 **currencyPair** | **String**| Currency pair | [optional]
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

<a name="getUniBorrowable"></a>
# **getUniBorrowable**
> MaxUniBorrowable getUniBorrowable(currency, currencyPair)

Get maximum borrowable

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginUniApi apiInstance = new MarginUniApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency
        String currencyPair = "BTC_USDT"; // String | Currency pair
        try {
            MaxUniBorrowable result = apiInstance.getUniBorrowable(currency, currencyPair);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginUniApi#getUniBorrowable");
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
 **currencyPair** | **String**| Currency pair |

### Return type

[**MaxUniBorrowable**](MaxUniBorrowable.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

