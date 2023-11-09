/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.3
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
 * * `can_save_media` - Can Save Media * `can_geo_ip` - Can Geo Ip * `can_impersonate` - Can Impersonate * `can_debug` - Can Debug * `is_enterprise` - Is Enterprise
 *
 * Values: canSaveMedia,canGeoIp,canImpersonate,canDebug,isEnterprise,unknownDefaultOpenApi
 */

enum class CapabilitiesEnum(val value: kotlin.String) {

    @Json(name = "can_save_media")
    canSaveMedia("can_save_media"),

    @Json(name = "can_geo_ip")
    canGeoIp("can_geo_ip"),

    @Json(name = "can_impersonate")
    canImpersonate("can_impersonate"),

    @Json(name = "can_debug")
    canDebug("can_debug"),

    @Json(name = "is_enterprise")
    isEnterprise("is_enterprise"),

    @Json(name = "unknown_default_open_api")
    unknownDefaultOpenApi("unknown_default_open_api");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CapabilitiesEnum) "$data" else null

        /**
         * Returns a valid [CapabilitiesEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CapabilitiesEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

