
# CreateUniLend

Create lending or redemption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency name | 
**amount** | **String** | Amount to deposit into lending pool | 
**type** | [**TypeEnum**](#TypeEnum) | Operation type: lend - Lend, redeem - Redeem | 
**minRate** | **String** | Minimum interest rate. If set too high, lending may fail and no interest will be earned. Required for lending operations.  |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
LEND | &quot;lend&quot;
REDEEM | &quot;redeem&quot;

