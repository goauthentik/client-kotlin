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

import io.goauthentik.api.models.FlowSetRequest
import io.goauthentik.api.models.UserFieldsEnum

import com.squareup.moshi.Json

/**
 * IdentificationStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param userFields Fields of the user object to match against. (Hold shift to select multiple options)
 * @param passwordStage When set, shows a password field, instead of showing the password field as seaprate step.
 * @param caseInsensitiveMatching When enabled, user fields are matched regardless of their casing.
 * @param showMatchedUser When a valid username/email has been entered, and this option is enabled, the user's username and avatar will be shown. Otherwise, the text that the user entered will be shown
 * @param enrollmentFlow Optional enrollment flow, which is linked at the bottom of the page.
 * @param recoveryFlow Optional recovery flow, which is linked at the bottom of the page.
 * @param passwordlessFlow Optional passwordless flow, which is linked at the bottom of the page.
 * @param sources Specify which sources should be shown.
 * @param showSourceLabels 
 */

data class PatchedIdentificationStageRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    /* Fields of the user object to match against. (Hold shift to select multiple options) */
    @Json(name = "user_fields")
    val userFields: kotlin.collections.List<UserFieldsEnum>? = null,

    /* When set, shows a password field, instead of showing the password field as seaprate step. */
    @Json(name = "password_stage")
    val passwordStage: java.util.UUID? = null,

    /* When enabled, user fields are matched regardless of their casing. */
    @Json(name = "case_insensitive_matching")
    val caseInsensitiveMatching: kotlin.Boolean? = null,

    /* When a valid username/email has been entered, and this option is enabled, the user's username and avatar will be shown. Otherwise, the text that the user entered will be shown */
    @Json(name = "show_matched_user")
    val showMatchedUser: kotlin.Boolean? = null,

    /* Optional enrollment flow, which is linked at the bottom of the page. */
    @Json(name = "enrollment_flow")
    val enrollmentFlow: java.util.UUID? = null,

    /* Optional recovery flow, which is linked at the bottom of the page. */
    @Json(name = "recovery_flow")
    val recoveryFlow: java.util.UUID? = null,

    /* Optional passwordless flow, which is linked at the bottom of the page. */
    @Json(name = "passwordless_flow")
    val passwordlessFlow: java.util.UUID? = null,

    /* Specify which sources should be shown. */
    @Json(name = "sources")
    val sources: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "show_source_labels")
    val showSourceLabels: kotlin.Boolean? = null

)

