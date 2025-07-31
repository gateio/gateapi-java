
# SpotPriceTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **String** | Trigger price | 
**rule** | [**RuleEnum**](#RuleEnum) | Price trigger condition  - &#x60;&gt;&#x3D;&#x60;: triggered when market price is greater than or equal to &#x60;price&#x60; - &#x60;&lt;&#x3D;&#x60;: triggered when market price is less than or equal to &#x60;price&#x60;  | 
**expiration** | **Integer** | Maximum wait time for trigger condition (in seconds). Order will be cancelled if timeout | 

## Enum: RuleEnum

Name | Value
---- | -----
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;

