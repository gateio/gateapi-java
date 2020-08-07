# MarginApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMarginCurrencyPairs**](MarginApi.md#listMarginCurrencyPairs) | **GET** /margin/currency_pairs | List all supported currency pairs supported in margin trading
[**listFundingBook**](MarginApi.md#listFundingBook) | **GET** /margin/funding_book | Order book of lending loans
[**listMarginAccounts**](MarginApi.md#listMarginAccounts) | **GET** /margin/accounts | Margin account list
[**listMarginAccountBook**](MarginApi.md#listMarginAccountBook) | **GET** /margin/account_book | List margin account balance change history
[**listFundingAccounts**](MarginApi.md#listFundingAccounts) | **GET** /margin/funding_accounts | Funding account list
[**listLoans**](MarginApi.md#listLoans) | **GET** /margin/loans | List all loans
[**createLoan**](MarginApi.md#createLoan) | **POST** /margin/loans | Lend or borrow
[**mergeLoans**](MarginApi.md#mergeLoans) | **POST** /margin/merged_loans | Merge multiple lending loans
[**getLoan**](MarginApi.md#getLoan) | **GET** /margin/loans/{loan_id} | Retrieve one single loan detail
[**cancelLoan**](MarginApi.md#cancelLoan) | **DELETE** /margin/loans/{loan_id} | Cancel lending loan
[**updateLoan**](MarginApi.md#updateLoan) | **PATCH** /margin/loans/{loan_id} | Modify a loan
[**listLoanRepayments**](MarginApi.md#listLoanRepayments) | **GET** /margin/loans/{loan_id}/repayment | List loan repayment records
[**repayLoan**](MarginApi.md#repayLoan) | **POST** /margin/loans/{loan_id}/repayment | Repay a loan
[**listLoanRecords**](MarginApi.md#listLoanRecords) | **GET** /margin/loan_records | List repayment records of specified loan
[**getLoanRecord**](MarginApi.md#getLoanRecord) | **GET** /margin/loan_records/{loan_record_id} | Get one single loan record
[**updateLoanRecord**](MarginApi.md#updateLoanRecord) | **PATCH** /margin/loan_records/{loan_record_id} | Modify a loan record


<a name="listMarginCurrencyPairs"></a>
# **listMarginCurrencyPairs**
> List&lt;MarginCurrencyPair&gt; listMarginCurrencyPairs()

List all supported currency pairs supported in margin trading

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MarginApi apiInstance = new MarginApi(defaultClient);
        try {
            List<MarginCurrencyPair> result = apiInstance.listMarginCurrencyPairs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listMarginCurrencyPairs");
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

[**List&lt;MarginCurrencyPair&gt;**](MarginCurrencyPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listFundingBook"></a>
# **listFundingBook**
> List&lt;FundingBookItem&gt; listFundingBook(currency)

Order book of lending loans

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String currency = "BTC"; // String | Retrieved specified currency related data
        try {
            List<FundingBookItem> result = apiInstance.listFundingBook(currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listFundingBook");
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
 **currency** | **String**| Retrieved specified currency related data |

### Return type

[**List&lt;FundingBookItem&gt;**](FundingBookItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order book retrieved |  -  |

<a name="listMarginAccounts"></a>
# **listMarginAccounts**
> List&lt;MarginAccount&gt; listMarginAccounts().currencyPair(currencyPair).execute();

Margin account list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Currency pair
        try {
            List<MarginAccount> result = apiInstance.listMarginAccounts()
                        .currencyPair(currencyPair)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listMarginAccounts");
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
 **currencyPair** | **String**| Currency pair | [optional]

### Return type

[**List&lt;MarginAccount&gt;**](MarginAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listMarginAccountBook"></a>
# **listMarginAccountBook**
> List&lt;MarginAccountBook&gt; listMarginAccountBook().currency(currency).currencyPair(currencyPair).from(from).to(to).page(page).limit(limit).execute();

List margin account balance change history

Only transferring from or to margin account are provided for now. Time range allows 30 days at most

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String currency = "currency_example"; // String | List records related to specified currency only. If specified, `currency_pair` is also required.
        String currencyPair = "currencyPair_example"; // String | List records related to specified currency pair. Used in combination with `currency`. Ignored if `currency` is not provided
        Long from = 56L; // Long | Time range beginning, default to 7 days before current time
        Long to = 56L; // Long | Time range ending, default to current time
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned in one list
        try {
            List<MarginAccountBook> result = apiInstance.listMarginAccountBook()
                        .currency(currency)
                        .currencyPair(currencyPair)
                        .from(from)
                        .to(to)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listMarginAccountBook");
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
 **currency** | **String**| List records related to specified currency only. If specified, &#x60;currency_pair&#x60; is also required. | [optional]
 **currencyPair** | **String**| List records related to specified currency pair. Used in combination with &#x60;currency&#x60;. Ignored if &#x60;currency&#x60; is not provided | [optional]
 **from** | **Long**| Time range beginning, default to 7 days before current time | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]

### Return type

[**List&lt;MarginAccountBook&gt;**](MarginAccountBook.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listFundingAccounts"></a>
# **listFundingAccounts**
> List&lt;FundingAccount&gt; listFundingAccounts().currency(currency).execute();

Funding account list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String currency = "BTC"; // String | Retrieved specified currency related data
        try {
            List<FundingAccount> result = apiInstance.listFundingAccounts()
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listFundingAccounts");
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
 **currency** | **String**| Retrieved specified currency related data | [optional]

### Return type

[**List&lt;FundingAccount&gt;**](FundingAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listLoans"></a>
# **listLoans**
> List&lt;Loan&gt; listLoans(status, side).currency(currency).currencyPair(currencyPair).sortBy(sortBy).reverseSort(reverseSort).page(page).limit(limit).execute();

List all loans

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String status = "open"; // String | Loan status
        String side = "lend"; // String | Lend or borrow
        String currency = "BTC"; // String | Retrieved specified currency related data
        String currencyPair = "BTC_USDT"; // String | Currency pair
        String sortBy = "rate"; // String | Specify which field is used to sort. `create_time` or `rate` is supported. Default to `create_time`
        Boolean reverseSort = false; // Boolean | Whether to sort in descending order. Default to `true`
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned in one list
        try {
            List<Loan> result = apiInstance.listLoans(status, side)
                        .currency(currency)
                        .currencyPair(currencyPair)
                        .sortBy(sortBy)
                        .reverseSort(reverseSort)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listLoans");
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
 **status** | **String**| Loan status | [enum: open, loaned, finished, auto_repaid]
 **side** | **String**| Lend or borrow | [enum: lend, borrow]
 **currency** | **String**| Retrieved specified currency related data | [optional]
 **currencyPair** | **String**| Currency pair | [optional]
 **sortBy** | **String**| Specify which field is used to sort. &#x60;create_time&#x60; or &#x60;rate&#x60; is supported. Default to &#x60;create_time&#x60; | [optional] [enum: create_time, rate]
 **reverseSort** | **Boolean**| Whether to sort in descending order. Default to &#x60;true&#x60; | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]

### Return type

[**List&lt;Loan&gt;**](Loan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="createLoan"></a>
# **createLoan**
> Loan createLoan(loan)

Lend or borrow

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        Loan loan = new Loan(); // Loan | 
        try {
            Loan result = apiInstance.createLoan(loan);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#createLoan");
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
 **loan** | [**Loan**](Loan.md)|  |

### Return type

[**Loan**](Loan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Loan created |  -  |

<a name="mergeLoans"></a>
# **mergeLoans**
> Loan mergeLoans(currency, ids)

Merge multiple lending loans

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String currency = "BTC"; // String | Retrieved specified currency related data
        String ids = "123,234,345"; // String | Lending loan ID list separated by `,`. Maximum of 20 IDs are allowed in one request
        try {
            Loan result = apiInstance.mergeLoans(currency, ids);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#mergeLoans");
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
 **currency** | **String**| Retrieved specified currency related data |
 **ids** | **String**| Lending loan ID list separated by &#x60;,&#x60;. Maximum of 20 IDs are allowed in one request |

### Return type

[**Loan**](Loan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Loans merged |  -  |

<a name="getLoan"></a>
# **getLoan**
> Loan getLoan(loanId, side)

Retrieve one single loan detail

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String loanId = "12345"; // String | Loan ID
        String side = "lend"; // String | Lend or borrow
        try {
            Loan result = apiInstance.getLoan(loanId, side);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getLoan");
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
 **loanId** | **String**| Loan ID |
 **side** | **String**| Lend or borrow | [enum: lend, borrow]

### Return type

[**Loan**](Loan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="cancelLoan"></a>
# **cancelLoan**
> Loan cancelLoan(loanId, currency)

Cancel lending loan

Only lending loans can be cancelled

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String loanId = "12345"; // String | Loan ID
        String currency = "BTC"; // String | Retrieved specified currency related data
        try {
            Loan result = apiInstance.cancelLoan(loanId, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#cancelLoan");
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
 **loanId** | **String**| Loan ID |
 **currency** | **String**| Retrieved specified currency related data |

### Return type

[**Loan**](Loan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order cancelled |  -  |

<a name="updateLoan"></a>
# **updateLoan**
> Loan updateLoan(loanId, loanPatch)

Modify a loan

Only &#x60;auto_renew&#x60; modification is supported currently

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String loanId = "12345"; // String | Loan ID
        LoanPatch loanPatch = new LoanPatch(); // LoanPatch | 
        try {
            Loan result = apiInstance.updateLoan(loanId, loanPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#updateLoan");
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
 **loanId** | **String**| Loan ID |
 **loanPatch** | [**LoanPatch**](LoanPatch.md)|  |

### Return type

[**Loan**](Loan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated |  -  |

<a name="listLoanRepayments"></a>
# **listLoanRepayments**
> List&lt;Repayment&gt; listLoanRepayments(loanId)

List loan repayment records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String loanId = "12345"; // String | Loan ID
        try {
            List<Repayment> result = apiInstance.listLoanRepayments(loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listLoanRepayments");
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
 **loanId** | **String**| Loan ID |

### Return type

[**List&lt;Repayment&gt;**](Repayment.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="repayLoan"></a>
# **repayLoan**
> Loan repayLoan(loanId, repayRequest)

Repay a loan

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String loanId = "12345"; // String | Loan ID
        RepayRequest repayRequest = new RepayRequest(); // RepayRequest | 
        try {
            Loan result = apiInstance.repayLoan(loanId, repayRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#repayLoan");
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
 **loanId** | **String**| Loan ID |
 **repayRequest** | [**RepayRequest**](RepayRequest.md)|  |

### Return type

[**Loan**](Loan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Loan repaid |  -  |

<a name="listLoanRecords"></a>
# **listLoanRecords**
> List&lt;LoanRecord&gt; listLoanRecords(loanId).status(status).page(page).limit(limit).execute();

List repayment records of specified loan

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String loanId = "12345"; // String | Loan ID
        String status = "loaned"; // String | Loan record status
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned in one list
        try {
            List<LoanRecord> result = apiInstance.listLoanRecords(loanId)
                        .status(status)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listLoanRecords");
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
 **loanId** | **String**| Loan ID |
 **status** | **String**| Loan record status | [optional] [enum: loaned, finished]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in one list | [optional] [default to 100]

### Return type

[**List&lt;LoanRecord&gt;**](LoanRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getLoanRecord"></a>
# **getLoanRecord**
> LoanRecord getLoanRecord(loanRecordId, loanId)

Get one single loan record

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String loanRecordId = "12345"; // String | Loan record ID
        String loanId = "12345"; // String | Loan ID
        try {
            LoanRecord result = apiInstance.getLoanRecord(loanRecordId, loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getLoanRecord");
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
 **loanRecordId** | **String**| Loan record ID |
 **loanId** | **String**| Loan ID |

### Return type

[**LoanRecord**](LoanRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Detail retrieved |  -  |

<a name="updateLoanRecord"></a>
# **updateLoanRecord**
> LoanRecord updateLoanRecord(loanRecordId, loanPatch)

Modify a loan record

Only &#x60;auto_renew&#x60; modification is supported currently

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String loanRecordId = "12345"; // String | Loan record ID
        LoanPatch loanPatch = new LoanPatch(); // LoanPatch | 
        try {
            LoanRecord result = apiInstance.updateLoanRecord(loanRecordId, loanPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#updateLoanRecord");
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
 **loanRecordId** | **String**| Loan record ID |
 **loanPatch** | [**LoanPatch**](LoanPatch.md)|  |

### Return type

[**LoanRecord**](LoanRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Loan record updated |  -  |

