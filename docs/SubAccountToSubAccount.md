
# SubAccountToSubAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Transfer currency name | 
**subAccountType** | **String** | Transfer from the account. (deprecate, use &#x60;sub_account_from_type&#x60; and &#x60;sub_account_to_type&#x60; instead) |  [optional]
**subAccountFrom** | **String** | Transfer from the user id of the sub-account | 
**subAccountFromType** | [**SubAccountFromTypeEnum**](#SubAccountFromTypeEnum) | Transfer from the account.  &#x60;spot&#x60; - spot account, &#x60;futures&#x60; - perpetual contract account, &#x60;cross_margin&#x60; - cross margin account | 
**subAccountTo** | **String** | Transfer to the user id of the sub-account | 
**subAccountToType** | [**SubAccountToTypeEnum**](#SubAccountToTypeEnum) | Transfer to the account.  &#x60;spot&#x60; - spot account, &#x60;futures&#x60; - perpetual contract account, &#x60;cross_margin&#x60; - cross margin account | 
**amount** | **String** | Transfer amount | 

## Enum: SubAccountFromTypeEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
FUTURES | &quot;futures&quot;
CROSS_MARGIN | &quot;cross_margin&quot;

## Enum: SubAccountToTypeEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
FUTURES | &quot;futures&quot;
CROSS_MARGIN | &quot;cross_margin&quot;

