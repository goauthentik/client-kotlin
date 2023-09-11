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


import com.squareup.moshi.Json

/**
 * Serializer for Duo authenticator devices
 *
 * @param pk 
 * @param name The human-readable name of this device.
 */

data class DuoDevice (

    @Json(name = "pk")
    val pk: kotlin.Int,

    /* The human-readable name of this device. */
    @Json(name = "name")
    val name: kotlin.String

)

