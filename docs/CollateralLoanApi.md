# CollateralLoanApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCollateralLoanOrders**](CollateralLoanApi.md#listCollateralLoanOrders) | **GET** /loan/collateral/orders | List Orders.
[**createCollateralLoan**](CollateralLoanApi.md#createCollateralLoan) | **POST** /loan/collateral/orders | Place order.
[**getCollateralLoanOrderDetail**](CollateralLoanApi.md#getCollateralLoanOrderDetail) | **GET** /loan/collateral/orders/{order_id} | Get a single order.
[**repayCollateralLoan**](CollateralLoanApi.md#repayCollateralLoan) | **POST** /loan/collateral/repay | Repayment.
[**listRepayRecords**](CollateralLoanApi.md#listRepayRecords) | **GET** /loan/collateral/repay_records | Repayment history.
[**listCollateralRecords**](CollateralLoanApi.md#listCollateralRecords) | **GET** /loan/collateral/collaterals | Query collateral adjustment records.
[**operateCollateral**](CollateralLoanApi.md#operateCollateral) | **POST** /loan/collateral/collaterals | Increase or redeem collateral.
[**getUserTotalAmount**](CollateralLoanApi.md#getUserTotalAmount) | **GET** /loan/collateral/total_amount | Query the total borrowing and collateral amount for the user.
[**getUserLtvInfo**](CollateralLoanApi.md#getUserLtvInfo) | **GET** /loan/collateral/ltv | Query user&#39;s collateralization ratio.
[**listCollateralCurrencies**](CollateralLoanApi.md#listCollateralCurrencies) | **GET** /loan/collateral/currencies | Query supported borrowing and collateral currencies.


<a name="listCollateralLoanOrders"></a>
# **listCollateralLoanOrders**
> List&lt;CollateralOrder&gt; listCollateralLoanOrders().page(page).limit(limit).collateralCurrency(collateralCurrency).borrowCurrency(borrowCurrency).execute();

List Orders.

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
        Integer page = 1; // Integer | Page number.
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list.
        String collateralCurrency = "BTC"; // String | Collateral.
        String borrowCurrency = "USDT"; // String | Borrowed currency.
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
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned in a single list. | [optional] [default to 100]
 **collateralCurrency** | **String**| Collateral. | [optional]
 **borrowCurrency** | **String**| Borrowed currency. | [optional]

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
**200** | List retrieved. |  -  |

<a name="createCollateralLoan"></a>
# **createCollateralLoan**
> OrderResp createCollateralLoan(createCollateralOrder)

Place order.

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
**200** | Success. |  -  |

<a name="getCollateralLoanOrderDetail"></a>
# **getCollateralLoanOrderDetail**
> CollateralOrder getCollateralLoanOrderDetail(orderId)

Get a single order.

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
        Long orderId = 100001L; // Long | Order ID returned on successful order creation.
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
 **orderId** | **Long**| Order ID returned on successful order creation. |

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
**200** | Success. |  -  |

<a name="repayCollateralLoan"></a>
# **repayCollateralLoan**
> RepayResp repayCollateralLoan(repayLoan)

Repayment.

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
**200** | Operated successfully. |  -  |

<a name="listRepayRecords"></a>
# **listRepayRecords**
> List&lt;RepayRecord&gt; listRepayRecords(source).borrowCurrency(borrowCurrency).collateralCurrency(collateralCurrency).page(page).limit(limit).from(from).to(to).execute();

Repayment history.

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
        String source = "repay"; // String | Operation type: repay - Regular repayment, liquidate - Liquidation.
        String borrowCurrency = "USDT"; // String | Borrowed currency.
        String collateralCurrency = "BTC"; // String | Collateral.
        Integer page = 1; // Integer | Page number.
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list.
        Long from = 1609459200L; // Long | Start timestamp of the query.
        Long to = 1609459200L; // Long | Time range ending, default to current time.
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
 **source** | **String**| Operation type: repay - Regular repayment, liquidate - Liquidation. |
 **borrowCurrency** | **String**| Borrowed currency. | [optional]
 **collateralCurrency** | **String**| Collateral. | [optional]
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned in a single list. | [optional] [default to 100]
 **from** | **Long**| Start timestamp of the query. | [optional]
 **to** | **Long**| Time range ending, default to current time. | [optional]

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
**200** | Successfully retrieved. |  -  |

<a name="listCollateralRecords"></a>
# **listCollateralRecords**
> List&lt;CollateralRecord&gt; listCollateralRecords().page(page).limit(limit).from(from).to(to).borrowCurrency(borrowCurrency).collateralCurrency(collateralCurrency).execute();

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
import io.gate.gateapi.api.CollateralLoanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        CollateralLoanApi apiInstance = new CollateralLoanApi(defaultClient);
        Integer page = 1; // Integer | Page number.
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list.
        Long from = 1609459200L; // Long | Start timestamp of the query.
        Long to = 1609459200L; // Long | Time range ending, default to current time.
        String borrowCurrency = "USDT"; // String | Borrowed currency.
        String collateralCurrency = "BTC"; // String | Collateral.
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
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records to be returned in a single list. | [optional] [default to 100]
 **from** | **Long**| Start timestamp of the query. | [optional]
 **to** | **Long**| Time range ending, default to current time. | [optional]
 **borrowCurrency** | **String**| Borrowed currency. | [optional]
 **collateralCurrency** | **String**| Collateral. | [optional]

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
**200** | Successfully retrieved. |  -  |

<a name="operateCollateral"></a>
# **operateCollateral**
> operateCollateral(collateralAlign)

Increase or redeem collateral.

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
**204** | Operated successfully. |  -  |

<a name="getUserTotalAmount"></a>
# **getUserTotalAmount**
> UserTotalAmount getUserTotalAmount()

Query the total borrowing and collateral amount for the user.

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
**200** | Successfully retrieved. |  -  |

<a name="getUserLtvInfo"></a>
# **getUserLtvInfo**
> UserLtvInfo getUserLtvInfo(collateralCurrency, borrowCurrency)

Query user&#39;s collateralization ratio.

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
        String collateralCurrency = "BTC"; // String | Collateral.
        String borrowCurrency = "USDT"; // String | Borrowed currency.
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
 **collateralCurrency** | **String**| Collateral. |
 **borrowCurrency** | **String**| Borrowed currency. |

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
**200** | Successfully retrieved. |  -  |

<a name="listCollateralCurrencies"></a>
# **listCollateralCurrencies**
> List&lt;CollateralLoanCurrency&gt; listCollateralCurrencies().loanCurrency(loanCurrency).execute();

Query supported borrowing and collateral currencies.

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
        String loanCurrency = "BTC"; // String | The parameter loan_currency is used to specify the borrowing currency. If loan_currency is not provided, the API will return all supported borrowing currencies.
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
 **loanCurrency** | **String**| The parameter loan_currency is used to specify the borrowing currency. If loan_currency is not provided, the API will return all supported borrowing currencies. | [optional]

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
**200** | Successfully retrieved. |  -  |

