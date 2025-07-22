
# FuturesPriceTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategyType** | [**StrategyTypeEnum**](#StrategyTypeEnum) | Trigger Policy   - 0: Price trigger, that is, when the price meets the conditions  - 1: Price spread trigger, i.e. the last price specified in &#x60;price_type&#x60; minus the second-last price difference At present, only 0 is the latest transaction price |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Price type. 0 - latest deal price, 1 - mark price, 2 - index price. |  [optional]
**price** | **String** | Value of price on price triggered, or price gap on price gap triggered. |  [optional]
**rule** | [**RuleEnum**](#RuleEnum) | Price Condition Type  - 1: Indicates that the price calculated based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; is greater than or equal to &#x60;Trigger.Price&#x60; Trigger, while Trigger.Price must &gt; last_price - based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; is less than or equal to &#x60;Trigger.Price&#x60; Trigger, and Trigger.Price must &lt; last_price |  [optional]
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

