
# GroupMember

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | **kotlin.Int** |  |  [readonly]
**username** | **kotlin.String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. | 
**name** | **kotlin.String** | User&#39;s display name. | 
**uid** | **kotlin.String** |  |  [readonly]
**isActive** | **kotlin.Boolean** | Designates whether this user should be treated as active. Unselect this instead of deleting accounts. |  [optional]
**lastLogin** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



