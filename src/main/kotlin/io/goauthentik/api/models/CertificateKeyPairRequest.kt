/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.1
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
 * CertificateKeyPair Serializer
 *
 * @param name 
 * @param certificateData PEM-encoded Certificate data
 * @param keyData Optional Private Key. If this is set, you can use this keypair for encryption.
 */

data class CertificateKeyPairRequest (

    @Json(name = "name")
    val name: kotlin.String,

    /* PEM-encoded Certificate data */
    @Json(name = "certificate_data")
    val certificateData: kotlin.String,

    /* Optional Private Key. If this is set, you can use this keypair for encryption. */
    @Json(name = "key_data")
    val keyData: kotlin.String? = null

)

