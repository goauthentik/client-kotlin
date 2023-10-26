/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.1
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
 * Challenge when a flow's active stage calls `stage_invalid()`.
 *
 * @param type 
 * @param pendingUser 
 * @param pendingUserAvatar 
 * @param flowInfo 
 * @param component 
 * @param responseErrors 
 * @param errorMessage 
 */

data class AccessDeniedChallenge (

    @Json(name = "type")
    val type: ChallengeChoices,

    @Json(name = "pending_user")
    val pendingUser: kotlin.String,

    @Json(name = "pending_user_avatar")
    val pendingUserAvatar: kotlin.String,

    @Json(name = "flow_info")
    val flowInfo: ContextualFlowInfo? = null,

    @Json(name = "component")
    val component: kotlin.String? = "ak-stage-access-denied",

    @Json(name = "response_errors")
    val responseErrors: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ErrorDetail>>? = null,

    @Json(name = "error_message")
    val errorMessage: kotlin.String? = null

)

