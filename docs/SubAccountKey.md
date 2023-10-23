
# SubAccountKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | User ID |  [optional] [readonly]
**mode** | **Integer** | Mode: 1 - classic 2 - portfolio account |  [optional]
**name** | **String** | API key name |  [optional]
**perms** | [**List&lt;ApiV4KeyPerm&gt;**](ApiV4KeyPerm.md) |  |  [optional]
**ipWhitelist** | **List&lt;String&gt;** | ip white list (list will be removed if no value is passed) |  [optional]
**key** | **String** | API Key |  [optional] [readonly]
**state** | **Integer** | State 1 - normal 2 - locked 3 - frozen |  [optional] [readonly]
**createdAt** | **String** | Creation time |  [optional] [readonly]
**updatedAt** | **String** | Last update time |  [optional] [readonly]

