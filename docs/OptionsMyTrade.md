
# OptionsMyTrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Fill ID |  [optional]
**createTime** | **Double** | Fill Time |  [optional]
**contract** | **String** | Options contract name |  [optional]
**orderId** | **Integer** | Related order ID |  [optional]
**size** | **Long** | Trading size |  [optional]
**price** | **String** | Trade price (quote currency) |  [optional]
**underlyingPrice** | **String** | Underlying price (quote currency) |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role. taker - taker, maker - maker |  [optional]

## Enum: RoleEnum

Name | Value
---- | -----
TAKER | &quot;taker&quot;
MAKER | &quot;maker&quot;

