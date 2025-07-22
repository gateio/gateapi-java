
# SubAccountTransfer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subAccount** | **String** | Sub account user ID. | 
**subAccountType** | **String** | Target sub user&#39;s account. &#x60;spot&#x60; - spot account, &#x60;futures&#x60; - perpetual contract account, &#x60;delivery&#x60; - delivery account |  [optional]
**currency** | **String** | Transfer currency name. | 
**amount** | **String** | Transfer amount. | 
**direction** | **String** | Transfer direction. to - transfer into sub account; from - transfer out from sub account | 
**clientOrderId** | **String** | The custom ID provided by the customer serves as a safeguard against duplicate transfers. It can be a combination of letters (case-sensitive), numbers, hyphens &#39;-&#39;, and underscores &#39;_&#39;, with a length ranging from 1 to 64 characters. |  [optional]

