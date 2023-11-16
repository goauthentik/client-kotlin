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

import io.goauthentik.api.models.FlowSetRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * AuthenticatorStaticStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param configureFlow Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage.
 * @param friendlyName 
 * @param tokenCount 
 * @param tokenLength 
 */


data class AuthenticatorStaticStageRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    /* Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. */
    @Json(name = "configure_flow")
    val configureFlow: java.util.UUID? = null,

    @Json(name = "friendly_name")
    val friendlyName: kotlin.String? = null,

    @Json(name = "token_count")
    val tokenCount: kotlin.Int? = null,

    @Json(name = "token_length")
    val tokenLength: kotlin.Int? = null

)

