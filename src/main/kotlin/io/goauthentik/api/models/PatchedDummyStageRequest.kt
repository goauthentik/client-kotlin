/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.3
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

import io.goauthentik.api.models.FlowSetRequest

import com.squareup.moshi.Json

/**
 * DummyStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param throwError 
 */

data class PatchedDummyStageRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    @Json(name = "throw_error")
    val throwError: kotlin.Boolean? = null

)

