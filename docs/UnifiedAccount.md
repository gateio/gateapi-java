

# UnifiedAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID |  [optional]
**refreshTime** | **Long** | Time of the most recent refresh |  [optional]
**locked** | **Boolean** | Whether account is locked |  [optional]
**balances** | [**Map&lt;String, UnifiedBalance&gt;**](UnifiedBalance.md) |  |  [optional]
**total** | **String** | Total account assets converted to USD, i.e. the sum of &#x60;(available + freeze) * price&#x60;  in all currencies (deprecated, to be deprecated, replaced by unified_account_total) |  [optional]
**borrowed** | **String** | The total borrowed amount in USD, calculated as the sum of the product of &#x60;borrowed * price&#x60; for all currencies (excluding points cards). |  [optional]
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
**spotOrderLoss** | **String** | Total order loss, in USDT |  [optional]
**spotHedge** | **Boolean** | Spot hedging status, true - enabled, false - not enabled. |  [optional]
**useFunding** | **Boolean** | Whether to use funds as margin |  [optional]



