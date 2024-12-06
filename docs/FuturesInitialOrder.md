

# FuturesInitialOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contract** | **String** | Futures contract | 
**size** | **Long** | Order size. Positive size means to buy, while negative one means to sell. Set to 0 to close the position |  [optional]
**price** | **String** | Order price. Set to 0 to use market price | 
**close** | **Boolean** | Set to true if trying to close the position |  [optional]
**tif** | [**TifEnum**](#TifEnum) | Time in force. If using market price, only &#x60;ioc&#x60; is supported.  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled |  [optional]
**text** | **String** | The source of the order, including: - web: web - api: api - app: app |  [optional]
**reduceOnly** | **Boolean** | Set to true to create a reduce-only order |  [optional]
**autoSize** | **String** | Set side to close dual-mode position. &#x60;close_long&#x60; closes the long side; while &#x60;close_short&#x60; the short one. Note &#x60;size&#x60; also needs to be set to 0 |  [optional]
**isReduceOnly** | **Boolean** | Is the order reduce-only |  [optional] [readonly]
**isClose** | **Boolean** | Is the order to close position |  [optional] [readonly]



## Enum: TifEnum

Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;



