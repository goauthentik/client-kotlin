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

import io.goauthentik.api.models.DeniedActionEnum
import io.goauthentik.api.models.FlowDesignationEnum
import io.goauthentik.api.models.LayoutEnum
import io.goauthentik.api.models.PolicyEngineMode

import com.squareup.moshi.Json

/**
 * Stripped down flow serializer
 *
 * @param name 
 * @param slug Visible in the URL.
 * @param title Shown as the Title in Flow pages.
 * @param designation Decides what this Flow is used for. For example, the Authentication flow is redirect to when an un-authenticated user visits authentik.  * `authentication` - Authentication * `authorization` - Authorization * `invalidation` - Invalidation * `enrollment` - Enrollment * `unenrollment` - Unrenollment * `recovery` - Recovery * `stage_configuration` - Stage Configuration
 * @param policyEngineMode 
 * @param compatibilityMode Enable compatibility mode, increases compatibility with password managers on mobile devices.
 * @param layout 
 * @param deniedAction Configure what should happen when a flow denies access to a user.  * `message_continue` - Message Continue * `message` - Message * `continue` - Continue
 */

data class FlowSetRequest (

    @Json(name = "name")
    val name: kotlin.String,

    /* Visible in the URL. */
    @Json(name = "slug")
    val slug: kotlin.String,

    /* Shown as the Title in Flow pages. */
    @Json(name = "title")
    val title: kotlin.String,

    /* Decides what this Flow is used for. For example, the Authentication flow is redirect to when an un-authenticated user visits authentik.  * `authentication` - Authentication * `authorization` - Authorization * `invalidation` - Invalidation * `enrollment` - Enrollment * `unenrollment` - Unrenollment * `recovery` - Recovery * `stage_configuration` - Stage Configuration */
    @Json(name = "designation")
    val designation: FlowDesignationEnum,

    @Json(name = "policy_engine_mode")
    val policyEngineMode: PolicyEngineMode? = null,

    /* Enable compatibility mode, increases compatibility with password managers on mobile devices. */
    @Json(name = "compatibility_mode")
    val compatibilityMode: kotlin.Boolean? = null,

    @Json(name = "layout")
    val layout: LayoutEnum? = null,

    /* Configure what should happen when a flow denies access to a user.  * `message_continue` - Message Continue * `message` - Message * `continue` - Continue */
    @Json(name = "denied_action")
    val deniedAction: DeniedActionEnum? = null

)

