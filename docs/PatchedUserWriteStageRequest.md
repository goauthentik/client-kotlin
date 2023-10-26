
# PatchedUserWriteStageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**flowSet** | [**kotlin.collections.List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional]
**userCreationMode** | [**UserCreationModeEnum**](UserCreationModeEnum.md) |  |  [optional]
**createUsersAsInactive** | **kotlin.Boolean** | When set, newly created users are inactive and cannot login. |  [optional]
**createUsersGroup** | [**java.util.UUID**](java.util.UUID.md) | Optionally add newly created users to this group. |  [optional]
**userType** | [**UserTypeEnum**](UserTypeEnum.md) |  |  [optional]
**userPathTemplate** | **kotlin.String** |  |  [optional]



