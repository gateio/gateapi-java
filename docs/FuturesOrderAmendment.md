
# FuturesOrderAmendment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size** | **Long** | New order size, including filled part.  - If new size is less than or equal to filled size, the order will be cancelled. - Order side must be identical to the original one. - Close order size cannot be changed. - For reduce only orders, increasing size may leads to other reduce only orders being cancelled. - If price is not changed, decreasing size will not change its precedence in order book, while increasing will move it to the last at current price. |  [optional]
**price** | **String** | New order price. |  [optional]
**amendText** | **String** | Custom info during amending order |  [optional]
**bizInfo** | **String** | Users can annotate this modification with information. |  [optional]
**bbo** | **String** | Users are able to modify the offer price manually. |  [optional]

