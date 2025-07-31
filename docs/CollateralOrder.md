
# CollateralOrder

Collateral order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Long** | Order ID |  [optional]
**collateralCurrency** | **String** | Collateral currency |  [optional]
**collateralAmount** | **String** | Collateral amount |  [optional]
**borrowCurrency** | **String** | Borrowed currency |  [optional]
**borrowAmount** | **String** | Borrowed amount |  [optional]
**repaidAmount** | **String** | Repaid amount |  [optional]
**repaidPrincipal** | **String** | Repaid principal |  [optional]
**repaidInterest** | **String** | Repaid interest |  [optional]
**initLtv** | **String** | Initial collateralization rate |  [optional]
**currentLtv** | **String** | Current collateralization rate |  [optional]
**liquidateLtv** | **String** | Liquidation collateralization rate |  [optional]
**status** | **String** | Order status: - initial: Initial state after placing the order - collateral_deducted: Collateral deduction successful - collateral_returning: Loan failed - Collateral return pending - lent: Loan successful - repaying: Repayment in progress - liquidating: Liquidation in progress - finished: Order completed - closed_liquidated: Liquidation and repayment completed |  [optional]
**borrowTime** | **Long** | Borrowing time, timestamp in seconds |  [optional]
**leftRepayTotal** | **String** | Outstanding principal and interest (outstanding principal + outstanding interest) |  [optional]
**leftRepayPrincipal** | **String** | Outstanding principal |  [optional]
**leftRepayInterest** | **String** | Outstanding interest |  [optional]

