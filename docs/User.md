
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | **kotlin.Int** |  |  [readonly]
**username** | **kotlin.String** |  | 
**name** | **kotlin.String** | User&#39;s display name. | 
**isSuperuser** | **kotlin.Boolean** |  |  [readonly]
**groupsObj** | [**kotlin.collections.List&lt;UserGroup&gt;**](UserGroup.md) |  |  [readonly]
**avatar** | **kotlin.String** |  |  [readonly]
**uid** | **kotlin.String** |  |  [readonly]
**isActive** | **kotlin.Boolean** | Designates whether this user should be treated as active. Unselect this instead of deleting accounts. |  [optional]
**lastLogin** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**groups** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**path** | **kotlin.String** |  |  [optional]
**type** | [**UserTypeEnum**](UserTypeEnum.md) |  |  [optional]



