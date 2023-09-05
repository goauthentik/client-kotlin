/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.2
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


import com.squareup.moshi.Json

/**
 * Serializer for license status
 *
 * @param internalUsers 
 * @param externalUsers 
 * @param valid 
 * @param showAdminWarning 
 * @param showUserWarning 
 * @param readOnly 
 * @param latestValid 
 * @param hasLicense 
 */

data class LicenseSummary (

    @Json(name = "internal_users")
    val internalUsers: kotlin.Int,

    @Json(name = "external_users")
    val externalUsers: kotlin.Int,

    @Json(name = "valid")
    val valid: kotlin.Boolean,

    @Json(name = "show_admin_warning")
    val showAdminWarning: kotlin.Boolean,

    @Json(name = "show_user_warning")
    val showUserWarning: kotlin.Boolean,

    @Json(name = "read_only")
    val readOnly: kotlin.Boolean,

    @Json(name = "latest_valid")
    val latestValid: java.time.OffsetDateTime,

    @Json(name = "has_license")
    val hasLicense: kotlin.Boolean

)

