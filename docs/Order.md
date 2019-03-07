
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Order ID |  [optional]
**createTime** | **String** | Order creation time |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Order status  - &#x60;open&#x60;: to be filled- &#x60;closed&#x60;: filled- &#x60;cancelled&#x60;: cancelled |  [optional]
**currencyPair** | **String** | Currency pair | 
**type** | [**TypeEnum**](#TypeEnum) | Order type. limit - limit order |  [optional]
**account** | [**AccountEnum**](#AccountEnum) | Account type. spot - use spot account; margin - use margin account |  [optional]
**side** | [**SideEnum**](#SideEnum) | Order side | 
**amount** | **String** | Trade amount | 
**price** | **String** | Order price | 
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | Time in force |  [optional]
**left** | **String** | Amount left to fill |  [optional]
**fillPrice** | **String** | Fill price of the order |  [optional]


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



