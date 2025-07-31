
# UnifiedPortfolioOutput

Portfolio margin calculator output

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maintainMarginTotal** | **String** | Total maintenance margin, including only portfolio margin calculation results for positions in risk units, excluding borrowing margin. If borrowing exists, conventional borrowing margin requirements will still apply |  [optional]
**initialMarginTotal** | **String** | Total initial margin, calculated as the maximum of the following three combinations: position, position + positive delta orders, position + negative delta orders |  [optional]
**calculateTime** | **Long** | Calculation time |  [optional]
**riskUnit** | [**List&lt;MockRiskUnit&gt;**](MockRiskUnit.md) | Risk unit |  [optional]

