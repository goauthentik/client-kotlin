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
 * Provider Serializer
 *
 * @param name 
 * @param authorizationFlow Flow used when authorizing this provider.
 * @param authenticationFlow Flow used for authentication when the associated application is accessed by an un-authenticated user.
 * @param propertyMappings 
 */


data class ProviderRequest (

    @Json(name = "name")
    val name: kotlin.String,

    /* Flow used when authorizing this provider. */
    @Json(name = "authorization_flow")
    val authorizationFlow: java.util.UUID,

    /* Flow used for authentication when the associated application is accessed by an un-authenticated user. */
    @Json(name = "authentication_flow")
    val authenticationFlow: java.util.UUID? = null,

    @Json(name = "property_mappings")
    val propertyMappings: kotlin.collections.List<java.util.UUID>? = null

)

