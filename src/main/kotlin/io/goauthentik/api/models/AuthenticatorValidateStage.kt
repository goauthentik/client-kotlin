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

import io.goauthentik.api.models.DeviceClassesEnum
import io.goauthentik.api.models.FlowSet
import io.goauthentik.api.models.NotConfiguredActionEnum
import io.goauthentik.api.models.UserVerificationEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * AuthenticatorValidateStage Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object type so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param flowSet 
 * @param notConfiguredAction 
 * @param deviceClasses Device classes which can be used to authenticate
 * @param configurationStages Stages used to configure Authenticator when user doesn't have any compatible devices. After this configuration Stage passes, the user is not prompted again.
 * @param lastAuthThreshold If any of the user's device has been used within this threshold, this stage will be skipped
 * @param webauthnUserVerification 
 */


data class AuthenticatorValidateStage (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    /* Get object type so that we know how to edit the object */
    @Json(name = "component")
    val component: kotlin.String,

    /* Return object's verbose_name */
    @Json(name = "verbose_name")
    val verboseName: kotlin.String,

    /* Return object's plural verbose_name */
    @Json(name = "verbose_name_plural")
    val verboseNamePlural: kotlin.String,

    /* Return internal model name */
    @Json(name = "meta_model_name")
    val metaModelName: kotlin.String,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSet>? = null,

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

    @Json(name = "webauthn_user_verification")
    val webauthnUserVerification: UserVerificationEnum? = null

)

