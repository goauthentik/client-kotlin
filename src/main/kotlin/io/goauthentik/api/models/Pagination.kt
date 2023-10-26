/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.0
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
 * 
 *
 * @param next 
 * @param previous 
 * @param count 
 * @param current 
 * @param totalPages 
 * @param startIndex 
 * @param endIndex 
 */

data class Pagination (

    @Json(name = "next")
    val next: java.math.BigDecimal,

    @Json(name = "previous")
    val previous: java.math.BigDecimal,

    @Json(name = "count")
    val count: java.math.BigDecimal,

    @Json(name = "current")
    val current: java.math.BigDecimal,

    @Json(name = "total_pages")
    val totalPages: java.math.BigDecimal,

    @Json(name = "start_index")
    val startIndex: java.math.BigDecimal,

    @Json(name = "end_index")
    val endIndex: java.math.BigDecimal

)

