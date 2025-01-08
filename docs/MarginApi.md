# MarginApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMarginAccounts**](MarginApi.md#listMarginAccounts) | **GET** /margin/accounts | Margin account list
[**listMarginAccountBook**](MarginApi.md#listMarginAccountBook) | **GET** /margin/account_book | List margin account balance change history
[**listFundingAccounts**](MarginApi.md#listFundingAccounts) | **GET** /margin/funding_accounts | Funding account list
[**getAutoRepayStatus**](MarginApi.md#getAutoRepayStatus) | **GET** /margin/auto_repay | Retrieve user auto repayment setting
[**setAutoRepay**](MarginApi.md#setAutoRepay) | **POST** /margin/auto_repay | Update user&#39;s auto repayment setting
[**getMarginTransferable**](MarginApi.md#getMarginTransferable) | **GET** /margin/transferable | Get the max transferable amount for a specific margin currency
[**listCrossMarginCurrencies**](MarginApi.md#listCrossMarginCurrencies) | **GET** /margin/cross/currencies | Currencies supported by cross margin.
[**getCrossMarginCurrency**](MarginApi.md#getCrossMarginCurrency) | **GET** /margin/cross/currencies/{currency} | Retrieve detail of one single currency supported by cross margin
[**getCrossMarginAccount**](MarginApi.md#getCrossMarginAccount) | **GET** /margin/cross/accounts | Retrieve cross margin account
[**listCrossMarginAccountBook**](MarginApi.md#listCrossMarginAccountBook) | **GET** /margin/cross/account_book | Retrieve cross margin account change history
[**listCrossMarginLoans**](MarginApi.md#listCrossMarginLoans) | **GET** /margin/cross/loans | List cross margin borrow history
[**createCrossMarginLoan**](MarginApi.md#createCrossMarginLoan) | **POST** /margin/cross/loans | Create a cross margin borrow loan
[**getCrossMarginLoan**](MarginApi.md#getCrossMarginLoan) | **GET** /margin/cross/loans/{loan_id} | Retrieve single borrow loan detail
[**listCrossMarginRepayments**](MarginApi.md#listCrossMarginRepayments) | **GET** /margin/cross/repayments | Retrieve cross margin repayments
[**repayCrossMarginLoan**](MarginApi.md#repayCrossMarginLoan) | **POST** /margin/cross/repayments | Cross margin repayments
[**getCrossMarginInterestRecords**](MarginApi.md#getCrossMarginInterestRecords) | **GET** /margin/cross/interest_records | Interest records for the cross margin account
[**getCrossMarginTransferable**](MarginApi.md#getCrossMarginTransferable) | **GET** /margin/cross/transferable | Get the max transferable amount for a specific cross margin currency
[**getCrossMarginEstimateRate**](MarginApi.md#getCrossMarginEstimateRate) | **GET** /margin/cross/estimate_rate | Estimated interest rates
[**getCrossMarginBorrowable**](MarginApi.md#getCrossMarginBorrowable) | **GET** /margin/cross/borrowable | Get the max borrowable amount for a specific cross margin currency


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
import io.gate.gateapi.GateApiException;
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
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listMarginAccounts");
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
> List&lt;MarginAccountBook&gt; listMarginAccountBook().currency(currency).currencyPair(currencyPair).type(type).from(from).to(to).page(page).limit(limit).execute();

List margin account balance change history

Only transferals from and to margin account are provided for now. Time range allows 30 days at most

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        String type = "lend"; // String | Only retrieve changes of the specified type. All types will be returned if not specified.
        Long from = 1627706330L; // Long | Start timestamp of the query
        Long to = 1635329650L; // Long | Time range ending, default to current time
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        try {
            List<MarginAccountBook> result = apiInstance.listMarginAccountBook()
                        .currency(currency)
                        .currencyPair(currencyPair)
                        .type(type)
                        .from(from)
                        .to(to)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listMarginAccountBook");
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
 **currency** | **String**| List records related to specified currency only. If specified, &#x60;currency_pair&#x60; is also required. | [optional]
 **currencyPair** | **String**| List records related to specified currency pair. Used in combination with &#x60;currency&#x60;. Ignored if &#x60;currency&#x60; is not provided | [optional]
 **type** | **String**| Only retrieve changes of the specified type. All types will be returned if not specified. | [optional]
 **from** | **Long**| Start timestamp of the query | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]

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
import io.gate.gateapi.GateApiException;
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
        String currency = "BTC"; // String | Retrieve data of the specified currency
        try {
            List<FundingAccount> result = apiInstance.listFundingAccounts()
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listFundingAccounts");
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

<a name="getAutoRepayStatus"></a>
# **getAutoRepayStatus**
> AutoRepaySetting getAutoRepayStatus()

Retrieve user auto repayment setting

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        try {
            AutoRepaySetting result = apiInstance.getAutoRepayStatus();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getAutoRepayStatus");
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

[**AutoRepaySetting**](AutoRepaySetting.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Current auto repayment setting |  -  |

<a name="setAutoRepay"></a>
# **setAutoRepay**
> AutoRepaySetting setAutoRepay(status)

Update user&#39;s auto repayment setting

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        String status = "on"; // String | New auto repayment status. `on` - enabled, `off` - disabled
        try {
            AutoRepaySetting result = apiInstance.setAutoRepay(status);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#setAutoRepay");
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
 **status** | **String**| New auto repayment status. &#x60;on&#x60; - enabled, &#x60;off&#x60; - disabled |

### Return type

[**AutoRepaySetting**](AutoRepaySetting.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Current auto repayment setting |  -  |

<a name="getMarginTransferable"></a>
# **getMarginTransferable**
> MarginTransferable getMarginTransferable(currency).currencyPair(currencyPair).execute();

Get the max transferable amount for a specific margin currency

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        String currency = "BTC"; // String | Retrieve data of the specified currency
        String currencyPair = "BTC_USDT"; // String | Currency pair
        try {
            MarginTransferable result = apiInstance.getMarginTransferable(currency)
                        .currencyPair(currencyPair)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getMarginTransferable");
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
 **currencyPair** | **String**| Currency pair | [optional]

### Return type

[**MarginTransferable**](MarginTransferable.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listCrossMarginCurrencies"></a>
# **listCrossMarginCurrencies**
> List&lt;CrossMarginCurrency&gt; listCrossMarginCurrencies()

Currencies supported by cross margin.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MarginApi apiInstance = new MarginApi(defaultClient);
        try {
            List<CrossMarginCurrency> result = apiInstance.listCrossMarginCurrencies();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listCrossMarginCurrencies");
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

[**List&lt;CrossMarginCurrency&gt;**](CrossMarginCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="getCrossMarginCurrency"></a>
# **getCrossMarginCurrency**
> CrossMarginCurrency getCrossMarginCurrency(currency)

Retrieve detail of one single currency supported by cross margin

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MarginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MarginApi apiInstance = new MarginApi(defaultClient);
        String currency = "BTC"; // String | Currency name
        try {
            CrossMarginCurrency result = apiInstance.getCrossMarginCurrency(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getCrossMarginCurrency");
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
 **currency** | **String**| Currency name |

### Return type

[**CrossMarginCurrency**](CrossMarginCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getCrossMarginAccount"></a>
# **getCrossMarginAccount**
> CrossMarginAccount getCrossMarginAccount()

Retrieve cross margin account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        try {
            CrossMarginAccount result = apiInstance.getCrossMarginAccount();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getCrossMarginAccount");
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

[**CrossMarginAccount**](CrossMarginAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listCrossMarginAccountBook"></a>
# **listCrossMarginAccountBook**
> List&lt;CrossMarginAccountBook&gt; listCrossMarginAccountBook().currency(currency).from(from).to(to).page(page).limit(limit).type(type).execute();

Retrieve cross margin account change history

The record query time range is not allowed to exceed 30 days.  When using the limit&amp;page paging function to retrieve data, the maximum number of pages is 100,000, that is, (limit page - 1) &lt;&#x3D; 100000.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        String currency = "currency_example"; // String | Filter by currency
        Long from = 1627706330L; // Long | Start timestamp of the query
        Long to = 1635329650L; // Long | Time range ending, default to current time
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        String type = "borrow"; // String | Only retrieve changes of the specified type. All types will be returned if not specified.
        try {
            List<CrossMarginAccountBook> result = apiInstance.listCrossMarginAccountBook()
                        .currency(currency)
                        .from(from)
                        .to(to)
                        .page(page)
                        .limit(limit)
                        .type(type)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listCrossMarginAccountBook");
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
 **currency** | **String**| Filter by currency | [optional]
 **from** | **Long**| Start timestamp of the query | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **type** | **String**| Only retrieve changes of the specified type. All types will be returned if not specified. | [optional]

### Return type

[**List&lt;CrossMarginAccountBook&gt;**](CrossMarginAccountBook.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="listCrossMarginLoans"></a>
# **listCrossMarginLoans**
> List&lt;CrossMarginLoan&gt; listCrossMarginLoans(status).currency(currency).limit(limit).offset(offset).reverse(reverse).execute();

List cross margin borrow history

Sort by creation time in descending order by default. Set &#x60;reverse&#x3D;false&#x60; to return ascending results.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        Integer status = 56; // Integer | Filter by status. Supported values are 2 and 3. (deprecated.)
        String currency = "currency_example"; // String | Filter by currency
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Boolean reverse = true; // Boolean | Whether to sort in descending order, which is the default. Set `reverse=false` to return ascending results
        try {
            List<CrossMarginLoan> result = apiInstance.listCrossMarginLoans(status)
                        .currency(currency)
                        .limit(limit)
                        .offset(offset)
                        .reverse(reverse)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listCrossMarginLoans");
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
 **status** | **Integer**| Filter by status. Supported values are 2 and 3. (deprecated.) |
 **currency** | **String**| Filter by currency | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **reverse** | **Boolean**| Whether to sort in descending order, which is the default. Set &#x60;reverse&#x3D;false&#x60; to return ascending results | [optional] [default to true]

### Return type

[**List&lt;CrossMarginLoan&gt;**](CrossMarginLoan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="createCrossMarginLoan"></a>
# **createCrossMarginLoan**
> CrossMarginLoan createCrossMarginLoan(crossMarginLoan)

Create a cross margin borrow loan

Borrow amount cannot be less than currency minimum borrow amount

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        CrossMarginLoan crossMarginLoan = new CrossMarginLoan(); // CrossMarginLoan | 
        try {
            CrossMarginLoan result = apiInstance.createCrossMarginLoan(crossMarginLoan);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#createCrossMarginLoan");
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
 **crossMarginLoan** | [**CrossMarginLoan**](CrossMarginLoan.md)|  |

### Return type

[**CrossMarginLoan**](CrossMarginLoan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully borrowed |  -  |

<a name="getCrossMarginLoan"></a>
# **getCrossMarginLoan**
> CrossMarginLoan getCrossMarginLoan(loanId)

Retrieve single borrow loan detail

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        String loanId = "12345"; // String | Borrow loan ID
        try {
            CrossMarginLoan result = apiInstance.getCrossMarginLoan(loanId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getCrossMarginLoan");
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
 **loanId** | **String**| Borrow loan ID |

### Return type

[**CrossMarginLoan**](CrossMarginLoan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listCrossMarginRepayments"></a>
# **listCrossMarginRepayments**
> List&lt;CrossMarginRepayment&gt; listCrossMarginRepayments().currency(currency).loanId(loanId).limit(limit).offset(offset).reverse(reverse).execute();

Retrieve cross margin repayments

Sort by creation time in descending order by default. Set &#x60;reverse&#x3D;false&#x60; to return ascending results.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        String currency = "BTC"; // String | 
        String loanId = "12345"; // String | 
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Boolean reverse = true; // Boolean | Whether to sort in descending order, which is the default. Set `reverse=false` to return ascending results
        try {
            List<CrossMarginRepayment> result = apiInstance.listCrossMarginRepayments()
                        .currency(currency)
                        .loanId(loanId)
                        .limit(limit)
                        .offset(offset)
                        .reverse(reverse)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listCrossMarginRepayments");
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
 **currency** | **String**|  | [optional]
 **loanId** | **String**|  | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **reverse** | **Boolean**| Whether to sort in descending order, which is the default. Set &#x60;reverse&#x3D;false&#x60; to return ascending results | [optional] [default to true]

### Return type

[**List&lt;CrossMarginRepayment&gt;**](CrossMarginRepayment.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved |  -  |

<a name="repayCrossMarginLoan"></a>
# **repayCrossMarginLoan**
> List&lt;CrossMarginLoan&gt; repayCrossMarginLoan(crossMarginRepayRequest)

Cross margin repayments

When the liquidity of the currency is insufficient and the transaction risk is high, the currency will be disabled, and funds cannot be transferred.When the available balance of cross-margin is insufficient, the balance of the spot account can be used for repayment. Please ensure that the balance of the spot account is sufficient, and system uses cross-margin account for repayment first

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        CrossMarginRepayRequest crossMarginRepayRequest = new CrossMarginRepayRequest(); // CrossMarginRepayRequest | 
        try {
            List<CrossMarginLoan> result = apiInstance.repayCrossMarginLoan(crossMarginRepayRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#repayCrossMarginLoan");
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
 **crossMarginRepayRequest** | [**CrossMarginRepayRequest**](CrossMarginRepayRequest.md)|  |

### Return type

[**List&lt;CrossMarginLoan&gt;**](CrossMarginLoan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Loan repaid |  -  |

<a name="getCrossMarginInterestRecords"></a>
# **getCrossMarginInterestRecords**
> List&lt;UniLoanInterestRecord&gt; getCrossMarginInterestRecords().currency(currency).page(page).limit(limit).from(from).to(to).execute();

Interest records for the cross margin account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        String currency = "BTC"; // String | Retrieve data of the specified currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        Long from = 1547706332L; // Long | Start timestamp
        Long to = 1547706332L; // Long | End timestamp
        try {
            List<UniLoanInterestRecord> result = apiInstance.getCrossMarginInterestRecords()
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getCrossMarginInterestRecords");
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
 **from** | **Long**| Start timestamp | [optional]
 **to** | **Long**| End timestamp | [optional]

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

<a name="getCrossMarginTransferable"></a>
# **getCrossMarginTransferable**
> CrossMarginTransferable getCrossMarginTransferable(currency)

Get the max transferable amount for a specific cross margin currency

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        String currency = "BTC"; // String | Retrieve data of the specified currency
        try {
            CrossMarginTransferable result = apiInstance.getCrossMarginTransferable(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getCrossMarginTransferable");
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

[**CrossMarginTransferable**](CrossMarginTransferable.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getCrossMarginEstimateRate"></a>
# **getCrossMarginEstimateRate**
> Map&lt;String, String&gt; getCrossMarginEstimateRate(currencies)

Estimated interest rates

Please note that the interest rates are subject to change based on the borrowing and lending demand, and therefore, the provided rates may not be entirely accurate.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        List<String> currencies = Arrays.asList(); // List<String> | An array of up to 10 specifying the currency name
        try {
            Map<String, String> result = apiInstance.getCrossMarginEstimateRate(currencies);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getCrossMarginEstimateRate");
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
 **currencies** | [**List&lt;String&gt;**](String.md)| An array of up to 10 specifying the currency name |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getCrossMarginBorrowable"></a>
# **getCrossMarginBorrowable**
> UnifiedBorrowable getCrossMarginBorrowable(currency)

Get the max borrowable amount for a specific cross margin currency

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
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
        String currency = "BTC"; // String | Retrieve data of the specified currency
        try {
            UnifiedBorrowable result = apiInstance.getCrossMarginBorrowable(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getCrossMarginBorrowable");
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

