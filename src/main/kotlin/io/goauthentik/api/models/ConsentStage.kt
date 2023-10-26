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

import io.goauthentik.api.models.ConsentStageModeEnum
import io.goauthentik.api.models.FlowSet

import com.squareup.moshi.Json

/**
 * ConsentStage Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object type so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param flowSet 
 * @param mode 
 * @param consentExpireIn Offset after which consent expires. (Format: hours=1;minutes=2;seconds=3).
 */

data class ConsentStage (

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

    @Json(name = "mode")
    val mode: ConsentStageModeEnum? = null,

    /* Offset after which consent expires. (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "consent_expire_in")
    val consentExpireIn: kotlin.String? = null

)

