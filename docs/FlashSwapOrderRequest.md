
# FlashSwapOrderRequest

Parameters of flash swap order creation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**previewId** | **String** | Preview result ID | 
**sellCurrency** | **String** | The name of the asset being sold, as obtained from the \&quot;GET /flash_swap/currency_pairs\&quot; API, which retrieves a list of supported flash swap currency pairs. | 
**sellAmount** | **String** | Amount to sell (based on the preview result) | 
**buyCurrency** | **String** | The name of the asset being purchased, as obtained from the \&quot;GET /flash_swap/currency_pairs\&quot; API, which provides a list of supported flash swap currency pairs. | 
**buyAmount** | **String** | Amount to buy (based on the preview result) | 

