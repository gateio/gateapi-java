

# OptionsMMP

MMP Settings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**underlying** | **String** | Underlying | 
**window** | **Integer** | 时间窗口（毫秒），1-5000之间，0表示停用MMP | 
**frozenPeriod** | **Integer** | 冻结时长（毫秒），0表示一直冻结，需要调用重置API解冻 | 
**qtyLimit** | **String** | 成交量上限（正数，至多2位小数） | 
**deltaLimit** | **String** | 净delta值上限（正数，至多2位小数） | 
**triggerTimeMs** | **Long** | 触发冻结时间（毫秒），0表示没有触发冻结 |  [optional] [readonly]
**frozenUntilMs** | **Long** | 解冻时间（毫秒），如果未配置冻结时长，触发冻结后无解冻时间 |  [optional] [readonly]



