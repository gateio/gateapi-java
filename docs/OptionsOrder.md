
# OptionsOrder

Options order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Options order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**createTime** | **Double** | Creation time of order |  [optional] [readonly]
**finishTime** | **Double** | Order finished time. Not returned if order is open |  [optional] [readonly]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | Order finish reason:  - filled: Fully filled - cancelled: User cancelled - liquidated: Cancelled due to liquidation - ioc: Not immediately fully filled due to IOC time-in-force setting - auto_deleveraged: Cancelled due to auto-deleveraging - reduce_only: Cancelled due to position increase while reduce-only is set - position_closed: Cancelled because the position was closed - reduce_out: Only reduce positions by excluding hard-to-fill orders - mmp_cancelled: Cancelled by MMP |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Order status  - &#x60;open&#x60;: Pending - &#x60;finished&#x60;: Completed |  [optional] [readonly]
**contract** | **String** | Options identifier | 
**size** | **Long** | Required. Trading quantity. Positive for buy, negative for sell. Set to 0 for close position orders. | 
**iceberg** | **Long** | Display size for iceberg orders. 0 for non-iceberg orders. Note that hidden portions are charged taker fees. |  [optional]
**price** | **String** | Order price. Price of 0 with &#x60;tif&#x60; set as &#x60;ioc&#x60; represents market order (quote currency) |  [optional]
**close** | **Boolean** | Set as &#x60;true&#x60; to close the position, with &#x60;size&#x60; set to 0 |  [optional]
**isClose** | **Boolean** | Is the order to close position |  [optional] [readonly]
**reduceOnly** | **Boolean** | Set as &#x60;true&#x60; to be reduce-only order |  [optional]
**isReduceOnly** | **Boolean** | Is the order reduce-only |  [optional] [readonly]
**isLiq** | **Boolean** | Is the order for liquidation |  [optional] [readonly]
**mmp** | **Boolean** | When set to true, it is an MMP order |  [optional]
**isMmp** | **Boolean** | Whether it is an MMP order. Corresponds to &#x60;mmp&#x60; in the request |  [optional] [readonly]
**tif** | [**TifEnum**](#TifEnum) | Time in force strategy. Market orders currently only support IOC mode  - gtc: Good Till Cancelled - ioc: Immediate Or Cancelled, execute immediately or cancel, taker only - poc: Pending Or Cancelled, passive order, maker only |  [optional]
**left** | **Long** | Unfilled quantity |  [optional] [readonly]
**fillPrice** | **String** | Fill price |  [optional] [readonly]
**text** | **String** | User defined information. If not empty, must follow the rules below:  1. prefixed with &#x60;t-&#x60; 2. no longer than 28 bytes without &#x60;t-&#x60; prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) Besides user defined information, reserved contents are listed below, denoting how the order is created:  - web: from web - api: from API - app: from mobile phones - auto_deleveraging: from ADL - liquidation: from liquidation - insurance: from insurance  |  [optional]
**tkfr** | **String** | Taker fee |  [optional] [readonly]
**mkfr** | **String** | Maker fee |  [optional] [readonly]
**refu** | **Integer** | Referrer user ID |  [optional] [readonly]
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

