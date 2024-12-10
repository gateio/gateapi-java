
# CrossMarginAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID |  [optional]
**refreshTime** | **Long** | Time of the most recent refresh |  [optional]
**locked** | **Boolean** | Whether account is locked |  [optional]
**balances** | [**Map&lt;String, CrossMarginBalance&gt;**](CrossMarginBalance.md) |  |  [optional]
**total** | **String** | Total account value in USDT, i.e., the sum of all currencies&#39; &#x60;(available+freeze)*price*discount&#x60; |  [optional]
**borrowed** | **String** | Total borrowed value in USDT, i.e., the sum of all currencies&#39; &#x60;borrowed*price*discount&#x60; |  [optional]
**interest** | **String** | Total unpaid interests in USDT, i.e., the sum of all currencies&#39; &#x60;interest*price*discount&#x60; |  [optional]
**risk** | **String** | Risk rate. When it belows 110%, liquidation will be triggered. Calculation formula: &#x60;total / (borrowed+interest)&#x60; |  [optional]
**totalInitialMargin** | **String** | Total initial margin |  [optional]
**totalMarginBalance** | **String** | Total Margin Balance (∑(positive equity ＊ index price * discount) + ∑(negative equity * index price)) |  [optional]
**totalMaintenanceMargin** | **String** | Total maintenance margin |  [optional]
**totalInitialMarginRate** | **String** | Total initial margin rate |  [optional]
**totalMaintenanceMarginRate** | **String** | Total maintenance margin rate |  [optional]
**totalAvailableMargin** | **String** | Total available margin |  [optional]
**portfolioMarginTotal** | **String** | Total amount of the portfolio margin account |  [optional]
**portfolioMarginTotalLiab** | **String** | Total liabilities of the portfolio margin account |  [optional]
**portfolioMarginTotalEquity** | **String** | Total equity of the portfolio margin account |  [optional]

