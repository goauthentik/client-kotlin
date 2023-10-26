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


import com.squareup.moshi.Json

/**
 * User-bound object level permission
 *
 * @param id 
 * @param codename 
 * @param model 
 * @param appLabel 
 * @param objectPk 
 * @param name 
 */

data class UserObjectPermission (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "codename")
    val codename: kotlin.String,

    @Json(name = "model")
    val model: kotlin.String,

    @Json(name = "app_label")
    val appLabel: kotlin.String,

    @Json(name = "object_pk")
    val objectPk: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String

)

