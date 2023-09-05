
# UserGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**numPk** | **kotlin.Int** | Get a numerical, int32 ID for the group |  [readonly]
**name** | **kotlin.String** |  | 
**parentName** | **kotlin.String** |  |  [readonly]
**isSuperuser** | **kotlin.Boolean** | Users added to this group will be superusers. |  [optional]
**parent** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



