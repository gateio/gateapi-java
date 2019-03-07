
# FuturesInitialOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contract** | **String** | Futures contract | 
**size** | **Long** | Order size. Positive size means to buy, while negative one means to sell. Set to 0 to close the position |  [optional]
**price** | **String** | Order price. Set to 0 to use market price | 
**close** | **Boolean** | Set to true if trying to close the position |  [optional]
**tif** | [**TifEnum**](#TifEnum) | Time in force. If using market price, only &#x60;ioc&#x60; is supported.  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled |  [optional]
**text** | [**TextEnum**](#TextEnum) | How the order is created. Possible values are: web, api and app |  [optional]
**reduceOnly** | **Boolean** | Set to true to create an post-only order |  [optional]
**isReduceOnly** | **Boolean** | Is the order post-only |  [optional]
**isClose** | **Boolean** | Is the order to close position |  [optional]


<a name="TifEnum"></a>
## Enum: TifEnum
Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;


<a name="TextEnum"></a>
## Enum: TextEnum
Name | Value
---- | -----
WEB | &quot;web&quot;
API | &quot;api&quot;
APP | &quot;app&quot;



