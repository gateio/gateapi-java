# EarnUniApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUniCurrencies**](EarnUniApi.md#listUniCurrencies) | **GET** /earn/uni/currencies | List currencies for lending
[**getUniCurrency**](EarnUniApi.md#getUniCurrency) | **GET** /earn/uni/currencies/{currency} | Get currency detail for lending
[**listUserUniLends**](EarnUniApi.md#listUserUniLends) | **GET** /earn/uni/lends | List user&#39;s lending orders
[**createUniLend**](EarnUniApi.md#createUniLend) | **POST** /earn/uni/lends | Lend or redeem
[**changeUniLend**](EarnUniApi.md#changeUniLend) | **PATCH** /earn/uni/lends | Amend lending order
[**listUniLendRecords**](EarnUniApi.md#listUniLendRecords) | **GET** /earn/uni/lend_records | List records of lending
[**getUniInterest**](EarnUniApi.md#getUniInterest) | **GET** /earn/uni/interests/{currency} | Get the user&#39;s total interest income of specified currency
[**listUniInterestRecords**](EarnUniApi.md#listUniInterestRecords) | **GET** /earn/uni/interest_records | List interest records
[**getUniInterestStatus**](EarnUniApi.md#getUniInterestStatus) | **GET** /earn/uni/interest_status/{currency} | query currency interest compounding status
[**listUniChart**](EarnUniApi.md#listUniChart) | **GET** /earn/uni/chart | UniLoan currency annualized trend chart
[**listUniRate**](EarnUniApi.md#listUniRate) | **GET** /earn/uni/rate | Currency estimate annualized interest rate


<a name="listUniCurrencies"></a>
# **listUniCurrencies**
> List&lt;UniCurrency&gt; listUniCurrencies()

List currencies for lending

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        try {
            List<UniCurrency> result = apiInstance.listUniCurrencies();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#listUniCurrencies");
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

[**List&lt;UniCurrency&gt;**](UniCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getUniCurrency"></a>
# **getUniCurrency**
> UniCurrency getUniCurrency(currency)

Get currency detail for lending

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        String currency = "btc"; // String | Currency
        try {
            UniCurrency result = apiInstance.getUniCurrency(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#getUniCurrency");
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
 **currency** | **String**| Currency |

### Return type

[**UniCurrency**](UniCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listUserUniLends"></a>
# **listUserUniLends**
> List&lt;UniLend&gt; listUserUniLends().currency(currency).page(page).limit(limit).execute();

List user&#39;s lending orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        try {
            List<UniLend> result = apiInstance.listUserUniLends()
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#listUserUniLends");
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

[**List&lt;UniLend&gt;**](UniLend.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="createUniLend"></a>
# **createUniLend**
> createUniLend(createUniLend)

Lend or redeem

Lending: When lending, a minimum lending rate must be set. After successful lending is determined on an hourly basis, earnings will be calculated based on the determined rate.  Earnings for each hour will be settled at the top of the hour. If lending fails due to an excessively high interest rate, no interest will be earned for that hour.   If funds are redeemed before the hourly determination, no interest will be earned for that hour.   Priority: Under the same interest rate, wealth management products created or modified earlier will be prioritized for lending.  Redemption: For funds that failed to be lent, redemption will be credited immediately. For funds successfully lent, they are entitled to the earnings for that hour, and redemption will be credited in the next hourly interval.  Note: The two minutes before and after the hourly mark are the settlement period, during which lending and redemption are prohibited. 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        CreateUniLend createUniLend = new CreateUniLend(); // CreateUniLend | 
        try {
            apiInstance.createUniLend(createUniLend);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#createUniLend");
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
 **createUniLend** | [**CreateUniLend**](CreateUniLend.md)|  |

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

<a name="changeUniLend"></a>
# **changeUniLend**
> changeUniLend(patchUniLend)

Amend lending order

Currently only supports amending the minimum interest rate (hour)

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        PatchUniLend patchUniLend = new PatchUniLend(); // PatchUniLend | 
        try {
            apiInstance.changeUniLend(patchUniLend);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#changeUniLend");
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
 **patchUniLend** | [**PatchUniLend**](PatchUniLend.md)|  |

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
**204** | Updated |  -  |

<a name="listUniLendRecords"></a>
# **listUniLendRecords**
> List&lt;UniLendRecord&gt; listUniLendRecords().currency(currency).page(page).limit(limit).from(from).to(to).type(type).execute();

List records of lending

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        String type = "lend"; // String | type: lend - lend, redeem - redeem
        try {
            List<UniLendRecord> result = apiInstance.listUniLendRecords()
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .from(from)
                        .to(to)
                        .type(type)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#listUniLendRecords");
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
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]
 **type** | **String**| type: lend - lend, redeem - redeem | [optional] [enum: lend, redeem]

### Return type

[**List&lt;UniLendRecord&gt;**](UniLendRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getUniInterest"></a>
# **getUniInterest**
> UniLendInterest getUniInterest(currency)

Get the user&#39;s total interest income of specified currency

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        String currency = "btc"; // String | Currency
        try {
            UniLendInterest result = apiInstance.getUniInterest(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#getUniInterest");
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
 **currency** | **String**| Currency |

### Return type

[**UniLendInterest**](UniLendInterest.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listUniInterestRecords"></a>
# **listUniInterestRecords**
> List&lt;UniInterestRecord&gt; listUniInterestRecords().currency(currency).page(page).limit(limit).from(from).to(to).execute();

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
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        String currency = "BTC"; // String | Retrieve data of the specified currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        try {
            List<UniInterestRecord> result = apiInstance.listUniInterestRecords()
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
            System.err.println("Exception when calling EarnUniApi#listUniInterestRecords");
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
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]

### Return type

[**List&lt;UniInterestRecord&gt;**](UniInterestRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getUniInterestStatus"></a>
# **getUniInterestStatus**
> UniCurrencyInterest getUniInterestStatus(currency)

query currency interest compounding status

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        String currency = "btc"; // String | Currency
        try {
            UniCurrencyInterest result = apiInstance.getUniInterestStatus(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#getUniInterestStatus");
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
 **currency** | **String**| Currency |

### Return type

[**UniCurrencyInterest**](UniCurrencyInterest.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listUniChart"></a>
# **listUniChart**
> List&lt;InlineResponse200&gt; listUniChart(from, to, asset)

UniLoan currency annualized trend chart

Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-07-15 06:48+0000 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        Long from = 1719763200L; // Long | Start timestamp, unit s, maximum span of 30 days
        Long to = 1722441600L; // Long | End timestamp, unit s, maximum span of 30 days
        String asset = "BTC"; // String | Currency name
        try {
            List<InlineResponse200> result = apiInstance.listUniChart(from, to, asset);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#listUniChart");
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
 **from** | **Long**| Start timestamp, unit s, maximum span of 30 days |
 **to** | **Long**| End timestamp, unit s, maximum span of 30 days |
 **asset** | **String**| Currency name |

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-07-15 06:48+0000 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="listUniRate"></a>
# **listUniRate**
> List&lt;InlineResponse2001&gt; listUniRate()

Currency estimate annualized interest rate

Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-07-15 06:48+0000 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnUniApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnUniApi apiInstance = new EarnUniApi(defaultClient);
        try {
            List<InlineResponse2001> result = apiInstance.listUniRate();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnUniApi#listUniRate");
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

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-07-15 06:48+0000 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

