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
 * NotificationWebhookMapping Serializer
 *
 * @param name 
 * @param expression 
 */

data class NotificationWebhookMappingRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "expression")
    val expression: kotlin.String

)

