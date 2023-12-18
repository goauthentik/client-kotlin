
# OAuthSourceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Source&#39;s display Name. | 
**slug** | **kotlin.String** | Internal source name, used in URLs. | 
**providerType** | [**ProviderTypeEnum**](ProviderTypeEnum.md) |  | 
**consumerKey** | **kotlin.String** |  | 
**consumerSecret** | **kotlin.String** |  | 
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
**oidcJwks** | [**kotlin.Any**](.md) |  |  [optional]



