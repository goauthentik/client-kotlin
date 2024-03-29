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
 * Response from push sent to phone
 *
 * @param txId 
 * @param selectedItem 
 */


data class MobileDeviceResponseRequest (

    @Json(name = "tx_id")
    val txId: java.util.UUID,

    @Json(name = "selected_item")
    val selectedItem: kotlin.String

)

