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

import io.goauthentik.api.models.AuthModeEnum
import io.goauthentik.api.models.ProtocolEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Endpoint Serializer
 *
 * @param name 
 * @param provider 
 * @param protocol 
 * @param host 
 * @param authMode 
 * @param settings 
 * @param propertyMappings 
 * @param maximumConnections 
 */


data class EndpointRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "provider")
    val provider: kotlin.Int,

    @Json(name = "protocol")
    val protocol: ProtocolEnum,

    @Json(name = "host")
    val host: kotlin.String,

    @Json(name = "auth_mode")
    val authMode: AuthModeEnum,

    @Json(name = "settings")
    val settings: kotlin.Any? = null,

    @Json(name = "property_mappings")
    val propertyMappings: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "maximum_connections")
    val maximumConnections: kotlin.Int? = null

)

