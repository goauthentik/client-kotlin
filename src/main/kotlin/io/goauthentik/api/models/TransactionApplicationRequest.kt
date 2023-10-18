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

import io.goauthentik.api.models.ApplicationRequest
import io.goauthentik.api.models.ModelRequest
import io.goauthentik.api.models.ProviderModelEnum

import com.squareup.moshi.Json

/**
 * Serializer for creating a provider and an application in one transaction
 *
 * @param app 
 * @param providerModel 
 * @param provider 
 */

data class TransactionApplicationRequest (

    @Json(name = "app")
    val app: ApplicationRequest,

    @Json(name = "provider_model")
    val providerModel: ProviderModelEnum,

    @Json(name = "provider")
    val provider: ModelRequest

)
