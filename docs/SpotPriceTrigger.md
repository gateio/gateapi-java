

# SpotPriceTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **String** | Trigger price | 
**rule** | [**RuleEnum**](#RuleEnum) | Price trigger condition  - &gt;&#x3D;: triggered when market price larger than or equal to &#x60;price&#x60; field - &lt;&#x3D;: triggered when market price less than or equal to &#x60;price&#x60; field  | 
**expiration** | **Integer** | How long (in seconds) to wait for the condition to be triggered before cancelling the order. | 



## Enum: RuleEnum

Name | Value
---- | -----
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;



