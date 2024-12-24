
# CreateUniLoan

Borrow or repay

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency | 
**type** | [**TypeEnum**](#TypeEnum) | type: borrow - borrow, repay - repay | 
**amount** | **String** | The amount of lending or repaying | 
**repaidAll** | **Boolean** | Full repayment.  Repay operation only.  If the value is &#x60;true&#x60;, the amount will be ignored and the loan will be repaid in full. |  [optional]
**currencyPair** | **String** | Currency pair | 

## Enum: TypeEnum

Name | Value
---- | -----
BORROW | &quot;borrow&quot;
REPAY | &quot;repay&quot;

