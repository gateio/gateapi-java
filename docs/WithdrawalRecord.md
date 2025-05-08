
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
**failReason** | **String** | The reason for withdrawal failure is that there is a value when status &#x3D; CANCEL, and the rest of the state is empty |  [optional]
**timestamp2** | **String** | The withdrawal end time, i.e.: withdrawal cancel time or withdrawal success time When status &#x3D; CANCEL, the corresponding cancel time When status &#x3D; DONE and block_number &gt; 0, it is the time to withdrawal success |  [optional]
**memo** | **String** | Additional remarks with regards to the withdrawal |  [optional]
**status** | **String** | Transaction status  - DONE: Completed (block_number &gt; 0 is considered to be truly completed) - CANCEL: Canceled - REQUEST: Requesting - MANUAL: Pending manual review - BCODE: Recharge code operation - EXTPEND: Sent awaiting confirmation - FAIL: Failure on the chain awaiting confirmation - INVALID: Invalid order - VERIFY: Verifying - PROCES: Processing - PEND: Processing - DMOVE: pending manual review - REVIEW: Under review |  [optional] [readonly]
**chain** | **String** | Name of the chain used in withdrawals | 

