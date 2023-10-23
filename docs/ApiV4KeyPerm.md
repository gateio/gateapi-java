
# ApiV4KeyPerm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**NameEnum**](#NameEnum) | Permission name (all permissions will be removed if no value is passed)  - wallet: wallet - spot: spot/margin - futures: perpetual contract - delivery: delivery - earn: earn - options: options- account: Account - portfolio: Portfolio - loan: Loan |  [optional]
**readOnly** | **Boolean** | read only |  [optional]

## Enum: NameEnum

Name | Value
---- | -----
WALLET | &quot;wallet&quot;
SPOT | &quot;spot&quot;
FUTURES | &quot;futures&quot;
DELIVERY | &quot;delivery&quot;
EARN | &quot;earn&quot;
OPTIONS | &quot;options&quot;
ACCOUNT | &quot;account&quot;
PORTFOLIO | &quot;portfolio&quot;
LOAN | &quot;loan&quot;

