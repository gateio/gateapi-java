
# OrderResponse

下单返回

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID |  [optional]
**txHash** | **String** | Transaction Hash |  [optional]
**side** | **String** | 买单或者卖单 - buy - sell |  [optional]
**usdtAmount** | **String** | Amount |  [optional]
**currency** | **String** | 币 |  [optional]
**currencyAmount** | **String** | Currency amount |  [optional]
**status** | **Integer** | Order Status - &#x60;0&#x60; : All - &#x60;1&#x60; : Processing - &#x60;2&#x60; : Successful - &#x60;3&#x60; : Failed - &#x60;4&#x60; : Canceled - &#x60;5&#x60; : Buy order placed but transfer not completed - &#x60;6&#x60; : Cancelled order with transfer not complete |  [optional]
**gasMode** | **String** | Trading mode affects slippage selection - &#x60;speed&#x60; : Smart mode - &#x60;custom&#x60; : Custom mode, uses &#x60;slippage&#x60; parameter |  [optional]
**chain** | **String** | 链 |  [optional]
**gasFee** | **String** | Miner Fee (USDT-based) |  [optional]
**transactionFee** | **String** | Trading Fee (USDT-based) |  [optional]
**failedReason** | **String** | Failure reason (if any) |  [optional]
**createTime** | **Long** | 创建时间（时间戳） |  [optional]

