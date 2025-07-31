
# OptionsMMP

MMP Settings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**underlying** | **String** | Underlying | 
**window** | **Integer** | Time window (milliseconds), between 1-5000, 0 means disable MMP | 
**frozenPeriod** | **Integer** | Freeze duration (milliseconds), 0 means always frozen, need to call reset API to unfreeze | 
**qtyLimit** | **String** | Trading volume upper limit (positive number, up to 2 decimal places) | 
**deltaLimit** | **String** | Upper limit of net delta value (positive number, up to 2 decimal places) | 
**triggerTimeMs** | **Long** | Trigger freeze time (milliseconds), 0 means no freeze is triggered |  [optional] [readonly]
**frozenUntilMs** | **Long** | Unfreeze time (milliseconds). If the freeze duration is not configured, there will be no unfreeze time after the freeze is triggered |  [optional] [readonly]

