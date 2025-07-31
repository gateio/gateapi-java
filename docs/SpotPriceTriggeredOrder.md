
# SpotPriceTriggeredOrder

Spot price order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trigger** | [**SpotPriceTrigger**](SpotPriceTrigger.md) |  | 
**put** | [**SpotPricePutOrder**](SpotPricePutOrder.md) |  | 
**id** | **Long** | Auto order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**market** | **String** | Market | 
**ctime** | **Long** | Created time |  [optional] [readonly]
**ftime** | **Long** | End time |  [optional] [readonly]
**firedOrderId** | **Long** | ID of the order created after trigger |  [optional] [readonly]
**status** | **String** | Status  - open: Running - cancelled: Manually cancelled - finish: Successfully completed - failed: Failed to execute - expired: Expired |  [optional] [readonly]
**reason** | **String** | Additional description of how the order was completed |  [optional] [readonly]

