
# SubAccountKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID. |  [optional] [readonly]
**mode** | **Integer** | Mode: 1 - classic 2 - portfolio account. |  [optional]
**name** | **String** | API key name. |  [optional]
**perms** | [**List&lt;SubAccountKeyPerms&gt;**](SubAccountKeyPerms.md) |  |  [optional]
**ipWhitelist** | **List&lt;String&gt;** | ip white list (list will be removed if no value is passed). |  [optional]
**key** | **String** | API Key. |  [optional] [readonly]
**state** | **Integer** | State 1 - normal 2 - locked 3 - frozen. |  [optional] [readonly]
**createdAt** | **Long** | Creation time. |  [optional] [readonly]
**updatedAt** | **Long** | Last update time. |  [optional] [readonly]
**lastAccess** | **Long** | Last access time. |  [optional] [readonly]

