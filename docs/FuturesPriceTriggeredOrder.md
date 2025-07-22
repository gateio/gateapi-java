
# FuturesPriceTriggeredOrder

Futures order details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initial** | [**FuturesInitialOrder**](FuturesInitialOrder.md) |  | 
**trigger** | [**FuturesPriceTrigger**](FuturesPriceTrigger.md) |  | 
**id** | **Long** | Auto order ID. |  [optional] [readonly]
**user** | **Integer** | User ID. |  [optional] [readonly]
**createTime** | **Double** | Creation time. |  [optional] [readonly]
**finishTime** | **Double** | Finished time. |  [optional] [readonly]
**tradeId** | **Long** | ID of the newly created order on condition triggered. |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Auto order status  - &#x60;open&#x60;: order is active - &#x60;finished&#x60;: order is finished - &#x60;inactive&#x60;: order is not active, only for close-long-order or close-short-order - &#x60;invalid&#x60;: order is close-short-order |  [optional] [readonly]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | How order is finished. |  [optional] [readonly]
**reason** | **String** | Additional remarks on how the order was finished. |  [optional] [readonly]
**orderType** | **String** | Types of stop-profit and stop-loss, including:  - &#x60;close-long-order&#x60;: Entrusting order stop profit and stop loss, flat long position - &#x60;close-short-order&#x60;: loss, short position  - &#x60;close-long-position&#x60;: Position stop-profit stop loss, used to close long positions - &#x60;close-short-position&#x60;: Position stop-profit stop loss, used to close all short positions - &#x60;plan-close-long-position&#x60;: Position plan take profit and stop loss, used to close long positions in all or part of long positions - &#x60;plan-close-short-position&#x60;: Position plan stop-profit and stop loss, used to close all short positions or partially close short positions  The two types of entrusted order stop-profit and stop-loss are read-only and cannot be passed in through requests |  [optional]
**meOrderId** | **Long** | Corresponding order ID of order take-profit/stop-loss. |  [optional] [readonly]

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

