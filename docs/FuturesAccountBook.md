
# FuturesAccountBook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **Double** | Change time |  [optional]
**change** | **String** | Change amount |  [optional]
**balance** | **String** | Balance after change |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Changing Type: - dnw: Deposit &amp; Withdraw - pnl: Profit &amp; Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: POINT Deposit &amp; Withdraw - point_fee: POINT Trading fee - point_refr: POINT Referrer rebate |  [optional]
**text** | **String** | Comment |  [optional]
**contract** | **String** | Futures contract, the field is only available for data after 2023-10-30. |  [optional]
**tradeId** | **String** | trade id |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
DNW | &quot;dnw&quot;
PNL | &quot;pnl&quot;
FEE | &quot;fee&quot;
REFR | &quot;refr&quot;
FUND | &quot;fund&quot;
POINT_DNW | &quot;point_dnw&quot;
POINT_FEE | &quot;point_fee&quot;
POINT_REFR | &quot;point_refr&quot;

