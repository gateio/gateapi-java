
# CrossMarginLoan

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Loan record ID |  [optional] [readonly]
**createTime** | **Long** | Creation timestamp, in milliseconds |  [optional] [readonly]
**updateTime** | **Long** | Update timestamp, in milliseconds |  [optional] [readonly]
**currency** | **String** | Currency name | 
**amount** | **String** | Borrowed amount | 
**text** | **String** | User defined custom ID |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Borrow loan status, which includes:  - 1: failed to borrow - 2: borrowed but not repaid - 3: repayment complete |  [optional] [readonly]
**repaid** | **String** | Repaid amount |  [optional] [readonly]
**repaidInterest** | **String** | Repaid interest |  [optional] [readonly]
**unpaidInterest** | **String** | Outstanding interest yet to be paid |  [optional] [readonly]

## Enum: StatusEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

