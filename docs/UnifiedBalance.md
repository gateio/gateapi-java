
# UnifiedBalance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available** | **String** | Available amount is valid in single currency margin/cross-currency margin/combined margin mode, and the calculation is different in different modes |  [optional]
**freeze** | **String** | The locked amount is valid in single currency margin/cross-currency margin/combined margin mode |  [optional]
**borrowed** | **String** | Borrow limit, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**negativeLiab** | **String** | Negative balance loan is valid in cross-currency margin/combined margin mode, and is 0 in other modes such as single-currency margin mode |  [optional]
**futuresPosLiab** | **String** | Contract opening position borrowing currency (abandoned, to be offline field) |  [optional]
**equity** | **String** | Equity, valid in single currency margin/cross currency margin/combined margin mode |  [optional]
**totalFreeze** | **String** | Total occupancy (discarded, to be offline field) |  [optional]
**totalLiab** | **String** | Total borrowing, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**spotInUse** | **String** | The amount of spot hedging is valid in the combined margin mode, and is 0 in other margin modes such as single currency and cross-currency margin modes |  [optional]
**funding** | **String** | Yubibao financial management amount, effective when Yubibao financial management is turned on as a unified account margin switch |  [optional]
**fundingVersion** | **String** | Funding version |  [optional]
**crossBalance** | **String** | Full margin balance is valid in single currency margin mode, and is 0 in other modes such as cross currency margin/combined margin mode |  [optional]
**isoBalance** | **String** | Isolated margin balance is valid in single-currency margin mode and is 0 in other modes such as cross-currency margin/combined margin mode |  [optional]
**im** | **String** | Full-position initial margin is valid in single-currency margin mode and is 0 in other modes such as cross-currency margin/combined margin mode |  [optional]
**mm** | **String** | Full-position maintenance margin rate is valid in single-currency margin mode and is 0 in other modes such as cross-currency margin/combined margin mode |  [optional]
**imr** | **String** | Full-position initial margin rate is valid in single-currency margin mode and is 0 in other modes such as cross-currency margin/combined margin mode |  [optional]
**mmr** | **String** | Full-position maintenance margin rate is valid in single-currency margin mode and is 0 in other modes such as cross-currency margin/combined margin mode |  [optional]
**marginBalance** | **String** | Full margin balance is valid in single currency margin mode and is 0 in other modes such as cross currency margin/combined margin mode |  [optional]
**availableMargin** | **String** | Full margin available for full position is valid in single currency margin mode, and is 0 in other modes such as cross-currency margin/combined margin mode |  [optional]

