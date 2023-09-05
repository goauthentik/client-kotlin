
# UserWriteStage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**component** | **kotlin.String** | Get object type so that we know how to edit the object |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**flowSet** | [**kotlin.collections.List&lt;FlowSet&gt;**](FlowSet.md) |  |  [optional]
**userCreationMode** | [**UserCreationModeEnum**](UserCreationModeEnum.md) |  |  [optional]
**createUsersAsInactive** | **kotlin.Boolean** | When set, newly created users are inactive and cannot login. |  [optional]
**createUsersGroup** | [**java.util.UUID**](java.util.UUID.md) | Optionally add newly created users to this group. |  [optional]
**userPathTemplate** | **kotlin.String** |  |  [optional]



