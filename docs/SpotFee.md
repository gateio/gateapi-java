
# SpotFee

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID. |  [optional]
**takerFee** | **String** | taker fee rate. |  [optional]
**makerFee** | **String** | maker fee rate. |  [optional]
**gtDiscount** | **Boolean** | If GT deduction is enabled. |  [optional]
**gtTakerFee** | **String** | Taker fee rate if using GT deduction. It will be 0 if GT deduction is disabled |  [optional]
**gtMakerFee** | **String** | Maker fee rate if using GT deduction. It will be 0 if GT deduction is disabled |  [optional]
**loanFee** | **String** | Loan fee rate of margin lending. |  [optional]
**pointType** | **String** | Point type. 0 - Initial version. 1 - new version since 202009. |  [optional]
**currencyPair** | **String** | Currency pair. |  [optional]
**debitFee** | **Integer** | Deduction types for rates, 1 - GT deduction, 2 - Point card deduction, 3 - VIP rates |  [optional]

