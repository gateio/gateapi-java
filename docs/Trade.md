
# Trade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Trade ID |  [optional]
**createTime** | **String** | Trading time |  [optional]
**createTimeMs** | **String** | Trading time, with millisecond precision |  [optional]
**currencyPair** | **String** | Currency pair |  [optional]
**side** | [**SideEnum**](#SideEnum) | Buy or sell order |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role. No value in public endpoints |  [optional]
**amount** | **String** | Trade amount |  [optional]
**price** | **String** | Order price |  [optional]
**orderId** | **String** | Related order ID. No value in public endpoints |  [optional]
**fee** | **String** | Fee deducted. No value in public endpoints |  [optional]
**feeCurrency** | **String** | Fee currency unit. No value in public endpoints |  [optional]
**pointFee** | **String** | Points used to deduct fee. No value in public endpoints |  [optional]
**gtFee** | **String** | GT used to deduct fee. No value in public endpoints |  [optional]
**amendText** | **String** | The custom data that the user remarked when amending the order |  [optional]
**sequenceId** | **String** | Represents a unique and consecutive trade ID within a single market. It is used to track and identify trades in the specific market |  [optional]
**text** | **String** | User defined information. No value in public endpoints |  [optional]

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

