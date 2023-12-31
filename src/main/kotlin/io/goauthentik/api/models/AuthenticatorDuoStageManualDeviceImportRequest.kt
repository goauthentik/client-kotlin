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
 * 
 *
 * @param duoUserId 
 * @param username 
 */


data class AuthenticatorDuoStageManualDeviceImportRequest (

    @Json(name = "duo_user_id")
    val duoUserId: kotlin.String,

    @Json(name = "username")
    val username: kotlin.String

)

