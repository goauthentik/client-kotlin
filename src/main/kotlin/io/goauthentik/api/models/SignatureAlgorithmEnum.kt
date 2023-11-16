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
 * * `http://www.w3.org/2000/09/xmldsig#rsa-sha1` - RSA-SHA1 * `http://www.w3.org/2001/04/xmldsig-more#rsa-sha256` - RSA-SHA256 * `http://www.w3.org/2001/04/xmldsig-more#rsa-sha384` - RSA-SHA384 * `http://www.w3.org/2001/04/xmldsig-more#rsa-sha512` - RSA-SHA512 * `http://www.w3.org/2000/09/xmldsig#dsa-sha1` - DSA-SHA1
 *
 * Values: _2000slash09SlashXmldsigHashRsaMinusSha1,_2001slash04SlashXmldsigMinusMoreHashRsaMinusSha256,_2001slash04SlashXmldsigMinusMoreHashRsaMinusSha384,_2001slash04SlashXmldsigMinusMoreHashRsaMinusSha512,_2000slash09SlashXmldsigHashDsaMinusSha1,unknownDefaultOpenApi
 */

@JsonClass(generateAdapter = false)
enum class SignatureAlgorithmEnum(val value: kotlin.String) {

    @Json(name = "http://www.w3.org/2000/09/xmldsig#rsa-sha1")
    _2000slash09SlashXmldsigHashRsaMinusSha1("http://www.w3.org/2000/09/xmldsig#rsa-sha1"),

    @Json(name = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256")
    _2001slash04SlashXmldsigMinusMoreHashRsaMinusSha256("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"),

    @Json(name = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384")
    _2001slash04SlashXmldsigMinusMoreHashRsaMinusSha384("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384"),

    @Json(name = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512")
    _2001slash04SlashXmldsigMinusMoreHashRsaMinusSha512("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512"),

    @Json(name = "http://www.w3.org/2000/09/xmldsig#dsa-sha1")
    _2000slash09SlashXmldsigHashDsaMinusSha1("http://www.w3.org/2000/09/xmldsig#dsa-sha1"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SignatureAlgorithmEnum) "$data" else null

        /**
         * Returns a valid [SignatureAlgorithmEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SignatureAlgorithmEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

