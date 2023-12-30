
# PatchedRACProviderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional]
**authorizationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used when authorizing this provider. |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**settings** | [**kotlin.Any**](.md) |  |  [optional]
**connectionExpiry** | **kotlin.String** | Determines how long a session lasts. Default of 0 means that the sessions lasts until the browser is closed. (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3) |  [optional]



