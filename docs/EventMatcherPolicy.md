
# EventMatcherPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**component** | **kotlin.String** | Get object component so that we know how to edit the object |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**boundTo** | **kotlin.Int** | Return objects policy is bound to |  [readonly]
**executionLogging** | **kotlin.Boolean** | When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged. |  [optional]
**action** | [**EventActions**](EventActions.md) |  |  [optional]
**clientIp** | **kotlin.String** | Matches Event&#39;s Client IP (strict matching, for network matching use an Expression Policy) |  [optional]
**app** | [**AppEnum**](AppEnum.md) |  |  [optional]
**model** | [**ModelEnum**](ModelEnum.md) |  |  [optional]



