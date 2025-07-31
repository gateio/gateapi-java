
# UnifiedCollateralReq

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collateralType** | [**CollateralTypeEnum**](#CollateralTypeEnum) | User-set collateral mode: 0(all)-All currencies as collateral, 1(custom)-Custom currencies as collateral. When collateral_type is 0(all), enable_list and disable_list parameters are invalid |  [optional]
**enableList** | **List&lt;String&gt;** | Currency list, where collateral_type&#x3D;1(custom) indicates the addition logic |  [optional]
**disableList** | **List&lt;String&gt;** | Disable list, indicating the disable logic |  [optional]

## Enum: CollateralTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

