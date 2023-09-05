
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
**userMatchingMode** | [**UserMatchingModeEnum**](UserMatchingModeEnum.md) | How the source determines if an existing user should be authenticated or a new user enrolled.  * &#x60;identifier&#x60; - Use the source-specific identifier * &#x60;email_link&#x60; - Link to a user with identical email address. Can have security implications when a source doesn&#39;t validate email addresses. * &#x60;email_deny&#x60; - Use the user&#39;s email address, but deny enrollment when the email address already exists. * &#x60;username_link&#x60; - Link to a user with identical username. Can have security implications when a username is used with another source. * &#x60;username_deny&#x60; - Use the user&#39;s username, but deny enrollment when the username already exists. |  [optional]
**userPathTemplate** | **kotlin.String** |  |  [optional]
**requestTokenUrl** | **kotlin.String** | URL used to request the initial token. This URL is only required for OAuth 1. |  [optional]
**authorizationUrl** | **kotlin.String** | URL the user is redirect to to conest the flow. |  [optional]
**accessTokenUrl** | **kotlin.String** | URL used by authentik to retrieve tokens. |  [optional]
**profileUrl** | **kotlin.String** | URL used by authentik to get user information. |  [optional]
**additionalScopes** | **kotlin.String** |  |  [optional]
**oidcWellKnownUrl** | **kotlin.String** |  |  [optional]
**oidcJwksUrl** | **kotlin.String** |  |  [optional]
**oidcJwks** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



