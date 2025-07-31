
# OrderBook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Order book ID, which is updated whenever the order book is changed. Valid only when &#x60;with_id&#x60; is set to &#x60;true&#x60; |  [optional]
**current** | **Long** | The timestamp of the response data being generated (in milliseconds) |  [optional]
**update** | **Long** | The timestamp of when the orderbook last changed (in milliseconds) |  [optional]
**asks** | [**List&lt;List&lt;String&gt;&gt;**](List.md) | Ask Depth | 
**bids** | [**List&lt;List&lt;String&gt;&gt;**](List.md) | Bid Depth | 

