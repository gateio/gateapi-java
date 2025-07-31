
# FuturesTicker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contract** | **String** | Futures contract |  [optional]
**last** | **String** | Last trading price |  [optional]
**changePercentage** | **String** | Price change percentage. Negative values indicate price decrease, e.g. -7.45 |  [optional]
**totalSize** | **String** | Contract total size |  [optional]
**low24h** | **String** | 24-hour lowest price |  [optional]
**high24h** | **String** | 24-hour highest price |  [optional]
**volume24h** | **String** | 24-hour trading volume |  [optional]
**volume24hBtc** | **String** | 24-hour trading volume in BTC (deprecated, use &#x60;volume_24h_base&#x60;, &#x60;volume_24h_quote&#x60;, &#x60;volume_24h_settle&#x60; instead) |  [optional]
**volume24hUsd** | **String** | 24-hour trading volume in USD (deprecated, use &#x60;volume_24h_base&#x60;, &#x60;volume_24h_quote&#x60;, &#x60;volume_24h_settle&#x60; instead) |  [optional]
**volume24hBase** | **String** | 24-hour trading volume in base currency |  [optional]
**volume24hQuote** | **String** | 24-hour trading volume in quote currency |  [optional]
**volume24hSettle** | **String** | 24-hour trading volume in settle currency |  [optional]
**markPrice** | **String** | Recent mark price |  [optional]
**fundingRate** | **String** | Funding rate |  [optional]
**fundingRateIndicative** | **String** | Indicative Funding rate in next period. (deprecated. use &#x60;funding_rate&#x60;) |  [optional]
**indexPrice** | **String** | Index price |  [optional]
**quantoBaseRate** | **String** | Exchange rate of base currency and settlement currency in Quanto contract. Does not exists in contracts of other types |  [optional]
**lowestAsk** | **String** | Recent lowest ask |  [optional]
**lowestSize** | **String** | The latest seller&#39;s lowest price order quantity |  [optional]
**highestBid** | **String** | Recent highest bid |  [optional]
**highestSize** | **String** | The latest buyer&#39;s highest price order volume |  [optional]

