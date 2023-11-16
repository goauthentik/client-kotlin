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
 * * `never_create` - Never Create * `create_when_required` - Create When Required * `always_create` - Always Create
 *
 * Values: neverCreate,createWhenRequired,alwaysCreate,unknownDefaultOpenApi
 */

@JsonClass(generateAdapter = false)
enum class UserCreationModeEnum(val value: kotlin.String) {

    @Json(name = "never_create")
    neverCreate("never_create"),

    @Json(name = "create_when_required")
    createWhenRequired("create_when_required"),

    @Json(name = "always_create")
    alwaysCreate("always_create"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is UserCreationModeEnum) "$data" else null

        /**
         * Returns a valid [UserCreationModeEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): UserCreationModeEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

