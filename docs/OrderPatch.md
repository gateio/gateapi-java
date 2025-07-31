
# OrderPatch

Spot order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPair** | **String** | Currency pair |  [optional]
**account** | **String** | Specify query account |  [optional]
**amount** | **String** | Trading quantity. Either &#x60;amount&#x60; or &#x60;price&#x60; must be specified |  [optional]
**price** | **String** | Trading price. Either &#x60;amount&#x60; or &#x60;price&#x60; must be specified |  [optional]
**amendText** | **String** | Custom info during order amendment |  [optional]
**actionMode** | **String** | Processing Mode: When placing an order, different fields are returned based on action_mode. This field is only valid during the request and is not included in the response result ACK: Asynchronous mode, only returns key order fields RESULT: No clearing information FULL: Full mode (default) |  [optional]

