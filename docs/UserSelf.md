
# UserSelf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | **kotlin.Int** |  |  [readonly]
**username** | **kotlin.String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. | 
**name** | **kotlin.String** | User&#39;s display name. | 
**isActive** | **kotlin.Boolean** | Designates whether this user should be treated as active. Unselect this instead of deleting accounts. |  [readonly]
**isSuperuser** | **kotlin.Boolean** |  |  [readonly]
**groups** | [**kotlin.collections.List&lt;UserSelfGroups&gt;**](UserSelfGroups.md) |  |  [readonly]
**avatar** | **kotlin.String** | User&#39;s avatar, either a http/https URL or a data URI |  [readonly]
**uid** | **kotlin.String** |  |  [readonly]
**settings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Get user settings with brand and group settings applied |  [readonly]
**systemPermissions** | **kotlin.collections.List&lt;kotlin.String&gt;** | Get all system permissions assigned to the user |  [readonly]
**email** | **kotlin.String** |  |  [optional]
**type** | [**UserTypeEnum**](UserTypeEnum.md) |  |  [optional]



