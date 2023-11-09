/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.3
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

import io.goauthentik.api.models.BackendsEnum
import io.goauthentik.api.models.FlowSet

import com.squareup.moshi.Json

/**
 * PasswordStage Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object type so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param backends Selection of backends to test the password against.
 * @param flowSet 
 * @param configureFlow Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage.
 * @param failedAttemptsBeforeCancel How many attempts a user has before the flow is canceled. To lock the user out, use a reputation policy and a user_write stage.
 */

data class PasswordStage (

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

    /* Selection of backends to test the password against. */
    @Json(name = "backends")
    val backends: kotlin.collections.List<BackendsEnum>,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSet>? = null,

    /* Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. */
    @Json(name = "configure_flow")
    val configureFlow: java.util.UUID? = null,

    /* How many attempts a user has before the flow is canceled. To lock the user out, use a reputation policy and a user_write stage. */
    @Json(name = "failed_attempts_before_cancel")
    val failedAttemptsBeforeCancel: kotlin.Int? = null

)

