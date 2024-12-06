

# OptionsContract

Options contract detail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Options contract name |  [optional]
**tag** | **String** | tag |  [optional]
**createTime** | **Double** | Creation time |  [optional]
**expirationTime** | **Double** | Expiration time |  [optional]
**isCall** | **Boolean** | &#x60;true&#x60; means call options, while &#x60;false&#x60; is put options |  [optional]
**multiplier** | **String** | Multiplier used in converting from invoicing to settlement currency |  [optional]
**underlying** | **String** | Underlying |  [optional]
**underlyingPrice** | **String** | Underlying price (quote currency) |  [optional]
**lastPrice** | **String** | Last trading price |  [optional]
**markPrice** | **String** | Current mark price (quote currency) |  [optional]
**indexPrice** | **String** | Current index price (quote currency) |  [optional]
**makerFeeRate** | **String** | Maker fee rate, where negative means rebate |  [optional]
**takerFeeRate** | **String** | Taker fee rate |  [optional]
**orderPriceRound** | **String** | Minimum order price increment |  [optional]
**markPriceRound** | **String** | Minimum mark price increment |  [optional]
**orderSizeMin** | **Long** | Minimum order size the contract allowed |  [optional]
**orderSizeMax** | **Long** | Maximum order size the contract allowed |  [optional]
**orderPriceDeviate** | **String** | The positive and negative offset allowed between the order price and the current mark price, that is, the order price &#x60;order_price&#x60; must meet the following conditions:   order_price is within the range of mark_price +/- order_price_deviate * underlying_price  and does not distinguish between buy and sell orders |  [optional]
**refDiscountRate** | **String** | Referral fee rate discount |  [optional]
**refRebateRate** | **String** | Referrer commission rate |  [optional]
**orderbookId** | **Long** | Current orderbook ID |  [optional]
**tradeId** | **Long** | Current trade ID |  [optional]
**tradeSize** | **Long** | Historical accumulated trade size |  [optional]
**positionSize** | **Long** | Current total long position size |  [optional]
**ordersLimit** | **Integer** | Maximum number of open orders |  [optional]



