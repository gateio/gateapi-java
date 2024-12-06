

# FuturesTrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Trade ID |  [optional]
**createTime** | **Double** | Trading time |  [optional]
**createTimeMs** | **Double** | Trading time, with milliseconds set to 3 decimal places. |  [optional]
**contract** | **String** | Futures contract |  [optional]
**size** | **Long** | Trading size |  [optional]
**price** | **String** | Trading price (quote currency) |  [optional]
**isInternal** | **Boolean** | Whether internal trade. Internal trade refers to the takeover of liquidation orders by the insurance fund and ADL users. Since it is not a normal matching on the market depth, the transaction price may deviate, and it will not be recorded in the K-line. If it is not an internal trade, this field will not be returned. |  [optional]



