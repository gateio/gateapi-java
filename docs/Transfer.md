
# Transfer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Transfer currency name | 
**from** | [**FromEnum**](#FromEnum) | Account transferred from. &#x60;spot&#x60; - spot account. &#x60;margin&#x60; - margin account | 
**to** | [**ToEnum**](#ToEnum) | Account transferred to. &#x60;spot&#x60; - spot account. &#x60;margin&#x60; - margin account | 
**amount** | **String** | Transfer amount | 
**currencyPair** | **String** | Required if transfer from or to margin account | 


<a name="FromEnum"></a>
## Enum: FromEnum
Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;


<a name="ToEnum"></a>
## Enum: ToEnum
Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;



