

# RepayLoan

Repay
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Long** | Order ID | 
**repayAmount** | **String** | Repayment amount, it is mandatory when making partial repayments | 
**repaidAll** | **Boolean** | Repayment method, set to &#x60;true&#x60; for full repayment, and &#x60;false&#x60; for partial repayment; When set to false for partial repayment, the repay_amount parameter cannot be greater than the remaining amount to be repaid by the user.  | 



