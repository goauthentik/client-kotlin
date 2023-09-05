
# PasswordStageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**backends** | [**kotlin.collections.List&lt;BackendsEnum&gt;**](BackendsEnum.md) | Selection of backends to test the password against. | 
**flowSet** | [**kotlin.collections.List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional]
**configureFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional]
**failedAttemptsBeforeCancel** | **kotlin.Int** | How many attempts a user has before the flow is canceled. To lock the user out, use a reputation policy and a user_write stage. |  [optional]



