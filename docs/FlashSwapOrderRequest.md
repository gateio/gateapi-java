
# FlashSwapOrderRequest

Parameters of flash swap order creation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**previewId** | **String** | Preview result ID | 
**sellCurrency** | **String** | Name of the asset to be sold, obtained from the interface GET /flash_swap/currency_pairs: Query the list of all trading pairs supporting flash swap | 
**sellAmount** | **String** | Amount to sell (based on the preview result) | 
**buyCurrency** | **String** | Name of the asset to be bought, obtained from the interface GET /flash_swap/currency_pairs: Query the list of all trading pairs supporting flash swap | 
**buyAmount** | **String** | Amount to buy (based on the preview result) | 

