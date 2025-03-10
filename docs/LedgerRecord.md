
# LedgerRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Record ID |  [optional] [readonly]
**txid** | **String** | Hash record of the withdrawal |  [optional] [readonly]
**withdrawOrderId** | **String** | Client order id, up to 32 length and can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.)  |  [optional]
**timestamp** | **String** | Operation time |  [optional] [readonly]
**amount** | **String** | Currency amount | 
**currency** | **String** | Currency name | 
**address** | **String** | Withdrawal address. Required for withdrawals |  [optional]
**memo** | **String** | Additional remarks with regards to the withdrawal |  [optional]
**status** | **String** | Record status.  - DONE: done - CANCEL: cancelled - REQUEST: requesting - MANUAL: pending manual approval - BCODE: GateCode operation - EXTPEND: pending confirm after sending - FAIL: pending confirm when fail - INVALID: invalid order - VERIFY: verifying - PROCES: processing - PEND: pending - DMOVE: required manual approval |  [optional] [readonly]
**chain** | **String** | Name of the chain used in withdrawals | 

