/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.0
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
 * Reputation Policy Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object component so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param boundTo Return objects policy is bound to
 * @param executionLogging When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged.
 * @param checkIp 
 * @param checkUsername 
 * @param threshold 
 */

data class ReputationPolicy (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    /* Get object component so that we know how to edit the object */
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

    /* Return objects policy is bound to */
    @Json(name = "bound_to")
    val boundTo: kotlin.Int,

    /* When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged. */
    @Json(name = "execution_logging")
    val executionLogging: kotlin.Boolean? = null,

    @Json(name = "check_ip")
    val checkIp: kotlin.Boolean? = null,

    @Json(name = "check_username")
    val checkUsername: kotlin.Boolean? = null,

    @Json(name = "threshold")
    val threshold: kotlin.Int? = null

)

