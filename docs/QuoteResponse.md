
# QuoteResponse

Quotation Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | **String** | The quotation ID (quote_id) is used for placing orders and is valid for 1 minute |  [optional]
**minAmount** | **String** | 最小下单量 |  [optional]
**maxAmount** | **String** | 最大下单量 |  [optional]
**price** | **String** | Coin Price (USDT-based) |  [optional]
**slippage** | **String** | Slippage |  [optional]
**estimateGasFeeAmountUsdt** | **String** | Estimated Network Fee (USDT-based) |  [optional]
**orderFee** | **String** | Slippage value of 10 represents a 10% tolerance |  [optional]
**targetTokenMinAmount** | **String** | 最小获得数量 |  [optional]
**targetTokenMaxAmount** | **String** | 最大获得数量 |  [optional]
**errorType** | **Integer** | Failure Type - &#x60;0&#x60; : Success - &#x60;1&#x60; : Exceeds maximum value - &#x60;2&#x60; : Below minimum value |  [optional]

