
# BatchFuturesOrder

Futures order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**succeeded** | **Boolean** | Whether the batch of orders succeeded |  [optional]
**label** | **String** | Error label, only exists if execution fails |  [optional]
**detail** | **String** | Error detail, only present if execution failed and details need to be given |  [optional]
**id** | **Long** | Futures order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**createTime** | **Double** | Creation time of order |  [optional] [readonly]
**finishTime** | **Double** | Order finished time. Not returned if order is open |  [optional] [readonly]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | How the order was finished.  - filled: all filled - cancelled: manually cancelled - liquidated: cancelled because of liquidation - ioc: time in force is &#x60;IOC&#x60;, finish immediately - auto_deleveraged: finished by ADL - reduce_only: cancelled because of increasing position while &#x60;reduce-only&#x60; set- position_closed: cancelled because of position close - position_closed: canceled because the position was closed - reduce_out: only reduce positions by excluding hard-to-fill orders - stp: cancelled because self trade prevention  |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Order status  - &#x60;open&#x60;: waiting to be traded - &#x60;finished&#x60;: finished |  [optional] [readonly]
**contract** | **String** | Futures contract |  [optional]
**size** | **Long** | Order size. Specify positive number to make a bid, and negative number to ask |  [optional]
**iceberg** | **Long** | Display size for iceberg order. 0 for non-iceberg. Note that you will have to pay the taker fee for the hidden size |  [optional]
**price** | **String** | Order price. 0 for market order with &#x60;tif&#x60; set as &#x60;ioc&#x60; |  [optional]
**close** | **Boolean** | Set as &#x60;true&#x60; to close the position, with &#x60;size&#x60; set to 0 |  [optional]
**isClose** | **Boolean** | Is the order to close position |  [optional] [readonly]
**reduceOnly** | **Boolean** | Set as &#x60;true&#x60; to be reduce-only order |  [optional]
**isReduceOnly** | **Boolean** | Is the order reduce-only |  [optional] [readonly]
**isLiq** | **Boolean** | Is the order for liquidation |  [optional] [readonly]
**tif** | [**TifEnum**](#TifEnum) | Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, makes a post-only order that always enjoys a maker fee - fok: FillOrKill, fill either completely or none |  [optional]
**left** | **Long** | Size left to be traded |  [optional] [readonly]
**fillPrice** | **String** | Fill price of the order |  [optional] [readonly]
**text** | **String** | User defined information. If not empty, must follow the rules below:  1. prefixed with &#x60;t-&#x60; 2. no longer than 28 bytes without &#x60;t-&#x60; prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) Besides user defined information, reserved contents are listed below, denoting how the order is created:  - web: from web - api: from API - app: from mobile phones - auto_deleveraging: from ADL - liquidation: from liquidation - insurance: from insurance  |  [optional]
**tkfr** | **String** | Taker fee |  [optional] [readonly]
**mkfr** | **String** | Maker fee |  [optional] [readonly]
**refu** | **Integer** | Reference user ID |  [optional] [readonly]
**autoSize** | [**AutoSizeEnum**](#AutoSizeEnum) | Set side to close dual-mode position. &#x60;close_long&#x60; closes the long side; while &#x60;close_short&#x60; the short one. Note &#x60;size&#x60; also needs to be set to 0 |  [optional]
**stpAct** | [**StpActEnum**](#StpActEnum) | Self-Trading Prevention Action. Users can use this field to set self-trade prevetion strategies  1. After users join the &#x60;STP Group&#x60;, he can pass &#x60;stp_act&#x60; to limit the user&#39;s self-trade prevetion strategy. If &#x60;stp_act&#x60; is not passed, the default is &#x60;cn&#x60; strategy。 2. When the user does not join the &#x60;STP group&#x60;, an error will be returned when passing the &#x60;stp_act&#x60; parameter。 3. If the user did not use &#39;stp_act&#39; when placing the order, &#39;stp_act&#39; will return &#39;-&#39;  - cn: Cancel newest, Cancel new orders and keep old ones - co: Cancel oldest, Cancel old orders and keep new ones - cb: Cancel both, Both old and new orders will be cancelled |  [optional]
**stpId** | **Integer** | Orders between users in the same &#x60;stp_id&#x60; group are not allowed to be self-traded  1. If the &#x60;stp_id&#x60; of two orders being matched is non-zero and equal, they will not be executed. Instead, the corresponding strategy will be executed based on the &#x60;stp_act&#x60; of the taker. 2. &#x60;stp_id&#x60; returns &#x60;0&#x60; by default for orders that have not been set for &#x60;STP group&#x60; |  [optional] [readonly]

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
STP | &quot;stp&quot;

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
FOK | &quot;fok&quot;

## Enum: AutoSizeEnum

Name | Value
---- | -----
LONG | &quot;close_long&quot;
SHORT | &quot;close_short&quot;

## Enum: StpActEnum

Name | Value
---- | -----
CO | &quot;co&quot;
CN | &quot;cn&quot;
CB | &quot;cb&quot;
MINUS | &quot;-&quot;

