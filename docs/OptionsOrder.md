
# OptionsOrder

Options order detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Options order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**createTime** | **Double** | Creation time of order |  [optional] [readonly]
**finishTime** | **Double** | Order finished time. Not returned if order is open |  [optional] [readonly]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | Ending method, including:  - filled: fully completed - canceled: user canceled - liquidated: forced liquidation cancellation - ioc: Not fully filled immediately because tif is set to ioc - auto_deleveraged: automatic deleveraging cancel - reduce_only: Increased position is cancelled, because reduce_only is set or the position is closed - position_closed: Because the position was closed, the pending order was canceled - reduce_out: Only reduce the excluded pending orders that are not easy to be filled - mmp_cancelled: MMP canceled |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Order status  - &#x60;open&#x60;: waiting to be traded - &#x60;finished&#x60;: finished |  [optional] [readonly]
**contract** | **String** | Contract name | 
**size** | **Long** | Order size. Specify positive number to make a bid, and negative number to ask | 
**iceberg** | **Long** | Display size for iceberg order. 0 for non-iceberg. Note that you will have to pay the taker fee for the hidden size |  [optional]
**price** | **String** | Order price. 0 for market order with &#x60;tif&#x60; set as &#x60;ioc&#x60; (USDT) |  [optional]
**close** | **Boolean** | Set as &#x60;true&#x60; to close the position, with &#x60;size&#x60; set to 0 |  [optional]
**isClose** | **Boolean** | Is the order to close position |  [optional] [readonly]
**reduceOnly** | **Boolean** | Set as &#x60;true&#x60; to be reduce-only order |  [optional]
**isReduceOnly** | **Boolean** | Is the order reduce-only |  [optional] [readonly]
**isLiq** | **Boolean** | Is the order for liquidation |  [optional] [readonly]
**mmp** | **Boolean** | When set to true, delegate to MMP |  [optional]
**isMmp** | **Boolean** | Whether it is MMP delegation. Corresponds to &#x60;mmp&#x60; in the request. |  [optional] [readonly]
**tif** | [**TifEnum**](#TifEnum) | Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, makes a post-only order that always enjoys a maker fee |  [optional]
**left** | **Long** | Size left to be traded |  [optional] [readonly]
**fillPrice** | **String** | Fill price of the order |  [optional] [readonly]
**text** | **String** | User defined information. If not empty, must follow the rules below:  1. prefixed with &#x60;t-&#x60; 2. no longer than 28 bytes without &#x60;t-&#x60; prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) Besides user defined information, reserved contents are listed below, denoting how the order is created:  - web: from web - api: from API - app: from mobile phones - auto_deleveraging: from ADL - liquidation: from liquidation - insurance: from insurance  |  [optional]
**tkfr** | **String** | Taker fee |  [optional] [readonly]
**mkfr** | **String** | Maker fee |  [optional] [readonly]
**refu** | **Integer** | Reference user ID |  [optional] [readonly]
**refr** | **String** | Referrer rebate |  [optional] [readonly]

## Enum: FinishAsEnum

Name | Value
---- | -----
FILLED | &quot;filled&quot;
CANCELLED | &quot;cancelled&quot;
LIQUIDATED | &quot;liquidated&quot;
IOC | &quot;ioc&quot;
AUTO_DELEVERAGED | &quot;auto_deleveraged&quot;
REDUCE_ONLY | &quot;reduce_only&quot;
POSITION_CLOSED | &quot;position_closed&quot;
REDUCE_OUT | &quot;reduce_out&quot;
MMP_CANCELLED | &quot;mmp_cancelled&quot;

## Enum: StatusEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
FINISHED | &quot;finished&quot;

## Enum: TifEnum

Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;
POC | &quot;poc&quot;

