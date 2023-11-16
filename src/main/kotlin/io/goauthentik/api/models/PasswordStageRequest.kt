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

import io.goauthentik.api.models.BackendsEnum
import io.goauthentik.api.models.FlowSetRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PasswordStage Serializer
 *
 * @param name 
 * @param backends Selection of backends to test the password against.
 * @param flowSet 
 * @param configureFlow Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage.
 * @param failedAttemptsBeforeCancel How many attempts a user has before the flow is canceled. To lock the user out, use a reputation policy and a user_write stage.
 */


data class PasswordStageRequest (

    @Json(name = "name")
    val name: kotlin.String,

    /* Selection of backends to test the password against. */
    @Json(name = "backends")
    val backends: kotlin.collections.List<BackendsEnum>,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    /* Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. */
    @Json(name = "configure_flow")
    val configureFlow: java.util.UUID? = null,

    /* How many attempts a user has before the flow is canceled. To lock the user out, use a reputation policy and a user_write stage. */
    @Json(name = "failed_attempts_before_cancel")
    val failedAttemptsBeforeCancel: kotlin.Int? = null

)

