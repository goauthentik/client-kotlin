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

import io.goauthentik.api.models.FlowSet

import com.squareup.moshi.Json

/**
 * EmailStage Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object type so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param flowSet 
 * @param useGlobalSettings When enabled, global Email connection settings will be used and connection settings below will be ignored.
 * @param host 
 * @param port 
 * @param username 
 * @param useTls 
 * @param useSsl 
 * @param timeout 
 * @param fromAddress 
 * @param tokenExpiry Time in minutes the token sent is valid.
 * @param subject 
 * @param template 
 * @param activateUserOnSuccess Activate users upon completion of stage.
 */

data class EmailStage (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    /* Get object type so that we know how to edit the object */
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

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSet>? = null,

    /* When enabled, global Email connection settings will be used and connection settings below will be ignored. */
    @Json(name = "use_global_settings")
    val useGlobalSettings: kotlin.Boolean? = null,

    @Json(name = "host")
    val host: kotlin.String? = null,

    @Json(name = "port")
    val port: kotlin.Int? = null,

    @Json(name = "username")
    val username: kotlin.String? = null,

    @Json(name = "use_tls")
    val useTls: kotlin.Boolean? = null,

    @Json(name = "use_ssl")
    val useSsl: kotlin.Boolean? = null,

    @Json(name = "timeout")
    val timeout: kotlin.Int? = null,

    @Json(name = "from_address")
    val fromAddress: kotlin.String? = null,

    /* Time in minutes the token sent is valid. */
    @Json(name = "token_expiry")
    val tokenExpiry: kotlin.Int? = null,

    @Json(name = "subject")
    val subject: kotlin.String? = null,

    @Json(name = "template")
    val template: kotlin.String? = null,

    /* Activate users upon completion of stage. */
    @Json(name = "activate_user_on_success")
    val activateUserOnSuccess: kotlin.Boolean? = null

)

