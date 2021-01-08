
# BatchOrder

Batch order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | User defined information. If not empty, must follow the rules below:  1. prefixed with &#x60;t-&#x60; 2. no longer than 28 bytes without &#x60;t-&#x60; prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.)  |  [optional]
**succeeded** | **Boolean** | Whether order succeeds |  [optional]
**label** | **String** | Error label, empty string if order succeeds |  [optional]
**message** | **String** | Detailed error message, empty string if order succeeds |  [optional]
**id** | **String** | Order ID |  [optional] [readonly]
**createTime** | **String** | Order creation time |  [optional] [readonly]
**updateTime** | **String** | Order last modification time |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Order status  - &#x60;open&#x60;: to be filled - &#x60;closed&#x60;: filled - &#x60;cancelled&#x60;: cancelled |  [optional] [readonly]
**currencyPair** | **String** | Currency pair |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Order type. limit - limit order |  [optional]
**account** | [**AccountEnum**](#AccountEnum) | Account type. spot - use spot account; margin - use margin account |  [optional]
**side** | [**SideEnum**](#SideEnum) | Order side |  [optional]
**amount** | **String** | Trade amount |  [optional]
**price** | **String** | Order price |  [optional]
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, makes a post-only order that always enjoys a maker fee |  [optional]
**iceberg** | **String** | Amount to display for the iceberg order. Null or 0 for normal orders |  [optional]
**autoBorrow** | **Boolean** | Used in margin trading(i.e. &#x60;account&#x60; is &#x60;margin&#x60;) to allow automatic loan of insufficient part if balance is not enough. |  [optional]
**left** | **String** | Amount left to fill |  [optional] [readonly]
**fillPrice** | **String** | Total filled in quote currency. Deprecated in favor of &#x60;filled_total&#x60; |  [optional] [readonly]
**filledTotal** | **String** | Total filled in quote currency |  [optional] [readonly]
**fee** | **String** | Fee deducted |  [optional] [readonly]
**feeCurrency** | **String** | Fee currency unit |  [optional] [readonly]
**pointFee** | **String** | Point used to deduct fee |  [optional] [readonly]
**gtFee** | **String** | GT used to deduct fee |  [optional] [readonly]
**gtDiscount** | **Boolean** | Whether GT fee discount is used |  [optional] [readonly]
**rebatedFee** | **String** | Rebated fee |  [optional] [readonly]
**rebatedFeeCurrency** | **String** | Rebated fee currency unit |  [optional] [readonly]

## Enum: StatusEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
CANCELLED | &quot;cancelled&quot;

## Enum: TypeEnum

Name | Value
---- | -----
LIMIT | &quot;limit&quot;

## Enum: AccountEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;

## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;

## Enum: TimeInForceEnum

Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;
POC | &quot;poc&quot;

