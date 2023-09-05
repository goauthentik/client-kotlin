
# PatchedFlowStageBindingRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**stage** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**evaluateOnPlan** | **kotlin.Boolean** | Evaluate policies during the Flow planning process. |  [optional]
**reEvaluatePolicies** | **kotlin.Boolean** | Evaluate policies when the Stage is present to the user. |  [optional]
**order** | **kotlin.Int** |  |  [optional]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**invalidResponseAction** | [**InvalidResponseActionEnum**](InvalidResponseActionEnum.md) | Configure how the flow executor should handle an invalid response to a challenge. RETRY returns the error message and a similar challenge to the executor. RESTART restarts the flow from the beginning, and RESTART_WITH_CONTEXT restarts the flow while keeping the current context.  * &#x60;retry&#x60; - Retry * &#x60;restart&#x60; - Restart * &#x60;restart_with_context&#x60; - Restart With Context |  [optional]



