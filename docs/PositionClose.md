
# PositionClose

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **Double** | Position close time |  [optional] [readonly]
**contract** | **String** | Futures contract |  [optional] [readonly]
**side** | [**SideEnum**](#SideEnum) | Position side  - &#x60;long&#x60;: Long position - &#x60;short&#x60;: Short position |  [optional] [readonly]
**pnl** | **String** | PnL |  [optional] [readonly]
**pnlPnl** | **String** | PNL - Position P/L |  [optional] [readonly]
**pnlFund** | **String** | PNL - Funding Fees |  [optional] [readonly]
**pnlFee** | **String** | PNL - Transaction Fees |  [optional] [readonly]
**text** | **String** | Source of close order. See &#x60;order.text&#x60; field for specific values |  [optional] [readonly]
**maxSize** | **String** | Max Trade Size |  [optional] [readonly]
**accumSize** | **String** | Cumulative closed position volume |  [optional] [readonly]
**firstOpenTime** | **Long** | First Open Time |  [optional] [readonly]
**longPrice** | **String** | When side is &#39;long&#39;, it indicates the opening average price; when side is &#39;short&#39;, it indicates the closing average price |  [optional] [readonly]
**shortPrice** | **String** | When side is &#39;long&#39;, it indicates the closing average price; when side is &#39;short&#39;, it indicates the opening average price |  [optional] [readonly]

## Enum: SideEnum

Name | Value
---- | -----
LONG | &quot;long&quot;
SHORT | &quot;short&quot;

