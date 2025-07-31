
# CreateMultiCollateralOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID |  [optional]
**orderType** | **String** | current - current rate, fixed - fixed rate, defaults to current if not specified |  [optional]
**fixedType** | **String** | Fixed interest rate lending period: 7d - 7 days, 30d - 30 days. Required for fixed rate |  [optional]
**fixedRate** | **String** | Fixed interest rate, required for fixed rate |  [optional]
**autoRenew** | **Boolean** | Fixed interest rate, auto-renewal |  [optional]
**autoRepay** | **Boolean** | Fixed interest rate, auto-repayment |  [optional]
**borrowCurrency** | **String** | Borrowed currency | 
**borrowAmount** | **String** | Borrowed amount | 
**collateralCurrencies** | [**List&lt;CollateralCurrency&gt;**](CollateralCurrency.md) | Collateral currency and amount |  [optional]

