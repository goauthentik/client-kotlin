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

import io.goauthentik.api.models.ChallengeChoices
import io.goauthentik.api.models.ContextualFlowInfo
import io.goauthentik.api.models.ErrorDetail

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * challenge type to render HTML as-is
 *
 * @param type 
 * @param body 
 * @param flowInfo 
 * @param component 
 * @param responseErrors 
 */


data class ShellChallenge (

    @Json(name = "type")
    val type: ChallengeChoices,

    @Json(name = "body")
    val body: kotlin.String,

    @Json(name = "flow_info")
    val flowInfo: ContextualFlowInfo? = null,

    @Json(name = "component")
    val component: kotlin.String? = "xak-flow-shell",

    @Json(name = "response_errors")
    val responseErrors: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ErrorDetail>>? = null

)

