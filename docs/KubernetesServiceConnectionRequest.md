
# KubernetesServiceConnectionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**local** | **kotlin.Boolean** | If enabled, use the local connection. Required Docker socket/Kubernetes Integration |  [optional]
**kubeconfig** | [**kotlin.Any**](.md) | Paste your kubeconfig here. authentik will automatically use the currently selected context. |  [optional]
**verifySsl** | **kotlin.Boolean** | Verify SSL Certificates of the Kubernetes API endpoint |  [optional]



