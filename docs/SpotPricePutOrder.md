
# SpotPricePutOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Order type，default to &#x60;limit&#x60;  - limit : Limit Order - market : Market Order |  [optional]
**side** | [**SideEnum**](#SideEnum) | Order side  - buy: buy side - sell: sell side | 
**price** | **String** | Order price. | 
**amount** | **String** | When &#x60;type&#x60; is limit, it refers to base currency. For instance, &#x60;BTC_USDT&#x60; means &#x60;BTC&#x60;  When different currency according to &#x60;side&#x60;  - &#x60;side&#x60; : &#x60;buy&#x60; means quote currency, &#x60;BTC_USDT&#x60; means &#x60;USDT&#x60; - &#x60;side&#x60; : &#x60;sell&#x60; means base currency，&#x60;BTC_USDT&#x60; means &#x60;BTC&#x60;  | 
**account** | [**AccountEnum**](#AccountEnum) | Trading account type. Portfolio margin account must set to &#x60;unified&#x60;  -normal: spot trading - margin: margin trading - unified: unified trading  | 
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | time_in_force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only  |  [optional]
**autoBorrow** | **Boolean** | Whether to borrow coins automatically. |  [optional]
**autoRepay** | **Boolean** | Whether to repay the loan automatically. |  [optional]
**text** | **String** | The source of the order, including: - web: web - api: api - app: app |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
LIMIT | &quot;limit&quot;
MARKET | &quot;market&quot;

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
UNIFIED | &quot;unified&quot;

## Enum: TimeInForceEnum

Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;

