
# Contract

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Futures name |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Futures type |  [optional]
**quantoMultiplier** | **String** | Multiplier used in converting from invoicing to settlement currency in quanto futures |  [optional]
**leverageMin** | **String** | minimum leverage |  [optional]
**leverageMax** | **String** | maximum leverage |  [optional]
**markType** | [**MarkTypeEnum**](#MarkTypeEnum) | mark price type, internal - based on internal trading, index - based on external index price |  [optional]
**markPrice** | **String** | latest mark price |  [optional]
**indexPrice** | **String** | latest index price |  [optional]
**maintenanceRate** | **String** | maintenance rate of margin |  [optional]
**fundingRate** | **String** | funding rate |  [optional]
**fundingInterval** | **Integer** | funding application interval, unit in seconds |  [optional]
**fundingNextApply** | [**BigDecimal**](BigDecimal.md) | next funding time |  [optional]
**riskLimitBase** | **String** | risk limit base |  [optional]
**riskLimitStep** | **String** | step of adjusting risk limit |  [optional]
**riskLimitMax** | **String** | maximum risk limit the contract allowed |  [optional]
**orderSizeMin** | **Long** | minimum order size the contract allowed |  [optional]
**orderSizeMax** | **Long** | maximum order size the contract allowed |  [optional]
**orderPriceDeviate** | **String** | deviation between order price and current index price. If price of an order is denoted as &#x60;order_price&#x60;, it must meet the following condition:      abs(order_price - mark_price) &lt;&#x3D; mark_price * order_price_deviate  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INVERSE | &quot;inverse&quot;
QUANTO | &quot;quanto&quot;
DIRECT | &quot;direct&quot;


<a name="MarkTypeEnum"></a>
## Enum: MarkTypeEnum
Name | Value
---- | -----
INTERNAL | &quot;internal&quot;
INDEX | &quot;index&quot;



