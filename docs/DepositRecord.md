
# DepositRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Record ID |  [optional] [readonly]
**txid** | **String** | Hash record of the withdrawal |  [optional] [readonly]
**withdrawOrderId** | **String** | Client order id, up to 32 length and can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.)  |  [optional]
**timestamp** | **String** | Operation time |  [optional] [readonly]
**amount** | **String** | Token amount | 
**currency** | **String** | Currency name | 
**address** | **String** | Withdrawal address. Required for withdrawals |  [optional]
**memo** | **String** | Additional remarks with regards to the withdrawal |  [optional]
**status** | **String** | Trading Status  - REVIEW: Recharge review (compliance review) - PEND: Processing - DONE: Waiting for funds to be unlocked - INVALID: Invalid data - TRACK: Track the number of confirmations, waiting to add funds to the user (spot) - BLOCKED: Rejected Recharge - DEP_CREDITED: Recharge to account, withdrawal is not unlocked |  [optional] [readonly]
**chain** | **String** | Name of the chain used in withdrawals | 

