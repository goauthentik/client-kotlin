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
 * Serializer for sms authenticator devices
 *
 * @param name The human-readable name of this device.
 * @param pk 
 * @param phoneNumber 
 */

data class SMSDevice (

    /* The human-readable name of this device. */
    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "pk")
    val pk: kotlin.Int,

    @Json(name = "phone_number")
    val phoneNumber: kotlin.String

)

