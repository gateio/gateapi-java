
# Transfer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Transfer currency. For futures account, &#x60;currency&#x60; can be set to &#x60;POINT&#x60; or settle currency | 
**from** | [**FromEnum**](#FromEnum) | Account transferred from. &#x60;spot&#x60; - spot account. &#x60;margin&#x60; - margin account, &#x60;futures&#x60; - futures account | 
**to** | [**ToEnum**](#ToEnum) | Account transferred to. &#x60;spot&#x60; - spot account. &#x60;margin&#x60; - margin account, &#x60;futures&#x60; - futures account | 
**amount** | **String** | Transfer amount | 
**currencyPair** | **String** | Margin currency pair. Required if transfer from or to margin account |  [optional]
**settle** | **String** | Futures settle currency. Required if &#x60;currency&#x60; is &#x60;POINT&#x60; |  [optional]


<a name="FromEnum"></a>
## Enum: FromEnum
Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;
FUTURES | &quot;futures&quot;


<a name="ToEnum"></a>
## Enum: ToEnum
Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;
FUTURES | &quot;futures&quot;



