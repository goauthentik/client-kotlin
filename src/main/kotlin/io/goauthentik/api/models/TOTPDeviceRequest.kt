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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Serializer for totp authenticator devices
 *
 * @param name The human-readable name of this device.
 */


data class TOTPDeviceRequest (

    /* The human-readable name of this device. */
    @Json(name = "name")
    val name: kotlin.String

)

