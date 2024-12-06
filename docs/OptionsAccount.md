

# OptionsAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | **Long** | User ID |  [optional]
**total** | **String** | 账户余额 |  [optional]
**positionValue** | **String** | 仓位价值，做多仓位价值为正，做空仓位价值为负 |  [optional]
**equity** | **String** | 账户权益，账户余额与仓位价值的和 |  [optional]
**shortEnabled** | **Boolean** | If the account is allowed to short |  [optional]
**mmpEnabled** | **Boolean** | 是否启用MMP |  [optional]
**liqTriggered** | **Boolean** | 是否触发仓位强平 |  [optional]
**marginMode** | [**MarginModeEnum**](#MarginModeEnum) | ｜ 保证金模式： - 0：经典现货保证金模式 - 1：跨币种保证金模式 - 2：组合保证金模式 |  [optional]
**unrealisedPnl** | **String** | Unrealized PNL |  [optional]
**initMargin** | **String** | Initial position margin |  [optional]
**maintMargin** | **String** | Position maintenance margin |  [optional]
**orderMargin** | **String** | Order margin of unfinished orders |  [optional]
**askOrderMargin** | **String** | 未完成卖单的保证金 |  [optional]
**bidOrderMargin** | **String** | 未完成买单的保证金 |  [optional]
**available** | **String** | Available balance to transfer out or trade |  [optional]
**point** | **String** | POINT amount |  [optional]
**currency** | **String** | Settle currency |  [optional]
**ordersLimit** | **Integer** | 未完成订单数量上限 |  [optional]
**positionNotionalLimit** | **Long** | 名义价值上限，包含仓位以及未完成订单的名义价值 |  [optional]



## Enum: MarginModeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2



