
# CrossMarginAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID |  [optional]
**locked** | **Boolean** | Whether account is locked |  [optional]
**balances** | [**Map&lt;String, CrossMarginBalance&gt;**](CrossMarginBalance.md) |  |  [optional]
**total** | **String** | Total account value in USDT, i.e., the sum of all currencies&#39; &#x60;(available+freeze)*price*discount&#x60; |  [optional]
**borrowed** | **String** | Total borrowed value in USDT, i.e., the sum of all currencies&#39; &#x60;borrowed*price*discount&#x60; |  [optional]
**interest** | **String** | Total unpaid interests in USDT, i.e., the sum of all currencies&#39; &#x60;interest*price*discount&#x60; |  [optional]
**risk** | **String** | Risk rate. When it belows 110%, liquidation will be triggered. Calculation formula: &#x60;total / (borrowed+interest)&#x60; |  [optional]

