# WalletApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCurrencyChains**](WalletApi.md#listCurrencyChains) | **GET** /wallet/currency_chains | Query chains supported for specified currency
[**getDepositAddress**](WalletApi.md#getDepositAddress) | **GET** /wallet/deposit_address | Generate currency deposit address
[**listWithdrawals**](WalletApi.md#listWithdrawals) | **GET** /wallet/withdrawals | Get withdrawal records
[**listDeposits**](WalletApi.md#listDeposits) | **GET** /wallet/deposits | Get deposit records
[**transfer**](WalletApi.md#transfer) | **POST** /wallet/transfers | Transfer between trading accounts
[**listSubAccountTransfers**](WalletApi.md#listSubAccountTransfers) | **GET** /wallet/sub_account_transfers | Get transfer records between main and sub accounts
[**transferWithSubAccount**](WalletApi.md#transferWithSubAccount) | **POST** /wallet/sub_account_transfers | Transfer between main and sub accounts
[**subAccountToSubAccount**](WalletApi.md#subAccountToSubAccount) | **POST** /wallet/sub_account_to_sub_account | Transfer between sub-accounts
[**getTransferOrderStatus**](WalletApi.md#getTransferOrderStatus) | **GET** /wallet/order_status | Transfer status query
[**listWithdrawStatus**](WalletApi.md#listWithdrawStatus) | **GET** /wallet/withdraw_status | Query withdrawal status
[**listSubAccountBalances**](WalletApi.md#listSubAccountBalances) | **GET** /wallet/sub_account_balances | Query sub-account balance information
[**listSubAccountMarginBalances**](WalletApi.md#listSubAccountMarginBalances) | **GET** /wallet/sub_account_margin_balances | Query sub-account isolated margin account balance information
[**listSubAccountFuturesBalances**](WalletApi.md#listSubAccountFuturesBalances) | **GET** /wallet/sub_account_futures_balances | Query sub-account perpetual futures account balance information
[**listSubAccountCrossMarginBalances**](WalletApi.md#listSubAccountCrossMarginBalances) | **GET** /wallet/sub_account_cross_margin_balances | Query sub-account cross margin account balance information
[**listSavedAddress**](WalletApi.md#listSavedAddress) | **GET** /wallet/saved_address | Query withdrawal address whitelist
[**getTradeFee**](WalletApi.md#getTradeFee) | **GET** /wallet/fee | Query personal trading fees
[**getTotalBalance**](WalletApi.md#getTotalBalance) | **GET** /wallet/total_balance | Query personal account totals
[**listSmallBalance**](WalletApi.md#listSmallBalance) | **GET** /wallet/small_balance | Get list of convertible small balance currencies
[**convertSmallBalance**](WalletApi.md#convertSmallBalance) | **POST** /wallet/small_balance | Convert small balance currency
[**listSmallBalanceHistory**](WalletApi.md#listSmallBalanceHistory) | **GET** /wallet/small_balance_history | Get convertible small balance currency history
[**listPushOrders**](WalletApi.md#listPushOrders) | **GET** /wallet/push | Get UID transfer history


<a name="listCurrencyChains"></a>
# **listCurrencyChains**
> List&lt;CurrencyChain&gt; listCurrencyChains(currency)

Query chains supported for specified currency

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String currency = "GT"; // String | Currency name
        try {
            List<CurrencyChain> result = apiInstance.listCurrencyChains(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listCurrencyChains");
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

[**List&lt;CurrencyChain&gt;**](CurrencyChain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getDepositAddress"></a>
# **getDepositAddress**
> DepositAddress getDepositAddress(currency)

Generate currency deposit address

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String currency = "USDT"; // String | Currency name
        try {
            DepositAddress result = apiInstance.getDepositAddress(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#getDepositAddress");
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

[**DepositAddress**](DepositAddress.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Address successfully generated |  -  |

<a name="listWithdrawals"></a>
# **listWithdrawals**
> List&lt;WithdrawalRecord&gt; listWithdrawals().currency(currency).withdrawId(withdrawId).assetClass(assetClass).withdrawOrderId(withdrawOrderId).from(from).to(to).limit(limit).offset(offset).execute();

Get withdrawal records

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
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String currency = "BTC"; // String | Specify the currency. If not specified, returns all currencies
        String withdrawId = "withdrawId_example"; // String | Withdrawal record ID starts with 'w', such as: w1879219868. When withdraw_id is not empty, only this specific withdrawal record will be queried, and time-based querying will be disabled
        String assetClass = "assetClass_example"; // String | Currency type of withdrawal record, empty by default. Supports querying withdrawal records in main zone and innovation zone on demand. Value range: SPOT, PILOT  SPOT: Main Zone PILOT: Innovation Zone
        String withdrawOrderId = "withdrawOrderId_example"; // String | User-defined order number for withdrawal. Default is empty. When not empty, the specified user-defined order number record will be queried
        Long from = 1602120000L; // Long | Start time for querying records, defaults to 7 days before current time if not specified
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<WithdrawalRecord> result = apiInstance.listWithdrawals()
                        .currency(currency)
                        .withdrawId(withdrawId)
                        .assetClass(assetClass)
                        .withdrawOrderId(withdrawOrderId)
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
            System.err.println("Exception when calling WalletApi#listWithdrawals");
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
 **withdrawId** | **String**| Withdrawal record ID starts with &#39;w&#39;, such as: w1879219868. When withdraw_id is not empty, only this specific withdrawal record will be queried, and time-based querying will be disabled | [optional]
 **assetClass** | **String**| Currency type of withdrawal record, empty by default. Supports querying withdrawal records in main zone and innovation zone on demand. Value range: SPOT, PILOT  SPOT: Main Zone PILOT: Innovation Zone | [optional]
 **withdrawOrderId** | **String**| User-defined order number for withdrawal. Default is empty. When not empty, the specified user-defined order number record will be queried | [optional]
 **from** | **Long**| Start time for querying records, defaults to 7 days before current time if not specified | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;WithdrawalRecord&gt;**](WithdrawalRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listDeposits"></a>
# **listDeposits**
> List&lt;DepositRecord&gt; listDeposits().currency(currency).from(from).to(to).limit(limit).offset(offset).execute();

Get deposit records

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
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String currency = "BTC"; // String | Specify the currency. If not specified, returns all currencies
        Long from = 1602120000L; // Long | Start time for querying records, defaults to 7 days before current time if not specified
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of entries returned in the list, limited to 500 transactions
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<DepositRecord> result = apiInstance.listDeposits()
                        .currency(currency)
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
            System.err.println("Exception when calling WalletApi#listDeposits");
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
 **from** | **Long**| Start time for querying records, defaults to 7 days before current time if not specified | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of entries returned in the list, limited to 500 transactions | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;DepositRecord&gt;**](DepositRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="transfer"></a>
# **transfer**
> TransactionID transfer(transfer)

Transfer between trading accounts

Balance transfers between personal trading accounts. Currently supports the following transfer operations:  1. Spot account - Margin account 2. Spot account - Perpetual futures account 3. Spot account - Delivery futures account 4. Spot account - Options account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        Transfer transfer = new Transfer(); // Transfer | 
        try {
            TransactionID result = apiInstance.transfer(transfer);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#transfer");
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
 **transfer** | [**Transfer**](Transfer.md)|  |

### Return type

[**TransactionID**](TransactionID.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transfer operation successful |  -  |

<a name="listSubAccountTransfers"></a>
# **listSubAccountTransfers**
> List&lt;SubAccountTransferRecordItem&gt; listSubAccountTransfers().subUid(subUid).from(from).to(to).limit(limit).offset(offset).execute();

Get transfer records between main and sub accounts

Record query time range cannot exceed 30 days  &gt; Note: Only records after 2020-04-10 can be retrieved

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String subUid = "10003"; // String | Sub-account user ID, you can query multiple records separated by `,`. If not specified, it will return records of all sub-accounts
        Long from = 1602120000L; // Long | Start time for querying records, defaults to 7 days before current time if not specified
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<SubAccountTransferRecordItem> result = apiInstance.listSubAccountTransfers()
                        .subUid(subUid)
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
            System.err.println("Exception when calling WalletApi#listSubAccountTransfers");
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
 **subUid** | **String**| Sub-account user ID, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return records of all sub-accounts | [optional]
 **from** | **Long**| Start time for querying records, defaults to 7 days before current time if not specified | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;SubAccountTransferRecordItem&gt;**](SubAccountTransferRecordItem.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="transferWithSubAccount"></a>
# **transferWithSubAccount**
> TransactionID transferWithSubAccount(subAccountTransfer)

Transfer between main and sub accounts

Supports transfers to/from sub-account&#39;s spot or futures accounts. Note that regardless of which sub-account is operated, only the main account&#39;s spot account is used

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        SubAccountTransfer subAccountTransfer = new SubAccountTransfer(); // SubAccountTransfer | 
        try {
            TransactionID result = apiInstance.transferWithSubAccount(subAccountTransfer);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#transferWithSubAccount");
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
 **subAccountTransfer** | [**SubAccountTransfer**](SubAccountTransfer.md)|  |

### Return type

[**TransactionID**](TransactionID.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transfer operation successful |  -  |

<a name="subAccountToSubAccount"></a>
# **subAccountToSubAccount**
> TransactionID subAccountToSubAccount(subAccountToSubAccount)

Transfer between sub-accounts

Supports balance transfers between two sub-accounts under the same main account. You can use either the main account&#39;s API Key or the source sub-account&#39;s API Key to perform the operation

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        SubAccountToSubAccount subAccountToSubAccount = new SubAccountToSubAccount(); // SubAccountToSubAccount | 
        try {
            TransactionID result = apiInstance.subAccountToSubAccount(subAccountToSubAccount);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#subAccountToSubAccount");
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
 **subAccountToSubAccount** | [**SubAccountToSubAccount**](SubAccountToSubAccount.md)|  |

### Return type

[**TransactionID**](TransactionID.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transfer operation successful |  -  |

<a name="getTransferOrderStatus"></a>
# **getTransferOrderStatus**
> TransferOrderStatus getTransferOrderStatus().clientOrderId(clientOrderId).txId(txId).execute();

Transfer status query

Supports querying transfer status based on user-defined client_order_id or tx_id returned by the transfer interface

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String clientOrderId = "da3ce7a088c8b0372b741419c7829033"; // String | Customer-defined ID to prevent duplicate transfers. Can be a combination of letters (case-sensitive), numbers, hyphens '-', and underscores '_'. Can be pure letters or pure numbers with length between 1-64 characters
        String txId = "59636381286"; // String | Transfer operation number, cannot be empty at the same time as client_order_id
        try {
            TransferOrderStatus result = apiInstance.getTransferOrderStatus()
                        .clientOrderId(clientOrderId)
                        .txId(txId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#getTransferOrderStatus");
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
 **clientOrderId** | **String**| Customer-defined ID to prevent duplicate transfers. Can be a combination of letters (case-sensitive), numbers, hyphens &#39;-&#39;, and underscores &#39;_&#39;. Can be pure letters or pure numbers with length between 1-64 characters | [optional]
 **txId** | **String**| Transfer operation number, cannot be empty at the same time as client_order_id | [optional]

### Return type

[**TransferOrderStatus**](TransferOrderStatus.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transfer status retrieved successfully |  -  |

<a name="listWithdrawStatus"></a>
# **listWithdrawStatus**
> List&lt;WithdrawStatus&gt; listWithdrawStatus().currency(currency).execute();

Query withdrawal status

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String currency = "BTC"; // String | Query by specified currency name
        try {
            List<WithdrawStatus> result = apiInstance.listWithdrawStatus()
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listWithdrawStatus");
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
 **currency** | **String**| Query by specified currency name | [optional]

### Return type

[**List&lt;WithdrawStatus&gt;**](WithdrawStatus.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listSubAccountBalances"></a>
# **listSubAccountBalances**
> List&lt;SubAccountBalance&gt; listSubAccountBalances().subUid(subUid).execute();

Query sub-account balance information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String subUid = "10003"; // String | Sub-account user ID, you can query multiple records separated by `,`. If not specified, it will return records of all sub-accounts
        try {
            List<SubAccountBalance> result = apiInstance.listSubAccountBalances()
                        .subUid(subUid)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listSubAccountBalances");
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
 **subUid** | **String**| Sub-account user ID, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return records of all sub-accounts | [optional]

### Return type

[**List&lt;SubAccountBalance&gt;**](SubAccountBalance.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listSubAccountMarginBalances"></a>
# **listSubAccountMarginBalances**
> List&lt;SubAccountMarginBalance&gt; listSubAccountMarginBalances().subUid(subUid).execute();

Query sub-account isolated margin account balance information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String subUid = "10003"; // String | Sub-account user ID, you can query multiple records separated by `,`. If not specified, it will return records of all sub-accounts
        try {
            List<SubAccountMarginBalance> result = apiInstance.listSubAccountMarginBalances()
                        .subUid(subUid)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listSubAccountMarginBalances");
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
 **subUid** | **String**| Sub-account user ID, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return records of all sub-accounts | [optional]

### Return type

[**List&lt;SubAccountMarginBalance&gt;**](SubAccountMarginBalance.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listSubAccountFuturesBalances"></a>
# **listSubAccountFuturesBalances**
> List&lt;SubAccountFuturesBalance&gt; listSubAccountFuturesBalances().subUid(subUid).settle(settle).execute();

Query sub-account perpetual futures account balance information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String subUid = "10003"; // String | Sub-account user ID, you can query multiple records separated by `,`. If not specified, it will return records of all sub-accounts
        String settle = "usdt"; // String | Query balance of specified settlement currency
        try {
            List<SubAccountFuturesBalance> result = apiInstance.listSubAccountFuturesBalances()
                        .subUid(subUid)
                        .settle(settle)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listSubAccountFuturesBalances");
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
 **subUid** | **String**| Sub-account user ID, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return records of all sub-accounts | [optional]
 **settle** | **String**| Query balance of specified settlement currency | [optional]

### Return type

[**List&lt;SubAccountFuturesBalance&gt;**](SubAccountFuturesBalance.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listSubAccountCrossMarginBalances"></a>
# **listSubAccountCrossMarginBalances**
> List&lt;SubAccountCrossMarginBalance&gt; listSubAccountCrossMarginBalances().subUid(subUid).execute();

Query sub-account cross margin account balance information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String subUid = "10003"; // String | Sub-account user ID, you can query multiple records separated by `,`. If not specified, it will return records of all sub-accounts
        try {
            List<SubAccountCrossMarginBalance> result = apiInstance.listSubAccountCrossMarginBalances()
                        .subUid(subUid)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listSubAccountCrossMarginBalances");
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
 **subUid** | **String**| Sub-account user ID, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return records of all sub-accounts | [optional]

### Return type

[**List&lt;SubAccountCrossMarginBalance&gt;**](SubAccountCrossMarginBalance.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listSavedAddress"></a>
# **listSavedAddress**
> List&lt;SavedAddress&gt; listSavedAddress(currency).chain(chain).limit(limit).page(page).execute();

Query withdrawal address whitelist

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String currency = "USDT"; // String | Currency
        String chain = "\"\""; // String | Chain name
        String limit = "\"50\""; // String | Maximum number returned, up to 100
        Integer page = 1; // Integer | Page number
        try {
            List<SavedAddress> result = apiInstance.listSavedAddress(currency)
                        .chain(chain)
                        .limit(limit)
                        .page(page)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listSavedAddress");
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
 **chain** | **String**| Chain name | [optional] [default to &quot;&quot;]
 **limit** | **String**| Maximum number returned, up to 100 | [optional] [default to &quot;50&quot;]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**List&lt;SavedAddress&gt;**](SavedAddress.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="getTradeFee"></a>
# **getTradeFee**
> TradeFee getTradeFee().currencyPair(currencyPair).settle(settle).execute();

Query personal trading fees

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Specify currency pair to get more accurate fee settings.  This field is optional. Usually fee settings are the same for all currency pairs.
        String settle = "BTC"; // String | Specify the settlement currency of the contract to get more accurate fee settings.  This field is optional. Generally, the fee settings for all settlement currencies are the same.
        try {
            TradeFee result = apiInstance.getTradeFee()
                        .currencyPair(currencyPair)
                        .settle(settle)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#getTradeFee");
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
 **currencyPair** | **String**| Specify currency pair to get more accurate fee settings.  This field is optional. Usually fee settings are the same for all currency pairs. | [optional]
 **settle** | **String**| Specify the settlement currency of the contract to get more accurate fee settings.  This field is optional. Generally, the fee settings for all settlement currencies are the same. | [optional] [enum: BTC, USDT, USD]

### Return type

[**TradeFee**](TradeFee.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getTotalBalance"></a>
# **getTotalBalance**
> TotalBalance getTotalBalance().currency(currency).execute();

Query personal account totals

This query endpoint returns the total *estimated value* of all currencies in each account converted to the input currency. Exchange rates and related account balance information may be cached for up to 1 minute. It is not recommended to use this interface data for real-time calculations.  For real-time calculations, query the corresponding balance interface based on account type, such as:  - &#x60;GET /spot/accounts&#x60; to query spot account - &#x60;GET /margin/accounts&#x60; to query margin account - &#x60;GET /futures/{settle}/accounts&#x60; to query futures account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String currency = "\"USDT\""; // String | Target currency type for statistical conversion. Accepts BTC, CNY, USD, and USDT. USDT is the default value
        try {
            TotalBalance result = apiInstance.getTotalBalance()
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#getTotalBalance");
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
 **currency** | **String**| Target currency type for statistical conversion. Accepts BTC, CNY, USD, and USDT. USDT is the default value | [optional] [default to &quot;USDT&quot;]

### Return type

[**TotalBalance**](TotalBalance.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request is valid and successfully returned |  -  |

<a name="listSmallBalance"></a>
# **listSmallBalance**
> List&lt;SmallBalance&gt; listSmallBalance()

Get list of convertible small balance currencies

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        try {
            List<SmallBalance> result = apiInstance.listSmallBalance();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listSmallBalance");
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

[**List&lt;SmallBalance&gt;**](SmallBalance.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="convertSmallBalance"></a>
# **convertSmallBalance**
> convertSmallBalance(convertSmallBalance)

Convert small balance currency

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        ConvertSmallBalance convertSmallBalance = new ConvertSmallBalance(); // ConvertSmallBalance | 
        try {
            apiInstance.convertSmallBalance(convertSmallBalance);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#convertSmallBalance");
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
 **convertSmallBalance** | [**ConvertSmallBalance**](ConvertSmallBalance.md)|  |

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
**200** | Success |  -  |

<a name="listSmallBalanceHistory"></a>
# **listSmallBalanceHistory**
> List&lt;SmallBalanceHistory&gt; listSmallBalanceHistory().currency(currency).page(page).limit(limit).execute();

Get convertible small balance currency history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String currency = "currency_example"; // String | Currency to convert
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of items returned. Default: 100, minimum: 1, maximum: 100
        try {
            List<SmallBalanceHistory> result = apiInstance.listSmallBalanceHistory()
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listSmallBalanceHistory");
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
 **currency** | **String**| Currency to convert | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of items returned. Default: 100, minimum: 1, maximum: 100 | [optional] [default to 100]

### Return type

[**List&lt;SmallBalanceHistory&gt;**](SmallBalanceHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="listPushOrders"></a>
# **listPushOrders**
> List&lt;UidPushOrder&gt; listPushOrders().id(id).from(from).to(to).limit(limit).offset(offset).transactionType(transactionType).execute();

Get UID transfer history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WalletApi apiInstance = new WalletApi(defaultClient);
        Integer id = 56; // Integer | Order ID
        Integer from = 56; // Integer | Start time for querying records. If not specified, defaults to 7 days before the current time. Unix timestamp in seconds
        Integer to = 56; // Integer | End time for querying records. If not specified, defaults to the current time. Unix timestamp in seconds
        Integer limit = 100; // Integer | Maximum number of items returned in the list, default value is 100
        Integer offset = 0; // Integer | List offset, starting from 0
        String transactionType = "\"withdraw\""; // String | Order type returned in the list: `withdraw`, `deposit`. Default is `withdraw`.
        try {
            List<UidPushOrder> result = apiInstance.listPushOrders()
                        .id(id)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .transactionType(transactionType)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#listPushOrders");
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
 **id** | **Integer**| Order ID | [optional]
 **from** | **Integer**| Start time for querying records. If not specified, defaults to 7 days before the current time. Unix timestamp in seconds | [optional]
 **to** | **Integer**| End time for querying records. If not specified, defaults to the current time. Unix timestamp in seconds | [optional]
 **limit** | **Integer**| Maximum number of items returned in the list, default value is 100 | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **transactionType** | **String**| Order type returned in the list: &#x60;withdraw&#x60;, &#x60;deposit&#x60;. Default is &#x60;withdraw&#x60;. | [optional] [default to &quot;withdraw&quot;]

### Return type

[**List&lt;UidPushOrder&gt;**](UidPushOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

