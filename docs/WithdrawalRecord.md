
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
**status** | [**StatusEnum**](#StatusEnum) | 交易状态  - DONE: 完成 (block_number &gt; 0 才算真的上链完成) - CANCEL: 已取消 - REQUEST: 请求中 - MANUAL: 待人工审核 - BCODE: 充值码操作 - EXTPEND: 已经发送等待确认 - FAIL: 链上失败等待确认 - INVALID: 无效订单 - VERIFY: 验证中 - PROCES: 处理中 - PEND: 处理中 - DMOVE: 待人工审核 - SPLITPEND: cny提现大于5w,自动分单 |  [optional] [readonly]
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

