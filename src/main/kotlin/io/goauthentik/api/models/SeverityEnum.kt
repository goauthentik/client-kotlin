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
 * * `notice` - Notice * `warning` - Warning * `alert` - Alert
 *
 * Values: notice,warning,alert,unknownDefaultOpenApi
 */

@JsonClass(generateAdapter = false)
enum class SeverityEnum(val value: kotlin.String) {

    @Json(name = "notice")
    notice("notice"),

    @Json(name = "warning")
    warning("warning"),

    @Json(name = "alert")
    alert("alert"),

    @Json(name = "unknown_default_open_api")
    unknownDefaultOpenApi("unknown_default_open_api");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SeverityEnum) "$data" else null

        /**
         * Returns a valid [SeverityEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SeverityEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

