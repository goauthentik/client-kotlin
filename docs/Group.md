
# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**numPk** | **kotlin.Int** |  |  [readonly]
**name** | **kotlin.String** |  | 
**parentName** | **kotlin.String** |  |  [readonly]
**usersObj** | [**kotlin.collections.List&lt;GroupMember&gt;**](GroupMember.md) |  |  [readonly]
**rolesObj** | [**kotlin.collections.List&lt;Role&gt;**](Role.md) |  |  [readonly]
**isSuperuser** | **kotlin.Boolean** | Users added to this group will be superusers. |  [optional]
**parent** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**users** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**roles** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]



