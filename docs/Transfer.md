
# Transfer

Accounts available to transfer:  - `spot`: spot account - `margin`: margin account - `futures`: perpetual futures account - `delivery`: delivery futures account - `options`: options account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Transfer currency name. For contract accounts, &#x60;currency&#x60; can be set to &#x60;POINT&#x60; (points) or supported settlement currencies (e.g., &#x60;BTC&#x60;, &#x60;USDT&#x60;) | 
**from** | [**FromEnum**](#FromEnum) | Account to transfer from | 
**to** | [**ToEnum**](#ToEnum) | Account to transfer to | 
**amount** | **String** | Transfer amount | 
**currencyPair** | **String** | Margin trading pair. Required when transferring to or from margin account |  [optional]
**settle** | **String** | Contract settlement currency. Required when transferring to or from contract account |  [optional]

## Enum: FromEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;
FUTURES | &quot;futures&quot;
DELIVERY | &quot;delivery&quot;
OPTIONS | &quot;options&quot;

## Enum: ToEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;
FUTURES | &quot;futures&quot;
DELIVERY | &quot;delivery&quot;
OPTIONS | &quot;options&quot;

