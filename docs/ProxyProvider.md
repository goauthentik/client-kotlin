
# ProxyProvider

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
**clientId** | **kotlin.String** |  |  [readonly]
**externalHost** | [**java.net.URI**](java.net.URI.md) |  | 
**redirectUris** | **kotlin.String** |  |  [readonly]
**outpostSet** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [readonly]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**internalHost** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**internalHostSslValidation** | **kotlin.Boolean** | Validate SSL Certificates of upstream servers |  [optional]
**certificate** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**skipPathRegex** | **kotlin.String** | Regular expressions for which authentication is not required. Each new line is interpreted as a new Regular Expression. |  [optional]
**basicAuthEnabled** | **kotlin.Boolean** | Set a custom HTTP-Basic Authentication header based on values from authentik. |  [optional]
**basicAuthPasswordAttribute** | **kotlin.String** | User/Group Attribute used for the password part of the HTTP-Basic Header. |  [optional]
**basicAuthUserAttribute** | **kotlin.String** | User/Group Attribute used for the user part of the HTTP-Basic Header. If not set, the user&#39;s Email address is used. |  [optional]
**mode** | [**ProxyMode**](ProxyMode.md) | Enable support for forwardAuth in traefik and nginx auth_request. Exclusive with internal_host.  * &#x60;proxy&#x60; - Proxy * &#x60;forward_single&#x60; - Forward Single * &#x60;forward_domain&#x60; - Forward Domain |  [optional]
**interceptHeaderAuth** | **kotlin.Boolean** | When enabled, this provider will intercept the authorization header and authenticate requests based on its value. |  [optional]
**cookieDomain** | **kotlin.String** |  |  [optional]
**jwksSources** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**accessTokenValidity** | **kotlin.String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**refreshTokenValidity** | **kotlin.String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]



