
# ProxyOutpostConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | **kotlin.Int** |  |  [readonly]
**name** | **kotlin.String** |  | 
**externalHost** | [**java.net.URI**](java.net.URI.md) |  | 
**oidcConfiguration** | [**OpenIDConnectConfiguration**](OpenIDConnectConfiguration.md) |  |  [readonly]
**accessTokenValidity** | **kotlin.Double** | Get token validity as second count |  [readonly]
**scopesToRequest** | **kotlin.collections.List&lt;kotlin.String&gt;** | Get all the scope names the outpost should request, including custom-defined ones |  [readonly]
**assignedApplicationSlug** | **kotlin.String** | Internal application name, used in URLs. |  [readonly]
**assignedApplicationName** | **kotlin.String** | Application&#39;s display Name. |  [readonly]
**internalHost** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**internalHostSslValidation** | **kotlin.Boolean** | Validate SSL Certificates of upstream servers |  [optional]
**clientId** | **kotlin.String** |  |  [optional]
**clientSecret** | **kotlin.String** |  |  [optional]
**cookieSecret** | **kotlin.String** |  |  [optional]
**certificate** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**skipPathRegex** | **kotlin.String** | Regular expressions for which authentication is not required. Each new line is interpreted as a new Regular Expression. |  [optional]
**basicAuthEnabled** | **kotlin.Boolean** | Set a custom HTTP-Basic Authentication header based on values from authentik. |  [optional]
**basicAuthPasswordAttribute** | **kotlin.String** | User/Group Attribute used for the password part of the HTTP-Basic Header. |  [optional]
**basicAuthUserAttribute** | **kotlin.String** | User/Group Attribute used for the user part of the HTTP-Basic Header. If not set, the user&#39;s Email address is used. |  [optional]
**mode** | [**ProxyMode**](ProxyMode.md) |  |  [optional]
**cookieDomain** | **kotlin.String** |  |  [optional]
**interceptHeaderAuth** | **kotlin.Boolean** | When enabled, this provider will intercept the authorization header and authenticate requests based on its value. |  [optional]



