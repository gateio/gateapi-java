
# OrderPatch

Spot order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPair** | **String** | Currency pair |  [optional]
**account** | **String** | 指定查询账户。 |  [optional]
**amount** | **String** | New order amount. &#x60;amount&#x60; and &#x60;price&#x60; must specify one of them |  [optional]
**price** | **String** | New order price. &#x60;amount&#x60; and &#x60;Price&#x60; must specify one of them\&quot; |  [optional]
**amendText** | **String** | Custom info during amending order |  [optional]
**actionMode** | **String** | Processing Mode: When placing an order, different fields are returned based on action_mode. This field is only valid during the request and is not included in the response result ACK: Asynchronous mode, only returns key order fields RESULT: No clearing information FULL: Full mode (default) |  [optional]

