
# MyFuturesTradeTimeRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tradeId** | **String** | Fill ID |  [optional]
**createTime** | **Double** | Fill Time |  [optional]
**contract** | **String** | Futures contract |  [optional]
**orderId** | **String** | Related order ID |  [optional]
**size** | **Long** | Trading size |  [optional]
**closeSize** | **Long** | Number of closed positions:  close_size&#x3D;0 &amp;&amp; size＞0 Open long position close_size&#x3D;0 &amp;&amp; size＜0 Open short position close_size&gt;0 &amp;&amp; size&gt;0 &amp;&amp; size &lt;&#x3D; close_size Close short position close_size&gt;0 &amp;&amp; size&gt;0 &amp;&amp; size &gt; close_size Close short position and open long position close_size&lt;0 &amp;&amp; size&lt;0 &amp;&amp; size &gt;&#x3D; close_size Close long position close_size&lt;0 &amp;&amp; size&lt;0 &amp;&amp; size &lt; close_size Close long position and open short position |  [optional]
**price** | **String** | Fill Price |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role. taker - taker, maker - maker |  [optional]
**text** | **String** | Order custom information |  [optional]
**fee** | **String** | Trade fee |  [optional]
**pointFee** | **String** | Points used to deduct trade fee |  [optional]

## Enum: RoleEnum

Name | Value
---- | -----
TAKER | &quot;taker&quot;
MAKER | &quot;maker&quot;

