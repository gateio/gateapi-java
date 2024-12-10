
# OptionsOrder

Options order detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Options order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**createTime** | **Double** | Creation time of order |  [optional] [readonly]
**finishTime** | **Double** | Order finished time. Not returned if order is open |  [optional] [readonly]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | 结束方式，包括：  - filled: 完全成交 - cancelled: 用户撤销 - liquidated: 强制平仓撤销 - ioc: 未立即完全成交，因为tif设置为ioc - auto_deleveraged: 自动减仓撤销 - reduce_only: 增持仓位撤销，因为设置reduce_only或平仓 - position_closed: 因为仓位平掉了，所以挂单被撤掉 - reduce_out: 只减仓被排除的不容易成交的挂单 - mmp_cancelled: MMP撤销 |  [optional] [readonly]
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
**mmp** | **Boolean** | 设置为 true 的时候，为MMP委托 |  [optional]
**isMmp** | **Boolean** | 是否为MMP委托。对应请求中的&#x60;mmp&#x60;。 |  [optional] [readonly]
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

