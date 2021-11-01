
# SpotPriceTriggeredOrder

Spot order detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trigger** | [**SpotPriceTrigger**](SpotPriceTrigger.md) |  | 
**put** | [**SpotPricePutOrder**](SpotPricePutOrder.md) |  | 
**id** | **Long** | Auto order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**market** | **String** | Currency pair | 
**ctime** | **Long** | Creation time |  [optional] [readonly]
**ftime** | **Long** | Finished time |  [optional] [readonly]
**firedOrderId** | **Long** | ID of the newly created order on condition triggered |  [optional] [readonly]
**status** | **String** | Status  - open: open - cancelled: being manually cancelled - finish: successfully executed - failed: failed to execute - expired - expired  |  [optional] [readonly]
**reason** | **String** | Additional remarks on how the order was finished |  [optional] [readonly]

