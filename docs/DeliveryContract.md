
# DeliveryContract

Futures contract details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Futures contract |  [optional]
**underlying** | **String** | Underlying |  [optional]
**cycle** | [**CycleEnum**](#CycleEnum) | Cycle type, e.g. WEEKLY, QUARTERLY |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Futures contract type |  [optional]
**quantoMultiplier** | **String** | Multiplier used in converting from invoicing to settlement currency |  [optional]
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
**basisRate** | **String** | Fair basis rate |  [optional]
**basisValue** | **String** | Fair basis value |  [optional]
**basisImpactValue** | **String** | Funding used for calculating impact bid, ask price |  [optional]
**settlePrice** | **String** | Settle price |  [optional]
**settlePriceInterval** | **Integer** | Settle price update interval |  [optional]
**settlePriceDuration** | **Integer** | Settle price update duration in seconds |  [optional]
**expireTime** | **Long** | Contract expiry timestamp |  [optional]
**riskLimitBase** | **String** | Risk limit base |  [optional]
**riskLimitStep** | **String** | Step of adjusting risk limit |  [optional]
**riskLimitMax** | **String** | Maximum risk limit the contract allowed |  [optional]
**orderSizeMin** | **Long** | Minimum order size the contract allowed |  [optional]
**orderSizeMax** | **Long** | Maximum order size the contract allowed |  [optional]
**orderPriceDeviate** | **String** | deviation between order price and current index price. If price of an order is denoted as order_price, it must meet the following condition:   abs(order_price - mark_price) &lt;&#x3D; mark_price * order_price_deviate |  [optional]
**refDiscountRate** | **String** | Referral fee rate discount |  [optional]
**refRebateRate** | **String** | Referrer commission rate |  [optional]
**orderbookId** | **Long** | Current orderbook ID |  [optional]
**tradeId** | **Long** | Current trade ID |  [optional]
**tradeSize** | **Long** | Historical accumulated trade size |  [optional]
**positionSize** | **Long** | Current total long position size |  [optional]
**configChangeTime** | **Double** | Last changed time of configuration |  [optional]
**inDelisting** | **Boolean** | Contract is delisting |  [optional]
**ordersLimit** | **Integer** | Maximum number of open orders |  [optional]

## Enum: CycleEnum

Name | Value
---- | -----
WEEKLY | &quot;WEEKLY&quot;
BI_WEEKLY | &quot;BI-WEEKLY&quot;
QUARTERLY | &quot;QUARTERLY&quot;
BI_QUARTERLY | &quot;BI-QUARTERLY&quot;

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

