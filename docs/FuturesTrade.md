
# FuturesTrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Fill ID |  [optional]
**createTime** | **Double** | Fill Time |  [optional]
**createTimeMs** | **Double** | Trade time, with millisecond precision to 3 decimal places |  [optional]
**contract** | **String** | Futures contract |  [optional]
**size** | **Long** | Trading size |  [optional]
**price** | **String** | Trade price (quote currency) |  [optional]
**isInternal** | **Boolean** | Whether it is an internal trade. Internal trade refers to the takeover of liquidation orders by the insurance fund and ADL users. Since it is not a normal matching on the market depth, the trade price may deviate from the market, and it will not be recorded in the K-line. If it is not an internal trade, this field will not be returned |  [optional]

