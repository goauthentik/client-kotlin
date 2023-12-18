
# KubernetesServiceConnection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**component** | **kotlin.String** |  |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**local** | **kotlin.Boolean** | If enabled, use the local connection. Required Docker socket/Kubernetes Integration |  [optional]
**kubeconfig** | [**kotlin.Any**](.md) | Paste your kubeconfig here. authentik will automatically use the currently selected context. |  [optional]
**verifySsl** | **kotlin.Boolean** | Verify SSL Certificates of the Kubernetes API endpoint |  [optional]



