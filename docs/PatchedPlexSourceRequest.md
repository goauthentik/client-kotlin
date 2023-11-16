
# PatchedPlexSourceRequest

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
**clientId** | **kotlin.String** | Client identifier used to talk to Plex. |  [optional]
**allowedServers** | **kotlin.collections.List&lt;kotlin.String&gt;** | Which servers a user has to be a member of to be granted access. Empty list allows every server. |  [optional]
**allowFriends** | **kotlin.Boolean** | Allow friends to authenticate, even if you don&#39;t share a server. |  [optional]
**plexToken** | **kotlin.String** | Plex token used to check friends |  [optional]



