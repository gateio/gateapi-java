

# Contract

Futures contract details
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Futures contract |  [optional]
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
**fundingRate** | **String** | Current funding rate |  [optional]
**fundingInterval** | **Integer** | Funding application interval, unit in seconds |  [optional]
**fundingNextApply** | **Double** | Next funding time |  [optional]
**riskLimitBase** | **String** | Risk limit base,deprecated |  [optional]
**riskLimitStep** | **String** | Step of adjusting risk limit,deprecated |  [optional]
**riskLimitMax** | **String** | Maximum risk limit the contract allowed,deprecated,It is recommended to use /futures/{settle}/risk_limit_tiers to query risk limits. |  [optional]
**orderSizeMin** | **Long** | Minimum order size the contract allowed |  [optional]
**orderSizeMax** | **Long** | Maximum order size the contract allowed |  [optional]
**orderPriceDeviate** | **String** | deviation between order price and current index price. If price of an order is denoted as order_price, it must meet the following condition:      abs(order_price - mark_price) &lt;&#x3D; mark_price * order_price_deviate |  [optional]
**refDiscountRate** | **String** | Referral fee rate discount |  [optional]
**refRebateRate** | **String** | Referrer commission rate |  [optional]
**orderbookId** | **Long** | Current orderbook ID |  [optional]
**tradeId** | **Long** | Current trade ID |  [optional]
**tradeSize** | **Long** | Historical accumulated trade size |  [optional]
**positionSize** | **Long** | Current total long position size |  [optional]
**configChangeTime** | **Double** | Last changed time of configuration |  [optional]
**inDelisting** | **Boolean** | &#x60;in_delisting&#x3D;true&#x60; And when position_size&gt;0, it means the contract is in the offline transition period &#x60;in_delisting&#x3D;true&#x60; And when position_size&#x3D;0, it means the contract is offline |  [optional]
**ordersLimit** | **Integer** | Maximum number of open orders |  [optional]
**enableBonus** | **Boolean** | Whether bouns is enabled |  [optional]
**enableCredit** | **Boolean** | Whether portfolio margin account is enabled |  [optional]
**createTime** | **Double** | Created time of the contract |  [optional]
**fundingCapRatio** | **String** | The factor for the maximum of the funding rate. Maximum of funding rate &#x3D; (1/market maximum leverage - maintenance margin rate) * funding_cap_ratio |  [optional]



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



