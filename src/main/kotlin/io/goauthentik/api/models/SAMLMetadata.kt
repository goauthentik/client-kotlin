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
 * SAML Provider Metadata serializer
 *
 * @param metadata 
 * @param downloadUrl 
 */


data class SAMLMetadata (

    @Json(name = "metadata")
    val metadata: kotlin.String,

    @Json(name = "download_url")
    val downloadUrl: kotlin.String

)

