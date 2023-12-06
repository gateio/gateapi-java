
# AmendOrderResult

Batch order modification results

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID |  [optional] [readonly]
**amount** | **String** | Trade amount |  [optional] [readonly]
**price** | **String** | Order price |  [optional] [readonly]
**amendText** | **String** | The custom data that the user remarked when amending the order |  [optional] [readonly]
**succeeded** | **Boolean** | Update success status |  [optional] [readonly]
**label** | **String** | Error indicator for failed modifications; empty when successful |  [optional] [readonly]
**message** | **String** | Error description for failed modifications; empty when successful |  [optional] [readonly]
**account** | **String** | Account types， spot - spot account, margin - margin account, unified - unified account, cross_margin - cross margin account.Portfolio margin accounts can only be set to &#x60;cross_margin&#x60; |  [optional] [readonly]

