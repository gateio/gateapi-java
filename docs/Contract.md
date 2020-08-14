
# Contract

Futures contract details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Futures contract |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Futures contract type |  [optional]
**quantoMultiplier** | **String** | Multiplier used in converting from invoicing to settlement currency in quanto futures |  [optional]
**leverageMin** | **String** | Minimum leverage |  [optional]
**leverageMax** | **String** | Maximum leverage |  [optional]
**maintenanceRate** | **String** | Maintenance rate of margin |  [optional]
**markType** | [**MarkTypeEnum**](#MarkTypeEnum) | Mark price type, internal - based on internal trading, index - based on external index price |  [optional]
**markPrice** | **String** | Current mark price |  [optional]
**indexPrice** | **String** | Current index price |  [optional]
**lastPrice** | **String** | Last trading price |  [optional]
**makerFeeRate** | **String** | Maker fee rate, where negative means rebate |  [optional]
**takerFeeRate** | **String** | Taker fee rate |  [optional]
**orderPriceRound** | **String** | Minimum order price increment |  [optional]
**markPriceRound** | **String** | Minimum mark price increment |  [optional]
**fundingRate** | **String** | Current funding rate |  [optional]
**fundingInterval** | **Integer** | Funding application interval, unit in seconds |  [optional]
**fundingNextApply** | [**BigDecimal**](BigDecimal.md) | Next funding time |  [optional]
**riskLimitBase** | **String** | Risk limit base |  [optional]
**riskLimitStep** | **String** | Step of adjusting risk limit |  [optional]
**riskLimitMax** | **String** | Maximum risk limit the contract allowed |  [optional]
**orderSizeMin** | **Long** | Minimum order size the contract allowed |  [optional]
**orderSizeMax** | **Long** | Maximum order size the contract allowed |  [optional]
**orderPriceDeviate** | **String** | deviation between order price and current index price. If price of an order is denoted as order_price, it must meet the following condition:      abs(order_price - mark_price) &lt;&#x3D; mark_price * order_price_deviate |  [optional]
**refDiscountRate** | **String** | Referral fee rate discount |  [optional]
**refRebateRate** | **String** | Referrer commission rate |  [optional]
**orderbookId** | **Long** | Current orderbook ID |  [optional]
**tradeId** | **Long** | Current trade ID |  [optional]
**tradeSize** | **Long** | Historical accumulation trade size |  [optional]
**positionSize** | **Long** | Current total long position size |  [optional]
**configChangeTime** | [**BigDecimal**](BigDecimal.md) | Configuration&#39;s last changed time |  [optional]
**inDelisting** | **Boolean** | Contract is delisting |  [optional]
**ordersLimit** | **Integer** | Maximum number of open orders |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
INVERSE | &quot;inverse&quot;
DIRECT | &quot;direct&quot;

## Enum: MarkTypeEnum

Name | Value
---- | -----
INTERNAL | &quot;internal&quot;
INDEX | &quot;index&quot;

