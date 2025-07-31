
# Contract

Futures contract details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Futures contract |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Contract type: inverse - inverse contract, direct - direct contract |  [optional]
**quantoMultiplier** | **String** | Multiplier used in converting from invoicing to settlement currency |  [optional]
**leverageMin** | **String** | Minimum leverage |  [optional]
**leverageMax** | **String** | Maximum leverage |  [optional]
**maintenanceRate** | **String** | Maintenance rate of margin |  [optional]
**markType** | [**MarkTypeEnum**](#MarkTypeEnum) | Mark price type: internal - internal trading price, index - external index price |  [optional]
**markPrice** | **String** | Current mark price |  [optional]
**indexPrice** | **String** | Current index price |  [optional]
**lastPrice** | **String** | Last trading price |  [optional]
**makerFeeRate** | **String** | Maker fee rate, negative values indicate rebates |  [optional]
**takerFeeRate** | **String** | Taker fee rate |  [optional]
**orderPriceRound** | **String** | Minimum order price increment |  [optional]
**markPriceRound** | **String** | Minimum mark price increment |  [optional]
**fundingRate** | **String** | Current funding rate |  [optional]
**fundingInterval** | **Integer** | Funding application interval, unit in seconds |  [optional]
**fundingNextApply** | **Double** | Next funding time |  [optional]
**riskLimitBase** | **String** | Base risk limit (deprecated) |  [optional]
**riskLimitStep** | **String** | Risk limit adjustment step (deprecated) |  [optional]
**riskLimitMax** | **String** | Maximum risk limit allowed by the contract (deprecated). It is recommended to use /futures/{settle}/risk_limit_tiers to query risk limits |  [optional]
**orderSizeMin** | **Long** | Minimum order size allowed by the contract |  [optional]
**orderSizeMax** | **Long** | Maximum order size allowed by the contract |  [optional]
**orderPriceDeviate** | **String** | Maximum allowed deviation between order price and current mark price. The order price &#x60;order_price&#x60; must satisfy the following condition:      abs(order_price - mark_price) &lt;&#x3D; mark_price * order_price_deviate |  [optional]
**refDiscountRate** | **String** | Trading fee discount for referred users |  [optional]
**refRebateRate** | **String** | Commission rate for referrers |  [optional]
**orderbookId** | **Long** | Orderbook update ID |  [optional]
**tradeId** | **Long** | Current trade ID |  [optional]
**tradeSize** | **Long** | Historical cumulative trading volume |  [optional]
**positionSize** | **Long** | Current total long position size |  [optional]
**configChangeTime** | **Double** | Last configuration update time |  [optional]
**inDelisting** | **Boolean** | &#x60;in_delisting&#x3D;true&#x60; and position_size&gt;0 indicates the contract is in delisting transition period &#x60;in_delisting&#x3D;true&#x60; and position_size&#x3D;0 indicates the contract is delisted |  [optional]
**ordersLimit** | **Integer** | Maximum number of pending orders |  [optional]
**enableBonus** | **Boolean** | Whether bonus is enabled |  [optional]
**enableCredit** | **Boolean** | Whether portfolio margin account is enabled |  [optional]
**createTime** | **Double** | Created time of the contract |  [optional]
**fundingCapRatio** | **String** | The factor for the maximum of the funding rate. Maximum of funding rate &#x3D; (1/market maximum leverage - maintenance margin rate) * funding_cap_ratio |  [optional]
**status** | **String** | Contract status types include: prelaunch (pre-launch), trading (active), delisting (delisting), delisted (delisted) |  [optional]
**launchTime** | **Long** | Contract expiry timestamp |  [optional]

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

