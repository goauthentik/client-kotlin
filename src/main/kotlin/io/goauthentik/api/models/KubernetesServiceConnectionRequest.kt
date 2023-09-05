/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.2
 * Contact: hello@goauthentik.io
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.goauthentik.api.models


import com.squareup.moshi.Json

/**
 * KubernetesServiceConnection Serializer
 *
 * @param name 
 * @param local If enabled, use the local connection. Required Docker socket/Kubernetes Integration
 * @param kubeconfig Paste your kubeconfig here. authentik will automatically use the currently selected context.
 * @param verifySsl Verify SSL Certificates of the Kubernetes API endpoint
 */

data class KubernetesServiceConnectionRequest (

    @Json(name = "name")
    val name: kotlin.String,

    /* If enabled, use the local connection. Required Docker socket/Kubernetes Integration */
    @Json(name = "local")
    val local: kotlin.Boolean? = null,

    /* Paste your kubeconfig here. authentik will automatically use the currently selected context. */
    @Json(name = "kubeconfig")
    val kubeconfig: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* Verify SSL Certificates of the Kubernetes API endpoint */
    @Json(name = "verify_ssl")
    val verifySsl: kotlin.Boolean? = null

)

