
# CreateMultiCollateralOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID. |  [optional]
**orderType** | **String** | current - current, fixed - fixed, if not specified, default to current. |  [optional]
**fixedType** | **String** | Fixed interest rate loan period: 7d - 7 days, 30d - 30 days. Must be provided for fixed |  [optional]
**fixedRate** | **String** | Fixed interest rate, must be specified for fixed. |  [optional]
**autoRenew** | **Boolean** | Fixed interest rate, automatic renewal. |  [optional]
**autoRepay** | **Boolean** | Fixed interest rate, automatic repayment. |  [optional]
**borrowCurrency** | **String** | Borrowed currency. | 
**borrowAmount** | **String** | Borrowing amount. | 
**collateralCurrencies** | [**List&lt;CollateralCurrency&gt;**](CollateralCurrency.md) | Collateral currency and amount. |  [optional]

