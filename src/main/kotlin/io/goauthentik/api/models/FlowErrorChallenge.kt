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

import io.goauthentik.api.models.ContextualFlowInfo
import io.goauthentik.api.models.ErrorDetail

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Challenge class when an unhandled error occurs during a stage. Normal users are shown an error message, superusers are shown a full stacktrace.
 *
 * @param requestId 
 * @param type 
 * @param flowInfo 
 * @param component 
 * @param responseErrors 
 * @param error 
 * @param traceback 
 */


data class FlowErrorChallenge (

    @Json(name = "request_id")
    val requestId: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String? = "native",

    @Json(name = "flow_info")
    val flowInfo: ContextualFlowInfo? = null,

    @Json(name = "component")
    val component: kotlin.String? = "ak-stage-flow-error",

    @Json(name = "response_errors")
    val responseErrors: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ErrorDetail>>? = null,

    @Json(name = "error")
    val error: kotlin.String? = null,

    @Json(name = "traceback")
    val traceback: kotlin.String? = null

)

