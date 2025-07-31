
# FuturesAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **String** | total is the balance after the user&#39;s accumulated deposit, withdraw, profit and loss (including realized profit and loss, fund, fee and referral rebate), excluding unrealized profit and loss.  total &#x3D; SUM(history_dnw, history_pnl, history_fee, history_refr, history_fund) |  [optional]
**unrealisedPnl** | **String** | Unrealized PNL |  [optional]
**positionMargin** | **String** | Position margin |  [optional]
**orderMargin** | **String** | Order margin of unfinished orders |  [optional]
**available** | **String** | Available balance for transferring or trading (including bonus. Bonus cannot be withdrawn, so transfer amount needs to deduct bonus) |  [optional]
**point** | **String** | Point card amount |  [optional]
**currency** | **String** | Settlement currency |  [optional]
**inDualMode** | **Boolean** | Whether dual mode is enabled |  [optional]
**enableCredit** | **Boolean** | Whether portfolio margin account mode is enabled |  [optional]
**positionInitialMargin** | **String** | Initial margin occupied by positions, applicable to unified account mode |  [optional]
**maintenanceMargin** | **String** | Maintenance margin occupied by positions, applicable to new classic account margin mode and unified account mode |  [optional]
**bonus** | **String** | Bonus |  [optional]
**enableEvolvedClassic** | **Boolean** | Classic account margin mode, true-new mode, false-old mode |  [optional]
**crossOrderMargin** | **String** | Cross margin order margin, applicable to new classic account margin mode |  [optional]
**crossInitialMargin** | **String** | Cross margin initial margin, applicable to new classic account margin mode |  [optional]
**crossMaintenanceMargin** | **String** | Cross margin maintenance margin, applicable to new classic account margin mode |  [optional]
**crossUnrealisedPnl** | **String** | Cross margin unrealized P&amp;L, applicable to new classic account margin mode |  [optional]
**crossAvailable** | **String** | Cross margin available balance, applicable to new classic account margin mode |  [optional]
**crossMarginBalance** | **String** | Cross margin balance, applicable to new classic account margin mode |  [optional]
**crossMmr** | **String** | Cross margin maintenance margin rate, applicable to new classic account margin mode |  [optional]
**crossImr** | **String** | Cross margin initial margin rate, applicable to new classic account margin mode |  [optional]
**isolatedPositionMargin** | **String** | Isolated position margin, applicable to new classic account margin mode |  [optional]
**enableNewDualMode** | **Boolean** | Whether to open a new two-way position mode |  [optional]
**marginMode** | **Integer** | Margin mode, 0-classic margin mode, 1-cross-currency margin mode, 2-combined margin mode |  [optional]
**enableTieredMm** | **Boolean** | Whether to enable tiered maintenance margin calculation |  [optional]
**history** | [**FuturesAccountHistory**](FuturesAccountHistory.md) |  |  [optional]

