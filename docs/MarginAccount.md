
# MarginAccount

Margin account information for a trading pair. `base` corresponds to base currency account information, `quote` corresponds to quote currency account information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPair** | **String** | Currency pair |  [optional]
**accountType** | **String** | Account type: risk - risk rate account, mmr - maintenance margin rate account, inactive - market not activated |  [optional]
**leverage** | **String** | User&#39;s current market leverage multiplier |  [optional]
**locked** | **Boolean** | Whether the account is locked |  [optional]
**risk** | **String** | Current risk rate of the margin account (returned when the account is a risk rate account) |  [optional]
**mmr** | **String** | Leveraged Account Current Maintenance Margin Rate (returned when the Account is Account) |  [optional]
**base** | [**MarginAccountCurrency**](MarginAccountCurrency.md) |  |  [optional]
**quote** | [**MarginAccountCurrency**](MarginAccountCurrency.md) |  |  [optional]

