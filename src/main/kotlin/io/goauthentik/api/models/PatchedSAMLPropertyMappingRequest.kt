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


import com.squareup.moshi.Json

/**
 * SAMLPropertyMapping Serializer
 *
 * @param managed Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update.
 * @param name 
 * @param expression 
 * @param samlName 
 * @param friendlyName 
 */

data class PatchedSAMLPropertyMappingRequest (

    /* Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. */
    @Json(name = "managed")
    val managed: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "expression")
    val expression: kotlin.String? = null,

    @Json(name = "saml_name")
    val samlName: kotlin.String? = null,

    @Json(name = "friendly_name")
    val friendlyName: kotlin.String? = null

)

