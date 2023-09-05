
# PatchedAuthenticatorSMSStageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**flowSet** | [**kotlin.collections.List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional]
**configureFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional]
**friendlyName** | **kotlin.String** |  |  [optional]
**provider** | [**ProviderEnum**](ProviderEnum.md) |  |  [optional]
**fromNumber** | **kotlin.String** |  |  [optional]
**accountSid** | **kotlin.String** |  |  [optional]
**auth** | **kotlin.String** |  |  [optional]
**authPassword** | **kotlin.String** |  |  [optional]
**authType** | [**AuthTypeEnum**](AuthTypeEnum.md) |  |  [optional]
**verifyOnly** | **kotlin.Boolean** | When enabled, the Phone number is only used during enrollment to verify the users authenticity. Only a hash of the phone number is saved to ensure it is not re-used in the future. |  [optional]
**mapping** | [**java.util.UUID**](java.util.UUID.md) | Optionally modify the payload being sent to custom providers. |  [optional]



