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


import com.squareup.moshi.Json

/**
 * License Serializer
 *
 * @param licenseUuid 
 * @param name 
 * @param key 
 * @param expiry 
 * @param internalUsers 
 * @param externalUsers 
 */

data class License (

    @Json(name = "license_uuid")
    val licenseUuid: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "key")
    val key: kotlin.String,

    @Json(name = "expiry")
    val expiry: java.time.OffsetDateTime,

    @Json(name = "internal_users")
    val internalUsers: kotlin.Int,

    @Json(name = "external_users")
    val externalUsers: kotlin.Int

)

