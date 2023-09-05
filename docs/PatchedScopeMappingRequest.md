
# PatchedScopeMappingRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**managed** | **kotlin.String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [optional]
**name** | **kotlin.String** |  |  [optional]
**expression** | **kotlin.String** |  |  [optional]
**scopeName** | **kotlin.String** | Scope name requested by the client |  [optional]
**description** | **kotlin.String** | Description shown to the user when consenting. If left empty, the user won&#39;t be informed. |  [optional]



