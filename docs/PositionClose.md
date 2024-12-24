
# PositionClose

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **Double** | Position close time |  [optional] [readonly]
**contract** | **String** | Futures contract |  [optional] [readonly]
**side** | [**SideEnum**](#SideEnum) | Position side, long or short |  [optional] [readonly]
**pnl** | **String** | PNL |  [optional] [readonly]
**pnlPnl** | **String** | PNL - Position P/L |  [optional] [readonly]
**pnlFund** | **String** | PNL - Funding Fees |  [optional] [readonly]
**pnlFee** | **String** | PNL - Transaction Fees |  [optional] [readonly]
**text** | **String** | Text of close order |  [optional] [readonly]
**maxSize** | **String** | Max Trade Size |  [optional] [readonly]
**accumSize** | **String** | Cumulative closed position volume |  [optional] [readonly]
**firstOpenTime** | **Long** | First Open Time |  [optional] [readonly]
**longPrice** | **String** | When &#39;side&#39; is &#39;long,&#39; it indicates the opening average price; when &#39;side&#39; is &#39;short,&#39; it indicates the closing average price. |  [optional] [readonly]
**shortPrice** | **String** | When &#39;side&#39; is &#39;long,&#39; it indicates the opening average price; when &#39;side&#39; is &#39;short,&#39; it indicates the closing average price |  [optional] [readonly]

## Enum: SideEnum

Name | Value
---- | -----
LONG | &quot;long&quot;
SHORT | &quot;short&quot;

