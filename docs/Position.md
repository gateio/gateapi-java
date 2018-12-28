
# Position

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contract** | **String** | futures contract name |  [optional]
**size** | **Long** | position size |  [optional]
**leverage** | **String** | position leverage |  [optional]
**leverageMax** | **String** | maximum leverage of position |  [optional]
**value** | **String** | position value calculated in settlement currency |  [optional]
**margin** | **String** | position margin |  [optional]
**entryPrice** | **String** | entry price |  [optional]
**liqPrice** | **String** | liquidation price |  [optional]
**unrealisedPnl** | **String** | unrealised pnl |  [optional]
**realisedPnl** | **String** | realised pnl |  [optional]
**historyPnl** | **String** | history realised pnl |  [optional]
**locked** | **Boolean** | is position locked. e.g. position will be locked if failed to liquidate |  [optional]
**riskLimit** | **String** | position risk limit |  [optional]
**adlRanking** | **Integer** | AutoDeleverage ranking, from 1 to 5. Ranking larger than 5 is not considered |  [optional]
**closePrice** | **String** | close price of position in closing. 0 if position is not in closing |  [optional]
**closeOrderId** | **String** | close order id if position in closing |  [optional]
**lastClosePnl** | **String** | last closed pnl |  [optional]



