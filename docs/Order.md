
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Order ID |  [optional]
**text** | **String** | User defined information. If not empty, must follow the rules below:  1. prefixed with &#x60;t-&#x60; 2. no longer than 16 bytes without &#x60;t-&#x60; prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.)  |  [optional]
**createTime** | **String** | Order creation time |  [optional]
**updateTime** | **String** | Order last modification time |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Order status  - &#x60;open&#x60;: to be filled - &#x60;closed&#x60;: filled - &#x60;cancelled&#x60;: cancelled |  [optional]
**currencyPair** | **String** | Currency pair | 
**type** | [**TypeEnum**](#TypeEnum) | Order type. limit - limit order |  [optional]
**account** | [**AccountEnum**](#AccountEnum) | Account type. spot - use spot account; margin - use margin account |  [optional]
**side** | [**SideEnum**](#SideEnum) | Order side | 
**amount** | **String** | Trade amount | 
**price** | **String** | Order price | 
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, reduce only |  [optional]
**autoBorrow** | **Boolean** | Used in margin trading(i.e. &#x60;account&#x60; is &#x60;margin&#x60;) to allow automatic loan of insufficient part if balance is not enough. |  [optional]
**left** | **String** | Amount left to fill |  [optional]
**fillPrice** | **String** | Total filled in quote currency. Deprecated in favor of &#x60;filled_total&#x60; |  [optional]
**filledTotal** | **String** | Total filled in quote currency |  [optional]
**fee** | **String** | Fee deducted |  [optional]
**feeCurrency** | **String** | Fee currency unit |  [optional]
**pointFee** | **String** | Point used to deduct fee |  [optional]
**gtFee** | **String** | GT used to deduct fee |  [optional]
**gtDiscount** | **Boolean** | Whether GT fee discount is used |  [optional]
**rebatedFee** | **String** | Rebated fee |  [optional]
**rebatedFeeCurrency** | **String** | Rebated fee currency unit |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
CANCELLED | &quot;cancelled&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LIMIT | &quot;limit&quot;


<a name="AccountEnum"></a>
## Enum: AccountEnum
Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;


<a name="SideEnum"></a>
## Enum: SideEnum
Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;


<a name="TimeInForceEnum"></a>
## Enum: TimeInForceEnum
Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;
POC | &quot;poc&quot;



