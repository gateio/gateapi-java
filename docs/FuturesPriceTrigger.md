

# FuturesPriceTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategyType** | [**StrategyTypeEnum**](#StrategyTypeEnum) | How the order will be triggered   - &#x60;0&#x60;: by price, which means the order will be triggered if price condition is satisfied  - &#x60;1&#x60;: by price gap, which means the order will be triggered if gap of recent two prices of specified &#x60;price_type&#x60; are satisfied.  Only &#x60;0&#x60; is supported currently |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Price type. 0 - latest deal price, 1 - mark price, 2 - index price |  [optional]
**price** | **String** | Value of price on price triggered, or price gap on price gap triggered |  [optional]
**rule** | [**RuleEnum**](#RuleEnum) | Trigger condition type  - &#x60;1&#x60;: calculated price based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; &gt;&#x3D; &#x60;price&#x60; - &#x60;2&#x60;: calculated price based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; &lt;&#x3D; &#x60;price&#x60; |  [optional]
**expiration** | **Integer** | How long (in seconds) to wait for the condition to be triggered before cancelling the order. |  [optional]



## Enum: StrategyTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1



## Enum: PriceTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2



## Enum: RuleEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2



