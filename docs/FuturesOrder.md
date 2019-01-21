
# FuturesOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Futures order ID |  [optional]
**user** | **Integer** | User ID |  [optional]
**createTime** | [**BigDecimal**](BigDecimal.md) | Order creation time |  [optional]
**finishTime** | [**BigDecimal**](BigDecimal.md) | Order finished time. Not returned if order is open |  [optional]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | How the order is finished.  - filled: all filled - cancelled: manually cancelled - liquidated: cancelled because of liquidation - ioc: time in force is &#x60;IOC&#x60;, finish immediately - auto_deleveraged: finished by ADL - reduce_only: cancelled because of increasing position while &#x60;reduce-only&#x60; set |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Order status  - &#x60;open&#x60;: waiting to be traded - &#x60;finished&#x60;: finished |  [optional]
**contract** | **String** | Futures contract | 
**size** | **Long** | Order size. Specify positive number to make a bid, and negative number to ask |  [optional]
**iceberg** | **Long** | Display size for iceberg order. 0 for non-iceberg. Note that you would pay the taker fee for the hidden size |  [optional]
**price** | **String** | Order price. 0 for market order with &#x60;tif&#x60; set as &#x60;ioc&#x60; |  [optional]
**close** | **Boolean** | Set as &#x60;true&#x60; to close the position, with &#x60;size&#x60; set to 0 |  [optional]
**isClose** | **Boolean** | Is the order to close position |  [optional]
**reduceOnly** | **Boolean** | Set as &#x60;true&#x60; to be post-only order |  [optional]
**isReduceOnly** | **Boolean** | Is the order post-only |  [optional]
**isLiq** | **Boolean** | Is the order for liquidation |  [optional]
**tif** | [**TifEnum**](#TifEnum) | Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, post-only |  [optional]
**left** | **Long** | Size left to be traded |  [optional]
**fillPrice** | **String** | Fill price of the order |  [optional]
**text** | **String** | How order is created  - web: from web - api: from API - app: from mobile phones - auto_deleveraging: from ADL - liquidation: from liquidation - insurance: from insurance  |  [optional]
**tkfr** | **String** | Taker fee |  [optional]
**mkfr** | **String** | Maker fee |  [optional]
**refu** | **String** | Reference user ID |  [optional]


<a name="FinishAsEnum"></a>
## Enum: FinishAsEnum
Name | Value
---- | -----
FILLED | &quot;filled&quot;
CANCELLED | &quot;cancelled&quot;
LIQUIDATED | &quot;liquidated&quot;
IOC | &quot;ioc&quot;
AUTO_DELEVERAGED | &quot;auto_deleveraged&quot;
REDUCE_ONLY | &quot;reduce_only&quot;


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
POC | &quot;poc&quot;



