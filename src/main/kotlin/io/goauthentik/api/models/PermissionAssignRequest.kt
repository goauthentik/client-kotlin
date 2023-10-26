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

import io.goauthentik.api.models.ModelEnum

import com.squareup.moshi.Json

/**
 * Request to assign a new permission
 *
 * @param permissions 
 * @param model 
 * @param objectPk 
 */

data class PermissionAssignRequest (

    @Json(name = "permissions")
    val permissions: kotlin.collections.List<kotlin.String>,

    @Json(name = "model")
    val model: ModelEnum? = null,

    @Json(name = "object_pk")
    val objectPk: kotlin.String? = null

)

