/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.goauthentik.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * KubernetesServiceConnection Serializer
 *
 * @param pk 
 * @param name 
 * @param component 
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param local If enabled, use the local connection. Required Docker socket/Kubernetes Integration
 * @param kubeconfig Paste your kubeconfig here. authentik will automatically use the currently selected context.
 * @param verifySsl Verify SSL Certificates of the Kubernetes API endpoint
 */


data class KubernetesServiceConnection (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "component")
    val component: kotlin.String,

    /* Return object's verbose_name */
    @Json(name = "verbose_name")
    val verboseName: kotlin.String,

    /* Return object's plural verbose_name */
    @Json(name = "verbose_name_plural")
    val verboseNamePlural: kotlin.String,

    /* Return internal model name */
    @Json(name = "meta_model_name")
    val metaModelName: kotlin.String,

    /* If enabled, use the local connection. Required Docker socket/Kubernetes Integration */
    @Json(name = "local")
    val local: kotlin.Boolean? = null,

    /* Paste your kubeconfig here. authentik will automatically use the currently selected context. */
    @Json(name = "kubeconfig")
    val kubeconfig: kotlin.Any? = null,

    /* Verify SSL Certificates of the Kubernetes API endpoint */
    @Json(name = "verify_ssl")
    val verifySsl: kotlin.Boolean? = null

)

