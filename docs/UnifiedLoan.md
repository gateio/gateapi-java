
# UnifiedLoan

Borrow or repay

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency | 
**type** | [**TypeEnum**](#TypeEnum) | Type: &#x60;borrow&#x60; - borrow, &#x60;repay&#x60; - repay | 
**amount** | **String** | Borrow or repayment amount | 
**repaidAll** | **Boolean** | Full repayment, only used for repayment operations. When set to &#x60;true&#x60;, overrides &#x60;amount&#x60; and directly repays the full amount |  [optional]
**text** | **String** | User defined custom ID |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
BORROW | &quot;borrow&quot;
REPAY | &quot;repay&quot;

