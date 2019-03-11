
# MyFuturesTrade

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Trade ID |  [optional]
**createTime** | [**BigDecimal**](BigDecimal.md) | Trading time |  [optional]
**contract** | **String** | Futures contract |  [optional]
**orderId** | **String** | Order ID related |  [optional]
**size** | **Long** | Trading size |  [optional]
**price** | **String** | Trading price |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role. Available values are &#x60;taker&#x60; and &#x60;maker&#x60; |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
TAKER | &quot;taker&quot;
MAKER | &quot;maker&quot;


