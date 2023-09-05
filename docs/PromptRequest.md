
# PromptRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**fieldKey** | **kotlin.String** | Name of the form field, also used to store the value | 
**label** | **kotlin.String** |  | 
**type** | [**PromptTypeEnum**](PromptTypeEnum.md) |  | 
**required** | **kotlin.Boolean** |  |  [optional]
**placeholder** | **kotlin.String** | Optionally provide a short hint that describes the expected input value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple choices. |  [optional]
**initialValue** | **kotlin.String** | Optionally pre-fill the input with an initial value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple default choices. |  [optional]
**order** | **kotlin.Int** |  |  [optional]
**promptstageSet** | [**kotlin.collections.List&lt;StageRequest&gt;**](StageRequest.md) |  |  [optional]
**subText** | **kotlin.String** |  |  [optional]
**placeholderExpression** | **kotlin.Boolean** |  |  [optional]
**initialValueExpression** | **kotlin.Boolean** |  |  [optional]



