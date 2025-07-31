
# UnifiedAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID |  [optional]
**refreshTime** | **Long** | Last refresh time |  [optional]
**locked** | **Boolean** | Whether the account is locked, valid in cross-currency margin/combined margin mode, false in other modes such as single-currency margin mode |  [optional]
**balances** | [**Map&lt;String, UnifiedBalance&gt;**](UnifiedBalance.md) |  |  [optional]
**total** | **String** | Total account assets converted to USD, i.e. the sum of &#x60;(available + freeze) * price&#x60; in all currencies (deprecated, to be removed, replaced by unified_account_total) |  [optional]
**borrowed** | **String** | Total borrowed amount converted to USD, i.e. the sum of &#x60;borrowed * price&#x60; of all currencies (excluding point cards), valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**totalInitialMargin** | **String** | Total initial margin, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**totalMarginBalance** | **String** | Total margin balance, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**totalMaintenanceMargin** | **String** | Total maintenance margin is valid in cross-currency margin/combined margin mode, and is 0 in other modes such as single-currency margin mode |  [optional]
**totalInitialMarginRate** | **String** | Total initial margin rate, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**totalMaintenanceMarginRate** | **String** | Total maintenance margin rate, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**totalAvailableMargin** | **String** | Available margin amount, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**unifiedAccountTotal** | **String** | Total unified account assets, valid in single currency margin/cross-currency margin/combined margin mode |  [optional]
**unifiedAccountTotalLiab** | **String** | Total unified account borrowed amount, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**unifiedAccountTotalEquity** | **String** | Total unified account equity, valid in single currency margin/cross-currency margin/combined margin mode |  [optional]
**leverage** | **String** | Actual leverage ratio, valid in cross-currency margin/combined margin mode |  [optional] [readonly]
**spotOrderLoss** | **String** | Total pending order loss, in USDT, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**spotHedge** | **Boolean** | Spot hedging status: true - enabled, false - disabled |  [optional]
**useFunding** | **Boolean** | Whether to use Earn funds as margin |  [optional]
**isAllCollateral** | **Boolean** | Whether all currencies are used as margin: true - all currencies as margin, false - no |  [optional]

