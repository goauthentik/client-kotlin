
# FlowSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**policybindingmodelPtrId** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**slug** | **kotlin.String** | Visible in the URL. | 
**title** | **kotlin.String** | Shown as the Title in Flow pages. | 
**designation** | [**FlowDesignationEnum**](FlowDesignationEnum.md) | Decides what this Flow is used for. For example, the Authentication flow is redirect to when an un-authenticated user visits authentik.  * &#x60;authentication&#x60; - Authentication * &#x60;authorization&#x60; - Authorization * &#x60;invalidation&#x60; - Invalidation * &#x60;enrollment&#x60; - Enrollment * &#x60;unenrollment&#x60; - Unrenollment * &#x60;recovery&#x60; - Recovery * &#x60;stage_configuration&#x60; - Stage Configuration | 
**background** | **kotlin.String** | Get the URL to the background image. If the name is /static or starts with http it is returned as-is |  [readonly]
**exportUrl** | **kotlin.String** | Get export URL for flow |  [readonly]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**compatibilityMode** | **kotlin.Boolean** | Enable compatibility mode, increases compatibility with password managers on mobile devices. |  [optional]
**layout** | [**LayoutEnum**](LayoutEnum.md) |  |  [optional]
**deniedAction** | [**DeniedActionEnum**](DeniedActionEnum.md) | Configure what should happen when a flow denies access to a user.  * &#x60;message_continue&#x60; - Message Continue * &#x60;message&#x60; - Message * &#x60;continue&#x60; - Continue |  [optional]



