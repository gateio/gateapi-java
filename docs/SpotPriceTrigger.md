
# SpotPriceTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **String** | Trigger price. | 
**rule** | [**RuleEnum**](#RuleEnum) | Price trigger condition  - &#x60;&gt;&#x3D;&#x60;: triggered when market price larger than or equal to &#x60;price&#x60; field - &#x60;&lt;&#x3D;&#x60;: or equal to &#x60;price&#x60; field  | 
**expiration** | **Integer** | How long (in seconds) to wait for the condition to be triggered before cancelling the order. | 

## Enum: RuleEnum

Name | Value
---- | -----
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;

