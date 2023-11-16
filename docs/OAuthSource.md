
# OAuthSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** | Source&#39;s display Name. | 
**slug** | **kotlin.String** | Internal source name, used in URLs. | 
**component** | **kotlin.String** | Get object component so that we know how to edit the object |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**managed** | **kotlin.String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [readonly]
**icon** | **kotlin.String** | Get the URL to the Icon. If the name is /static or starts with http it is returned as-is |  [readonly]
**providerType** | [**ProviderTypeEnum**](ProviderTypeEnum.md) |  | 
**consumerKey** | **kotlin.String** |  | 
**callbackUrl** | **kotlin.String** | Get OAuth Callback URL |  [readonly]
**type** | [**SourceType**](SourceType.md) |  |  [readonly]
**enabled** | **kotlin.Boolean** |  |  [optional]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when authenticating existing users. |  [optional]
**enrollmentFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when enrolling new users. |  [optional]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**userMatchingMode** | [**UserMatchingModeEnum**](UserMatchingModeEnum.md) |  |  [optional]
**userPathTemplate** | **kotlin.String** |  |  [optional]
**requestTokenUrl** | **kotlin.String** | URL used to request the initial token. This URL is only required for OAuth 1. |  [optional]
**authorizationUrl** | **kotlin.String** | URL the user is redirect to to conest the flow. |  [optional]
**accessTokenUrl** | **kotlin.String** | URL used by authentik to retrieve tokens. |  [optional]
**profileUrl** | **kotlin.String** | URL used by authentik to get user information. |  [optional]
**additionalScopes** | **kotlin.String** |  |  [optional]
**oidcWellKnownUrl** | **kotlin.String** |  |  [optional]
**oidcJwksUrl** | **kotlin.String** |  |  [optional]
**oidcJwks** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



