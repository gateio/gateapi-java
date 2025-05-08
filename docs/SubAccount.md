
# SubAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remark** | **String** | custom text |  [optional]
**loginName** | **String** | Sub-account login name: Only letters, numbers and underscores are supported, and cannot contain other illegal characters | 
**password** | **String** | The sub-account&#39;s password. (Default: the same as main account&#39;s password) |  [optional]
**email** | **String** | The sub-account&#39;s email address. (Default: the same as main account&#39;s email address) |  [optional]
**state** | **Integer** | State: 1-normal, 2-locked\&quot; |  [optional] [readonly]
**type** | **Integer** | \&quot;Sub-account type: 1 - sub-account, 3 - cross margin account |  [optional] [readonly]
**userId** | **Long** | The user id of the sub-account |  [optional] [readonly]
**createTime** | **Long** | Created time |  [optional] [readonly]

