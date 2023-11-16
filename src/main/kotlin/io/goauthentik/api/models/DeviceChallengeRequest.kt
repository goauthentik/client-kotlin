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
 * Single device challenge
 *
 * @param deviceClass 
 * @param deviceUid 
 * @param challenge 
 */


data class DeviceChallengeRequest (

    @Json(name = "device_class")
    val deviceClass: kotlin.String,

    @Json(name = "device_uid")
    val deviceUid: kotlin.String,

    @Json(name = "challenge")
    val challenge: kotlin.collections.Map<kotlin.String, kotlin.Any>

)

