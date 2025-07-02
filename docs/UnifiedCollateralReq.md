
# UnifiedCollateralReq

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collateralType** | [**CollateralTypeEnum**](#CollateralTypeEnum) | 用户设置抵押物模式 0(all)-全部币种作为抵押物,1(custom)-自定义币种作为抵押物,collateral_type为0(all)时，enable_list与disable_list参数无效 |  [optional]
**enableList** | **List&lt;String&gt;** | 币种列表，collateral_type&#x3D;1(custom)表示追加的逻辑 |  [optional]
**disableList** | **List&lt;String&gt;** | 取消列表，表示取消的逻辑 |  [optional]

## Enum: CollateralTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

