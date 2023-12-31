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

import io.goauthentik.api.models.AppEnum
import io.goauthentik.api.models.EventActions
import io.goauthentik.api.models.ModelEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Event Matcher Policy Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object component so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param boundTo Return objects policy is bound to
 * @param executionLogging When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged.
 * @param action 
 * @param clientIp Matches Event's Client IP (strict matching, for network matching use an Expression Policy)
 * @param app 
 * @param model 
 */


data class EventMatcherPolicy (

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

    @Json(name = "action")
    val action: EventActions? = null,

    /* Matches Event's Client IP (strict matching, for network matching use an Expression Policy) */
    @Json(name = "client_ip")
    val clientIp: kotlin.String? = null,

    @Json(name = "app")
    val app: AppEnum? = null,

    @Json(name = "model")
    val model: ModelEnum? = null

)

