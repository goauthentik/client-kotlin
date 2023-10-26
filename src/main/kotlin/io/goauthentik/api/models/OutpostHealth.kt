/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.0
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
 * Outpost health status
 *
 * @param uid 
 * @param lastSeen 
 * @param version 
 * @param versionShould 
 * @param versionOutdated 
 * @param buildHash 
 * @param buildHashShould 
 * @param hostname 
 */

data class OutpostHealth (

    @Json(name = "uid")
    val uid: kotlin.String,

    @Json(name = "last_seen")
    val lastSeen: java.time.OffsetDateTime,

    @Json(name = "version")
    val version: kotlin.String,

    @Json(name = "version_should")
    val versionShould: kotlin.String,

    @Json(name = "version_outdated")
    val versionOutdated: kotlin.Boolean,

    @Json(name = "build_hash")
    val buildHash: kotlin.String,

    @Json(name = "build_hash_should")
    val buildHashShould: kotlin.String,

    @Json(name = "hostname")
    val hostname: kotlin.String

)

