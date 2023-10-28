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
 * Serializer for static authenticator devices
 *
 * @param name The human-readable name of this device.
 */

data class PatchedStaticDeviceRequest (

    /* The human-readable name of this device. */
    @Json(name = "name")
    val name: kotlin.String? = null

)

