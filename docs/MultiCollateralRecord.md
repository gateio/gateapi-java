

# MultiCollateralRecord

Multi-Collateral adjustment record.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Long** | Order ID |  [optional]
**recordId** | **Long** | Collateral record ID |  [optional]
**beforeLtv** | **String** | The collateral ratio before adjustment |  [optional]
**afterLtv** | **String** | The collateral ratio before adjustment |  [optional]
**operateTime** | **Long** | Operation time, timestamp in seconds. |  [optional]
**borrowCurrencies** | [**List&lt;MultiCollateralRecordCurrency&gt;**](MultiCollateralRecordCurrency.md) | Borrowing Currency List |  [optional]
**collateralCurrencies** | [**List&lt;MultiCollateralRecordCurrency&gt;**](MultiCollateralRecordCurrency.md) | Collateral Currency List |  [optional]



