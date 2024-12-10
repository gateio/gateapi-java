
# UnifiedLoan

Borrow or repay

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency | 
**type** | [**TypeEnum**](#TypeEnum) | type: borrow - borrow, repay - repay | 
**amount** | **String** | The amount of lending or repaying | 
**repaidAll** | **Boolean** | Full repayment is solely for repayment operations. When set to &#39;true,&#39; it overrides the &#39;amount,&#39; allowing for direct full repayment. |  [optional]
**text** | **String** | User defined custom ID |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
BORROW | &quot;borrow&quot;
REPAY | &quot;repay&quot;

