
# QuoteRequest

Quotation Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Trading Symbol | 
**side** | **String** | 买单或者卖单 - buy - sell | 
**amount** | **String** | Trade Quantity - &#x60;side&#x60; : &#x60;buy&#x60; refers to the quote currency, i.e., &#x60;USDT&#x60; - &#x60;side&#x60; : &#x60;sell&#x60; refers to the base currency | 
**gasMode** | **String** | Trading mode affects slippage selection - &#x60;speed&#x60; : Smart mode - &#x60;custom&#x60; : Custom mode, uses &#x60;slippage&#x60; parameter | 
**slippage** | **String** | Slippage value of 10 represents a 10% tolerance |  [optional]

