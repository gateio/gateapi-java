
# SpotPriceTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **String** | Trigger price | 
**rule** | [**RuleEnum**](#RuleEnum) | Price trigger condition  - &gt;&#x3D;: triggered when market price larger than or equal to &#x60;price&#x60; field - &lt;&#x3D;: triggered when market price less than or equal to &#x60;price&#x60; field  | 
**expiration** | **Integer** | How many seconds will the order wait for the condition being triggered. Order will be cancelled on timed out | 

## Enum: RuleEnum

Name | Value
---- | -----
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;

