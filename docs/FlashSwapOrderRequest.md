
# FlashSwapOrderRequest

Parameters of flash swap order creation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**previewId** | **String** | Preview result ID |  [optional]
**sellCurrency** | **String** | Currency to sell which can be retrieved from supported currency list API &#x60;GET /flash_swap/currencies&#x60; | 
**sellAmount** | **String** | Amount to sell. It is required to choose one parameter between &#x60;sell_amount&#x60; and &#x60;buy_amount&#x60; |  [optional]
**buyCurrency** | **String** | Currency to buy which can be retrieved from supported currency list API &#x60;GET /flash_swap/currencies&#x60; | 
**buyAmount** | **String** | Amount to buy. It is required to choose one parameter between &#x60;sell_amount&#x60; and &#x60;buy_amount&#x60; |  [optional]

