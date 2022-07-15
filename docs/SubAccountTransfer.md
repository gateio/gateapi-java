
# SubAccountTransfer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Transfer currency name | 
**subAccount** | **String** | Sub account user ID | 
**direction** | [**DirectionEnum**](#DirectionEnum) | Transfer direction. to - transfer into sub account; from - transfer out from sub account | 
**amount** | **String** | Transfer amount | 
**uid** | **String** | Main account user ID |  [optional] [readonly]
**timest** | **String** | Transfer timestamp |  [optional] [readonly]
**source** | **String** | Where the operation is initiated from |  [optional] [readonly]
**subAccountType** | [**SubAccountTypeEnum**](#SubAccountTypeEnum) | Target sub user&#39;s account. &#x60;spot&#x60; - spot account, &#x60;futures&#x60; - perpetual contract account, &#x60;cross_margin&#x60; - cross margin account |  [optional]

## Enum: DirectionEnum

Name | Value
---- | -----
TO | &quot;to&quot;
FROM | &quot;from&quot;

## Enum: SubAccountTypeEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
FUTURES | &quot;futures&quot;
CROSS_MARGIN | &quot;cross_margin&quot;

