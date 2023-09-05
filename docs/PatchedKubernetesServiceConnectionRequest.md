
# PatchedKubernetesServiceConnectionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**local** | **kotlin.Boolean** | If enabled, use the local connection. Required Docker socket/Kubernetes Integration |  [optional]
**kubeconfig** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Paste your kubeconfig here. authentik will automatically use the currently selected context. |  [optional]
**verifySsl** | **kotlin.Boolean** | Verify SSL Certificates of the Kubernetes API endpoint |  [optional]



