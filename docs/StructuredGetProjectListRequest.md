
# StructuredGetProjectListRequest

Dual Investment order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  Product Type, default to empty for querying all.  &#x60;SharkFin2.0&#x60;-Shark Fin 2.0  &#x60;BullishSharkFin&#x60;-Bullish Shark Fin  &#x60;BearishSharkFin&#x60;-Bearish Shark Fin  &#x60;DoubleNoTouch&#x60;-Double No-Touch  &#x60;RangeAccrual&#x60;-RangeAccrual  &#x60;SnowBall&#x60;-Snow Ball  |  [optional]
**status** | **String** |  Status: default to empty for querying all.   &#x60;in_process&#x60;-in progress  &#x60;will_begin&#x60;-will begin  &#x60;wait_settlement&#x60;-waiting for settlement  &#x60;done&#x60;-done |  [optional]
**page** | **Integer** | Page number |  [optional]
**limit** | **Integer** | Number of items returned in the list. Default is 100. |  [optional]

