
# FuturesOrder

Futures order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Futures order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**createTime** | **Double** | Creation time of order |  [optional] [readonly]
**finishTime** | **Double** | Order finished time. Not returned if order is open |  [optional] [readonly]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | How the order was finished:  - filled: all filled - cancelled: manually cancelled - liquidated: cancelled because of liquidation - ioc: time in force is &#x60;IOC&#x60;, finish immediately - auto_deleveraged: finished by ADL - reduce_only: cancelled because of increasing position while &#x60;reduce-only&#x60; set - position_closed: cancelled because the position was closed - reduce_out: only reduce positions by excluding hard-to-fill orders - stp: cancelled because self trade prevention |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Order status  - &#x60;open&#x60;: Pending - &#x60;finished&#x60;: Completed |  [optional] [readonly]
**contract** | **String** | Futures contract | 
**size** | **Long** | Required. Trading quantity. Positive for buy, negative for sell. Set to 0 for close position orders. | 
**iceberg** | **Long** | Display size for iceberg orders. 0 for non-iceberg orders. Note that hidden portions are charged taker fees. |  [optional]
**price** | **String** | Order price. Price of 0 with &#x60;tif&#x60; set to &#x60;ioc&#x60; represents a market order. |  [optional]
**close** | **Boolean** | Set as &#x60;true&#x60; to close the position, with &#x60;size&#x60; set to 0 |  [optional]
**isClose** | **Boolean** | Is the order to close position |  [optional] [readonly]
**reduceOnly** | **Boolean** | Set as &#x60;true&#x60; to be reduce-only order |  [optional]
**isReduceOnly** | **Boolean** | Is the order reduce-only |  [optional] [readonly]
**isLiq** | **Boolean** | Is the order for liquidation |  [optional] [readonly]
**tif** | [**TifEnum**](#TifEnum) | Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, makes a post-only order that always enjoys a maker fee - fok: FillOrKill, fill either completely or none |  [optional]
**left** | **Long** | Unfilled quantity |  [optional] [readonly]
**fillPrice** | **String** | Fill price |  [optional] [readonly]
**text** | **String** | Custom order information. If not empty, must follow the rules below:  1. Prefixed with &#x60;t-&#x60; 2. No longer than 28 bytes without &#x60;t-&#x60; prefix 3. Can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.)  In addition to user-defined information, the following are internal reserved fields that identify the order source:  - web: Web - api: API call - app: Mobile app - auto_deleveraging: Automatic deleveraging - liquidation: Forced liquidation of positions under the old classic mode - liq-xxx: a. Forced liquidation of positions under the new classic mode, including isolated margin, one-way cross margin, and non-hedged positions under two-way cross margin. b. Forced liquidation of isolated positions under the unified account single-currency margin mode - hedge-liq-xxx: Forced liquidation of hedged positions under the new classic mode two-way cross margin, i.e., simultaneously closing long and short positions - pm_liquidate: Forced liquidation under unified account multi-currency margin mode - comb_margin_liquidate: Forced liquidation under unified account portfolio margin mode - scm_liquidate: Forced liquidation of positions under unified account single-currency margin mode - insurance: Insurance |  [optional]
**tkfr** | **String** | Taker fee |  [optional] [readonly]
**mkfr** | **String** | Maker fee |  [optional] [readonly]
**refu** | **Integer** | Referrer user ID |  [optional] [readonly]
**autoSize** | [**AutoSizeEnum**](#AutoSizeEnum) | Set side to close dual-mode position. &#x60;close_long&#x60; closes the long side; while &#x60;close_short&#x60; the short one. Note &#x60;size&#x60; also needs to be set to 0 |  [optional]
**stpId** | **Integer** | Orders between users in the same &#x60;stp_id&#x60; group are not allowed to be self-traded  1. If the &#x60;stp_id&#x60; of two orders being matched is non-zero and equal, they will not be executed. Instead, the corresponding strategy will be executed based on the &#x60;stp_act&#x60; of the taker. 2. &#x60;stp_id&#x60; returns &#x60;0&#x60; by default for orders that have not been set for &#x60;STP group&#x60; |  [optional] [readonly]
**stpAct** | [**StpActEnum**](#StpActEnum) | Self-Trading Prevention Action. Users can use this field to set self-trade prevention strategies  1. After users join the &#x60;STP Group&#x60;, they can pass &#x60;stp_act&#x60; to limit the user&#39;s self-trade prevention strategy. If &#x60;stp_act&#x60; is not passed, the default is &#x60;cn&#x60; strategy. 2. When the user does not join the &#x60;STP group&#x60;, an error will be returned when passing the &#x60;stp_act&#x60; parameter. 3. If the user did not use &#x60;stp_act&#x60; when placing the order, &#x60;stp_act&#x60; will return &#39;-&#39;  - cn: Cancel newest, cancel new orders and keep old ones - co: Cancel oldest, cancel old orders and keep new ones - cb: Cancel both, both old and new orders will be cancelled |  [optional]
**amendText** | **String** | The custom data that the user remarked when amending the order |  [optional] [readonly]

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

