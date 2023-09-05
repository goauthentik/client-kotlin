
# SCIMProvider

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | **kotlin.Int** |  |  [readonly]
**name** | **kotlin.String** |  | 
**component** | **kotlin.String** | Get object component so that we know how to edit the object |  [readonly]
**assignedBackchannelApplicationSlug** | **kotlin.String** | Internal application name, used in URLs. |  [readonly]
**assignedBackchannelApplicationName** | **kotlin.String** | Application&#39;s display Name. |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**url** | **kotlin.String** | Base URL to SCIM requests, usually ends in /v2 | 
**token** | **kotlin.String** | Authentication token | 
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**propertyMappingsGroup** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Property mappings used for group creation/updating. |  [optional]
**excludeUsersServiceAccount** | **kotlin.Boolean** |  |  [optional]
**filterGroup** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]



