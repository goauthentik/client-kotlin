
# LDAPSourceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Source&#39;s display Name. | 
**slug** | **kotlin.String** | Internal source name, used in URLs. | 
**serverUri** | [**java.net.URI**](java.net.URI.md) |  | 
**baseDn** | **kotlin.String** |  | 
**enabled** | **kotlin.Boolean** |  |  [optional]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when authenticating existing users. |  [optional]
**enrollmentFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when enrolling new users. |  [optional]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**userMatchingMode** | [**UserMatchingModeEnum**](UserMatchingModeEnum.md) | How the source determines if an existing user should be authenticated or a new user enrolled.  * &#x60;identifier&#x60; - Use the source-specific identifier * &#x60;email_link&#x60; - Link to a user with identical email address. Can have security implications when a source doesn&#39;t validate email addresses. * &#x60;email_deny&#x60; - Use the user&#39;s email address, but deny enrollment when the email address already exists. * &#x60;username_link&#x60; - Link to a user with identical username. Can have security implications when a username is used with another source. * &#x60;username_deny&#x60; - Use the user&#39;s username, but deny enrollment when the username already exists. |  [optional]
**userPathTemplate** | **kotlin.String** |  |  [optional]
**peerCertificate** | [**java.util.UUID**](java.util.UUID.md) | Optionally verify the LDAP Server&#39;s Certificate against the CA Chain in this keypair. |  [optional]
**clientCertificate** | [**java.util.UUID**](java.util.UUID.md) | Client certificate to authenticate against the LDAP Server&#39;s Certificate. |  [optional]
**bindCn** | **kotlin.String** |  |  [optional]
**bindPassword** | **kotlin.String** |  |  [optional]
**startTls** | **kotlin.Boolean** |  |  [optional]
**sni** | **kotlin.Boolean** |  |  [optional]
**additionalUserDn** | **kotlin.String** | Prepended to Base DN for User-queries. |  [optional]
**additionalGroupDn** | **kotlin.String** | Prepended to Base DN for Group-queries. |  [optional]
**userObjectFilter** | **kotlin.String** | Consider Objects matching this filter to be Users. |  [optional]
**groupObjectFilter** | **kotlin.String** | Consider Objects matching this filter to be Groups. |  [optional]
**groupMembershipField** | **kotlin.String** | Field which contains members of a group. |  [optional]
**objectUniquenessField** | **kotlin.String** | Field which contains a unique Identifier. |  [optional]
**syncUsers** | **kotlin.Boolean** |  |  [optional]
**syncUsersPassword** | **kotlin.Boolean** | When a user changes their password, sync it back to LDAP. This can only be enabled on a single LDAP source. |  [optional]
**syncGroups** | **kotlin.Boolean** |  |  [optional]
**syncParentGroup** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**propertyMappingsGroup** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Property mappings used for group creation/updating. |  [optional]



