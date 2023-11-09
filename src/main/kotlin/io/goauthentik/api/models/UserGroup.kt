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


import com.squareup.moshi.Json

/**
 * Simplified Group Serializer for user's groups
 *
 * @param pk 
 * @param numPk Get a numerical, int32 ID for the group
 * @param name 
 * @param parentName 
 * @param isSuperuser Users added to this group will be superusers.
 * @param parent 
 * @param attributes 
 */

data class UserGroup (

    @Json(name = "pk")
    val pk: java.util.UUID,

    /* Get a numerical, int32 ID for the group */
    @Json(name = "num_pk")
    val numPk: kotlin.Int,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "parent_name")
    val parentName: kotlin.String,

    /* Users added to this group will be superusers. */
    @Json(name = "is_superuser")
    val isSuperuser: kotlin.Boolean? = null,

    @Json(name = "parent")
    val parent: java.util.UUID? = null,

    @Json(name = "attributes")
    val attributes: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

)

