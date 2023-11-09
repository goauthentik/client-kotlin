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
 * Single device challenge
 *
 * @param deviceClass 
 * @param deviceUid 
 * @param challenge 
 */

data class DeviceChallenge (

    @Json(name = "device_class")
    val deviceClass: kotlin.String,

    @Json(name = "device_uid")
    val deviceUid: kotlin.String,

    @Json(name = "challenge")
    val challenge: kotlin.collections.Map<kotlin.String, kotlin.Any>

)

