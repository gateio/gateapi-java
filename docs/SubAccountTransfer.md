
# SubAccountTransfer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subAccount** | **String** | Sub account user ID | 
**subAccountType** | **String** | 操作的子账号交易账户， spot - 现货账户， futures - 永续合约账户， delivery - 交割合约账户, options - 期权账户 |  [optional]
**currency** | **String** | Transfer currency name | 
**amount** | **String** | Transfer amount | 
**direction** | **String** | Transfer direction. to - transfer into sub account; from - transfer out from sub account | 
**clientOrderId** | **String** | The custom ID provided by the customer serves as a safeguard against duplicate transfers. It can be a combination of letters (case-sensitive), numbers, hyphens &#39;-&#39;, and underscores &#39;_&#39;, with a length ranging from 1 to 64 characters. |  [optional]

