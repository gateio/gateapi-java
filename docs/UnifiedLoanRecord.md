
# UnifiedLoanRecord

Loan records

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID |  [optional] [readonly]
**type** | **String** | type: borrow - borrow, repay - repay |  [optional] [readonly]
**repaymentType** | **String** | Repayment type, none - No repayment type, manual_repay - Manual repayment, auto_repay - Automatic repayment, cancel_auto_repay - Automatic repayment after withdrawal, different_currencies_repayment - Different currency repayment |  [optional] [readonly]
**borrowType** | **String** | Loan type, returned when querying loan records. manual_borrow - Manual repayment , auto_borrow - Automatic repayment |  [optional]
**currencyPair** | **String** | Currency pair |  [optional] [readonly]
**currency** | **String** | Currency |  [optional] [readonly]
**amount** | **String** | The amount of lending or repaying |  [optional] [readonly]
**createTime** | **Long** | Created time |  [optional] [readonly]

