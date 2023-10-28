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


import com.squareup.moshi.Json

/**
 * Tenant Serializer
 *
 * @param tenantUuid 
 * @param domain Domain that activates this tenant. Can be a superset, i.e. `a.b` for `aa.b` and `ba.b`
 * @param default 
 * @param brandingTitle 
 * @param brandingLogo 
 * @param brandingFavicon 
 * @param flowAuthentication 
 * @param flowInvalidation 
 * @param flowRecovery 
 * @param flowUnenrollment 
 * @param flowUserSettings 
 * @param flowDeviceCode 
 * @param eventRetention Events will be deleted after this duration.(Format: weeks=3;days=2;hours=3,seconds=2).
 * @param webCertificate Web Certificate used by the authentik Core webserver.
 * @param attributes 
 */

data class Tenant (

    @Json(name = "tenant_uuid")
    val tenantUuid: java.util.UUID,

    /* Domain that activates this tenant. Can be a superset, i.e. `a.b` for `aa.b` and `ba.b` */
    @Json(name = "domain")
    val domain: kotlin.String,

    @Json(name = "default")
    val default: kotlin.Boolean? = null,

    @Json(name = "branding_title")
    val brandingTitle: kotlin.String? = null,

    @Json(name = "branding_logo")
    val brandingLogo: kotlin.String? = null,

    @Json(name = "branding_favicon")
    val brandingFavicon: kotlin.String? = null,

    @Json(name = "flow_authentication")
    val flowAuthentication: java.util.UUID? = null,

    @Json(name = "flow_invalidation")
    val flowInvalidation: java.util.UUID? = null,

    @Json(name = "flow_recovery")
    val flowRecovery: java.util.UUID? = null,

    @Json(name = "flow_unenrollment")
    val flowUnenrollment: java.util.UUID? = null,

    @Json(name = "flow_user_settings")
    val flowUserSettings: java.util.UUID? = null,

    @Json(name = "flow_device_code")
    val flowDeviceCode: java.util.UUID? = null,

    /* Events will be deleted after this duration.(Format: weeks=3;days=2;hours=3,seconds=2). */
    @Json(name = "event_retention")
    val eventRetention: kotlin.String? = null,

    /* Web Certificate used by the authentik Core webserver. */
    @Json(name = "web_certificate")
    val webCertificate: java.util.UUID? = null,

    @Json(name = "attributes")
    val attributes: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

)

