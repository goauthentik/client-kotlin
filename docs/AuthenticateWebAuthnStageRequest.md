
# AuthenticateWebAuthnStageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**flowSet** | [**kotlin.collections.List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional]
**configureFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional]
**friendlyName** | **kotlin.String** |  |  [optional]
**userVerification** | [**UserVerificationEnum**](UserVerificationEnum.md) |  |  [optional]
**authenticatorAttachment** | [**AuthenticatorAttachmentEnum**](AuthenticatorAttachmentEnum.md) |  |  [optional]
**residentKeyRequirement** | [**ResidentKeyRequirementEnum**](ResidentKeyRequirementEnum.md) |  |  [optional]



