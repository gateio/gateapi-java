
# SubAccountKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | User ID |  [optional] [readonly]
**mode** | **Integer** | Mode: 1 - classic 2 - portfolio account |  [optional]
**name** | **String** | API Key Name |  [optional]
**perms** | [**List&lt;SubAccountKeyPerms&gt;**](SubAccountKeyPerms.md) |  |  [optional]
**ipWhitelist** | **List&lt;String&gt;** | IP whitelist (list will be cleared if no value is passed) |  [optional]
**key** | **String** | API Key |  [optional] [readonly]
**state** | **Integer** | Status: 1-Normal 2-Frozen 3-Locked |  [optional] [readonly]
**createdAt** | **Long** | Created time |  [optional] [readonly]
**updatedAt** | **Long** | Last Update Time |  [optional] [readonly]
**lastAccess** | **Long** | Last Access Time |  [optional] [readonly]

