

# CancelOrderResult

Order cancellation result
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPair** | **String** | Order currency pair |  [optional]
**id** | **String** | Order ID |  [optional]
**text** | **String** | Custom order information |  [optional]
**succeeded** | **Boolean** | Whether cancellation succeeded |  [optional]
**label** | **String** | Error label when failed to cancel the order; emtpy if succeeded |  [optional]
**message** | **String** | Error message when failed to cancel the order; empty if succeeded |  [optional]
**account** | **String** | Empty by default. If cancelled order is cross margin order, this field is set to &#x60;cross_margin&#x60; |  [optional]



