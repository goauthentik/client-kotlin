/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.2
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

import io.goauthentik.api.models.Source

import com.squareup.moshi.Json

/**
 * Plex Source connection Serializer
 *
 * @param pk 
 * @param user 
 * @param source 
 * @param identifier 
 * @param plexToken 
 */

data class PlexSourceConnection (

    @Json(name = "pk")
    val pk: kotlin.Int,

    @Json(name = "user")
    val user: kotlin.Int,

    @Json(name = "source")
    val source: Source,

    @Json(name = "identifier")
    val identifier: kotlin.String,

    @Json(name = "plex_token")
    val plexToken: kotlin.String

)

