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
[**getUserMarginTier**](MarginApi.md#getUserMarginTier) | **GET** /margin/user/loan_margin_tiers | Check the user&#39;s own leverage lending gradient in the current market
[**getMarketMarginTier**](MarginApi.md#getMarketMarginTier) | **GET** /margin/loan_margin_tiers | Query the current market leverage lending gradient
[**setUserMarketLeverage**](MarginApi.md#setUserMarketLeverage) | **POST** /margin/leverage/user_market_setting | Set the user market leverage multiple
[**listMarginUserAccount**](MarginApi.md#listMarginUserAccount) | **GET** /margin/user/account | Query the user&#39;s leverage account list
[**listCrossMarginLoans**](MarginApi.md#listCrossMarginLoans) | **GET** /margin/cross/loans | List cross margin borrow history. (deprecated)
[**listCrossMarginRepayments**](MarginApi.md#listCrossMarginRepayments) | **GET** /margin/cross/repayments | Retrieve cross margin repayments. (deprecated)


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

<a name="getUserMarginTier"></a>
# **getUserMarginTier**
> List&lt;MarginLeverageTier&gt; getUserMarginTier(currencyPair)

Check the user&#39;s own leverage lending gradient in the current market

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
            List<MarginLeverageTier> result = apiInstance.getUserMarginTier(currencyPair);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getUserMarginTier");
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

[**List&lt;MarginLeverageTier&gt;**](MarginLeverageTier.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getMarketMarginTier"></a>
# **getMarketMarginTier**
> List&lt;MarginLeverageTier&gt; getMarketMarginTier(currencyPair)

Query the current market leverage lending gradient

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
        String currencyPair = "BTC_USDT"; // String | Currency pair
        try {
            List<MarginLeverageTier> result = apiInstance.getMarketMarginTier(currencyPair);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#getMarketMarginTier");
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

[**List&lt;MarginLeverageTier&gt;**](MarginLeverageTier.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="setUserMarketLeverage"></a>
# **setUserMarketLeverage**
> setUserMarketLeverage(marginMarketLeverage)

Set the user market leverage multiple

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
        MarginMarketLeverage marginMarketLeverage = new MarginMarketLeverage(); // MarginMarketLeverage | 
        try {
            apiInstance.setUserMarketLeverage(marginMarketLeverage);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#setUserMarketLeverage");
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
 **marginMarketLeverage** | [**MarginMarketLeverage**](MarginMarketLeverage.md)|  |

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
**204** | Success |  -  |

<a name="listMarginUserAccount"></a>
# **listMarginUserAccount**
> List&lt;MarginAccount&gt; listMarginUserAccount().currencyPair(currencyPair).execute();

Query the user&#39;s leverage account list

Support querying risk rate per position account and margin rate per position account

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
            List<MarginAccount> result = apiInstance.listMarginUserAccount()
                        .currencyPair(currencyPair)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MarginApi#listMarginUserAccount");
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

<a name="listCrossMarginLoans"></a>
# **listCrossMarginLoans**
> List&lt;CrossMarginLoan&gt; listCrossMarginLoans(status).currency(currency).limit(limit).offset(offset).reverse(reverse).execute();

List cross margin borrow history. (deprecated)

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

<a name="listCrossMarginRepayments"></a>
# **listCrossMarginRepayments**
> List&lt;CrossMarginRepayment&gt; listCrossMarginRepayments().currency(currency).loanId(loanId).limit(limit).offset(offset).reverse(reverse).execute();

Retrieve cross margin repayments. (deprecated)

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

