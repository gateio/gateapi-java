
# OptionsPositionClose

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **Double** | Position close time |  [optional] [readonly]
**contract** | **String** | Options contract name |  [optional] [readonly]
**side** | [**SideEnum**](#SideEnum) | Position side  - &#x60;long&#x60;: Long position - &#x60;short&#x60;: Short position |  [optional] [readonly]
**pnl** | **String** | PnL |  [optional] [readonly]
**text** | **String** | Source of close order. See &#x60;order.text&#x60; field for specific values |  [optional] [readonly]
**settleSize** | **String** | Settlement size |  [optional] [readonly]

## Enum: SideEnum

Name | Value
---- | -----
LONG | &quot;long&quot;
SHORT | &quot;short&quot;

