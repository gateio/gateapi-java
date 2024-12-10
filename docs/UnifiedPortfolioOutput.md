
# UnifiedPortfolioOutput

The output of the portfolio margin calculator.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maintainMarginTotal** | **String** | Total maintenance margin, including only the portfolio margin calculation results for positions in the risk unit,  excluding borrowed margin. If borrowing exists, conventional borrowing margin requirements will still apply. |  [optional]
**initialMarginTotal** | **String** | Total initial margin, calculated as the maximum of the following three combinations: position,  position + positive delta orders, position + negative delta orders. |  [optional]
**calculateTime** | **Long** | Calculate time |  [optional]
**riskUnit** | [**List&lt;MockRiskUnit&gt;**](MockRiskUnit.md) | Risk unit |  [optional]

