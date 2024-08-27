
# FuturesAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **String** | total is the balance after the user&#39;s accumulated deposit, withdraw, profit and loss (including realized profit and loss, fund, fee and referral rebate), excluding unrealized profit and loss.  total &#x3D; SUM(history_dnw, history_pnl, history_fee, history_refr, history_fund) |  [optional]
**unrealisedPnl** | **String** | Unrealized PNL |  [optional]
**positionMargin** | **String** | Position margin |  [optional]
**orderMargin** | **String** | Order margin of unfinished orders |  [optional]
**available** | **String** | The available balance for transferring or trading(including bonus.  Bonus can&#39;t be be withdrawn. The transfer amount needs to deduct the bonus) |  [optional]
**point** | **String** | POINT amount |  [optional]
**currency** | **String** | Settle currency |  [optional]
**inDualMode** | **Boolean** | Whether dual mode is enabled |  [optional]
**enableCredit** | **Boolean** | Whether portfolio margin account mode is enabled |  [optional]
**positionInitialMargin** | **String** | Initial margin position, applicable to the portfolio margin account model |  [optional]
**maintenanceMargin** | **String** | Maintenance margin position, applicable to the portfolio margin account model |  [optional]
**bonus** | **String** | Perpetual Contract Bonus |  [optional]
**enableEvolvedClassic** | **Boolean** | Classic account margin mode, true - enable new mode, false - revert to old mode. |  [optional]
**history** | [**FuturesAccountHistory**](FuturesAccountHistory.md) |  |  [optional]

