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

import io.goauthentik.api.models.AuthenticationEnum
import io.goauthentik.api.models.DeniedActionEnum
import io.goauthentik.api.models.FlowDesignationEnum
import io.goauthentik.api.models.LayoutEnum
import io.goauthentik.api.models.PolicyEngineMode

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Flow Serializer
 *
 * @param name 
 * @param slug Visible in the URL.
 * @param title Shown as the Title in Flow pages.
 * @param designation 
 * @param policyEngineMode 
 * @param compatibilityMode Enable compatibility mode, increases compatibility with password managers on mobile devices.
 * @param layout 
 * @param deniedAction 
 * @param authentication 
 */


data class PatchedFlowRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Visible in the URL. */
    @Json(name = "slug")
    val slug: kotlin.String? = null,

    /* Shown as the Title in Flow pages. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "designation")
    val designation: FlowDesignationEnum? = null,

    @Json(name = "policy_engine_mode")
    val policyEngineMode: PolicyEngineMode? = null,

    /* Enable compatibility mode, increases compatibility with password managers on mobile devices. */
    @Json(name = "compatibility_mode")
    val compatibilityMode: kotlin.Boolean? = null,

    @Json(name = "layout")
    val layout: LayoutEnum? = null,

    @Json(name = "denied_action")
    val deniedAction: DeniedActionEnum? = null,

    @Json(name = "authentication")
    val authentication: AuthenticationEnum? = null

)

