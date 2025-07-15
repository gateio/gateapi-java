
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
**maintenanceMargin** | **String** | The maintenance deposit occupied by the position is suitable for the new classic account margin model and unified account model |  [optional]
**bonus** | **String** | Perpetual Contract Bonus |  [optional]
**enableEvolvedClassic** | **Boolean** | Classic account margin mode, true-new mode, false-old mode |  [optional]
**crossOrderMargin** | **String** | Full -warehouse hanging order deposit, suitable for the new classic account margin model |  [optional]
**crossInitialMargin** | **String** | The initial security deposit of the full warehouse is suitable for the new classic account margin model |  [optional]
**crossMaintenanceMargin** | **String** | Maintain deposit in full warehouse, suitable for new classic account margin models |  [optional]
**crossUnrealisedPnl** | **String** | The full warehouse does not achieve profit and loss, suitable for the new classic account margin model |  [optional]
**crossAvailable** | **String** | Full warehouse available amount, suitable for the new classic account margin model |  [optional]
**crossMarginBalance** | **String** | Full margin balance, suitable for the new classic account margin model |  [optional]
**crossMmr** | **String** | Maintain margin ratio for the full position, suitable for the new classic account margin model |  [optional]
**crossImr** | **String** | The initial margin rate of the full position is suitable for the new classic account margin model |  [optional]
**isolatedPositionMargin** | **String** | Ware -position margin, suitable for the new classic account margin model |  [optional]
**enableNewDualMode** | **Boolean** | Whether to open a new two-way position mode |  [optional]
**marginMode** | **Integer** | Margin mode, 0-classic margin mode, 1-cross-currency margin mode, 2-combined margin mode |  [optional]
**enableTieredMm** | **Boolean** | Whether to enable tiered maintenance margin calculation |  [optional]
**history** | [**FuturesAccountHistory**](FuturesAccountHistory.md) |  |  [optional]

