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
 * Plex Source connection Serializer
 *
 * @param identifier 
 * @param plexToken 
 */


data class PlexSourceConnectionRequest (

    @Json(name = "identifier")
    val identifier: kotlin.String,

    @Json(name = "plex_token")
    val plexToken: kotlin.String

)

