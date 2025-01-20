
# UidPushOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Order ID |  [optional]
**pushUid** | **Long** | Initiator User ID |  [optional]
**receiveUid** | **Long** | Recipient User ID |  [optional]
**currency** | **String** | Currency name |  [optional]
**amount** | **String** | Transfer amount |  [optional]
**createTime** | **Long** | Creation time |  [optional]
**status** | **String** | Withdrawal Status  - CREATING: Creating - PENDING: Waiting for receiving(Please contact the other party to accept the transfer on the Gate official website) - CANCELLING: Cancelling - CANCELLED: Revoked - REFUSING: Rejection - REFUSED: Rejected - RECEIVING: Receiving - RECEIVED: Success |  [optional]
**message** | **String** | PENDING Reason Tips |  [optional]
**transactionType** | **String** | Order Type |  [optional]

