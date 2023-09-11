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

import io.goauthentik.api.models.LDAPProvider
import io.goauthentik.api.models.Pagination

import com.squareup.moshi.Json

/**
 * 
 *
 * @param pagination 
 * @param results 
 */

data class PaginatedLDAPProviderList (

    @Json(name = "pagination")
    val pagination: Pagination,

    @Json(name = "results")
    val results: kotlin.collections.List<LDAPProvider>

)

