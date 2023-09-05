
# Application

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** | Application&#39;s display Name. | 
**slug** | **kotlin.String** | Internal application name, used in URLs. | 
**providerObj** | [**Provider**](Provider.md) |  |  [readonly]
**backchannelProvidersObj** | [**kotlin.collections.List&lt;Provider&gt;**](Provider.md) |  |  [readonly]
**launchUrl** | **kotlin.String** | Allow formatting of launch URL |  [readonly]
**metaIcon** | **kotlin.String** | Get the URL to the App Icon image. If the name is /static or starts with http it is returned as-is |  [readonly]
**provider** | **kotlin.Int** |  |  [optional]
**backchannelProviders** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**openInNewTab** | **kotlin.Boolean** | Open launch URL in a new browser tab or window. |  [optional]
**metaLaunchUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**metaDescription** | **kotlin.String** |  |  [optional]
**metaPublisher** | **kotlin.String** |  |  [optional]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**group** | **kotlin.String** |  |  [optional]



