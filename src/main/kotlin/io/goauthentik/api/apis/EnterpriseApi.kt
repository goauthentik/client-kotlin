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

package io.goauthentik.api.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import io.goauthentik.api.models.GenericError
import io.goauthentik.api.models.InstallID
import io.goauthentik.api.models.License
import io.goauthentik.api.models.LicenseForecast
import io.goauthentik.api.models.LicenseRequest
import io.goauthentik.api.models.LicenseSummary
import io.goauthentik.api.models.PaginatedLicenseList
import io.goauthentik.api.models.PatchedLicenseRequest
import io.goauthentik.api.models.UsedBy
import io.goauthentik.api.models.ValidationError

import com.squareup.moshi.Json

import io.goauthentik.api.infrastructure.ApiClient
import io.goauthentik.api.infrastructure.ApiResponse
import io.goauthentik.api.infrastructure.ClientException
import io.goauthentik.api.infrastructure.ClientError
import io.goauthentik.api.infrastructure.ServerException
import io.goauthentik.api.infrastructure.ServerError
import io.goauthentik.api.infrastructure.MultiValueMap
import io.goauthentik.api.infrastructure.PartConfig
import io.goauthentik.api.infrastructure.RequestConfig
import io.goauthentik.api.infrastructure.RequestMethod
import io.goauthentik.api.infrastructure.ResponseType
import io.goauthentik.api.infrastructure.Success
import io.goauthentik.api.infrastructure.toMultiValue

class EnterpriseApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost/api/v3")
        }
    }

    /**
     * 
     * License Viewset
     * @param licenseRequest 
     * @return License
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicenseCreate(licenseRequest: LicenseRequest) : License {
        val localVarResponse = enterpriseLicenseCreateWithHttpInfo(licenseRequest = licenseRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as License
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * License Viewset
     * @param licenseRequest 
     * @return ApiResponse<License?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicenseCreateWithHttpInfo(licenseRequest: LicenseRequest) : ApiResponse<License?> {
        val localVariableConfig = enterpriseLicenseCreateRequestConfig(licenseRequest = licenseRequest)

        return request<LicenseRequest, License>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicenseCreate
     *
     * @param licenseRequest 
     * @return RequestConfig
     */
    fun enterpriseLicenseCreateRequestConfig(licenseRequest: LicenseRequest) : RequestConfig<LicenseRequest> {
        val localVariableBody = licenseRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/enterprise/license/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * License Viewset
     * @param licenseUuid A UUID string identifying this License.
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicenseDestroy(licenseUuid: java.util.UUID) : Unit {
        val localVarResponse = enterpriseLicenseDestroyWithHttpInfo(licenseUuid = licenseUuid)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * License Viewset
     * @param licenseUuid A UUID string identifying this License.
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicenseDestroyWithHttpInfo(licenseUuid: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = enterpriseLicenseDestroyRequestConfig(licenseUuid = licenseUuid)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicenseDestroy
     *
     * @param licenseUuid A UUID string identifying this License.
     * @return RequestConfig
     */
    fun enterpriseLicenseDestroyRequestConfig(licenseUuid: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/enterprise/license/{license_uuid}/".replace("{"+"license_uuid"+"}", encodeURIComponent(licenseUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Forecast how many users will be required in a year
     * @return LicenseForecast
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicenseForecastRetrieve() : LicenseForecast {
        val localVarResponse = enterpriseLicenseForecastRetrieveWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as LicenseForecast
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Forecast how many users will be required in a year
     * @return ApiResponse<LicenseForecast?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicenseForecastRetrieveWithHttpInfo() : ApiResponse<LicenseForecast?> {
        val localVariableConfig = enterpriseLicenseForecastRetrieveRequestConfig()

        return request<Unit, LicenseForecast>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicenseForecastRetrieve
     *
     * @return RequestConfig
     */
    fun enterpriseLicenseForecastRetrieveRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/enterprise/license/forecast/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Get install_id
     * @return InstallID
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicenseGetInstallIdRetrieve() : InstallID {
        val localVarResponse = enterpriseLicenseGetInstallIdRetrieveWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InstallID
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Get install_id
     * @return ApiResponse<InstallID?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicenseGetInstallIdRetrieveWithHttpInfo() : ApiResponse<InstallID?> {
        val localVariableConfig = enterpriseLicenseGetInstallIdRetrieveRequestConfig()

        return request<Unit, InstallID>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicenseGetInstallIdRetrieve
     *
     * @return RequestConfig
     */
    fun enterpriseLicenseGetInstallIdRetrieveRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/enterprise/license/get_install_id/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * License Viewset
     * @param name  (optional)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param search A search term. (optional)
     * @return PaginatedLicenseList
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicenseList(name: kotlin.String? = null, ordering: kotlin.String? = null, page: kotlin.Int? = null, pageSize: kotlin.Int? = null, search: kotlin.String? = null) : PaginatedLicenseList {
        val localVarResponse = enterpriseLicenseListWithHttpInfo(name = name, ordering = ordering, page = page, pageSize = pageSize, search = search)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaginatedLicenseList
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * License Viewset
     * @param name  (optional)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param search A search term. (optional)
     * @return ApiResponse<PaginatedLicenseList?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicenseListWithHttpInfo(name: kotlin.String?, ordering: kotlin.String?, page: kotlin.Int?, pageSize: kotlin.Int?, search: kotlin.String?) : ApiResponse<PaginatedLicenseList?> {
        val localVariableConfig = enterpriseLicenseListRequestConfig(name = name, ordering = ordering, page = page, pageSize = pageSize, search = search)

        return request<Unit, PaginatedLicenseList>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicenseList
     *
     * @param name  (optional)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param search A search term. (optional)
     * @return RequestConfig
     */
    fun enterpriseLicenseListRequestConfig(name: kotlin.String?, ordering: kotlin.String?, page: kotlin.Int?, pageSize: kotlin.Int?, search: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (name != null) {
                    put("name", listOf(name.toString()))
                }
                if (ordering != null) {
                    put("ordering", listOf(ordering.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (pageSize != null) {
                    put("page_size", listOf(pageSize.toString()))
                }
                if (search != null) {
                    put("search", listOf(search.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/enterprise/license/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * License Viewset
     * @param licenseUuid A UUID string identifying this License.
     * @param patchedLicenseRequest  (optional)
     * @return License
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicensePartialUpdate(licenseUuid: java.util.UUID, patchedLicenseRequest: PatchedLicenseRequest? = null) : License {
        val localVarResponse = enterpriseLicensePartialUpdateWithHttpInfo(licenseUuid = licenseUuid, patchedLicenseRequest = patchedLicenseRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as License
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * License Viewset
     * @param licenseUuid A UUID string identifying this License.
     * @param patchedLicenseRequest  (optional)
     * @return ApiResponse<License?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicensePartialUpdateWithHttpInfo(licenseUuid: java.util.UUID, patchedLicenseRequest: PatchedLicenseRequest?) : ApiResponse<License?> {
        val localVariableConfig = enterpriseLicensePartialUpdateRequestConfig(licenseUuid = licenseUuid, patchedLicenseRequest = patchedLicenseRequest)

        return request<PatchedLicenseRequest, License>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicensePartialUpdate
     *
     * @param licenseUuid A UUID string identifying this License.
     * @param patchedLicenseRequest  (optional)
     * @return RequestConfig
     */
    fun enterpriseLicensePartialUpdateRequestConfig(licenseUuid: java.util.UUID, patchedLicenseRequest: PatchedLicenseRequest?) : RequestConfig<PatchedLicenseRequest> {
        val localVariableBody = patchedLicenseRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PATCH,
            path = "/enterprise/license/{license_uuid}/".replace("{"+"license_uuid"+"}", encodeURIComponent(licenseUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * License Viewset
     * @param licenseUuid A UUID string identifying this License.
     * @return License
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicenseRetrieve(licenseUuid: java.util.UUID) : License {
        val localVarResponse = enterpriseLicenseRetrieveWithHttpInfo(licenseUuid = licenseUuid)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as License
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * License Viewset
     * @param licenseUuid A UUID string identifying this License.
     * @return ApiResponse<License?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicenseRetrieveWithHttpInfo(licenseUuid: java.util.UUID) : ApiResponse<License?> {
        val localVariableConfig = enterpriseLicenseRetrieveRequestConfig(licenseUuid = licenseUuid)

        return request<Unit, License>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicenseRetrieve
     *
     * @param licenseUuid A UUID string identifying this License.
     * @return RequestConfig
     */
    fun enterpriseLicenseRetrieveRequestConfig(licenseUuid: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/enterprise/license/{license_uuid}/".replace("{"+"license_uuid"+"}", encodeURIComponent(licenseUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Get the total license status
     * @return LicenseSummary
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicenseSummaryRetrieve() : LicenseSummary {
        val localVarResponse = enterpriseLicenseSummaryRetrieveWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as LicenseSummary
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Get the total license status
     * @return ApiResponse<LicenseSummary?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicenseSummaryRetrieveWithHttpInfo() : ApiResponse<LicenseSummary?> {
        val localVariableConfig = enterpriseLicenseSummaryRetrieveRequestConfig()

        return request<Unit, LicenseSummary>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicenseSummaryRetrieve
     *
     * @return RequestConfig
     */
    fun enterpriseLicenseSummaryRetrieveRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/enterprise/license/summary/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * License Viewset
     * @param licenseUuid A UUID string identifying this License.
     * @param licenseRequest 
     * @return License
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicenseUpdate(licenseUuid: java.util.UUID, licenseRequest: LicenseRequest) : License {
        val localVarResponse = enterpriseLicenseUpdateWithHttpInfo(licenseUuid = licenseUuid, licenseRequest = licenseRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as License
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * License Viewset
     * @param licenseUuid A UUID string identifying this License.
     * @param licenseRequest 
     * @return ApiResponse<License?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicenseUpdateWithHttpInfo(licenseUuid: java.util.UUID, licenseRequest: LicenseRequest) : ApiResponse<License?> {
        val localVariableConfig = enterpriseLicenseUpdateRequestConfig(licenseUuid = licenseUuid, licenseRequest = licenseRequest)

        return request<LicenseRequest, License>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicenseUpdate
     *
     * @param licenseUuid A UUID string identifying this License.
     * @param licenseRequest 
     * @return RequestConfig
     */
    fun enterpriseLicenseUpdateRequestConfig(licenseUuid: java.util.UUID, licenseRequest: LicenseRequest) : RequestConfig<LicenseRequest> {
        val localVariableBody = licenseRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/enterprise/license/{license_uuid}/".replace("{"+"license_uuid"+"}", encodeURIComponent(licenseUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Get a list of all objects that use this object
     * @param licenseUuid A UUID string identifying this License.
     * @return kotlin.collections.List<UsedBy>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enterpriseLicenseUsedByList(licenseUuid: java.util.UUID) : kotlin.collections.List<UsedBy> {
        val localVarResponse = enterpriseLicenseUsedByListWithHttpInfo(licenseUuid = licenseUuid)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<UsedBy>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Get a list of all objects that use this object
     * @param licenseUuid A UUID string identifying this License.
     * @return ApiResponse<kotlin.collections.List<UsedBy>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun enterpriseLicenseUsedByListWithHttpInfo(licenseUuid: java.util.UUID) : ApiResponse<kotlin.collections.List<UsedBy>?> {
        val localVariableConfig = enterpriseLicenseUsedByListRequestConfig(licenseUuid = licenseUuid)

        return request<Unit, kotlin.collections.List<UsedBy>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation enterpriseLicenseUsedByList
     *
     * @param licenseUuid A UUID string identifying this License.
     * @return RequestConfig
     */
    fun enterpriseLicenseUsedByListRequestConfig(licenseUuid: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/enterprise/license/{license_uuid}/used_by/".replace("{"+"license_uuid"+"}", encodeURIComponent(licenseUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
