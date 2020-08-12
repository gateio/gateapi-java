
# LedgerRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Record ID |  [optional] [readonly]
**txid** | **String** | Hash record of the withdrawal |  [optional] [readonly]
**timestamp** | **String** | Record time |  [optional] [readonly]
**amount** | **String** | Trade amount | 
**currency** | **String** | Record currency | 
**address** | **String** | Withdrawal address. Required for withdrawals |  [optional]
**memo** | **String** | Extra withdrawal memo |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Record status.  - DONE: done - CANCEL: cancelled - REQUEST: requesting - MANUAL: waiting for manual approval - BCODE: GateCode operation |  [optional] [readonly]

## Enum: StatusEnum

Name | Value
---- | -----
DONE | &quot;DONE&quot;
CANCEL | &quot;CANCEL&quot;
REQUEST | &quot;REQUEST&quot;
MANUAL | &quot;MANUAL&quot;
BCODE | &quot;BCODE&quot;

