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
 * Special challenge for apple-native authentication flow, which happens on the client.
 *
 * @param type 
 * @param clientId 
 * @param scope 
 * @param redirectUri 
 * @param state 
 * @param flowInfo 
 * @param component 
 * @param responseErrors 
 */


data class AppleLoginChallenge (

    @Json(name = "type")
    val type: ChallengeChoices,

    @Json(name = "client_id")
    val clientId: kotlin.String,

    @Json(name = "scope")
    val scope: kotlin.String,

    @Json(name = "redirect_uri")
    val redirectUri: kotlin.String,

    @Json(name = "state")
    val state: kotlin.String,

    @Json(name = "flow_info")
    val flowInfo: ContextualFlowInfo? = null,

    @Json(name = "component")
    val component: kotlin.String? = "ak-source-oauth-apple",

    @Json(name = "response_errors")
    val responseErrors: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ErrorDetail>>? = null

)

