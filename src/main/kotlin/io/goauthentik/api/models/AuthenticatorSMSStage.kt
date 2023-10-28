/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.2
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

import io.goauthentik.api.models.AuthTypeEnum
import io.goauthentik.api.models.FlowSet
import io.goauthentik.api.models.ProviderEnum

import com.squareup.moshi.Json

/**
 * AuthenticatorSMSStage Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object type so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param provider 
 * @param fromNumber 
 * @param accountSid 
 * @param auth 
 * @param flowSet 
 * @param configureFlow Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage.
 * @param friendlyName 
 * @param authPassword 
 * @param authType 
 * @param verifyOnly When enabled, the Phone number is only used during enrollment to verify the users authenticity. Only a hash of the phone number is saved to ensure it is not reused in the future.
 * @param mapping Optionally modify the payload being sent to custom providers.
 */

data class AuthenticatorSMSStage (

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

    @Json(name = "provider")
    val provider: ProviderEnum,

    @Json(name = "from_number")
    val fromNumber: kotlin.String,

    @Json(name = "account_sid")
    val accountSid: kotlin.String,

    @Json(name = "auth")
    val auth: kotlin.String,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSet>? = null,

    /* Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. */
    @Json(name = "configure_flow")
    val configureFlow: java.util.UUID? = null,

    @Json(name = "friendly_name")
    val friendlyName: kotlin.String? = null,

    @Json(name = "auth_password")
    val authPassword: kotlin.String? = null,

    @Json(name = "auth_type")
    val authType: AuthTypeEnum? = null,

    /* When enabled, the Phone number is only used during enrollment to verify the users authenticity. Only a hash of the phone number is saved to ensure it is not reused in the future. */
    @Json(name = "verify_only")
    val verifyOnly: kotlin.Boolean? = null,

    /* Optionally modify the payload being sent to custom providers. */
    @Json(name = "mapping")
    val mapping: java.util.UUID? = null

)

