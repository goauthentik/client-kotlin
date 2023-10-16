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
 * User permission with additional object-related data
 *
 * @param id 
 * @param codename 
 * @param model 
 * @param appLabel 
 * @param objectPk 
 * @param name 
 * @param appLabelVerbose Get app label from permission's model
 * @param modelVerbose Get model label from permission's model
 * @param objectDescription Get model description from attached model. This operation takes at least one additional query, and the description is only shown if the user/role has the view_ permission on the object
 */

data class ExtraUserObjectPermission (

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
    val name: kotlin.String,

    /* Get app label from permission's model */
    @Json(name = "app_label_verbose")
    val appLabelVerbose: kotlin.String,

    /* Get model label from permission's model */
    @Json(name = "model_verbose")
    val modelVerbose: kotlin.String,

    /* Get model description from attached model. This operation takes at least one additional query, and the description is only shown if the user/role has the view_ permission on the object */
    @Json(name = "object_description")
    val objectDescription: kotlin.String?

)

