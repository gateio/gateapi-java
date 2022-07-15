
# MyFuturesTrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Trade ID |  [optional]
**createTime** | **Double** | Trading time |  [optional]
**contract** | **String** | Futures contract |  [optional]
**orderId** | **String** | Order ID related |  [optional]
**size** | **Long** | Trading size |  [optional]
**price** | **String** | Trading price |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role. Available values are &#x60;taker&#x60; and &#x60;maker&#x60; |  [optional]
**text** | **String** | User defined information |  [optional]
**fee** | **String** | Fee deducted |  [optional]
**pointFee** | **String** | Points used to deduct fee |  [optional]

## Enum: RoleEnum

Name | Value
---- | -----
TAKER | &quot;taker&quot;
MAKER | &quot;maker&quot;

