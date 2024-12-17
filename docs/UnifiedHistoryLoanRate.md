
# UnifiedHistoryLoanRate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency name |  [optional]
**tier** | **String** | The VIP level of the floating rate required |  [optional]
**tierUpRate** | **String** | VIP level corresponding floating rate |  [optional]
**rates** | [**List&lt;UnifiedHistoryLoanRateRates&gt;**](UnifiedHistoryLoanRateRates.md) | Historical interest rate information, one data per hour, the array size is determined by the page and limit parameters provided by the interface request parameters, sorted from recent to far in time |  [optional]

