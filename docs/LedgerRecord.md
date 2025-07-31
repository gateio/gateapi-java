
# LedgerRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Record ID |  [optional] [readonly]
**txid** | **String** | Hash record of the withdrawal |  [optional] [readonly]
**withdrawOrderId** | **String** | User-defined order number for withdrawal. Default is empty. When not empty, the specified user-defined order number record will be queried |  [optional]
**timestamp** | **String** | Operation time |  [optional] [readonly]
**amount** | **String** | Token amount | 
**currency** | **String** | Currency name | 
**address** | **String** | Withdrawal address. Required for withdrawals |  [optional]
**memo** | **String** | Additional remarks with regards to the withdrawal |  [optional]
**withdrawId** | **String** | Withdrawal record ID starts with &#39;w&#39;, such as: w1879219868. When withdraw_id is not empty, only this specific withdrawal record will be queried, and time-based querying will be disabled |  [optional]
**assetClass** | **String** | Withdrawal record currency type, empty by default. Supports users to query withdrawal records in main area and innovation area on demand. Valid values: SPOT, PILOT  SPOT: Main area PILOT: Innovation area |  [optional]
**status** | **String** | Transaction status  - DONE: Completed - CANCEL: Cancelled - REQUEST: Requesting - MANUAL: Pending manual review - BCODE: GateCode operation - EXTPEND: Sent, waiting for confirmation - FAIL: Failed on chain, waiting for confirmation - INVALID: Invalid order - VERIFY: Verifying - PROCES: Processing - PEND: Processing - DMOVE: Pending manual review - REVIEW: Under review |  [optional] [readonly]
**chain** | **String** | Name of the chain used in withdrawals | 

