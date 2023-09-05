
# PatchedOAuth2ProviderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional]
**authorizationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used when authorizing this provider. |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**clientType** | [**ClientTypeEnum**](ClientTypeEnum.md) | Confidential clients are capable of maintaining the confidentiality of their credentials. Public clients are incapable  * &#x60;confidential&#x60; - Confidential * &#x60;public&#x60; - Public |  [optional]
**clientId** | **kotlin.String** |  |  [optional]
**clientSecret** | **kotlin.String** |  |  [optional]
**accessCodeValidity** | **kotlin.String** | Access codes not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**accessTokenValidity** | **kotlin.String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**refreshTokenValidity** | **kotlin.String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]
**includeClaimsInIdToken** | **kotlin.Boolean** | Include User claims from scopes in the id_token, for applications that don&#39;t access the userinfo endpoint. |  [optional]
**signingKey** | [**java.util.UUID**](java.util.UUID.md) | Key used to sign the tokens. Only required when JWT Algorithm is set to RS256. |  [optional]
**redirectUris** | **kotlin.String** | Enter each URI on a new line. |  [optional]
**subMode** | [**SubModeEnum**](SubModeEnum.md) | Configure what data should be used as unique User Identifier. For most cases, the default should be fine.  * &#x60;hashed_user_id&#x60; - Based on the Hashed User ID * &#x60;user_id&#x60; - Based on user ID * &#x60;user_uuid&#x60; - Based on user UUID * &#x60;user_username&#x60; - Based on the username * &#x60;user_email&#x60; - Based on the User&#39;s Email. This is recommended over the UPN method. * &#x60;user_upn&#x60; - Based on the User&#39;s UPN, only works if user has a &#39;upn&#39; attribute set. Use this method only if you have different UPN and Mail domains. |  [optional]
**issuerMode** | [**IssuerModeEnum**](IssuerModeEnum.md) | Configure how the issuer field of the ID Token should be filled.  * &#x60;global&#x60; - Same identifier is used for all providers * &#x60;per_provider&#x60; - Each provider has a different issuer, based on the application slug. |  [optional]
**jwksSources** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]



