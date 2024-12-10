
# FuturesAutoDeleverage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **Long** | Automatic deleveraging time |  [optional] [readonly]
**user** | **Long** | User ID |  [optional] [readonly]
**orderId** | **Long** | Order ID. Order IDs before 2023-02-20 are null |  [optional] [readonly]
**contract** | **String** | Futures contract |  [optional] [readonly]
**leverage** | **String** | Position leverage |  [optional] [readonly]
**crossLeverageLimit** | **String** | Cross margin leverage(valid only when &#x60;leverage&#x60; is 0) |  [optional] [readonly]
**entryPrice** | **String** | Average entry price |  [optional] [readonly]
**fillPrice** | **String** | Average fill price |  [optional] [readonly]
**tradeSize** | **Long** | Trading size |  [optional] [readonly]
**positionSize** | **Long** | Positions after auto-deleveraging |  [optional] [readonly]

