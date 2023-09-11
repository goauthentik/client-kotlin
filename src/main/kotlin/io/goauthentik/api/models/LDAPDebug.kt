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
 * 
 *
 * @param user 
 * @param group 
 * @param membership 
 */

data class LDAPDebug (

    @Json(name = "user")
    val user: kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>,

    @Json(name = "group")
    val group: kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>,

    @Json(name = "membership")
    val membership: kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>

)

