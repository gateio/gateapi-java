
# UnifiedCollateralReq

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collateralType** | [**CollateralTypeEnum**](#CollateralTypeEnum) | User-set collateral mode0(all)-All currencies used as collateral, collateral; when collateral_type is 0(all), the enable_list and disable_list parameters are invalid |  [optional]
**enableList** | **List&lt;String&gt;** | Currency list, where collateral_type&#x3D;1(custom) indicates the logic of addition |  [optional]
**disableList** | **List&lt;String&gt;** | Cancellation list, indicating the logic of cancellation. |  [optional]

## Enum: CollateralTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

