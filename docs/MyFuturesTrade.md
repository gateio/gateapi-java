

# MyFuturesTrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Trade ID |  [optional]
**createTime** | **Double** | Trading time |  [optional]
**contract** | **String** | Futures contract |  [optional]
**orderId** | **String** | Order ID related |  [optional]
**size** | **Long** | Trading size |  [optional]
**closeSize** | **Long** | Number of closed positions:  close_size&#x3D;0 &amp;&amp; size＞0       Open long position close_size&#x3D;0 &amp;&amp; size＜0       Open short position close_size&gt;0 &amp;&amp; size&gt;0 &amp;&amp; size &lt;&#x3D; close_size Close short postion close_size&gt;0 &amp;&amp; size&gt;0 &amp;&amp; size &gt; close_size Close short position and open long position close_size&lt;0 &amp;&amp; size&lt;0 &amp;&amp; size &gt;&#x3D; close_size Close long postion close_size&lt;0 &amp;&amp; size&lt;0 &amp;&amp; size &lt; close_size Close long position and open short position |  [optional]
**price** | **String** | Trading price |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role. Available values are &#x60;taker&#x60; and &#x60;maker&#x60; |  [optional]
**text** | **String** | User defined information |  [optional]
**fee** | **String** | Fee deducted |  [optional]
**pointFee** | **String** | Points used to deduct fee |  [optional]



## Enum: RoleEnum

Name | Value
---- | -----
TAKER | &quot;taker&quot;
MAKER | &quot;maker&quot;



