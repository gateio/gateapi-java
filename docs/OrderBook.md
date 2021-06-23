
# OrderBook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Order book ID, which is updated whenever the order book is changed. Valid only when &#x60;with_id&#x60; is set to &#x60;true&#x60; |  [optional]
**current** | **Long** | Response data generation timestamp in milliseconds |  [optional]
**update** | **Long** | Order book changed timestamp in milliseconds |  [optional]
**asks** | [**List&lt;List&lt;String&gt;&gt;**](List.md) | Asks order depth | 
**bids** | [**List&lt;List&lt;String&gt;&gt;**](List.md) | Bids order depth | 

