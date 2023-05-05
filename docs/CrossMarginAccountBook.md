
# CrossMarginAccountBook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Balance change record ID |  [optional]
**time** | **Long** | The timestamp of the change (in milliseconds) |  [optional]
**currency** | **String** | Currency changed |  [optional]
**change** | **String** | Amount changed. Positive value means transferring in, while negative out |  [optional]
**balance** | **String** | Balance after change |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Account change type, including:  - in: transferals into cross margin account - out: transferals out from cross margin account - repay: loan repayment - borrow: borrowed loan - interest: interest - new_order: new order locked - order_fill: order fills - referral_fee: fee refund from referrals - order_fee: order fee generated from fills - futures_in: transfer into futures account - futures_out: transfer out of futures account - unknown: unknown type |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
IN | &quot;in&quot;
OUT | &quot;out&quot;
REPAY | &quot;repay&quot;
BORROW | &quot;borrow&quot;
INTEREST | &quot;interest&quot;
NEW_ORDER | &quot;new_order&quot;
ORDER_FILL | &quot;order_fill&quot;
REFERRAL_FEE | &quot;referral_fee&quot;
ORDER_FEE | &quot;order_fee&quot;
FUTURES_IN | &quot;futures_in&quot;
FUTURES_OUT | &quot;futures_out&quot;
UNKNOWN | &quot;unknown&quot;

