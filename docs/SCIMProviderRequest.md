
# SCIMProviderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**url** | **kotlin.String** | Base URL to SCIM requests, usually ends in /v2 | 
**token** | **kotlin.String** | Authentication token | 
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**propertyMappingsGroup** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Property mappings used for group creation/updating. |  [optional]
**excludeUsersServiceAccount** | **kotlin.Boolean** |  |  [optional]
**filterGroup** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]



