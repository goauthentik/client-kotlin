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

import io.goauthentik.api.models.ChallengeChoices
import io.goauthentik.api.models.ContextualFlowInfo
import io.goauthentik.api.models.ErrorDetail

import com.squareup.moshi.Json

/**
 * Final challenge after user enters their code
 *
 * @param type 
 * @param flowInfo 
 * @param component 
 * @param responseErrors 
 */

data class OAuthDeviceCodeFinishChallenge (

    @Json(name = "type")
    val type: ChallengeChoices,

    @Json(name = "flow_info")
    val flowInfo: ContextualFlowInfo? = null,

    @Json(name = "component")
    val component: kotlin.String? = "ak-provider-oauth2-device-code-finish",

    @Json(name = "response_errors")
    val responseErrors: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ErrorDetail>>? = null

)

