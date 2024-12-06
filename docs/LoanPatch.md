

# LoanPatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Loan currency | 
**side** | [**SideEnum**](#SideEnum) | Loan side. Possible values are &#x60;lend&#x60; and &#x60;borrow&#x60;. For &#x60;LoanRecord&#x60; patching, only &#x60;lend&#x60; is supported | 
**autoRenew** | **Boolean** | Auto renew | 
**currencyPair** | **String** | Currency pair. Required if borrowing |  [optional]
**loanId** | **String** | Loan ID. Required for &#x60;LoanRecord&#x60; patching |  [optional]



## Enum: SideEnum

Name | Value
---- | -----
LEND | &quot;lend&quot;
BORROW | &quot;borrow&quot;



