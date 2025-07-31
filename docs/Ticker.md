
# Ticker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPair** | **String** | Currency pair |  [optional]
**last** | **String** | Last trading price |  [optional]
**lowestAsk** | **String** | Recent lowest ask |  [optional]
**lowestSize** | **String** | Latest seller&#39;s lowest price quantity; not available for batch queries; available for single queries, empty if no data |  [optional]
**highestBid** | **String** | Recent highest bid |  [optional]
**highestSize** | **String** | Latest buyer&#39;s highest price quantity; not available for batch queries; available for single queries, empty if no data |  [optional]
**changePercentage** | **String** | 24h price change percentage (negative for decrease, e.g., -7.45) |  [optional]
**changeUtc0** | **String** | UTC+0 timezone, 24h price change percentage, negative for decline (e.g., -7.45) |  [optional]
**changeUtc8** | **String** | UTC+8 timezone, 24h price change percentage, negative for decline (e.g., -7.45) |  [optional]
**baseVolume** | **String** | Base currency trading volume in the last 24h |  [optional]
**quoteVolume** | **String** | Quote currency trading volume in the last 24h |  [optional]
**high24h** | **String** | 24h High |  [optional]
**low24h** | **String** | 24h Low |  [optional]
**etfNetValue** | **String** | ETF net value |  [optional]
**etfPreNetValue** | **String** | ETF net value at previous rebalancing point |  [optional]
**etfPreTimestamp** | **Long** | ETF previous rebalancing time |  [optional]
**etfLeverage** | **String** | ETF current leverage |  [optional]

