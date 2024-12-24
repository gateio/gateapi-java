
# MockMarginResult

Margin result

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Position combination type &#x60;original_position&#x60; - Original position &#x60;long_delta_original_position&#x60; - Positive delta + Original position &#x60;short_delta_original_position&#x60; - Negative delta + Original position |  [optional]
**profitLossRanges** | [**List&lt;ProfitLossRange&gt;**](ProfitLossRange.md) | The results of 33 pressure scenarios for MR1 |  [optional]
**maxLoss** | [**ProfitLossRange**](.md) | 最大损失 |  [optional]
**mr1** | **String** | Stress testing |  [optional]
**mr2** | **String** | Basis spread risk |  [optional]
**mr3** | **String** | Volatility spread risk |  [optional]
**mr4** | **String** | Option short risk |  [optional]

