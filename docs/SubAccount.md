
# SubAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remark** | **String** | Remark |  [optional]
**loginName** | **String** | 子账户登陆名：仅支持字母、数字、下划线，不可包含其他非法字符。 | 
**password** | **String** | The sub-account&#39;s password. (Default: the same as main account&#39;s password) |  [optional]
**email** | **String** | The sub-account&#39;s email address. (Default: the same as main account&#39;s email address) |  [optional]
**state** | **Integer** | Sub-account status: 1-normal, 2-locked |  [optional] [readonly]
**type** | **Integer** | Sub-account type: 1-Regular sub-account, 3-Cross margin sub-account |  [optional] [readonly]
**userId** | **Long** | Sub-account user ID |  [optional] [readonly]
**createTime** | **Long** | Created time |  [optional] [readonly]

