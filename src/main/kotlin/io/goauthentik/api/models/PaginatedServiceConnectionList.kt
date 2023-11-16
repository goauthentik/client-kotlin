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

import io.goauthentik.api.models.Pagination
import io.goauthentik.api.models.ServiceConnection

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param pagination 
 * @param results 
 */


data class PaginatedServiceConnectionList (

    @Json(name = "pagination")
    val pagination: Pagination,

    @Json(name = "results")
    val results: kotlin.collections.List<ServiceConnection>

)

