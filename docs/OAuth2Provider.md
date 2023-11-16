
# OAuth2Provider

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
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
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



