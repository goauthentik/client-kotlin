
# PolicyBindingRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target** | [**java.util.UUID**](java.util.UUID.md) |  | 
**order** | **kotlin.Int** |  | 
**policy** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**group** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**user** | **kotlin.Int** |  |  [optional]
**negate** | **kotlin.Boolean** | Negates the outcome of the policy. Messages are unaffected. |  [optional]
**enabled** | **kotlin.Boolean** |  |  [optional]
**timeout** | **kotlin.Int** | Timeout after which Policy execution is terminated. |  [optional]



