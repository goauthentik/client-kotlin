/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.3
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

import io.goauthentik.api.models.FooterLink
import io.goauthentik.api.models.UiThemeEnum

import com.squareup.moshi.Json

/**
 * Partial tenant information for styling
 *
 * @param matchedDomain 
 * @param brandingTitle 
 * @param brandingLogo 
 * @param brandingFavicon 
 * @param uiFooterLinks 
 * @param uiTheme 
 * @param defaultLocale 
 * @param flowAuthentication 
 * @param flowInvalidation 
 * @param flowRecovery 
 * @param flowUnenrollment 
 * @param flowUserSettings 
 * @param flowDeviceCode 
 */

data class CurrentTenant (

    @Json(name = "matched_domain")
    val matchedDomain: kotlin.String,

    @Json(name = "branding_title")
    val brandingTitle: kotlin.String,

    @Json(name = "branding_logo")
    val brandingLogo: kotlin.String,

    @Json(name = "branding_favicon")
    val brandingFavicon: kotlin.String,

    @Json(name = "ui_footer_links")
    val uiFooterLinks: kotlin.collections.List<FooterLink> = arrayListOf(),

    @Json(name = "ui_theme")
    val uiTheme: UiThemeEnum,

    @Json(name = "default_locale")
    val defaultLocale: kotlin.String,

    @Json(name = "flow_authentication")
    val flowAuthentication: kotlin.String? = null,

    @Json(name = "flow_invalidation")
    val flowInvalidation: kotlin.String? = null,

    @Json(name = "flow_recovery")
    val flowRecovery: kotlin.String? = null,

    @Json(name = "flow_unenrollment")
    val flowUnenrollment: kotlin.String? = null,

    @Json(name = "flow_user_settings")
    val flowUserSettings: kotlin.String? = null,

    @Json(name = "flow_device_code")
    val flowDeviceCode: kotlin.String? = null

)

