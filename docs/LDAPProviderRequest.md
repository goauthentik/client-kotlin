
# LDAPProviderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**authorizationFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used when authorizing this provider. | 
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



