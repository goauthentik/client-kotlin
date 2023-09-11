/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.3
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
import io.goauthentik.api.models.FlowSetRequest

import com.squareup.moshi.Json

/**
 * ConsentStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param mode 
 * @param consentExpireIn Offset after which consent expires. (Format: hours=1;minutes=2;seconds=3).
 */

data class ConsentStageRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    @Json(name = "mode")
    val mode: ConsentStageModeEnum? = null,

    /* Offset after which consent expires. (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "consent_expire_in")
    val consentExpireIn: kotlin.String? = null

)

