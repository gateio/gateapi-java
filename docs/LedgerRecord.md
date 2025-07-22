
# LedgerRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Record ID. |  [optional] [readonly]
**txid** | **String** | Hash record of the withdrawal. |  [optional] [readonly]
**withdrawOrderId** | **String** | User-defined order number when withdrawing. Default is empty. When not empty, the specified user-defined order number record will be queried |  [optional]
**timestamp** | **String** | Operation time. |  [optional] [readonly]
**amount** | **String** | Currency amount. | 
**currency** | **String** | Currency name. | 
**address** | **String** | Withdrawal address. Required for withdrawals. |  [optional]
**memo** | **String** | Additional remarks with regards to the withdrawal. |  [optional]
**withdrawId** | **String** | The withdrawal record id starts with w, such as: w1879219868. When withdraw_id is not empty, the value querys this withdrawal record and no longer querys according to time |  [optional]
**assetClass** | **String** | The currency type of withdrawal record is empty by default. It supports users to query the withdrawal records in the main and innovation areas on demand. Value range: SPOT, PILOT  SPOT: Main Zone  PILOT: Innovation Zone |  [optional]
**status** | **String** | Record status.  - DONE: done - CANCEL: cancelled - REQUEST: requesting - MANUAL: pending manual approval - BCODE: GateCode operation - EXTPEND: pending confirm after sending - FAIL: pending confirm when fail - INVALID: invalid order - VERIFY: verifying - PROCES: processing - PEND: pending - DMOVE: required manual approval - REVIEW: Under review |  [optional] [readonly]
**chain** | **String** | Name of the chain used in withdrawals. | 

