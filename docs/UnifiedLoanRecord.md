
# UnifiedLoanRecord

Borrowing Records

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID |  [optional] [readonly]
**type** | **String** | Type: &#x60;borrow&#x60; - borrow, &#x60;repay&#x60; - repay |  [optional] [readonly]
**repaymentType** | **String** | Repayment type: none - No repayment type, manual_repay - Manual repayment, auto_repay - Automatic repayment, cancel_auto_repay - Automatic repayment after order cancellation, different_currencies_repayment - Cross-currency repayment |  [optional] [readonly]
**borrowType** | **String** | Borrowing type, returned when querying loan records: manual_borrow - Manual borrowing, auto_borrow - Automatic borrowing |  [optional]
**currencyPair** | **String** | Currency pair |  [optional] [readonly]
**currency** | **String** | Currency |  [optional] [readonly]
**amount** | **String** | Borrow or repayment amount |  [optional] [readonly]
**createTime** | **Long** | Created time |  [optional] [readonly]

