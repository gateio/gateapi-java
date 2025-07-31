
# UidPushOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Order ID |  [optional]
**pushUid** | **Long** | Initiator User ID |  [optional]
**receiveUid** | **Long** | Recipient User ID |  [optional]
**currency** | **String** | Currency name |  [optional]
**amount** | **String** | Transfer amount |  [optional]
**createTime** | **Long** | Created time |  [optional]
**status** | **String** | Withdrawal status:  - CREATING: Creating - PENDING: Waiting for recipient (Please contact the recipient to accept the transfer on Gate official website) - CANCELLING: Cancelling - CANCELLED: Cancelled - REFUSING: Refusing - REFUSED: Refused - RECEIVING: Receiving - RECEIVED: Success |  [optional]
**message** | **String** | PENDING reason tips |  [optional]
**transactionType** | **String** | Order Type |  [optional]

