
# FlowStageBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**policybindingmodelPtrId** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**target** | [**java.util.UUID**](java.util.UUID.md) |  | 
**stage** | [**java.util.UUID**](java.util.UUID.md) |  | 
**stageObj** | [**Stage**](Stage.md) |  |  [readonly]
**order** | **kotlin.Int** |  | 
**evaluateOnPlan** | **kotlin.Boolean** | Evaluate policies during the Flow planning process. |  [optional]
**reEvaluatePolicies** | **kotlin.Boolean** | Evaluate policies when the Stage is present to the user. |  [optional]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**invalidResponseAction** | [**InvalidResponseActionEnum**](InvalidResponseActionEnum.md) |  |  [optional]



