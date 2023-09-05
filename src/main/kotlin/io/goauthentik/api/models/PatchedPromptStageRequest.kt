/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.2
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
 * PromptStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param fields 
 * @param validationPolicies 
 */

data class PatchedPromptStageRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    @Json(name = "fields")
    val fields: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "validation_policies")
    val validationPolicies: kotlin.collections.List<java.util.UUID>? = null

)

