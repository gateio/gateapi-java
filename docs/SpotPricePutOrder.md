
# SpotPricePutOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Order type, default to &#x60;limit&#x60; |  [optional]
**side** | [**SideEnum**](#SideEnum) | Order side  - buy: buy side - sell: sell side | 
**price** | **String** | Order price | 
**amount** | **String** | Order amount | 
**account** | [**AccountEnum**](#AccountEnum) | Trading account type.  Portfolio margin account must set to &#x60;cross_margin&#x60;  - normal: spot trading - margin: margin trading - cross_margin: cross_margin trading  | 
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | time_in_force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only  |  [optional]

## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;

## Enum: AccountEnum

Name | Value
---- | -----
NORMAL | &quot;normal&quot;
MARGIN | &quot;margin&quot;
CROSS_MARGIN | &quot;cross_margin&quot;

## Enum: TimeInForceEnum

Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;

