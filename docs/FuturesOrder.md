
# FuturesOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | futures order ID |  [optional]
**createTime** | [**BigDecimal**](BigDecimal.md) | order creation time |  [optional]
**finishTime** | [**BigDecimal**](BigDecimal.md) | order finished time. Not returned if order is open |  [optional]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | how the order is finished.  - filled: all filled - cancelled: manually cancelled - liquidated: cancelled because of liquidation - ioc: time in force is &#x60;IOC&#x60;, finish immediately - auto_deleveraged: finished by ADL  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | order status  - &#x60;open&#x60;: waiting to be traded - &#x60;finished&#x60;: finished  |  [optional]
**contract** | **String** | contract name | 
**size** | **Long** | contract size. Specify positive number to make a bid, negative number otherwise.  Set to 0 if trying to close the position  |  [optional]
**price** | **String** | order price. Set to 0 if using market price |  [optional]
**close** | **Boolean** | set to true if trying to close the position |  [optional]
**isClose** | **Boolean** | the order is a closing position order. |  [optional]
**tif** | [**TifEnum**](#TifEnum) | Time in force. If using market price, only &#x60;ioc&#x60; is supported.  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled  |  [optional]
**left** | **Long** | size left to be traded |  [optional]
**fillPrice** | **String** | fill price of the order |  [optional]
**text** | **String** | how order is created  - web: from web - api: from API - app: from mobile phones - auto_deleveraging: from ADL - liquidation: from liquidation - insurance: from insurance  |  [optional]


<a name="FinishAsEnum"></a>
## Enum: FinishAsEnum
Name | Value
---- | -----
FILLED | &quot;filled&quot;
CANCELLED | &quot;cancelled&quot;
LIQUIDATED | &quot;liquidated&quot;
IOC | &quot;ioc&quot;
AUTO_DELEVERAGED | &quot;auto_deleveraged&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
FINISHED | &quot;finished&quot;


<a name="TifEnum"></a>
## Enum: TifEnum
Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;



