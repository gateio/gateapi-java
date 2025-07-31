
# CreateUniLoan

Borrow or repay

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency | 
**type** | [**TypeEnum**](#TypeEnum) | Type: &#x60;borrow&#x60; - borrow, &#x60;repay&#x60; - repay | 
**amount** | **String** | Borrow or repayment amount | 
**repaidAll** | **Boolean** | Full repayment. For repayment operations only. When &#x60;true&#x60;, overrides &#x60;amount&#x60; and repays the full amount |  [optional]
**currencyPair** | **String** | Currency pair | 

## Enum: TypeEnum

Name | Value
---- | -----
BORROW | &quot;borrow&quot;
REPAY | &quot;repay&quot;

