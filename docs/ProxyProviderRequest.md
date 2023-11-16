
# ProxyProviderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**authorizationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used when authorizing this provider. | 
**externalHost** | [**java.net.URI**](java.net.URI.md) |  | 
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**internalHost** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**internalHostSslValidation** | **kotlin.Boolean** | Validate SSL Certificates of upstream servers |  [optional]
**certificate** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**skipPathRegex** | **kotlin.String** | Regular expressions for which authentication is not required. Each new line is interpreted as a new Regular Expression. |  [optional]
**basicAuthEnabled** | **kotlin.Boolean** | Set a custom HTTP-Basic Authentication header based on values from authentik. |  [optional]
**basicAuthPasswordAttribute** | **kotlin.String** | User/Group Attribute used for the password part of the HTTP-Basic Header. |  [optional]
**basicAuthUserAttribute** | **kotlin.String** | User/Group Attribute used for the user part of the HTTP-Basic Header. If not set, the user&#39;s Email address is used. |  [optional]
**mode** | [**ProxyMode**](ProxyMode.md) |  |  [optional]
**interceptHeaderAuth** | **kotlin.Boolean** | When enabled, this provider will intercept the authorization header and authenticate requests based on its value. |  [optional]
**cookieDomain** | **kotlin.String** |  |  [optional]
**jwksSources** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**accessTokenValidity** | **kotlin.String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**refreshTokenValidity** | **kotlin.String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]



