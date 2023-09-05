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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param name 
 * @param createGroup 
 * @param expiring 
 * @param expires If not provided, valid for 360 days
 */

data class UserServiceAccountRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "create_group")
    val createGroup: kotlin.Boolean? = false,

    @Json(name = "expiring")
    val expiring: kotlin.Boolean? = true,

    /* If not provided, valid for 360 days */
    @Json(name = "expires")
    val expires: java.time.OffsetDateTime? = null

)

