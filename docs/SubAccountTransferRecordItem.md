
# SubAccountTransferRecordItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timest** | **String** | Transfer timestamp |  [optional] [readonly]
**uid** | **String** | Main account user ID |  [optional] [readonly]
**subAccount** | **String** | Sub account user ID | 
**subAccountType** | **String** | Target sub-account trading account: spot - spot account, futures - perpetual contract account, delivery - delivery contract account, options - options account |  [optional]
**currency** | **String** | Transfer currency name | 
**amount** | **String** | Transfer amount | 
**direction** | **String** | Transfer direction: to - transfer into sub-account, from - transfer out from sub-account | 
**source** | **String** | Source of the transfer operation |  [optional] [readonly]
**clientOrderId** | **String** | Customer-defined ID to prevent duplicate transfers. Can be a combination of letters (case-sensitive), numbers, hyphens &#39;-&#39;, and underscores &#39;_&#39;. Can be pure letters or pure numbers with length between 1-64 characters |  [optional]
**status** | **String** | Sub-account transfer record status, currently only &#39;success&#39; |  [optional]

