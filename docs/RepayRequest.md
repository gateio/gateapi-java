
# RepayRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPair** | **String** | Currency pair | 
**currency** | **String** | Loan currency | 
**mode** | [**ModeEnum**](#ModeEnum) | Repay mode. all - repay all; partial - repay only some portion | 
**amount** | **String** | Repay amount. Required in &#x60;partial&#x60; mode |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
PARTIAL | &quot;partial&quot;



