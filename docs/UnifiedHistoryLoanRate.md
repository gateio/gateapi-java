
# UnifiedHistoryLoanRate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency name |  [optional]
**tier** | **String** | VIP level for the floating rate to be retrieved |  [optional]
**tierUpRate** | **String** | Floating rate corresponding to VIP level |  [optional]
**rates** | [**List&lt;UnifiedHistoryLoanRateRates&gt;**](UnifiedHistoryLoanRateRates.md) | Historical interest rate information, one data point per hour, array size determined by page and limit parameters from the API request, sorted by time from recent to distant |  [optional]

