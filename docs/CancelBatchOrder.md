
# CancelBatchOrder

Info of order to be cancelled

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPair** | **String** | Order currency pair | 
**id** | **String** | Order ID or user custom ID. Custom ID are accepted only within 30 minutes after order creation | 
**actionMode** | **String** | Processing Mode: When placing an order, different fields are returned based on action_mode. This field is only valid during the request and is not included in the response result ACK: Asynchronous mode, only returns key order fields RESULT: No clearing information FULL: Full mode (default) |  [optional]

