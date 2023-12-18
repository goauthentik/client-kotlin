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

import io.goauthentik.api.models.ContextualFlowInfoLayoutEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Contextual flow information for a challenge
 *
 * @param cancelUrl 
 * @param layout 
 * @param title 
 * @param background 
 */


data class ContextualFlowInfo (

    @Json(name = "cancel_url")
    val cancelUrl: kotlin.String,

    @Json(name = "layout")
    val layout: ContextualFlowInfoLayoutEnum,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "background")
    val background: kotlin.String? = null

)

