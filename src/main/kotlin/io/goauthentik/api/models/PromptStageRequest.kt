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
 * PromptStage Serializer
 *
 * @param name 
 * @param fields 
 * @param flowSet 
 * @param validationPolicies 
 */


data class PromptStageRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "fields")
    val fields: kotlin.collections.List<java.util.UUID>,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    @Json(name = "validation_policies")
    val validationPolicies: kotlin.collections.List<java.util.UUID>? = null

)

