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


import com.squareup.moshi.Json

/**
 * * `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` - Email * `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` - Persistent * `urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName` - X509 * `urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName` - Windows * `urn:oasis:names:tc:SAML:2.0:nameid-format:transient` - Transient
 *
 * Values: _1period1ColonNameidMinusFormatColonEmailAddress,_2period0ColonNameidMinusFormatColonPersistent,_2period0ColonNameidMinusFormatColonX509SubjectName,_2period0ColonNameidMinusFormatColonWindowsDomainQualifiedName,_2period0ColonNameidMinusFormatColonTransient,unknownDefaultOpenApi
 */

enum class NameIdPolicyEnum(val value: kotlin.String) {

    @Json(name = "urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress")
    _1period1ColonNameidMinusFormatColonEmailAddress("urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress"),

    @Json(name = "urn:oasis:names:tc:SAML:2.0:nameid-format:persistent")
    _2period0ColonNameidMinusFormatColonPersistent("urn:oasis:names:tc:SAML:2.0:nameid-format:persistent"),

    @Json(name = "urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName")
    _2period0ColonNameidMinusFormatColonX509SubjectName("urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName"),

    @Json(name = "urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName")
    _2period0ColonNameidMinusFormatColonWindowsDomainQualifiedName("urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName"),

    @Json(name = "urn:oasis:names:tc:SAML:2.0:nameid-format:transient")
    _2period0ColonNameidMinusFormatColonTransient("urn:oasis:names:tc:SAML:2.0:nameid-format:transient"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is NameIdPolicyEnum) "$data" else null

        /**
         * Returns a valid [NameIdPolicyEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): NameIdPolicyEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

