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

import io.goauthentik.api.models.DigitsEnum
import io.goauthentik.api.models.FlowSet

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * AuthenticatorTOTPStage Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object type so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param digits 
 * @param flowSet 
 * @param configureFlow Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage.
 * @param friendlyName 
 */


data class AuthenticatorTOTPStage (

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

    @Json(name = "digits")
    val digits: DigitsEnum,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSet>? = null,

    /* Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. */
    @Json(name = "configure_flow")
    val configureFlow: java.util.UUID? = null,

    @Json(name = "friendly_name")
    val friendlyName: kotlin.String? = null

)

