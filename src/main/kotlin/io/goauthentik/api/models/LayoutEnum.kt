/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.2
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
 * * `stacked` - STACKED * `content_left` - CONTENT_LEFT * `content_right` - CONTENT_RIGHT * `sidebar_left` - SIDEBAR_LEFT * `sidebar_right` - SIDEBAR_RIGHT
 *
 * Values: stacked,contentLeft,contentRight,sidebarLeft,sidebarRight,unknownDefaultOpenApi
 */

enum class LayoutEnum(val value: kotlin.String) {

    @Json(name = "stacked")
    stacked("stacked"),

    @Json(name = "content_left")
    contentLeft("content_left"),

    @Json(name = "content_right")
    contentRight("content_right"),

    @Json(name = "sidebar_left")
    sidebarLeft("sidebar_left"),

    @Json(name = "sidebar_right")
    sidebarRight("sidebar_right"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is LayoutEnum) "$data" else null

        /**
         * Returns a valid [LayoutEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): LayoutEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

