/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.goauthentik.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * ScopeMapping Serializer
 *
 * @param managed Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update.
 * @param name 
 * @param expression 
 * @param scopeName Scope name requested by the client
 * @param description Description shown to the user when consenting. If left empty, the user won't be informed.
 */


data class PatchedScopeMappingRequest (

    /* Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. */
    @Json(name = "managed")
    val managed: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "expression")
    val expression: kotlin.String? = null,

    /* Scope name requested by the client */
    @Json(name = "scope_name")
    val scopeName: kotlin.String? = null,

    /* Description shown to the user when consenting. If left empty, the user won't be informed. */
    @Json(name = "description")
    val description: kotlin.String? = null

)

