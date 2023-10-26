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

import io.goauthentik.api.models.DeviceClassesEnum
import io.goauthentik.api.models.FlowSetRequest
import io.goauthentik.api.models.NotConfiguredActionEnum
import io.goauthentik.api.models.UserVerificationEnum

import com.squareup.moshi.Json

/**
 * AuthenticatorValidateStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param notConfiguredAction 
 * @param deviceClasses Device classes which can be used to authenticate
 * @param configurationStages Stages used to configure Authenticator when user doesn't have any compatible devices. After this configuration Stage passes, the user is not prompted again.
 * @param lastAuthThreshold If any of the user's device has been used within this threshold, this stage will be skipped
 * @param webauthnUserVerification Enforce user verification for WebAuthn devices.  * `required` - Required * `preferred` - Preferred * `discouraged` - Discouraged
 */

data class AuthenticatorValidateStageRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    @Json(name = "not_configured_action")
    val notConfiguredAction: NotConfiguredActionEnum? = null,

    /* Device classes which can be used to authenticate */
    @Json(name = "device_classes")
    val deviceClasses: kotlin.collections.List<DeviceClassesEnum>? = null,

    /* Stages used to configure Authenticator when user doesn't have any compatible devices. After this configuration Stage passes, the user is not prompted again. */
    @Json(name = "configuration_stages")
    val configurationStages: kotlin.collections.List<java.util.UUID>? = null,

    /* If any of the user's device has been used within this threshold, this stage will be skipped */
    @Json(name = "last_auth_threshold")
    val lastAuthThreshold: kotlin.String? = null,

    /* Enforce user verification for WebAuthn devices.  * `required` - Required * `preferred` - Preferred * `discouraged` - Discouraged */
    @Json(name = "webauthn_user_verification")
    val webauthnUserVerification: UserVerificationEnum? = null

)

