
# ModelRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**authorizationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used when authorizing this provider. | 
**externalHost** | [**java.net.URI**](java.net.URI.md) |  | 
**acsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**url** | **kotlin.String** | Base URL to SCIM requests, usually ends in /v2 | 
**token** | **kotlin.String** | Authentication token | 
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**baseDn** | **kotlin.String** | DN under which objects are accessible. |  [optional]
**searchGroup** | [**java.util.UUID**](java.util.UUID.md) | Users in this group can do search queries. If not set, every user can execute search queries. |  [optional]
**certificate** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**tlsServerName** | **kotlin.String** |  |  [optional]
**uidStartNumber** | **kotlin.Int** | The start for uidNumbers, this number is added to the user.pk to make sure that the numbers aren&#39;t too low for POSIX users. Default is 2000 to ensure that we don&#39;t collide with local users uidNumber |  [optional]
**gidStartNumber** | **kotlin.Int** | The start for gidNumbers, this number is added to a number generated from the group.pk to make sure that the numbers aren&#39;t too low for POSIX groups. Default is 4000 to ensure that we don&#39;t collide with local groups or users primary groups gidNumber |  [optional]
**searchMode** | [**LDAPAPIAccessMode**](LDAPAPIAccessMode.md) |  |  [optional]
**bindMode** | [**LDAPAPIAccessMode**](LDAPAPIAccessMode.md) |  |  [optional]
**mfaSupport** | **kotlin.Boolean** | When enabled, code-based multi-factor authentication can be used by appending a semicolon and the TOTP code to the password. This should only be enabled if all users that will bind to this provider have a TOTP device configured, as otherwise a password may incorrectly be rejected if it contains a semicolon. |  [optional]
**clientType** | [**ClientTypeEnum**](ClientTypeEnum.md) |  |  [optional]
**clientId** | **kotlin.String** |  |  [optional]
**clientSecret** | **kotlin.String** |  |  [optional]
**accessCodeValidity** | **kotlin.String** | Access codes not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**accessTokenValidity** | **kotlin.String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**refreshTokenValidity** | **kotlin.String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**includeClaimsInIdToken** | **kotlin.Boolean** | Include User claims from scopes in the id_token, for applications that don&#39;t access the userinfo endpoint. |  [optional]
**signingKey** | [**java.util.UUID**](java.util.UUID.md) | Key used to sign the tokens. Only required when JWT Algorithm is set to RS256. |  [optional]
**redirectUris** | **kotlin.String** | Enter each URI on a new line. |  [optional]
**subMode** | [**SubModeEnum**](SubModeEnum.md) |  |  [optional]
**issuerMode** | [**IssuerModeEnum**](IssuerModeEnum.md) |  |  [optional]
**jwksSources** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**internalHost** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**internalHostSslValidation** | **kotlin.Boolean** | Validate SSL Certificates of upstream servers |  [optional]
**skipPathRegex** | **kotlin.String** | Regular expressions for which authentication is not required. Each new line is interpreted as a new Regular Expression. |  [optional]
**basicAuthEnabled** | **kotlin.Boolean** | Set a custom HTTP-Basic Authentication header based on values from authentik. |  [optional]
**basicAuthPasswordAttribute** | **kotlin.String** | User/Group Attribute used for the password part of the HTTP-Basic Header. |  [optional]
**basicAuthUserAttribute** | **kotlin.String** | User/Group Attribute used for the user part of the HTTP-Basic Header. If not set, the user&#39;s Email address is used. |  [optional]
**mode** | [**ProxyMode**](ProxyMode.md) |  |  [optional]
**interceptHeaderAuth** | **kotlin.Boolean** | When enabled, this provider will intercept the authorization header and authenticate requests based on its value. |  [optional]
**cookieDomain** | **kotlin.String** |  |  [optional]
**settings** | [**kotlin.Any**](.md) |  |  [optional]
**connectionExpiry** | **kotlin.String** | Determines how long a session lasts. Default of 0 means that the sessions lasts until the browser is closed. (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3) |  [optional]
**clientNetworks** | **kotlin.String** | List of CIDRs (comma-separated) that clients can connect from. A more specific CIDR will match before a looser one. Clients connecting from a non-specified CIDR will be dropped. |  [optional]
**sharedSecret** | **kotlin.String** | Shared secret between clients and server to hash packets. |  [optional]
**audience** | **kotlin.String** | Value of the audience restriction field of the assertion. When left empty, no audience restriction will be added. |  [optional]
**issuer** | **kotlin.String** | Also known as EntityID |  [optional]
**assertionValidNotBefore** | **kotlin.String** | Assertion valid not before current time + this value (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3). |  [optional]
**assertionValidNotOnOrAfter** | **kotlin.String** | Assertion not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**sessionValidNotOnOrAfter** | **kotlin.String** | Session not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**nameIdMapping** | [**java.util.UUID**](java.util.UUID.md) | Configure how the NameID value will be created. When left empty, the NameIDPolicy of the incoming request will be considered |  [optional]
**digestAlgorithm** | [**DigestAlgorithmEnum**](DigestAlgorithmEnum.md) |  |  [optional]
**signatureAlgorithm** | [**SignatureAlgorithmEnum**](SignatureAlgorithmEnum.md) |  |  [optional]
**signingKp** | [**java.util.UUID**](java.util.UUID.md) | Keypair used to sign outgoing Responses going to the Service Provider. |  [optional]
**verificationKp** | [**java.util.UUID**](java.util.UUID.md) | When selected, incoming assertion&#39;s Signatures will be validated against this certificate. To allow unsigned Requests, leave on default. |  [optional]
**spBinding** | [**SpBindingEnum**](SpBindingEnum.md) |  |  [optional]
**defaultRelayState** | **kotlin.String** | Default relay_state value for IDP-initiated logins |  [optional]
**propertyMappingsGroup** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Property mappings used for group creation/updating. |  [optional]
**excludeUsersServiceAccount** | **kotlin.Boolean** |  |  [optional]
**filterGroup** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]



