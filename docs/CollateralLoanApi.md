# CollateralLoanApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCollateralLoanOrders**](CollateralLoanApi.md#listCollateralLoanOrders) | **GET** /loan/collateral/orders | Query collateral loan order list
[**createCollateralLoan**](CollateralLoanApi.md#createCollateralLoan) | **POST** /loan/collateral/orders | Place collateral loan order
[**getCollateralLoanOrderDetail**](CollateralLoanApi.md#getCollateralLoanOrderDetail) | **GET** /loan/collateral/orders/{order_id} | Query single order details
[**repayCollateralLoan**](CollateralLoanApi.md#repayCollateralLoan) | **POST** /loan/collateral/repay | Collateral loan repayment
[**listRepayRecords**](CollateralLoanApi.md#listRepayRecords) | **GET** /loan/collateral/repay_records | Query collateral loan repayment records
[**listCollateralRecords**](CollateralLoanApi.md#listCollateralRecords) | **GET** /loan/collateral/collaterals | Query collateral adjustment records
[**operateCollateral**](CollateralLoanApi.md#operateCollateral) | **POST** /loan/collateral/collaterals | Increase or redeem collateral
[**getUserTotalAmount**](CollateralLoanApi.md#getUserTotalAmount) | **GET** /loan/collateral/total_amount | Query user&#39;s total borrowing and collateral amount
[**getUserLtvInfo**](CollateralLoanApi.md#getUserLtvInfo) | **GET** /loan/collateral/ltv | Query user&#39;s collateralization ratio and remaining borrowable currencies
[**listCollateralCurrencies**](CollateralLoanApi.md#listCollateralCurrencies) | **GET** /loan/collateral/currencies | Query supported borrowing and collateral currencies


<a name="listCollateralLoanOrders"></a>
# **listCollateralLoanOrders**
> List&lt;CollateralOrder&gt; listCollateralLoanOrders().page(page).limit(limit).collateralCurrency(collateralCurrency).borrowCurrency(borrowCurrency).execute();

Query collateral loan order list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        String collateralCurrency = "BTC"; // String | Collateral currency
        String borrowCurrency = "USDT"; // String | Borrowed currency
        try {
            List<CollateralOrder> result = apiInstance.listCollateralLoanOrders()
                        .page(page)
                        .limit(limit)
                        .collateralCurrency(collateralCurrency)
                        .borrowCurrency(borrowCurrency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralLoanApi#listCollateralLoanOrders");
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
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **collateralCurrency** | **String**| Collateral currency | [optional]
 **borrowCurrency** | **String**| Borrowed currency | [optional]

### Return type

[**List&lt;CollateralOrder&gt;**](CollateralOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="createCollateralLoan"></a>
# **createCollateralLoan**
> OrderResp createCollateralLoan(createCollateralOrder)

Place collateral loan order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        CreateCollateralOrder createCollateralOrder = new CreateCollateralOrder(); // CreateCollateralOrder | 
        try {
            OrderResp result = apiInstance.createCollateralLoan(createCollateralOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralLoanApi#createCollateralLoan");
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
 **createCollateralOrder** | [**CreateCollateralOrder**](CreateCollateralOrder.md)|  |

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
**200** | Order placed successfully |  -  |

<a name="getCollateralLoanOrderDetail"></a>
# **getCollateralLoanOrderDetail**
> CollateralOrder getCollateralLoanOrderDetail(orderId)

Query single order details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        Long orderId = 100001L; // Long | Order ID returned when order is successfully created
        try {
            CollateralOrder result = apiInstance.getCollateralLoanOrderDetail(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralLoanApi#getCollateralLoanOrderDetail");
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
 **orderId** | **Long**| Order ID returned when order is successfully created |

### Return type

[**CollateralOrder**](CollateralOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order details queried successfully |  -  |

<a name="repayCollateralLoan"></a>
# **repayCollateralLoan**
> RepayResp repayCollateralLoan(repayLoan)

Collateral loan repayment

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        RepayLoan repayLoan = new RepayLoan(); // RepayLoan | 
        try {
            RepayResp result = apiInstance.repayCollateralLoan(repayLoan);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralLoanApi#repayCollateralLoan");
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
 **repayLoan** | [**RepayLoan**](RepayLoan.md)|  |

### Return type

[**RepayResp**](RepayResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Operation successful |  -  |

<a name="listRepayRecords"></a>
# **listRepayRecords**
> List&lt;RepayRecord&gt; listRepayRecords(source).borrowCurrency(borrowCurrency).collateralCurrency(collateralCurrency).page(page).limit(limit).from(from).to(to).execute();

Query collateral loan repayment records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        String source = "repay"; // String | Operation type: repay - Regular repayment, liquidate - Liquidation
        String borrowCurrency = "USDT"; // String | Borrowed currency
        String collateralCurrency = "BTC"; // String | Collateral currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Long from = 1609459200L; // Long | Start timestamp for the query
        Long to = 1609459200L; // Long | End timestamp for the query, defaults to current time if not specified
        try {
            List<RepayRecord> result = apiInstance.listRepayRecords(source)
                        .borrowCurrency(borrowCurrency)
                        .collateralCurrency(collateralCurrency)
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
            System.err.println("Exception when calling CollateralLoanApi#listRepayRecords");
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
 **source** | **String**| Operation type: repay - Regular repayment, liquidate - Liquidation |
 **borrowCurrency** | **String**| Borrowed currency | [optional]
 **collateralCurrency** | **String**| Collateral currency | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **from** | **Long**| Start timestamp for the query | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]

### Return type

[**List&lt;RepayRecord&gt;**](RepayRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listCollateralRecords"></a>
# **listCollateralRecords**
> List&lt;CollateralRecord&gt; listCollateralRecords().page(page).limit(limit).from(from).to(to).borrowCurrency(borrowCurrency).collateralCurrency(collateralCurrency).execute();

Query collateral adjustment records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Long from = 1609459200L; // Long | Start timestamp for the query
        Long to = 1609459200L; // Long | End timestamp for the query, defaults to current time if not specified
        String borrowCurrency = "USDT"; // String | Borrowed currency
        String collateralCurrency = "BTC"; // String | Collateral currency
        try {
            List<CollateralRecord> result = apiInstance.listCollateralRecords()
                        .page(page)
                        .limit(limit)
                        .from(from)
                        .to(to)
                        .borrowCurrency(borrowCurrency)
                        .collateralCurrency(collateralCurrency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralLoanApi#listCollateralRecords");
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
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **from** | **Long**| Start timestamp for the query | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **borrowCurrency** | **String**| Borrowed currency | [optional]
 **collateralCurrency** | **String**| Collateral currency | [optional]

### Return type

[**List&lt;CollateralRecord&gt;**](CollateralRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="operateCollateral"></a>
# **operateCollateral**
> operateCollateral(collateralAlign)

Increase or redeem collateral

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        CollateralAlign collateralAlign = new CollateralAlign(); // CollateralAlign | 
        try {
            apiInstance.operateCollateral(collateralAlign);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralLoanApi#operateCollateral");
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
 **collateralAlign** | [**CollateralAlign**](CollateralAlign.md)|  |

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
**204** | Operation successful |  -  |

<a name="getUserTotalAmount"></a>
# **getUserTotalAmount**
> UserTotalAmount getUserTotalAmount()

Query user&#39;s total borrowing and collateral amount

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        try {
            UserTotalAmount result = apiInstance.getUserTotalAmount();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralLoanApi#getUserTotalAmount");
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

[**UserTotalAmount**](UserTotalAmount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getUserLtvInfo"></a>
# **getUserLtvInfo**
> UserLtvInfo getUserLtvInfo(collateralCurrency, borrowCurrency)

Query user&#39;s collateralization ratio and remaining borrowable currencies

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        String collateralCurrency = "BTC"; // String | Collateral currency
        String borrowCurrency = "USDT"; // String | Borrowed currency
        try {
            UserLtvInfo result = apiInstance.getUserLtvInfo(collateralCurrency, borrowCurrency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralLoanApi#getUserLtvInfo");
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
 **collateralCurrency** | **String**| Collateral currency |
 **borrowCurrency** | **String**| Borrowed currency |

### Return type

[**UserLtvInfo**](UserLtvInfo.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listCollateralCurrencies"></a>
# **listCollateralCurrencies**
> List&lt;CollateralLoanCurrency&gt; listCollateralCurrencies().loanCurrency(loanCurrency).execute();

Query supported borrowing and collateral currencies

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        String loanCurrency = "BTC"; // String | Parameter loan_currency. If omitted, returns all supported borrowing currencies; if provided, returns the array of collateral currencies supported for that borrowing currency
        try {
            List<CollateralLoanCurrency> result = apiInstance.listCollateralCurrencies()
                        .loanCurrency(loanCurrency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralLoanApi#listCollateralCurrencies");
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
 **loanCurrency** | **String**| Parameter loan_currency. If omitted, returns all supported borrowing currencies; if provided, returns the array of collateral currencies supported for that borrowing currency | [optional]

### Return type

[**List&lt;CollateralLoanCurrency&gt;**](CollateralLoanCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

