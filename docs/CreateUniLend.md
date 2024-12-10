
# CreateUniLend

Lend or redeem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency name | 
**amount** | **String** | The amount of currency could be lent | 
**type** | [**TypeEnum**](#TypeEnum) | type: lend - lend, redeem - redeem | 
**minRate** | **String** | The minimum interest rate. If the value is too high, it might lead to the unsuccessful lending and no profit will be gained for that hour.  |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
LEND | &quot;lend&quot;
REDEEM | &quot;redeem&quot;

