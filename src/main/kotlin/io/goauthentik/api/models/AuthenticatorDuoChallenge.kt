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
 * Duo Challenge
 *
 * @param type 
 * @param pendingUser 
 * @param pendingUserAvatar 
 * @param activationBarcode 
 * @param activationCode 
 * @param stageUuid 
 * @param flowInfo 
 * @param component 
 * @param responseErrors 
 */


data class AuthenticatorDuoChallenge (

    @Json(name = "type")
    val type: ChallengeChoices,

    @Json(name = "pending_user")
    val pendingUser: kotlin.String,

    @Json(name = "pending_user_avatar")
    val pendingUserAvatar: kotlin.String,

    @Json(name = "activation_barcode")
    val activationBarcode: kotlin.String,

    @Json(name = "activation_code")
    val activationCode: kotlin.String,

    @Json(name = "stage_uuid")
    val stageUuid: kotlin.String,

    @Json(name = "flow_info")
    val flowInfo: ContextualFlowInfo? = null,

    @Json(name = "component")
    val component: kotlin.String? = "ak-stage-authenticator-duo",

    @Json(name = "response_errors")
    val responseErrors: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ErrorDetail>>? = null

)

