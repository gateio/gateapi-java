
# WithdrawalRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Record ID |  [optional] [readonly]
**txid** | **String** | Hash record of the withdrawal |  [optional] [readonly]
**blockNumber** | **String** | 区块编号 |  [optional] [readonly]
**withdrawOrderId** | **String** | Client order id, up to 32 length and can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.)  |  [optional]
**timestamp** | **String** | Operation time |  [optional] [readonly]
**amount** | **String** | Currency amount | 
**fee** | **String** | fee |  [optional] [readonly]
**currency** | **String** | Currency name | 
**address** | **String** | Withdrawal address. Required for withdrawals |  [optional]
**memo** | **String** | Additional remarks with regards to the withdrawal |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Transaction status  - DONE: Completed (block_number &gt; 0 is considered to be truly completed) - CANCEL: Canceled - REQUEST: Requesting - MANUAL: Pending manual review - BCODE: Recharge code operation - EXTPEND: Sent awaiting confirmation - FAIL: Failure on the chain awaiting confirmation - INVALID: Invalid order - VERIFY: Verifying - PROCES: Processing - PEND: Processing - DMOVE: pending manual review - SPLITPEND: cny withdrawal is greater than 50,000, orders will be split automatically |  [optional] [readonly]
**chain** | **String** | Name of the chain used in withdrawals | 

## Enum: StatusEnum

Name | Value
---- | -----
DONE | &quot;DONE&quot;
CANCEL | &quot;CANCEL&quot;
REQUEST | &quot;REQUEST&quot;
MANUAL | &quot;MANUAL&quot;
BCODE | &quot;BCODE&quot;
EXTPEND | &quot;EXTPEND&quot;
FAIL | &quot;FAIL&quot;
INVALID | &quot;INVALID&quot;
VERIFY | &quot;VERIFY&quot;
PROCES | &quot;PROCES&quot;
PEND | &quot;PEND&quot;
DMOVE | &quot;DMOVE&quot;
SPLITPEND | &quot;SPLITPEND&quot;

