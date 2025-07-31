
# FuturesPriceTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategyType** | [**StrategyTypeEnum**](#StrategyTypeEnum) | Trigger Strategy   - 0: Price trigger, triggered when price meets conditions  - 1: Price spread trigger, i.e. the difference between the latest price specified in &#x60;price_type&#x60; and the second-last price Currently only supports 0 (latest transaction price) |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Reference price type. 0 - Latest trade price, 1 - Mark price, 2 - Index price |  [optional]
**price** | **String** | Price value for price trigger, or spread value for spread trigger |  [optional]
**rule** | [**RuleEnum**](#RuleEnum) | Price Condition Type  - 1: Trigger when the price calculated based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; is greater than or equal to &#x60;Trigger.Price&#x60;, while Trigger.Price must &gt; last_price - 2: Trigger when the price calculated based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; is less than or equal to &#x60;Trigger.Price&#x60;, and Trigger.Price must &lt; last_price |  [optional]
**expiration** | **Integer** | Maximum wait time for trigger condition (in seconds). Order will be cancelled if timeout |  [optional]

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

