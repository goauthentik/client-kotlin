
# PatchedSAMLSourceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Source&#39;s display Name. |  [optional]
**slug** | **kotlin.String** | Internal source name, used in URLs. |  [optional]
**enabled** | **kotlin.Boolean** |  |  [optional]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when authenticating existing users. |  [optional]
**enrollmentFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when enrolling new users. |  [optional]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**userMatchingMode** | [**UserMatchingModeEnum**](UserMatchingModeEnum.md) |  |  [optional]
**userPathTemplate** | **kotlin.String** |  |  [optional]
**preAuthenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used before authentication. |  [optional]
**issuer** | **kotlin.String** | Also known as Entity ID. Defaults the Metadata URL. |  [optional]
**ssoUrl** | [**java.net.URI**](java.net.URI.md) | URL that the initial Login request is sent to. |  [optional]
**sloUrl** | [**java.net.URI**](java.net.URI.md) | Optional URL if your IDP supports Single-Logout. |  [optional]
**allowIdpInitiated** | **kotlin.Boolean** | Allows authentication flows initiated by the IdP. This can be a security risk, as no validation of the request ID is done. |  [optional]
**nameIdPolicy** | [**NameIdPolicyEnum**](NameIdPolicyEnum.md) |  |  [optional]
**bindingType** | [**BindingTypeEnum**](BindingTypeEnum.md) |  |  [optional]
**verificationKp** | [**java.util.UUID**](java.util.UUID.md) | When selected, incoming assertion&#39;s Signatures will be validated against this certificate. To allow unsigned Requests, leave on default. |  [optional]
**signingKp** | [**java.util.UUID**](java.util.UUID.md) | Keypair used to sign outgoing Responses going to the Identity Provider. |  [optional]
**digestAlgorithm** | [**DigestAlgorithmEnum**](DigestAlgorithmEnum.md) |  |  [optional]
**signatureAlgorithm** | [**SignatureAlgorithmEnum**](SignatureAlgorithmEnum.md) |  |  [optional]
**temporaryUserDeleteAfter** | **kotlin.String** | Time offset when temporary users should be deleted. This only applies if your IDP uses the NameID Format &#39;transient&#39;, and the user doesn&#39;t log out manually. (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]



