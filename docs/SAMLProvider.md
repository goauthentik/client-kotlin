
# SAMLProvider

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
**acsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**urlDownloadMetadata** | **kotlin.String** | Get metadata download URL |  [readonly]
**urlSsoPost** | **kotlin.String** | Get SSO Post URL |  [readonly]
**urlSsoRedirect** | **kotlin.String** | Get SSO Redirect URL |  [readonly]
**urlSsoInit** | **kotlin.String** | Get SSO IDP-Initiated URL |  [readonly]
**urlSloPost** | **kotlin.String** | Get SLO POST URL |  [readonly]
**urlSloRedirect** | **kotlin.String** | Get SLO redirect URL |  [readonly]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
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
**spBinding** | [**SpBindingEnum**](SpBindingEnum.md) | This determines how authentik sends the response back to the Service Provider.  * &#x60;redirect&#x60; - Redirect * &#x60;post&#x60; - Post |  [optional]
**defaultRelayState** | **kotlin.String** | Default relay_state value for IDP-initiated logins |  [optional]



