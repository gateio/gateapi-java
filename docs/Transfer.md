
# Transfer

Accounts available to transfer:  - `spot`: spot account - `margin`: margin account - `futures`: perpetual futures account - `delivery`: delivery futures account - `cross_margin`: cross margin account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Transfer currency. For futures account, &#x60;currency&#x60; can be set to &#x60;POINT&#x60; or settle currency | 
**from** | [**FromEnum**](#FromEnum) | Account to transfer from | 
**to** | [**ToEnum**](#ToEnum) | Account to transfer to | 
**amount** | **String** | Transfer amount | 
**currencyPair** | **String** | Margin currency pair. Required if transfer from or to margin account |  [optional]
**settle** | **String** | Futures settle currency. Required if &#x60;currency&#x60; is &#x60;POINT&#x60; |  [optional]

## Enum: FromEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;
FUTURES | &quot;futures&quot;
DELIVERY | &quot;delivery&quot;
CROSS_MARGIN | &quot;cross_margin&quot;

## Enum: ToEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;
FUTURES | &quot;futures&quot;
DELIVERY | &quot;delivery&quot;
CROSS_MARGIN | &quot;cross_margin&quot;

