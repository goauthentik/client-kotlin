
# LDAPSource

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
**serverUri** | [**java.net.URI**](java.net.URI.md) |  | 
**baseDn** | **kotlin.String** |  | 
**connectivity** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;&gt;** | Get cached source connectivity |  [readonly]
**enabled** | **kotlin.Boolean** |  |  [optional]
**authenticationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when authenticating existing users. |  [optional]
**enrollmentFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow to use when enrolling new users. |  [optional]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**userMatchingMode** | [**UserMatchingModeEnum**](UserMatchingModeEnum.md) |  |  [optional]
**userPathTemplate** | **kotlin.String** |  |  [optional]
**peerCertificate** | [**java.util.UUID**](java.util.UUID.md) | Optionally verify the LDAP Server&#39;s Certificate against the CA Chain in this keypair. |  [optional]
**clientCertificate** | [**java.util.UUID**](java.util.UUID.md) | Client certificate to authenticate against the LDAP Server&#39;s Certificate. |  [optional]
**bindCn** | **kotlin.String** |  |  [optional]
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



