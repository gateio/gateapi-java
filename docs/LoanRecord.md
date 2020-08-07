
# LoanRecord

Margin loaned record details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Loan record ID |  [optional]
**loanId** | **String** | Loan ID the record belongs to |  [optional]
**createTime** | **String** | Loan time |  [optional]
**expireTime** | **String** | Expiration time |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Loan record status |  [optional]
**borrowUserId** | **String** | Garbled user ID |  [optional]
**currency** | **String** | Loan currency |  [optional]
**rate** | **String** | Loan rate |  [optional]
**amount** | **String** | Loan amount |  [optional]
**days** | **Integer** | Loan days |  [optional]
**autoRenew** | **Boolean** | Whether the record will auto renew on expiration |  [optional]
**repaid** | **String** | Repaid amount |  [optional]
**paidInterest** | **String** | Repaid interest |  [optional] [readonly]
**unpaidInterest** | **String** | Interest not repaid |  [optional] [readonly]

## Enum: StatusEnum

Name | Value
---- | -----
LOANED | &quot;loaned&quot;
FINISHED | &quot;finished&quot;

