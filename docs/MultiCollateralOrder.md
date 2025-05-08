
# MultiCollateralOrder

Multi-Collateral Order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID |  [optional]
**orderType** | **String** | current - current, fixed - fixed |  [optional]
**fixedType** | **String** | Fixed interest rate loan periods: 7d - 7 days, 30d - 30 days. |  [optional]
**fixedRate** | **String** | Fixed interest rate |  [optional]
**expireTime** | **Long** | Expiration time, timestamp, unit in seconds. |  [optional]
**autoRenew** | **Boolean** | Fixed interest rate, automatic renewal |  [optional]
**autoRepay** | **Boolean** | Fixed interest rate, automatic repayment |  [optional]
**currentLtv** | **String** | The current collateralization rate |  [optional]
**status** | **String** | Order status: - initial: Initial state after placing the order - collateral_deducted: Collateral deduction successful - collateral_returning: Loan failed - Collateral return pending - lent: Loan successful - repaying: Repayment in progress - liquidating: Liquidation in progress - finished: Order completed - closed_liquidated: Liquidation and repayment completed |  [optional]
**borrowTime** | **Long** | Borrowing time, timestamp in seconds |  [optional]
**totalLeftRepayUsdt** | **String** | Value of Left repay amount converted in USDT |  [optional]
**totalLeftCollateralUsdt** | **String** | Value of Collateral amount in USDT |  [optional]
**borrowCurrencies** | [**List&lt;BorrowCurrencyInfo&gt;**](BorrowCurrencyInfo.md) | Borrowing Currency List |  [optional]
**collateralCurrencies** | [**List&lt;CollateralCurrencyInfo&gt;**](CollateralCurrencyInfo.md) | Collateral Currency List |  [optional]

