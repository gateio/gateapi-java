
# TradeFee

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID |  [optional]
**takerFee** | **String** | taker fee rate |  [optional]
**makerFee** | **String** | maker fee rate |  [optional]
**gtDiscount** | **Boolean** | Whether GT deduction discount is enabled |  [optional]
**gtTakerFee** | **String** | Taker fee rate if using GT deduction. It will be 0 if GT deduction is disabled |  [optional]
**gtMakerFee** | **String** | Maker fee rate with GT deduction. Returns 0 if GT deduction is disabled |  [optional]
**loanFee** | **String** | Loan fee rate of margin lending |  [optional]
**pointType** | **String** | Point card type: 0 - Original version, 1 - New version since 202009 |  [optional]
**futuresTakerFee** | **String** | Perpetual contract taker fee rate |  [optional]
**futuresMakerFee** | **String** | Perpetual contract maker fee rate |  [optional]
**deliveryTakerFee** | **String** | Delivery contract taker fee rate |  [optional]
**deliveryMakerFee** | **String** | Delivery contract maker fee rate |  [optional]
**debitFee** | **Integer** | Deduction types for rates, 1 - GT deduction, 2 - Point card deduction, 3 - VIP rates |  [optional]

