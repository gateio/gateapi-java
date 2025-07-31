
# FlashSwapPreviewRequest

Parameters of flash swap order creation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellCurrency** | **String** | The name of the asset being sold, as obtained from the \&quot;GET /flash_swap/currency_pairs\&quot; API, which retrieves a list of supported flash swap currency pairs | 
**sellAmount** | **String** | Amount to sell. It is required to choose one parameter between &#x60;sell_amount&#x60; and &#x60;buy_amount&#x60; |  [optional]
**buyCurrency** | **String** | The name of the asset being purchased, as obtained from the \&quot;GET /flash_swap/currency_pairs\&quot; API, which provides a list of supported flash swap currency pairs | 
**buyAmount** | **String** | Amount to buy. It is required to choose one parameter between &#x60;sell_amount&#x60; and &#x60;buy_amount&#x60; |  [optional]

