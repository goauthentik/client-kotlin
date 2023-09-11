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

import io.goauthentik.api.models.Application
import io.goauthentik.api.models.User

import com.squareup.moshi.Json

/**
 * UserConsent Serializer
 *
 * @param pk 
 * @param user 
 * @param application 
 * @param expires 
 * @param permissions 
 */

data class UserConsent (

    @Json(name = "pk")
    val pk: kotlin.Int,

    @Json(name = "user")
    val user: User,

    @Json(name = "application")
    val application: Application,

    @Json(name = "expires")
    val expires: java.time.OffsetDateTime? = null,

    @Json(name = "permissions")
    val permissions: kotlin.String? = ""

)

