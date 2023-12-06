
# UnifiedAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID |  [optional]
**refreshTime** | **Long** | Time of the most recent refresh |  [optional]
**locked** | **Boolean** | Whether account is locked |  [optional]
**balances** | [**Map&lt;String, UnifiedBalance&gt;**](UnifiedBalance.md) |  |  [optional]
**total** | **String** | The total asset value in USDT. Sum of &#x60;(available + freeze) * price&#x60; |  [optional]
**borrowed** | **String** | The total borrowed amount in USDT equivalent. Sum of &#x60;borrowed * price&#x60;  |  [optional]
**totalInitialMargin** | **String** | Total initial margin |  [optional]
**totalMarginBalance** | **String** | Total margin balance |  [optional]
**totalMaintenanceMargin** | **String** | Total maintenance margin |  [optional]
**totalInitialMarginRate** | **String** | Total initial margin rate |  [optional]
**totalMaintenanceMarginRate** | **String** | Total maintenance margin rate |  [optional]
**totalAvailableMargin** | **String** | Total available margin |  [optional]
**unifiedAccountTotal** | **String** | Total amount of the portfolio margin account |  [optional]
**unifiedAccountTotalLiab** | **String** | Total liabilities of the portfolio margin account |  [optional]
**unifiedAccountTotalEquity** | **String** | Total equity of the portfolio margin account |  [optional]
**leverage** | **String** | Leverage |  [optional] [readonly]

