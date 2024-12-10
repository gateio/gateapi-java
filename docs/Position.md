
# Position

Futures position details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | **Long** | User ID |  [optional] [readonly]
**contract** | **String** | Futures contract |  [optional] [readonly]
**size** | **Long** | Position size |  [optional] [readonly]
**leverage** | **String** | Position leverage. 0 means cross margin; positive number means isolated margin |  [optional]
**riskLimit** | **String** | Position risk limit |  [optional]
**leverageMax** | **String** | Maximum leverage under current risk limit |  [optional] [readonly]
**maintenanceRate** | **String** | Maintenance rate under current risk limit |  [optional] [readonly]
**value** | **String** | Position value calculated in settlement currency |  [optional] [readonly]
**margin** | **String** | Position margin |  [optional]
**entryPrice** | **String** | Entry price |  [optional] [readonly]
**liqPrice** | **String** | Liquidation price |  [optional] [readonly]
**markPrice** | **String** | Current mark price |  [optional] [readonly]
**initialMargin** | **String** | The initial margin occupied by the position, applicable to the portfolio margin account |  [optional] [readonly]
**maintenanceMargin** | **String** | Maintenance margin required for the position, applicable to portfolio margin account |  [optional] [readonly]
**unrealisedPnl** | **String** | Unrealized PNL |  [optional] [readonly]
**realisedPnl** | **String** | Realized PNL |  [optional] [readonly]
**pnlPnl** | **String** | Realized PNL - Position P/L |  [optional] [readonly]
**pnlFund** | **String** | Realized PNL -  Funding Fees |  [optional] [readonly]
**pnlFee** | **String** | Realized PNL - Transaction Fees |  [optional] [readonly]
**historyPnl** | **String** | History realized PNL |  [optional] [readonly]
**lastClosePnl** | **String** | PNL of last position close |  [optional] [readonly]
**realisedPoint** | **String** | Realized POINT PNL |  [optional] [readonly]
**historyPoint** | **String** | History realized POINT PNL |  [optional] [readonly]
**adlRanking** | **Integer** | Ranking of auto deleveraging, a total of 1-5 grades, &#x60;1&#x60; is the highest, &#x60;5&#x60; is the lowest, and &#x60;6&#x60; is the special case when there is no position held or in liquidation |  [optional] [readonly]
**pendingOrders** | **Integer** | Current open orders |  [optional] [readonly]
**closeOrder** | [**PositionCloseOrder**](PositionCloseOrder.md) |  |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | Position mode, including:  - &#x60;single&#x60;: dual mode is not enabled- &#x60;dual_long&#x60;: long position in dual mode- &#x60;dual_short&#x60;: short position in dual mode |  [optional]
**crossLeverageLimit** | **String** | Cross margin leverage(valid only when &#x60;leverage&#x60; is 0) |  [optional]
**updateTime** | **Long** | Last update time |  [optional] [readonly]
**updateId** | **Long** | Update id. Each time the position is updated, the value will be +1. |  [optional] [readonly]
**openTime** | **Long** | First Open Time |  [optional]

## Enum: ModeEnum

Name | Value
---- | -----
SINGLE | &quot;single&quot;
DUAL_LONG | &quot;dual_long&quot;
DUAL_SHORT | &quot;dual_short&quot;

