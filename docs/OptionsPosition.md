
# OptionsPosition

Options contract position details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | **Integer** | User ID |  [optional] [readonly]
**underlying** | **String** | Underlying |  [optional] [readonly]
**underlyingPrice** | **String** | Underlying price (quote currency) |  [optional] [readonly]
**contract** | **String** | Options contract name |  [optional] [readonly]
**size** | **Long** | Position size (contract quantity) |  [optional] [readonly]
**entryPrice** | **String** | Entry size (quote currency) |  [optional] [readonly]
**markPrice** | **String** | Current mark price (quote currency) |  [optional] [readonly]
**markIv** | **String** | Implied volatility |  [optional] [readonly]
**realisedPnl** | **String** | Realized PnL |  [optional] [readonly]
**unrealisedPnl** | **String** | Unrealized PNL |  [optional] [readonly]
**pendingOrders** | **Integer** | Current pending order quantity |  [optional] [readonly]
**closeOrder** | [**OptionsPositionCloseOrder**](OptionsPositionCloseOrder.md) |  |  [optional]
**delta** | **String** | Greek letter delta |  [optional] [readonly]
**gamma** | **String** | Greek letter gamma |  [optional] [readonly]
**vega** | **String** | Greek letter vega |  [optional] [readonly]
**theta** | **String** | Greek letter theta |  [optional] [readonly]

