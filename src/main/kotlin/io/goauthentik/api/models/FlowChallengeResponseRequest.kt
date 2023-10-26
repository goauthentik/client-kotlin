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

import io.goauthentik.api.models.AppleChallengeResponseRequest
import io.goauthentik.api.models.AuthenticatorDuoChallengeResponseRequest
import io.goauthentik.api.models.AuthenticatorSMSChallengeResponseRequest
import io.goauthentik.api.models.AuthenticatorStaticChallengeResponseRequest
import io.goauthentik.api.models.AuthenticatorTOTPChallengeResponseRequest
import io.goauthentik.api.models.AuthenticatorValidationChallengeResponseRequest
import io.goauthentik.api.models.AuthenticatorWebAuthnChallengeResponseRequest
import io.goauthentik.api.models.AutoSubmitChallengeResponseRequest
import io.goauthentik.api.models.CaptchaChallengeResponseRequest
import io.goauthentik.api.models.ConsentChallengeResponseRequest
import io.goauthentik.api.models.DeviceChallengeRequest
import io.goauthentik.api.models.DummyChallengeResponseRequest
import io.goauthentik.api.models.EmailChallengeResponseRequest
import io.goauthentik.api.models.IdentificationChallengeResponseRequest
import io.goauthentik.api.models.OAuthDeviceCodeChallengeResponseRequest
import io.goauthentik.api.models.OAuthDeviceCodeFinishChallengeResponseRequest
import io.goauthentik.api.models.PasswordChallengeResponseRequest
import io.goauthentik.api.models.PlexAuthenticationChallengeResponseRequest
import io.goauthentik.api.models.PromptChallengeResponseRequest
import io.goauthentik.api.models.UserLoginChallengeResponseRequest

import com.squareup.moshi.Json

/**
 * 
 *
 * @param code 
 * @param response 
 * @param token 
 * @param uidField 
 * @param password 
 * @param rememberMe 
 * @param component 
 * @param phoneNumber 
 * @param selectedChallenge 
 * @param selectedStage 
 * @param webauthn 
 * @param duo 
 */

interface FlowChallengeResponseRequest {

    @Json(name = "code")
    val code: kotlin.Int
    @Json(name = "response")
    val response: kotlin.collections.Map<kotlin.String, kotlin.Any>
    @Json(name = "token")
    val token: kotlin.String
    @Json(name = "uid_field")
    val uidField: kotlin.String
    @Json(name = "password")
    val password: kotlin.String
    @Json(name = "remember_me")
    val rememberMe: kotlin.Boolean
    @Json(name = "component")
    val component: kotlin.String?
    @Json(name = "phone_number")
    val phoneNumber: kotlin.String?
    @Json(name = "selected_challenge")
    val selectedChallenge: DeviceChallengeRequest?
    @Json(name = "selected_stage")
    val selectedStage: kotlin.String?
    @Json(name = "webauthn")
    val webauthn: kotlin.collections.Map<kotlin.String, kotlin.Any>?
    @Json(name = "duo")
    val duo: kotlin.Int?
}

