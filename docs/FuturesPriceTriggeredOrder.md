
# FuturesPriceTriggeredOrder

Futures order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initial** | [**FuturesInitialOrder**](FuturesInitialOrder.md) |  | 
**trigger** | [**FuturesPriceTrigger**](FuturesPriceTrigger.md) |  | 
**id** | **Long** | Auto order ID |  [optional] [readonly]
**user** | **Integer** | User ID |  [optional] [readonly]
**createTime** | [**BigDecimal**](BigDecimal.md) | Creation time |  [optional] [readonly]
**finishTime** | [**BigDecimal**](BigDecimal.md) | Finished time |  [optional] [readonly]
**tradeId** | **Long** | ID of the newly created order on condition triggered |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Order status. |  [optional] [readonly]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | How order is finished |  [optional] [readonly]
**reason** | **String** | Extra messages of how order is finished |  [optional] [readonly]

## Enum: StatusEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
FINISHED | &quot;finished&quot;

## Enum: FinishAsEnum

Name | Value
---- | -----
CANCELLED | &quot;cancelled&quot;
SUCCEEDED | &quot;succeeded&quot;
FAILED | &quot;failed&quot;
EXPIRED | &quot;expired&quot;

