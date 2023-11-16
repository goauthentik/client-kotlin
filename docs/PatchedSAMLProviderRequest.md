
# PatchedSAMLProviderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional]
**authorizationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used when authorizing this provider. |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**acsUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
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



