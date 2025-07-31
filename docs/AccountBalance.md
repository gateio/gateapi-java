
# AccountBalance

Total balances calculated with specified currency unit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** | Account total balance amount |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency |  [optional]
**unrealisedPnl** | **String** | Unrealised_pnl, this field will only appear in futures, options, delivery, and total accounts |  [optional]
**borrowed** | **String** | Total borrowed amount, this field will only appear in margin and cross_margin accounts |  [optional]

## Enum: CurrencyEnum

Name | Value
---- | -----
BTC | &quot;BTC&quot;
CNY | &quot;CNY&quot;
USD | &quot;USD&quot;
USDT | &quot;USDT&quot;

