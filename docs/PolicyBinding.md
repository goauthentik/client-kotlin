
# PolicyBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**policyObj** | [**Policy**](Policy.md) |  |  [readonly]
**groupObj** | [**Group**](Group.md) |  |  [readonly]
**userObj** | [**User**](User.md) |  |  [readonly]
**target** | [**java.util.UUID**](java.util.UUID.md) |  | 
**order** | **kotlin.Int** |  | 
**policy** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**group** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**user** | **kotlin.Int** |  |  [optional]
**negate** | **kotlin.Boolean** | Negates the outcome of the policy. Messages are unaffected. |  [optional]
**enabled** | **kotlin.Boolean** |  |  [optional]
**timeout** | **kotlin.Int** | Timeout after which Policy execution is terminated. |  [optional]



