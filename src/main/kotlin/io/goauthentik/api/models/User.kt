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

import io.goauthentik.api.models.UserGroup
import io.goauthentik.api.models.UserTypeEnum

import com.squareup.moshi.Json

/**
 * User Serializer
 *
 * @param pk 
 * @param username 
 * @param name User's display name.
 * @param isSuperuser 
 * @param groupsObj 
 * @param avatar 
 * @param uid 
 * @param isActive Designates whether this user should be treated as active. Unselect this instead of deleting accounts.
 * @param lastLogin 
 * @param groups 
 * @param email 
 * @param attributes 
 * @param path 
 * @param type 
 */

data class User (

    @Json(name = "pk")
    val pk: kotlin.Int,

    @Json(name = "username")
    val username: kotlin.String,

    /* User's display name. */
    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "is_superuser")
    val isSuperuser: kotlin.Boolean,

    @Json(name = "groups_obj")
    val groupsObj: kotlin.collections.List<UserGroup>,

    @Json(name = "avatar")
    val avatar: kotlin.String,

    @Json(name = "uid")
    val uid: kotlin.String,

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

