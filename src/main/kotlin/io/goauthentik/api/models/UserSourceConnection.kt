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

import io.goauthentik.api.models.Source

import com.squareup.moshi.Json

/**
 * OAuth Source Serializer
 *
 * @param pk 
 * @param user 
 * @param source 
 * @param created 
 */

data class UserSourceConnection (

    @Json(name = "pk")
    val pk: kotlin.Int,

    @Json(name = "user")
    val user: kotlin.Int,

    @Json(name = "source")
    val source: Source,

    @Json(name = "created")
    val created: java.time.OffsetDateTime

)

