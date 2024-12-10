
# MultiRepayRecord

Mult Repay Record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Long** | Order ID |  [optional]
**recordId** | **Long** | Repayment record ID |  [optional]
**initLtv** | **String** | The initial collateralization rate |  [optional]
**beforeLtv** | **String** | Ltv before the operation |  [optional]
**afterLtv** | **String** | Ltv after the operation |  [optional]
**borrowTime** | **Long** | Borrowing time, timestamp in seconds. |  [optional]
**repayTime** | **Long** | Repayment time, timestamp in seconds. |  [optional]
**borrowCurrencies** | [**List&lt;RepayRecordCurrency&gt;**](RepayRecordCurrency.md) | List of borrowing information |  [optional]
**collateralCurrencies** | [**List&lt;RepayRecordCurrency&gt;**](RepayRecordCurrency.md) | List of collateral information |  [optional]
**repaidCurrencies** | [**List&lt;RepayRecordRepaidCurrency&gt;**](RepayRecordRepaidCurrency.md) | Repay Currency List |  [optional]
**totalInterestList** | [**List&lt;RepayRecordTotalInterest&gt;**](RepayRecordTotalInterest.md) | Total Interest List |  [optional]
**leftRepayInterestList** | [**List&lt;RepayRecordLeftInterest&gt;**](RepayRecordLeftInterest.md) | List of left repay interest |  [optional]

