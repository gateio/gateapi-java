
# FuturesPriceTriggeredOrder

Futures price-triggered order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initial** | [**FuturesInitialOrder**](FuturesInitialOrder.md) |  | 
**trigger** | [**FuturesPriceTrigger**](FuturesPriceTrigger.md) |  | 
**id** | **Long** | Auto order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**createTime** | **Double** | Created time |  [optional] [readonly]
**finishTime** | **Double** | End time |  [optional] [readonly]
**tradeId** | **Long** | ID of the order created after trigger |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Order status  - &#x60;open&#x60;: Active - &#x60;finished&#x60;: Finished - &#x60;inactive&#x60;: Inactive, only applies to order take-profit/stop-loss - &#x60;invalid&#x60;: Invalid, only applies to order take-profit/stop-loss |  [optional] [readonly]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | Finish status: cancelled - Cancelled; succeeded - Succeeded; failed - Failed; expired - Expired |  [optional] [readonly]
**reason** | **String** | Additional description of how the order was completed |  [optional] [readonly]
**orderType** | **String** | Types of take-profit and stop-loss orders, including:  - &#x60;close-long-order&#x60;: Order take-profit/stop-loss, close long position - &#x60;close-short-order&#x60;: Order take-profit/stop-loss, close short position - &#x60;close-long-position&#x60;: Position take-profit/stop-loss, used to close all long positions - &#x60;close-short-position&#x60;: Position take-profit/stop-loss, used to close all short positions - &#x60;plan-close-long-position&#x60;: Position plan take-profit/stop-loss, used to close all or partial long positions - &#x60;plan-close-short-position&#x60;: Position plan take-profit/stop-loss, used to close all or partial short positions  The two types of order take-profit/stop-loss are read-only and cannot be passed in requests |  [optional]
**meOrderId** | **Long** | Corresponding order ID for order take-profit/stop-loss orders |  [optional] [readonly]

## Enum: StatusEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
FINISHED | &quot;finished&quot;
INACTIVE | &quot;inactive&quot;
INVALID | &quot;invalid&quot;

## Enum: FinishAsEnum

Name | Value
---- | -----
CANCELLED | &quot;cancelled&quot;
SUCCEEDED | &quot;succeeded&quot;
FAILED | &quot;failed&quot;
EXPIRED | &quot;expired&quot;

