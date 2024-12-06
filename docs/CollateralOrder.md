

# CollateralOrder

Collateral Order
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Long** | Order ID |  [optional]
**collateralCurrency** | **String** | Collateral |  [optional]
**collateralAmount** | **String** | Collateral amount |  [optional]
**borrowCurrency** | **String** | Borrowed currency |  [optional]
**borrowAmount** | **String** | Borrowing amount |  [optional]
**repaidAmount** | **String** | Repaid amount |  [optional]
**repaidPrincipal** | **String** | Repaid principal |  [optional]
**repaidInterest** | **String** | Repaid interest |  [optional]
**initLtv** | **String** | The initial collateralization rate |  [optional]
**currentLtv** | **String** | The current collateralization rate |  [optional]
**liquidateLtv** | **String** | The liquidation collateralization rate |  [optional]
**status** | **String** | Order status: - initial: Initial state after placing the order - collateral_deducted: Collateral deduction successful - collateral_returning: Loan failed - Collateral return pending - lent: Loan successful - repaying: Repayment in progress - liquidating: Liquidation in progress - finished: Order completed - closed_liquidated: Liquidation and repayment completed |  [optional]
**borrowTime** | **Long** | Borrowing time, timestamp in seconds |  [optional]
**leftRepayTotal** | **String** | Outstanding principal and interest (outstanding principal + outstanding interest) |  [optional]
**leftRepayPrincipal** | **String** | outstanding principal |  [optional]
**leftRepayInterest** | **String** | outstanding interest |  [optional]



