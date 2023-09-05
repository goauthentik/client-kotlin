
# SAMLSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** | Source&#39;s display Name. | 
**slug** | **kotlin.String** | Internal source name, used in URLs. | 
**component** | **kotlin.String** | Get object component so that we know how to edit the object |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**managed** | **kotlin.String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [readonly]
**icon** | **kotlin.String** | Get the URL to the Icon. If the name is /static or starts with http it is returned as-is |  [readonly]
**preAuthenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used before authentication. | 
**ssoUrl** | [**java.net.URI**](java.net.URI.md) | URL that the initial Login request is sent to. | 
**enabled** | **kotlin.Boolean** |  |  [optional]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when authenticating existing users. |  [optional]
**enrollmentFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when enrolling new users. |  [optional]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**userMatchingMode** | [**UserMatchingModeEnum**](UserMatchingModeEnum.md) | How the source determines if an existing user should be authenticated or a new user enrolled.  * &#x60;identifier&#x60; - Use the source-specific identifier * &#x60;email_link&#x60; - Link to a user with identical email address. Can have security implications when a source doesn&#39;t validate email addresses. * &#x60;email_deny&#x60; - Use the user&#39;s email address, but deny enrollment when the email address already exists. * &#x60;username_link&#x60; - Link to a user with identical username. Can have security implications when a username is used with another source. * &#x60;username_deny&#x60; - Use the user&#39;s username, but deny enrollment when the username already exists. |  [optional]
**userPathTemplate** | **kotlin.String** |  |  [optional]
**issuer** | **kotlin.String** | Also known as Entity ID. Defaults the Metadata URL. |  [optional]
**sloUrl** | [**java.net.URI**](java.net.URI.md) | Optional URL if your IDP supports Single-Logout. |  [optional]
**allowIdpInitiated** | **kotlin.Boolean** | Allows authentication flows initiated by the IdP. This can be a security risk, as no validation of the request ID is done. |  [optional]
**nameIdPolicy** | [**NameIdPolicyEnum**](NameIdPolicyEnum.md) | NameID Policy sent to the IdP. Can be unset, in which case no Policy is sent.  * &#x60;urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress&#x60; - Email * &#x60;urn:oasis:names:tc:SAML:2.0:nameid-format:persistent&#x60; - Persistent * &#x60;urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName&#x60; - X509 * &#x60;urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName&#x60; - Windows * &#x60;urn:oasis:names:tc:SAML:2.0:nameid-format:transient&#x60; - Transient |  [optional]
**bindingType** | [**BindingTypeEnum**](BindingTypeEnum.md) |  |  [optional]
**verificationKp** | [**java.util.UUID**](java.util.UUID.md) | When selected, incoming assertion&#39;s Signatures will be validated against this certificate. To allow unsigned Requests, leave on default. |  [optional]
**signingKp** | [**java.util.UUID**](java.util.UUID.md) | Keypair used to sign outgoing Responses going to the Identity Provider. |  [optional]
**digestAlgorithm** | [**DigestAlgorithmEnum**](DigestAlgorithmEnum.md) |  |  [optional]
**signatureAlgorithm** | [**SignatureAlgorithmEnum**](SignatureAlgorithmEnum.md) |  |  [optional]
**temporaryUserDeleteAfter** | **kotlin.String** | Time offset when temporary users should be deleted. This only applies if your IDP uses the NameID Format &#39;transient&#39;, and the user doesn&#39;t log out manually. (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional]



