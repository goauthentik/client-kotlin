
# RACProvider

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | **kotlin.Int** |  |  [readonly]
**name** | **kotlin.String** |  | 
**authorizationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used when authorizing this provider. | 
**component** | **kotlin.String** | Get object component so that we know how to edit the object |  [readonly]
**assignedApplicationSlug** | **kotlin.String** | Internal application name, used in URLs. |  [readonly]
**assignedApplicationName** | **kotlin.String** | Application&#39;s display Name. |  [readonly]
**assignedBackchannelApplicationSlug** | **kotlin.String** | Internal application name, used in URLs. |  [readonly]
**assignedBackchannelApplicationName** | **kotlin.String** | Application&#39;s display Name. |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**outpostSet** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [readonly]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**settings** | [**kotlin.Any**](.md) |  |  [optional]
**connectionExpiry** | **kotlin.String** | Determines how long a session lasts. Default of 0 means that the sessions lasts until the browser is closed. (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3) |  [optional]



