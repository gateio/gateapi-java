
# FuturesPriceTriggeredOrder

Futures order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initial** | [**FuturesInitialOrder**](FuturesInitialOrder.md) |  | 
**trigger** | [**FuturesPriceTrigger**](FuturesPriceTrigger.md) |  | 
**id** | **Long** | Auto order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**createTime** | **Double** | Creation time |  [optional] [readonly]
**finishTime** | **Double** | Finished time |  [optional] [readonly]
**tradeId** | **Long** | ID of the newly created order on condition triggered |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Auto order status  - &#x60;open&#x60;: order is active - &#x60;finished&#x60;: order is finished - &#x60;inactive&#x60;: order is not active, only for close-long-order or close-short-order - &#x60;invalid&#x60;: order is invalid, only for close-long-order or close-short-order |  [optional] [readonly]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | How order is finished |  [optional] [readonly]
**reason** | **String** | Additional remarks on how the order was finished |  [optional] [readonly]
**orderType** | **String** | Take-profit/stop-loss types, which include:  - &#x60;close-long-order&#x60;: order take-profit/stop-loss, close long position - &#x60;close-short-order&#x60;: order take-profit/stop-loss, close short position - &#x60;close-long-position&#x60;: position take-profit/stop-loss, close long position - &#x60;close-short-position&#x60;: position take-profit/stop-loss, close short position - &#x60;plan-close-long-position&#x60;: position planned take-profit/stop-loss, close long position - &#x60;plan-close-short-position&#x60;: position planned take-profit/stop-loss, close short position  The order take-profit/stop-loss can not be passed by request. These two types are read only. |  [optional]
**meOrderId** | **String** | Corresponding order ID of order take-profit/stop-loss. |  [optional] [readonly]

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

