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

import io.goauthentik.api.models.UserSelf

import com.squareup.moshi.Json

/**
 * Response for the /user/me endpoint, returns the currently active user (as `user` property) and, if this user is being impersonated, the original user in the `original` property.
 *
 * @param user 
 * @param original 
 */

data class SessionUser (

    @Json(name = "user")
    val user: UserSelf,

    @Json(name = "original")
    val original: UserSelf? = null

)

