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
 * Types of an object that can be created
 *
 * @param name 
 * @param description 
 * @param component 
 * @param modelName 
 * @param requiresEnterprise 
 */


data class TypeCreate (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String,

    @Json(name = "component")
    val component: kotlin.String,

    @Json(name = "model_name")
    val modelName: kotlin.String,

    @Json(name = "requires_enterprise")
    val requiresEnterprise: kotlin.Boolean? = false

)

