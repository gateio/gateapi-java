
# LedgerRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Record ID |  [optional] [readonly]
**txid** | **String** | Hash record of the withdrawal |  [optional] [readonly]
**timestamp** | **String** | Operation time |  [optional] [readonly]
**amount** | **String** | Currency amount | 
**currency** | **String** | Currency name | 
**address** | **String** | Withdrawal address. Required for withdrawals |  [optional]
**memo** | **String** | Additional remarks with regards to the withdrawal |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Record status.  - DONE: done - CANCEL: cancelled - REQUEST: requesting - MANUAL: pending manual approval - BCODE: GateCode operation - EXTPEND: pending confirm after sending - FAIL: pending confirm when fail - INVALID: invalid order - VERIFY: verifying - PROCES: processing - PEND: pending - DMOVE: required manual approval - SPLITPEND: the order is automatically split due to large amount |  [optional] [readonly]
**chain** | **String** | Name of the chain used in withdrawals |  [optional]
**fee** | **String** | Fee |  [optional]

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

