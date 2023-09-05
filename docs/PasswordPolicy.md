
# PasswordPolicy

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
**passwordField** | **kotlin.String** | Field key to check, field keys defined in Prompt stages are available. |  [optional]
**amountDigits** | **kotlin.Int** |  |  [optional]
**amountUppercase** | **kotlin.Int** |  |  [optional]
**amountLowercase** | **kotlin.Int** |  |  [optional]
**amountSymbols** | **kotlin.Int** |  |  [optional]
**lengthMin** | **kotlin.Int** |  |  [optional]
**symbolCharset** | **kotlin.String** |  |  [optional]
**errorMessage** | **kotlin.String** |  |  [optional]
**checkStaticRules** | **kotlin.Boolean** |  |  [optional]
**checkHaveIBeenPwned** | **kotlin.Boolean** |  |  [optional]
**checkZxcvbn** | **kotlin.Boolean** |  |  [optional]
**hibpAllowedCount** | **kotlin.Int** | How many times the password hash is allowed to be on haveibeenpwned |  [optional]
**zxcvbnScoreThreshold** | **kotlin.Int** | If the zxcvbn score is equal or less than this value, the policy will fail. |  [optional]



