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

import io.goauthentik.api.models.FlowSet

import com.squareup.moshi.Json

/**
 * PromptStage Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object type so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param fields 
 * @param flowSet 
 * @param validationPolicies 
 */

data class PromptStage (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    /* Get object type so that we know how to edit the object */
    @Json(name = "component")
    val component: kotlin.String,

    /* Return object's verbose_name */
    @Json(name = "verbose_name")
    val verboseName: kotlin.String,

    /* Return object's plural verbose_name */
    @Json(name = "verbose_name_plural")
    val verboseNamePlural: kotlin.String,

    /* Return internal model name */
    @Json(name = "meta_model_name")
    val metaModelName: kotlin.String,

    @Json(name = "fields")
    val fields: kotlin.collections.List<java.util.UUID>,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSet>? = null,

    @Json(name = "validation_policies")
    val validationPolicies: kotlin.collections.List<java.util.UUID>? = null

)

