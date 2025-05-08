
# MarginAccount

Margin account detail. `base` refers to base currency, while `quotes to quote currency

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPair** | **String** | Currency pair |  [optional]
**accountType** | **String** | Account type, risk - risk rate account, mmr - maintenance margin rate account, inactive - market not activated |  [optional]
**leverage** | **String** | User current market leverage multiple |  [optional]
**locked** | **Boolean** | Whether account is locked |  [optional]
**risk** | **String** | Leveraged Account Current Risk Rate (Returned when the Account is a Risk Rate Account) |  [optional]
**mmr** | **String** | Leveraged Account Current Maintenance Margin Rate (returned when the Account is a Maintenance Margin Rate Account) |  [optional]
**base** | [**MarginAccountCurrency**](MarginAccountCurrency.md) |  |  [optional]
**quote** | [**MarginAccountCurrency**](MarginAccountCurrency.md) |  |  [optional]

