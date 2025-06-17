
# SubCrossMarginAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID of the cross margin account. 0 means that the subaccount has not yet opened a cross margin account |  [optional]
**locked** | **Boolean** | Whether account is locked |  [optional]
**balances** | [**Map&lt;String, CrossMarginBalance&gt;**](CrossMarginBalance.md) |  |  [optional]
**total** | **String** | Total account value in USDT, i.e., the sum of all currencies&#39; &#x60;(available+freeze)*price*discount&#x60; |  [optional]
**borrowed** | **String** | Total borrowed value in USDT, i.e., the sum of all currencies&#39; &#x60;borrowed*price*discount&#x60; |  [optional]
**borrowedNet** | **String** | Total borrowed value in USDT * borrowed factor |  [optional]
**net** | **String** | Total net assets in USDT |  [optional]
**leverage** | **String** | Position leverage |  [optional]
**interest** | **String** | Total unpaid interests in USDT, i.e., the sum of all currencies&#39; &#x60;interest*price*discount&#x60; |  [optional]
**risk** | **String** | Risk rate. When it belows 110%, liquidation will be triggered. Calculation formula: &#x60;total / (borrowed+interest)&#x60; |  [optional]
**totalInitialMargin** | **String** | Total initial margin |  [optional]
**totalMarginBalance** | **String** | Total margin balance |  [optional]
**totalMaintenanceMargin** | **String** | Total maintenance margin |  [optional]
**totalInitialMarginRate** | **String** | Total initial margin rate |  [optional]
**totalMaintenanceMarginRate** | **String** | Total maintenance margin rate |  [optional]
**totalAvailableMargin** | **String** | Total available margin |  [optional]

