

# CrossMarginBalance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available** | **String** | Available amount |  [optional]
**freeze** | **String** | Locked amount |  [optional]
**borrowed** | **String** | Borrowed amount |  [optional]
**interest** | **String** | Unpaid interests |  [optional]
**negativeLiab** | **String** | Negative Liabilities. Formula:Min[available+total+unrealized_pnl,0] |  [optional]
**futuresPosLiab** | **String** | Borrowing to Open Positions in Futures |  [optional]
**equity** | **String** | Equity. Formula: available + freeze - borrowed + futures account&#39;s total + unrealized_pnl |  [optional]
**totalFreeze** | **String** | Total freeze. Formula: freeze + position_initial_margin + order_margin |  [optional]
**totalLiab** | **String** | Total liabilities. Formula: Max[Abs[Min[quity - total_freeze,0], borrowed]] - futures_pos_liab |  [optional]



