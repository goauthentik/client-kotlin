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

import io.goauthentik.api.models.Coordinate

import com.squareup.moshi.Json

/**
 * User Metrics
 *
 * @param logins 
 * @param loginsFailed 
 * @param authorizations 
 */

data class UserMetrics (

    @Json(name = "logins")
    val logins: kotlin.collections.List<Coordinate>,

    @Json(name = "logins_failed")
    val loginsFailed: kotlin.collections.List<Coordinate>,

    @Json(name = "authorizations")
    val authorizations: kotlin.collections.List<Coordinate>

)

