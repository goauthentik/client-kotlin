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
 * Preview how the current user is mapped via the property mappings selected in a provider
 *
 * @param preview 
 */


data class PropertyMappingPreview (

    @Json(name = "preview")
    val preview: kotlin.collections.Map<kotlin.String, kotlin.Any>

)

