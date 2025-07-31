# RebateApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agencyTransactionHistory**](RebateApi.md#agencyTransactionHistory) | **GET** /rebate/agency/transaction_history | Broker obtains transaction history of recommended users
[**agencyCommissionsHistory**](RebateApi.md#agencyCommissionsHistory) | **GET** /rebate/agency/commission_history | Broker obtains rebate history of recommended users
[**partnerTransactionHistory**](RebateApi.md#partnerTransactionHistory) | **GET** /rebate/partner/transaction_history | Partner obtains transaction history of recommended users
[**partnerCommissionsHistory**](RebateApi.md#partnerCommissionsHistory) | **GET** /rebate/partner/commission_history | Partner obtains rebate records of recommended users
[**partnerSubList**](RebateApi.md#partnerSubList) | **GET** /rebate/partner/sub_list | Partner subordinate list
[**rebateBrokerCommissionHistory**](RebateApi.md#rebateBrokerCommissionHistory) | **GET** /rebate/broker/commission_history | Broker obtains user&#39;s rebate records
[**rebateBrokerTransactionHistory**](RebateApi.md#rebateBrokerTransactionHistory) | **GET** /rebate/broker/transaction_history | Broker obtains user&#39;s trading history
[**rebateUserInfo**](RebateApi.md#rebateUserInfo) | **GET** /rebate/user/info | User obtains rebate information
[**userSubRelation**](RebateApi.md#userSubRelation) | **GET** /rebate/user/sub_relation | User subordinate relationship


<a name="agencyTransactionHistory"></a>
# **agencyTransactionHistory**
> List&lt;AgencyTransactionHistory&gt; agencyTransactionHistory().currencyPair(currencyPair).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

Broker obtains transaction history of recommended users

Record query time range cannot exceed 30 days

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
        String currencyPair = "BTC_USDT"; // String | Specify the trading pair. If not specified, returns all trading pairs
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Start time for querying records, defaults to 7 days before current time if not specified
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
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
 **currencyPair** | **String**| Specify the trading pair. If not specified, returns all trading pairs | [optional]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time for querying records, defaults to 7 days before current time if not specified | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
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
**200** | List retrieved successfully |  -  |

<a name="agencyCommissionsHistory"></a>
# **agencyCommissionsHistory**
> List&lt;AgencyCommissionHistory&gt; agencyCommissionsHistory().currency(currency).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

Broker obtains rebate history of recommended users

Record query time range cannot exceed 30 days

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
        String currency = "BTC"; // String | Specify the currency. If not specified, returns all currencies
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Start time for querying records, defaults to 7 days before current time if not specified
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
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
 **currency** | **String**| Specify the currency. If not specified, returns all currencies | [optional]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time for querying records, defaults to 7 days before current time if not specified | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
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
**200** | List retrieved successfully |  -  |

<a name="partnerTransactionHistory"></a>
# **partnerTransactionHistory**
> PartnerTransactionHistory partnerTransactionHistory().currencyPair(currencyPair).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

Partner obtains transaction history of recommended users

Record query time range cannot exceed 30 days

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
        String currencyPair = "BTC_USDT"; // String | Specify the trading pair. If not specified, returns all trading pairs
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Start time for querying records, defaults to 7 days before current time if not specified
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            PartnerTransactionHistory result = apiInstance.partnerTransactionHistory()
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
            System.err.println("Exception when calling RebateApi#partnerTransactionHistory");
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
 **currencyPair** | **String**| Specify the trading pair. If not specified, returns all trading pairs | [optional]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time for querying records, defaults to 7 days before current time if not specified | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**PartnerTransactionHistory**](PartnerTransactionHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="partnerCommissionsHistory"></a>
# **partnerCommissionsHistory**
> PartnerCommissionHistory partnerCommissionsHistory().currency(currency).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

Partner obtains rebate records of recommended users

Record query time range cannot exceed 30 days

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
        String currency = "BTC"; // String | Specify the currency. If not specified, returns all currencies
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Start time for querying records, defaults to 7 days before current time if not specified
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            PartnerCommissionHistory result = apiInstance.partnerCommissionsHistory()
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
            System.err.println("Exception when calling RebateApi#partnerCommissionsHistory");
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
 **currency** | **String**| Specify the currency. If not specified, returns all currencies | [optional]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time for querying records, defaults to 7 days before current time if not specified | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**PartnerCommissionHistory**](PartnerCommissionHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="partnerSubList"></a>
# **partnerSubList**
> PartnerSubList partnerSubList().userId(userId).limit(limit).offset(offset).execute();

Partner subordinate list

Including sub-agents, direct customers, and indirect customers

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
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            PartnerSubList result = apiInstance.partnerSubList()
                        .userId(userId)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#partnerSubList");
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
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**PartnerSubList**](PartnerSubList.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="rebateBrokerCommissionHistory"></a>
# **rebateBrokerCommissionHistory**
> List&lt;BrokerCommission&gt; rebateBrokerCommissionHistory().limit(limit).offset(offset).userId(userId).from(from).to(to).execute();

Broker obtains user&#39;s rebate records

Record query time range cannot exceed 30 days

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
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1711929600L; // Long | Start time of the query record. If not specified, defaults to 30 days before the current time
        Long to = 1714521600L; // Long | End timestamp for the query, defaults to current time if not specified
        try {
            List<BrokerCommission> result = apiInstance.rebateBrokerCommissionHistory()
                        .limit(limit)
                        .offset(offset)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#rebateBrokerCommissionHistory");
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
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time of the query record. If not specified, defaults to 30 days before the current time | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]

### Return type

[**List&lt;BrokerCommission&gt;**](BrokerCommission.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="rebateBrokerTransactionHistory"></a>
# **rebateBrokerTransactionHistory**
> List&lt;BrokerTransaction&gt; rebateBrokerTransactionHistory().limit(limit).offset(offset).userId(userId).from(from).to(to).execute();

Broker obtains user&#39;s trading history

Record query time range cannot exceed 30 days

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
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1711929600L; // Long | Start time of the query record. If not specified, defaults to 30 days before the current time
        Long to = 1714521600L; // Long | End timestamp for the query, defaults to current time if not specified
        try {
            List<BrokerTransaction> result = apiInstance.rebateBrokerTransactionHistory()
                        .limit(limit)
                        .offset(offset)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#rebateBrokerTransactionHistory");
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
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time of the query record. If not specified, defaults to 30 days before the current time | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]

### Return type

[**List&lt;BrokerTransaction&gt;**](BrokerTransaction.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="rebateUserInfo"></a>
# **rebateUserInfo**
> List&lt;RebateUserInfo&gt; rebateUserInfo()

User obtains rebate information

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
        try {
            List<RebateUserInfo> result = apiInstance.rebateUserInfo();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#rebateUserInfo");
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

[**List&lt;RebateUserInfo&gt;**](RebateUserInfo.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="userSubRelation"></a>
# **userSubRelation**
> UserSubRelation userSubRelation(userIdList)

User subordinate relationship

Query whether the specified user is within the system

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
        String userIdList = "1, 2, 3"; // String | Query user ID list, separated by commas. If more than 100, only 100 will be returned
        try {
            UserSubRelation result = apiInstance.userSubRelation(userIdList);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#userSubRelation");
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
 **userIdList** | **String**| Query user ID list, separated by commas. If more than 100, only 100 will be returned |

### Return type

[**UserSubRelation**](UserSubRelation.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

