
# CurrencyPair

Spot currency pair

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Currency pair |  [optional]
**base** | **String** | Base currency |  [optional]
**baseName** | **String** | Base currency name |  [optional]
**quote** | **String** | Quote currency |  [optional]
**quoteName** | **String** | Quote currency name |  [optional]
**fee** | **String** | Trading fee rate |  [optional]
**minBaseAmount** | **String** | Minimum amount of base currency to trade, &#x60;null&#x60; means no limit |  [optional]
**minQuoteAmount** | **String** | Minimum amount of quote currency to trade, &#x60;null&#x60; means no limit |  [optional]
**maxBaseAmount** | **String** | Maximum amount of base currency to trade, &#x60;null&#x60; means no limit |  [optional]
**maxQuoteAmount** | **String** | Maximum amount of quote currency to trade, &#x60;null&#x60; means no limit |  [optional]
**amountPrecision** | **Integer** | Amount scale |  [optional]
**precision** | **Integer** | Price scale |  [optional]
**tradeStatus** | [**TradeStatusEnum**](#TradeStatusEnum) | Trading status  - untradable: cannot be traded - buyable: can be bought - sellable: can be sold - tradable: can be bought and sold |  [optional]
**sellStart** | **Long** | Sell start unix timestamp in seconds |  [optional]
**buyStart** | **Long** | Buy start unix timestamp in seconds |  [optional]
**delistingTime** | **Long** | Expected time to remove the shelves, Unix timestamp in seconds |  [optional]
**type** | **String** | Trading pair type, normal: normal, premarket: pre-market |  [optional]
**tradeUrl** | **String** | Transaction link |  [optional]
**stTag** | **Boolean** | Whether the trading pair is in ST risk assessment, false - No, true - Yes |  [optional]

## Enum: TradeStatusEnum

Name | Value
---- | -----
UNTRADABLE | &quot;untradable&quot;
BUYABLE | &quot;buyable&quot;
SELLABLE | &quot;sellable&quot;
TRADABLE | &quot;tradable&quot;

