
# PatchedSCIMProviderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**propertyMappingsGroup** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Property mappings used for group creation/updating. |  [optional]
**url** | **kotlin.String** | Base URL to SCIM requests, usually ends in /v2 |  [optional]
**token** | **kotlin.String** | Authentication token |  [optional]
**excludeUsersServiceAccount** | **kotlin.Boolean** |  |  [optional]
**filterGroup** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]



