
# Trade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Trade ID |  [optional]
**createTime** | **String** | Trading time |  [optional]
**side** | [**SideEnum**](#SideEnum) | Order side |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role |  [optional]
**amount** | **String** | Trade amount |  [optional]
**price** | **String** | Order price |  [optional]
**orderId** | **String** | Related order ID. No value in public endpoints |  [optional]
**fee** | **String** | Fee deducted. No value in public endpoints |  [optional]
**feeCurrency** | **String** | Fee currency unit. No value in public endpoints |  [optional]
**pointFee** | **String** | Point used to deduct fee |  [optional]
**gtFee** | **String** | GT used to deduct fee |  [optional]

## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;

## Enum: RoleEnum

Name | Value
---- | -----
TAKER | &quot;taker&quot;
MAKER | &quot;maker&quot;

