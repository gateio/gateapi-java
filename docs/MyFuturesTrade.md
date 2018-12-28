
# MyFuturesTrade

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | trade ID |  [optional]
**createTime** | [**BigDecimal**](BigDecimal.md) | trade time |  [optional]
**contract** | **String** | contract name |  [optional]
**orderId** | **String** | related order ID |  [optional]
**size** | **Long** | trade size |  [optional]
**price** | **String** | trade price |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | trade role |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
TAKER | &quot;taker&quot;
MAKER | &quot;maker&quot;



