# MultiCollateralLoanApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMultiCollateralOrders**](MultiCollateralLoanApi.md#listMultiCollateralOrders) | **GET** /loan/multi_collateral/orders | List Multi-Collateral Orders.
[**createMultiCollateral**](MultiCollateralLoanApi.md#createMultiCollateral) | **POST** /loan/multi_collateral/orders | Create Multi-Collateral Order.
[**getMultiCollateralOrderDetail**](MultiCollateralLoanApi.md#getMultiCollateralOrderDetail) | **GET** /loan/multi_collateral/orders/{order_id} | Get Multi-Collateral Order Detail.
[**listMultiRepayRecords**](MultiCollateralLoanApi.md#listMultiRepayRecords) | **GET** /loan/multi_collateral/repay | List Multi-Collateral Repay Records.
[**repayMultiCollateralLoan**](MultiCollateralLoanApi.md#repayMultiCollateralLoan) | **POST** /loan/multi_collateral/repay | Repay Multi-Collateral Loan.
[**listMultiCollateralRecords**](MultiCollateralLoanApi.md#listMultiCollateralRecords) | **GET** /loan/multi_collateral/mortgage | Query collateral adjustment records.
[**operateMultiCollateral**](MultiCollateralLoanApi.md#operateMultiCollateral) | **POST** /loan/multi_collateral/mortgage | Operate Multi-Collateral.
[**listUserCurrencyQuota**](MultiCollateralLoanApi.md#listUserCurrencyQuota) | **GET** /loan/multi_collateral/currency_quota | List User Currency Quota.
[**listMultiCollateralCurrencies**](MultiCollateralLoanApi.md#listMultiCollateralCurrencies) | **GET** /loan/multi_collateral/currencies | Query supported borrowing and collateral currencies in Multi-Collateral.
[**getMultiCollateralLtv**](MultiCollateralLoanApi.md#getMultiCollateralLtv) | **GET** /loan/multi_collateral/ltv | Get Multi-Collateral ratio.
[**getMultiCollateralFixRate**](MultiCollateralLoanApi.md#getMultiCollateralFixRate) | **GET** /loan/multi_collateral/fixed_rate | Query fixed interest rates for the currency for 7 days and 30 days.
[**getMultiCollateralCurrentRate**](MultiCollateralLoanApi.md#getMultiCollateralCurrentRate) | **GET** /loan/multi_collateral/current_rate | Query the current interest rate of the currency.


<a name="listMultiCollateralOrders"></a>
# **listMultiCollateralOrders**
> List&lt;MultiCollateralOrder&gt; listMultiCollateralOrders().page(page).limit(limit).sort(sort).orderType(orderType).execute();

List Multi-Collateral Orders.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer limit = 10; // Integer | Maximum number of records to be returned in a single list.
        String sort = "ltv_asc"; // String | Query the current interest rate of the currency in the previous hour.
        String orderType = "current"; // String | Order type: current - Query current orders, fixed - Query fixed orders, defaults to current orders if not specified
        try {
            List<MultiCollateralOrder> result = apiInstance.listMultiCollateralOrders()
                        .page(page)
                        .limit(limit)
                        .sort(sort)
                        .orderType(orderType)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#listMultiCollateralOrders");
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
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned in a single list. | [optional] [default to 10]
 **sort** | **String**| Query the current interest rate of the currency in the previous hour. | [optional]
 **orderType** | **String**| Order type: current - Query current orders, fixed - Query fixed orders, defaults to current orders if not specified | [optional]

### Return type

[**List&lt;MultiCollateralOrder&gt;**](MultiCollateralOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="createMultiCollateral"></a>
# **createMultiCollateral**
> OrderResp createMultiCollateral(createMultiCollateralOrder)

Create Multi-Collateral Order.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        CreateMultiCollateralOrder createMultiCollateralOrder = new CreateMultiCollateralOrder(); // CreateMultiCollateralOrder | 
        try {
            OrderResp result = apiInstance.createMultiCollateral(createMultiCollateralOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#createMultiCollateral");
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
 **createMultiCollateralOrder** | [**CreateMultiCollateralOrder**](CreateMultiCollateralOrder.md)|  |

### Return type

[**OrderResp**](OrderResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

<a name="getMultiCollateralOrderDetail"></a>
# **getMultiCollateralOrderDetail**
> MultiCollateralOrder getMultiCollateralOrderDetail(orderId)

Get Multi-Collateral Order Detail.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        String orderId = "12345"; // String | Order ID returned on successful order creation.
        try {
            MultiCollateralOrder result = apiInstance.getMultiCollateralOrderDetail(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#getMultiCollateralOrderDetail");
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
 **orderId** | **String**| Order ID returned on successful order creation. |

### Return type

[**MultiCollateralOrder**](MultiCollateralOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

<a name="listMultiRepayRecords"></a>
# **listMultiRepayRecords**
> List&lt;MultiRepayRecord&gt; listMultiRepayRecords(type).borrowCurrency(borrowCurrency).page(page).limit(limit).from(from).to(to).execute();

List Multi-Collateral Repay Records.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        String type = "repay"; // String | Operation type: repay - Regular repayment, liquidate - Liquidation.
        String borrowCurrency = "USDT"; // String | Borrowed currency.
        Integer page = 1; // Integer | Page number.
        Integer limit = 10; // Integer | Maximum number of records to be returned in a single list.
        Long from = 1609459200L; // Long | Start timestamp of the query.
        Long to = 1609459200L; // Long | Time range ending, default to current time.
        try {
            List<MultiRepayRecord> result = apiInstance.listMultiRepayRecords(type)
                        .borrowCurrency(borrowCurrency)
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
            System.err.println("Exception when calling MultiCollateralLoanApi#listMultiRepayRecords");
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
 **type** | **String**| Operation type: repay - Regular repayment, liquidate - Liquidation. |
 **borrowCurrency** | **String**| Borrowed currency. | [optional]
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned in a single list. | [optional] [default to 10]
 **from** | **Long**| Start timestamp of the query. | [optional]
 **to** | **Long**| Time range ending, default to current time. | [optional]

### Return type

[**List&lt;MultiRepayRecord&gt;**](MultiRepayRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="repayMultiCollateralLoan"></a>
# **repayMultiCollateralLoan**
> MultiRepayResp repayMultiCollateralLoan(repayMultiLoan)

Repay Multi-Collateral Loan.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        RepayMultiLoan repayMultiLoan = new RepayMultiLoan(); // RepayMultiLoan | 
        try {
            MultiRepayResp result = apiInstance.repayMultiCollateralLoan(repayMultiLoan);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#repayMultiCollateralLoan");
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
 **repayMultiLoan** | [**RepayMultiLoan**](RepayMultiLoan.md)|  |

### Return type

[**MultiRepayResp**](MultiRepayResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Operated successfully. |  -  |

<a name="listMultiCollateralRecords"></a>
# **listMultiCollateralRecords**
> List&lt;MultiCollateralRecord&gt; listMultiCollateralRecords().page(page).limit(limit).from(from).to(to).collateralCurrency(collateralCurrency).execute();

Query collateral adjustment records.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer limit = 10; // Integer | Maximum number of records to be returned in a single list.
        Long from = 1609459200L; // Long | Start timestamp of the query.
        Long to = 1609459200L; // Long | Time range ending, default to current time.
        String collateralCurrency = "BTC"; // String | Collateral.
        try {
            List<MultiCollateralRecord> result = apiInstance.listMultiCollateralRecords()
                        .page(page)
                        .limit(limit)
                        .from(from)
                        .to(to)
                        .collateralCurrency(collateralCurrency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#listMultiCollateralRecords");
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
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned in a single list. | [optional] [default to 10]
 **from** | **Long**| Start timestamp of the query. | [optional]
 **to** | **Long**| Time range ending, default to current time. | [optional]
 **collateralCurrency** | **String**| Collateral. | [optional]

### Return type

[**List&lt;MultiCollateralRecord&gt;**](MultiCollateralRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved. |  -  |

<a name="operateMultiCollateral"></a>
# **operateMultiCollateral**
> CollateralAdjustRes operateMultiCollateral(collateralAdjust)

Operate Multi-Collateral.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        CollateralAdjust collateralAdjust = new CollateralAdjust(); // CollateralAdjust | 
        try {
            CollateralAdjustRes result = apiInstance.operateMultiCollateral(collateralAdjust);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#operateMultiCollateral");
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
 **collateralAdjust** | [**CollateralAdjust**](CollateralAdjust.md)|  |

### Return type

[**CollateralAdjustRes**](CollateralAdjustRes.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Operated successfully. |  -  |

<a name="listUserCurrencyQuota"></a>
# **listUserCurrencyQuota**
> List&lt;CurrencyQuota&gt; listUserCurrencyQuota(type, currency)

List User Currency Quota.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        String type = "collateral"; // String | Currency type: collateral - Collateral currency, borrow - Borrowing.
        String currency = "BTC"; // String | When it is a collateral currency, multiple currencies can be passed separated by commas; when it is a borrowing currency, only one currency can be passedseparated by commas; when it is a borrowing currency, only one currency can be passedseparated by commas; when it is a borrowing currency, only one commas; when it is a borrowing currency, only one currency can be passed
        try {
            List<CurrencyQuota> result = apiInstance.listUserCurrencyQuota(type, currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#listUserCurrencyQuota");
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
 **type** | **String**| Currency type: collateral - Collateral currency, borrow - Borrowing. |
 **currency** | **String**| When it is a collateral currency, multiple currencies can be passed separated by commas; when it is a borrowing currency, only one currency can be passedseparated by commas; when it is a borrowing currency, only one currency can be passedseparated by commas; when it is a borrowing currency, only one commas; when it is a borrowing currency, only one currency can be passed |

### Return type

[**List&lt;CurrencyQuota&gt;**](CurrencyQuota.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="listMultiCollateralCurrencies"></a>
# **listMultiCollateralCurrencies**
> MultiCollateralCurrency listMultiCollateralCurrencies()

Query supported borrowing and collateral currencies in Multi-Collateral.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        try {
            MultiCollateralCurrency result = apiInstance.listMultiCollateralCurrencies();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#listMultiCollateralCurrencies");
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

[**MultiCollateralCurrency**](MultiCollateralCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="getMultiCollateralLtv"></a>
# **getMultiCollateralLtv**
> CollateralLtv getMultiCollateralLtv()

Get Multi-Collateral ratio.

The Multi-Collateral ratio is fixed, irrespective of the currency.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        try {
            CollateralLtv result = apiInstance.getMultiCollateralLtv();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#getMultiCollateralLtv");
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

[**CollateralLtv**](CollateralLtv.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="getMultiCollateralFixRate"></a>
# **getMultiCollateralFixRate**
> List&lt;CollateralFixRate&gt; getMultiCollateralFixRate()

Query fixed interest rates for the currency for 7 days and 30 days.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        try {
            List<CollateralFixRate> result = apiInstance.getMultiCollateralFixRate();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#getMultiCollateralFixRate");
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

[**List&lt;CollateralFixRate&gt;**](CollateralFixRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

<a name="getMultiCollateralCurrentRate"></a>
# **getMultiCollateralCurrentRate**
> List&lt;CollateralCurrentRate&gt; getMultiCollateralCurrentRate(currencies).vipLevel(vipLevel).execute();

Query the current interest rate of the currency.

Query the current interest rate of the currency in the previous hour.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.MultiCollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        MultiCollateralLoanApi apiInstance = new MultiCollateralLoanApi(defaultClient);
        List<String> currencies = Arrays.asList(); // List<String> | Specify currency name query array, separated by commas, maximum 100items.
        String vipLevel = "\"0\""; // String | VIP level, defaults to 0 if not transferred.
        try {
            List<CollateralCurrentRate> result = apiInstance.getMultiCollateralCurrentRate(currencies)
                        .vipLevel(vipLevel)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiCollateralLoanApi#getMultiCollateralCurrentRate");
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
 **currencies** | [**List&lt;String&gt;**](String.md)| Specify currency name query array, separated by commas, maximum 100items. |
 **vipLevel** | **String**| VIP level, defaults to 0 if not transferred. | [optional] [default to &quot;0&quot;]

### Return type

[**List&lt;CollateralCurrentRate&gt;**](CollateralCurrentRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved. |  -  |

