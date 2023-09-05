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

import io.goauthentik.api.models.GroupMember

import com.squareup.moshi.Json

/**
 * Group Serializer
 *
 * @param pk 
 * @param numPk 
 * @param name 
 * @param parentName 
 * @param usersObj 
 * @param isSuperuser Users added to this group will be superusers.
 * @param parent 
 * @param users 
 * @param attributes 
 */

data class Group (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "num_pk")
    val numPk: kotlin.Int,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "parent_name")
    val parentName: kotlin.String?,

    @Json(name = "users_obj")
    val usersObj: kotlin.collections.List<GroupMember>,

    /* Users added to this group will be superusers. */
    @Json(name = "is_superuser")
    val isSuperuser: kotlin.Boolean? = null,

    @Json(name = "parent")
    val parent: java.util.UUID? = null,

    @Json(name = "users")
    val users: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "attributes")
    val attributes: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

)

