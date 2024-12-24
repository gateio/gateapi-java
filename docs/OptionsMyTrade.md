
# OptionsMyTrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Trade ID |  [optional]
**createTime** | **Double** | Trading time |  [optional]
**contract** | **String** | Options contract name |  [optional]
**orderId** | **Integer** | Order ID related |  [optional]
**size** | **Long** | Trading size |  [optional]
**price** | **String** | Trading price (quote currency) |  [optional]
**underlyingPrice** | **String** | Underlying price (quote currency) |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role. Available values are &#x60;taker&#x60; and &#x60;maker&#x60; |  [optional]

## Enum: RoleEnum

Name | Value
---- | -----
TAKER | &quot;taker&quot;
MAKER | &quot;maker&quot;

