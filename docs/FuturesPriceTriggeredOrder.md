
# FuturesPriceTriggeredOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initial** | [**FuturesInitialOrder**](FuturesInitialOrder.md) |  | 
**trigger** | [**FuturesPriceTrigger**](FuturesPriceTrigger.md) |  | 
**id** | **Long** | Auto order ID |  [optional]
**user** | **Integer** | User ID |  [optional]
**createTime** | [**BigDecimal**](BigDecimal.md) | Creation time |  [optional]
**finishTime** | [**BigDecimal**](BigDecimal.md) | Finished time |  [optional]
**tradeId** | **Long** | ID of the newly created order on condition triggered |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Order status. |  [optional]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | How order is finished |  [optional]
**reason** | **String** | Extra messages of how order is finished |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
FINISHED | &quot;finished&quot;


<a name="FinishAsEnum"></a>
## Enum: FinishAsEnum
Name | Value
---- | -----
CANCELLED | &quot;cancelled&quot;
SUCCEEDED | &quot;succeeded&quot;
FAILED | &quot;failed&quot;
EXPIRED | &quot;expired&quot;



