
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

## Enum: DirectionEnum

Name | Value
---- | -----
TO | &quot;to&quot;
FROM | &quot;from&quot;

