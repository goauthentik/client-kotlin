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

import io.goauthentik.api.models.UserTypeEnum

import com.squareup.moshi.Json

/**
 * User Serializer
 *
 * @param username 
 * @param name User's display name.
 * @param isActive Designates whether this user should be treated as active. Unselect this instead of deleting accounts.
 * @param lastLogin 
 * @param groups 
 * @param email 
 * @param attributes 
 * @param path 
 * @param type 
 */

data class PatchedUserRequest (

    @Json(name = "username")
    val username: kotlin.String? = null,

    /* User's display name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Designates whether this user should be treated as active. Unselect this instead of deleting accounts. */
    @Json(name = "is_active")
    val isActive: kotlin.Boolean? = null,

    @Json(name = "last_login")
    val lastLogin: java.time.OffsetDateTime? = null,

    @Json(name = "groups")
    val groups: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "attributes")
    val attributes: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @Json(name = "path")
    val path: kotlin.String? = null,

    @Json(name = "type")
    val type: UserTypeEnum? = null

)

