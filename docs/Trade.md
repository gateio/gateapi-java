
# Trade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Fill ID |  [optional]
**createTime** | **String** | Fill Time |  [optional]
**createTimeMs** | **String** | Trading time, with millisecond precision |  [optional]
**currencyPair** | **String** | Currency pair |  [optional]
**side** | [**SideEnum**](#SideEnum) | Buy or sell order |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role, not returned in public endpoints |  [optional]
**amount** | **String** | Trade amount |  [optional]
**price** | **String** | Order price |  [optional]
**orderId** | **String** | Related order ID, not returned in public endpoints |  [optional]
**fee** | **String** | Fee deducted, not returned in public endpoints |  [optional]
**feeCurrency** | **String** | Fee currency unit, not returned in public endpoints |  [optional]
**pointFee** | **String** | Points used to deduct fee, not returned in public endpoints |  [optional]
**gtFee** | **String** | GT used to deduct fee, not returned in public endpoints |  [optional]
**amendText** | **String** | The custom data that the user remarked when amending the order |  [optional]
**sequenceId** | **String** | Consecutive trade ID within a single market. Used to track and identify trades in the specific market |  [optional]
**text** | **String** | User-defined information, not returned in public endpoints |  [optional]

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

