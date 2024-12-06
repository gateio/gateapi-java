

# SubAccountTransfer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Transfer currency name | 
**subAccount** | **String** | Sub account user ID | 
**direction** | **String** | Transfer direction. to - transfer into sub account; from - transfer out from sub account | 
**amount** | **String** | Transfer amount | 
**uid** | **String** | Main account user ID |  [optional] [readonly]
**clientOrderId** | **String** | The custom ID provided by the customer serves as a safeguard against duplicate transfers. It can be a combination of letters (case-sensitive), numbers, hyphens &#39;-&#39;, and underscores &#39;_&#39;, with a length ranging from 1 to 64 characters. |  [optional]
**timest** | **String** | Transfer timestamp |  [optional] [readonly]
**source** | **String** | Where the operation is initiated from |  [optional] [readonly]
**subAccountType** | **String** | Target sub user&#39;s account. &#x60;spot&#x60; - spot account, &#x60;futures&#x60; - perpetual contract account, &#x60;delivery&#x60; - delivery account |  [optional]



