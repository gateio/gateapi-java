
# LiquidateOrder

Spot liquidation order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | Order custom information. Users can set custom ID with this field. Custom fields must meet the following conditions:  1. Must start with &#x60;t-&#x60; 2. Excluding &#x60;t-&#x60;, length cannot exceed 28 bytes 3. Can only contain numbers, letters, underscore(_), hyphen(-) or dot(.)  |  [optional]
**currencyPair** | **String** | Currency pair | 
**amount** | **String** | Trade amount | 
**price** | **String** | Order price | 
**actionMode** | **String** | Processing mode:  Different fields are returned when placing an order based on action_mode. This field is only valid during the request and is not included in the response &#x60;ACK&#x60;: Asynchronous mode, only returns key order fields &#x60;RESULT&#x60;: No liquidation information &#x60;FULL&#x60;: Full mode (default) |  [optional]

