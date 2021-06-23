
# FuturesOrderBook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Order Book ID. Increase by 1 on every order book change. Set &#x60;with_id&#x3D;true&#x60; to include this field in response |  [optional]
**current** | **Double** | Response data generation timestamp |  [optional]
**update** | **Double** | Order book changed timestamp |  [optional]
**asks** | [**List&lt;FuturesOrderBookItem&gt;**](FuturesOrderBookItem.md) | Asks order depth | 
**bids** | [**List&lt;FuturesOrderBookItem&gt;**](FuturesOrderBookItem.md) | Bids order depth | 

