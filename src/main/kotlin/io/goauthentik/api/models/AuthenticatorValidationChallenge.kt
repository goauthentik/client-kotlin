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

import io.goauthentik.api.models.ChallengeChoices
import io.goauthentik.api.models.ContextualFlowInfo
import io.goauthentik.api.models.DeviceChallenge
import io.goauthentik.api.models.ErrorDetail
import io.goauthentik.api.models.SelectableStage

import com.squareup.moshi.Json

/**
 * Authenticator challenge
 *
 * @param type 
 * @param pendingUser 
 * @param pendingUserAvatar 
 * @param deviceChallenges 
 * @param configurationStages 
 * @param flowInfo 
 * @param component 
 * @param responseErrors 
 */

data class AuthenticatorValidationChallenge (

    @Json(name = "type")
    val type: ChallengeChoices,

    @Json(name = "pending_user")
    val pendingUser: kotlin.String,

    @Json(name = "pending_user_avatar")
    val pendingUserAvatar: kotlin.String,

    @Json(name = "device_challenges")
    val deviceChallenges: kotlin.collections.List<DeviceChallenge>,

    @Json(name = "configuration_stages")
    val configurationStages: kotlin.collections.List<SelectableStage>,

    @Json(name = "flow_info")
    val flowInfo: ContextualFlowInfo? = null,

    @Json(name = "component")
    val component: kotlin.String? = "ak-stage-authenticator-validate",

    @Json(name = "response_errors")
    val responseErrors: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ErrorDetail>>? = null

)

