# WalletApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCurrencyChains**](WalletApi.md#listCurrencyChains) | **GET** /wallet/currency_chains | List chains supported for specified currency
[**getDepositAddress**](WalletApi.md#getDepositAddress) | **GET** /wallet/deposit_address | Generate currency deposit address
[**listWithdrawals**](WalletApi.md#listWithdrawals) | **GET** /wallet/withdrawals | Retrieve withdrawal records
[**listDeposits**](WalletApi.md#listDeposits) | **GET** /wallet/deposits | Retrieve deposit records
[**transfer**](WalletApi.md#transfer) | **POST** /wallet/transfers | Transfer between trading accounts
[**listSubAccountTransfers**](WalletApi.md#listSubAccountTransfers) | **GET** /wallet/sub_account_transfers | Retrieve transfer records between main and sub accounts
[**transferWithSubAccount**](WalletApi.md#transferWithSubAccount) | **POST** /wallet/sub_account_transfers | Transfer between main and sub accounts
[**subAccountToSubAccount**](WalletApi.md#subAccountToSubAccount) | **POST** /wallet/sub_account_to_sub_account | Sub-account transfers to sub-account
[**getTransferOrderStatus**](WalletApi.md#getTransferOrderStatus) | **GET** /wallet/order_status | Transfer status query
[**listWithdrawStatus**](WalletApi.md#listWithdrawStatus) | **GET** /wallet/withdraw_status | Retrieve withdrawal status
[**listSubAccountBalances**](WalletApi.md#listSubAccountBalances) | **GET** /wallet/sub_account_balances | Retrieve sub account balances
[**listSubAccountMarginBalances**](WalletApi.md#listSubAccountMarginBalances) | **GET** /wallet/sub_account_margin_balances | Query sub accounts&#39; margin balances
[**listSubAccountFuturesBalances**](WalletApi.md#listSubAccountFuturesBalances) | **GET** /wallet/sub_account_futures_balances | Query sub accounts&#39; futures account balances
[**listSubAccountCrossMarginBalances**](WalletApi.md#listSubAccountCrossMarginBalances) | **GET** /wallet/sub_account_cross_margin_balances | Query subaccount&#39;s cross_margin account info
[**listSavedAddress**](WalletApi.md#listSavedAddress) | **GET** /wallet/saved_address | Query saved address
[**getTradeFee**](WalletApi.md#getTradeFee) | **GET** /wallet/fee | Retrieve personal trading fee
[**getTotalBalance**](WalletApi.md#getTotalBalance) | **GET** /wallet/total_balance | Retrieve user&#39;s total balances
[**listSmallBalance**](WalletApi.md#listSmallBalance) | **GET** /wallet/small_balance | List small balance
[**convertSmallBalance**](WalletApi.md#convertSmallBalance) | **POST** /wallet/small_balance | Convert small balance
[**listSmallBalanceHistory**](WalletApi.md#listSmallBalanceHistory) | **GET** /wallet/small_balance_history | List small balance history
[**listPushOrders**](WalletApi.md#listPushOrders) | **GET** /wallet/push | Retrieve the UID transfer history


<a name="listCurrencyChains"></a>
# **listCurrencyChains**
> List&lt;CurrencyChain&gt; listCurrencyChains(currency)

List chains supported for specified currency

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
**200** | Successfully retrieved |  -  |

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

Retrieve withdrawal records

Record time range cannot exceed 30 days

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
        String currency = "BTC"; // String | Filter by currency. Return all currency records if not specified
        String withdrawId = "withdrawId_example"; // String | The withdrawal record id starts with w, such as: w1879219868. When withdraw_id is not empty, the value querys this withdrawal record and no longer querys according to time
        String assetClass = "assetClass_example"; // String | The currency type of withdrawal record is empty by default. It supports users to query the withdrawal records in the main and innovation areas on demand. Value range: SPOT, PILOT  SPOT: Main Zone  PILOT: Innovation Zone
        String withdrawOrderId = "withdrawOrderId_example"; // String | User-defined order number when withdrawing. Default is empty. When not empty, the specified user-defined order number record will be queried
        Long from = 1602120000L; // Long | Time range beginning, default to 7 days before current time
        Long to = 1602123600L; // Long | Time range ending, default to current time
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
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
 **currency** | **String**| Filter by currency. Return all currency records if not specified | [optional]
 **withdrawId** | **String**| The withdrawal record id starts with w, such as: w1879219868. When withdraw_id is not empty, the value querys this withdrawal record and no longer querys according to time | [optional]
 **assetClass** | **String**| The currency type of withdrawal record is empty by default. It supports users to query the withdrawal records in the main and innovation areas on demand. Value range: SPOT, PILOT  SPOT: Main Zone  PILOT: Innovation Zone | [optional]
 **withdrawOrderId** | **String**| User-defined order number when withdrawing. Default is empty. When not empty, the specified user-defined order number record will be queried | [optional]
 **from** | **Long**| Time range beginning, default to 7 days before current time | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
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
**200** | List retrieved |  -  |

<a name="listDeposits"></a>
# **listDeposits**
> List&lt;DepositRecord&gt; listDeposits().currency(currency).from(from).to(to).limit(limit).offset(offset).execute();

Retrieve deposit records

Record time range cannot exceed 30 days

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
        String currency = "BTC"; // String | Filter by currency. Return all currency records if not specified
        Long from = 1602120000L; // Long | Time range beginning, default to 7 days before current time
        Long to = 1602123600L; // Long | Time range ending, default to current time
        Integer limit = 100; // Integer | The maximum number of entries returned in the list is limited to 500 transactions.
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
 **currency** | **String**| Filter by currency. Return all currency records if not specified | [optional]
 **from** | **Long**| Time range beginning, default to 7 days before current time | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **limit** | **Integer**| The maximum number of entries returned in the list is limited to 500 transactions. | [optional] [default to 100]
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
**200** | List retrieved |  -  |

<a name="transfer"></a>
# **transfer**
> TransactionID transfer(transfer)

Transfer between trading accounts

Transfer between different accounts. Currently support transfers between the following:  1. spot - margin 2. spot - futures(perpetual) 3. spot - delivery 4. spot - options

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
**200** | Balance transferred |  -  |

<a name="listSubAccountTransfers"></a>
# **listSubAccountTransfers**
> List&lt;SubAccountTransferRecordItem&gt; listSubAccountTransfers().subUid(subUid).from(from).to(to).limit(limit).offset(offset).execute();

Retrieve transfer records between main and sub accounts

Record time range cannot exceed 30 days  &gt; Note: only records after 2020-04-10 can be retrieved

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
        String subUid = "10003"; // String | User ID of sub-account, you can query multiple records separated by `,`. If not specified, it will return the records of all sub accounts
        Long from = 1602120000L; // Long | Time range beginning, default to 7 days before current time
        Long to = 1602123600L; // Long | Time range ending, default to current time
        Integer limit = 100; // Integer | Maximum number of records to be returned in a single list
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
 **subUid** | **String**| User ID of sub-account, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return the records of all sub accounts | [optional]
 **from** | **Long**| Time range beginning, default to 7 days before current time | [optional]
 **to** | **Long**| Time range ending, default to current time | [optional]
 **limit** | **Integer**| Maximum number of records to be returned in a single list | [optional] [default to 100]
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
**200** | List retrieved |  -  |

<a name="transferWithSubAccount"></a>
# **transferWithSubAccount**
> TransactionID transferWithSubAccount(subAccountTransfer)

Transfer between main and sub accounts

Support transferring with sub user&#39;s spot or futures account. Note that only main user&#39;s spot account is used no matter which sub user&#39;s account is operated.

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
**200** | Balance transferred |  -  |

<a name="subAccountToSubAccount"></a>
# **subAccountToSubAccount**
> TransactionID subAccountToSubAccount(subAccountToSubAccount)

Sub-account transfers to sub-account

It is possible to perform balance transfers between two sub-accounts under the same main account. You can use either the API Key of the main account or the API Key of the sub-account to initiate the transfer.

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
**200** | Balance transferred |  -  |

<a name="getTransferOrderStatus"></a>
# **getTransferOrderStatus**
> TransferOrderStatus getTransferOrderStatus().clientOrderId(clientOrderId).txId(txId).execute();

Transfer status query

Support querying transfer status based on user-defined client_order_id or tx_id returned by the transfer interface

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
        String clientOrderId = "da3ce7a088c8b0372b741419c7829033"; // String | The custom ID provided by the customer serves as a safeguard against duplicate transfers. It can be a combination of letters (case-sensitive), numbers, hyphens '-', and underscores '_', with a length ranging from 1 to 64 characters.
        String txId = "59636381286"; // String | The transfer operation number and client_order_id cannot be empty at the same time
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
 **clientOrderId** | **String**| The custom ID provided by the customer serves as a safeguard against duplicate transfers. It can be a combination of letters (case-sensitive), numbers, hyphens &#39;-&#39;, and underscores &#39;_&#39;, with a length ranging from 1 to 64 characters. | [optional]
 **txId** | **String**| The transfer operation number and client_order_id cannot be empty at the same time | [optional]

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
**200** | Transfer status obtained successfully |  -  |

<a name="listWithdrawStatus"></a>
# **listWithdrawStatus**
> List&lt;WithdrawStatus&gt; listWithdrawStatus().currency(currency).execute();

Retrieve withdrawal status

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
        String currency = "BTC"; // String | Retrieve data of the specified currency
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
 **currency** | **String**| Retrieve data of the specified currency | [optional]

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
**200** | List retrieved |  -  |

<a name="listSubAccountBalances"></a>
# **listSubAccountBalances**
> List&lt;SubAccountBalance&gt; listSubAccountBalances().subUid(subUid).execute();

Retrieve sub account balances

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
        String subUid = "10003"; // String | User ID of sub-account, you can query multiple records separated by `,`. If not specified, it will return the records of all sub accounts
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
 **subUid** | **String**| User ID of sub-account, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return the records of all sub accounts | [optional]

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
**200** | List retrieved |  -  |

<a name="listSubAccountMarginBalances"></a>
# **listSubAccountMarginBalances**
> List&lt;SubAccountMarginBalance&gt; listSubAccountMarginBalances().subUid(subUid).execute();

Query sub accounts&#39; margin balances

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
        String subUid = "10003"; // String | User ID of sub-account, you can query multiple records separated by `,`. If not specified, it will return the records of all sub accounts
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
 **subUid** | **String**| User ID of sub-account, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return the records of all sub accounts | [optional]

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
**200** | List retrieved |  -  |

<a name="listSubAccountFuturesBalances"></a>
# **listSubAccountFuturesBalances**
> List&lt;SubAccountFuturesBalance&gt; listSubAccountFuturesBalances().subUid(subUid).settle(settle).execute();

Query sub accounts&#39; futures account balances

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
        String subUid = "10003"; // String | User ID of sub-account, you can query multiple records separated by `,`. If not specified, it will return the records of all sub accounts
        String settle = "usdt"; // String | Query only balances of specified settle currency
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
 **subUid** | **String**| User ID of sub-account, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return the records of all sub accounts | [optional]
 **settle** | **String**| Query only balances of specified settle currency | [optional]

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
**200** | List retrieved |  -  |

<a name="listSubAccountCrossMarginBalances"></a>
# **listSubAccountCrossMarginBalances**
> List&lt;SubAccountCrossMarginBalance&gt; listSubAccountCrossMarginBalances().subUid(subUid).execute();

Query subaccount&#39;s cross_margin account info

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
        String subUid = "10003"; // String | User ID of sub-account, you can query multiple records separated by `,`. If not specified, it will return the records of all sub accounts
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
 **subUid** | **String**| User ID of sub-account, you can query multiple records separated by &#x60;,&#x60;. If not specified, it will return the records of all sub accounts | [optional]

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
**200** | List retrieved |  -  |

<a name="listSavedAddress"></a>
# **listSavedAddress**
> List&lt;SavedAddress&gt; listSavedAddress(currency).chain(chain).limit(limit).page(page).execute();

Query saved address

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
        String limit = "\"50\""; // String | Maximum number returned, 100 at most
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
 **limit** | **String**| Maximum number returned, 100 at most | [optional] [default to &quot;50&quot;]
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
**200** | List retrieved |  -  |

<a name="getTradeFee"></a>
# **getTradeFee**
> TradeFee getTradeFee().currencyPair(currencyPair).settle(settle).execute();

Retrieve personal trading fee

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
        String currencyPair = "BTC_USDT"; // String | Specify a currency pair to retrieve precise fee rate  This field is optional. In most cases, the fee rate is identical among all currency pairs
        String settle = "BTC"; // String | Specify the settlement currency of the contract to get more accurate rate settings  This field is optional. Generally, the rate settings for all settlement currencies are the same.
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
 **currencyPair** | **String**| Specify a currency pair to retrieve precise fee rate  This field is optional. In most cases, the fee rate is identical among all currency pairs | [optional]
 **settle** | **String**| Specify the settlement currency of the contract to get more accurate rate settings  This field is optional. Generally, the rate settings for all settlement currencies are the same. | [optional] [enum: BTC, USDT, USD]

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
**200** | Successfully retrieved |  -  |

<a name="getTotalBalance"></a>
# **getTotalBalance**
> TotalBalance getTotalBalance().currency(currency).execute();

Retrieve user&#39;s total balances

This endpoint returns an approximate sum of exchanged amount from all currencies to input currency for each account.The exchange rate and account balance could have been cached for at most 1 minute. It is not recommended to use its result for any trading calculation.  For trading calculation, use the corresponding account query endpoint for each account type. For example:   - &#x60;GET /spot/accounts&#x60; to query spot account balance - &#x60;GET /margin/accounts&#x60; to query margin account balance - &#x60;GET /futures/{settle}/accounts&#x60; to query futures account balance

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
        String currency = "\"USDT\""; // String | Currency unit used to calculate the balance amount. BTC, CNY, USD and USDT are allowed. USDT is the default.
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
 **currency** | **String**| Currency unit used to calculate the balance amount. BTC, CNY, USD and USDT are allowed. USDT is the default. | [optional] [default to &quot;USDT&quot;]

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
**200** | Request is valid and is successfully responded |  -  |

<a name="listSmallBalance"></a>
# **listSmallBalance**
> List&lt;SmallBalance&gt; listSmallBalance()

List small balance

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

Convert small balance

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

List small balance history

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
        String currency = "currency_example"; // String | Currency
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum response items.  Default: 100, minimum: 1, Maximum: 100
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
 **currency** | **String**| Currency | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum response items.  Default: 100, minimum: 1, Maximum: 100 | [optional] [default to 100]

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

Retrieve the UID transfer history

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
        Integer from = 56; // Integer | The start time of the query record. If not specified, it defaults to 7 days forward from the current time, in seconds Unix timestamp
        Integer to = 56; // Integer | The end time of the query record. If not specified, the default is the current time, which is a Unix timestamp in seconds.
        Integer limit = 100; // Integer | The maximum number of items returned in the list, the default value is 100
        Integer offset = 0; // Integer | List offset, starting from 0
        String transactionType = "\"withdraw\""; // String | The list returns the order type `withdraw`, `deposit`, the default is `withdraw`.
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
 **from** | **Integer**| The start time of the query record. If not specified, it defaults to 7 days forward from the current time, in seconds Unix timestamp | [optional]
 **to** | **Integer**| The end time of the query record. If not specified, the default is the current time, which is a Unix timestamp in seconds. | [optional]
 **limit** | **Integer**| The maximum number of items returned in the list, the default value is 100 | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **transactionType** | **String**| The list returns the order type &#x60;withdraw&#x60;, &#x60;deposit&#x60;, the default is &#x60;withdraw&#x60;. | [optional] [default to &quot;withdraw&quot;]

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

