
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
**unrealisedPnl** | **String** | Unrealized PNL |  [optional] [readonly]
**realisedPnl** | **String** | Realized PNL |  [optional] [readonly]
**historyPnl** | **String** | History realized PNL |  [optional] [readonly]
**lastClosePnl** | **String** | PNL of last position close |  [optional] [readonly]
**realisedPoint** | **String** | Realized POINT PNL |  [optional] [readonly]
**historyPoint** | **String** | History realized POINT PNL |  [optional] [readonly]
**adlRanking** | **Integer** | ADL ranking, range from 1 to 5 |  [optional] [readonly]
**pendingOrders** | **Integer** | Current open orders |  [optional] [readonly]
**closeOrder** | [**PositionCloseOrder**](PositionCloseOrder.md) |  |  [optional]

