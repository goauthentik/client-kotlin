/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.2
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
 * Global permission
 *
 * @param id 
 * @param name 
 * @param codename 
 * @param model 
 * @param appLabel 
 * @param appLabelVerbose Human-readable app label
 * @param modelVerbose Human-readable model name
 */

data class Permission (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "codename")
    val codename: kotlin.String,

    @Json(name = "model")
    val model: kotlin.String,

    @Json(name = "app_label")
    val appLabel: kotlin.String,

    /* Human-readable app label */
    @Json(name = "app_label_verbose")
    val appLabelVerbose: kotlin.String,

    /* Human-readable model name */
    @Json(name = "model_verbose")
    val modelVerbose: kotlin.String

)

