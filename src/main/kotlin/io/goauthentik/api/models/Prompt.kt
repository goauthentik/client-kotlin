/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.2
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

import io.goauthentik.api.models.PromptTypeEnum
import io.goauthentik.api.models.Stage

import com.squareup.moshi.Json

/**
 * Prompt Serializer
 *
 * @param pk 
 * @param name 
 * @param fieldKey Name of the form field, also used to store the value
 * @param label 
 * @param type 
 * @param required 
 * @param placeholder Optionally provide a short hint that describes the expected input value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple choices.
 * @param initialValue Optionally pre-fill the input with an initial value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple default choices.
 * @param order 
 * @param promptstageSet 
 * @param subText 
 * @param placeholderExpression 
 * @param initialValueExpression 
 */

data class Prompt (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    /* Name of the form field, also used to store the value */
    @Json(name = "field_key")
    val fieldKey: kotlin.String,

    @Json(name = "label")
    val label: kotlin.String,

    @Json(name = "type")
    val type: PromptTypeEnum,

    @Json(name = "required")
    val required: kotlin.Boolean? = null,

    /* Optionally provide a short hint that describes the expected input value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple choices. */
    @Json(name = "placeholder")
    val placeholder: kotlin.String? = null,

    /* Optionally pre-fill the input with an initial value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple default choices. */
    @Json(name = "initial_value")
    val initialValue: kotlin.String? = null,

    @Json(name = "order")
    val order: kotlin.Int? = null,

    @Json(name = "promptstage_set")
    val promptstageSet: kotlin.collections.List<Stage>? = null,

    @Json(name = "sub_text")
    val subText: kotlin.String? = null,

    @Json(name = "placeholder_expression")
    val placeholderExpression: kotlin.Boolean? = null,

    @Json(name = "initial_value_expression")
    val initialValueExpression: kotlin.Boolean? = null

)

