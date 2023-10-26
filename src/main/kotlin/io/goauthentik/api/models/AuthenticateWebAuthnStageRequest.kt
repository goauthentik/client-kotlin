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

import io.goauthentik.api.models.AuthenticatorAttachmentEnum
import io.goauthentik.api.models.FlowSetRequest
import io.goauthentik.api.models.ResidentKeyRequirementEnum
import io.goauthentik.api.models.UserVerificationEnum

import com.squareup.moshi.Json

/**
 * AuthenticateWebAuthnStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param configureFlow Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage.
 * @param friendlyName 
 * @param userVerification 
 * @param authenticatorAttachment 
 * @param residentKeyRequirement 
 */

data class AuthenticateWebAuthnStageRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    /* Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. */
    @Json(name = "configure_flow")
    val configureFlow: java.util.UUID? = null,

    @Json(name = "friendly_name")
    val friendlyName: kotlin.String? = null,

    @Json(name = "user_verification")
    val userVerification: UserVerificationEnum? = null,

    @Json(name = "authenticator_attachment")
    val authenticatorAttachment: AuthenticatorAttachmentEnum? = null,

    @Json(name = "resident_key_requirement")
    val residentKeyRequirement: ResidentKeyRequirementEnum? = null

)

