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
 * Group Serializer
 *
 * @param name 
 * @param isSuperuser Users added to this group will be superusers.
 * @param parent 
 * @param users 
 * @param attributes 
 */

data class GroupRequest (

    @Json(name = "name")
    val name: kotlin.String,

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

