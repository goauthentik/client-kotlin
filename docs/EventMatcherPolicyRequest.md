
# EventMatcherPolicyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**executionLogging** | **kotlin.Boolean** | When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged. |  [optional]
**action** | [**EventActions**](EventActions.md) |  |  [optional]
**clientIp** | **kotlin.String** | Matches Event&#39;s Client IP (strict matching, for network matching use an Expression Policy) |  [optional]
**app** | [**AppEnum**](AppEnum.md) |  |  [optional]
**model** | [**ModelEnum**](ModelEnum.md) |  |  [optional]



