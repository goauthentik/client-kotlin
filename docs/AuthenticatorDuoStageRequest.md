
# AuthenticatorDuoStageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**clientId** | **kotlin.String** |  | 
**clientSecret** | **kotlin.String** |  | 
**apiHostname** | **kotlin.String** |  | 
**flowSet** | [**kotlin.collections.List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional]
**configureFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional]
**friendlyName** | **kotlin.String** |  |  [optional]
**adminIntegrationKey** | **kotlin.String** |  |  [optional]
**adminSecretKey** | **kotlin.String** |  |  [optional]



