
# BatchAmendItem

Order information that needs to be modified.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | The order ID returned upon successful creation or the custom ID specified by the user during creation (i.e., the &#39;text&#39; field). | 
**currencyPair** | **String** | Currency pair. | 
**account** | **String** | Default spot, unified account and warehouse-by-store leverage account. |  [optional]
**amount** | **String** | Trading Quantity. Only one of amountor pricecan be specified. |  [optional]
**price** | **String** | Trading Price. Only one of amountor pricecan be specified. |  [optional]
**amendText** | **String** | Custom info during amending order. |  [optional]
**actionMode** | **String** | Processing Mode: When placing an order, different fields are returned based on action_mode. This field is only valid during the request and is not included in the response result ACK: Asynchronous mode, only returns key order fields RESULT: No clearing information FULL: Full mode (default) |  [optional]

