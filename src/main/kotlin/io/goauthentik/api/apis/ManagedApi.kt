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

package io.goauthentik.api.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import io.goauthentik.api.models.BlueprintFile
import io.goauthentik.api.models.BlueprintInstance
import io.goauthentik.api.models.BlueprintInstanceRequest
import io.goauthentik.api.models.GenericError
import io.goauthentik.api.models.PaginatedBlueprintInstanceList
import io.goauthentik.api.models.PatchedBlueprintInstanceRequest
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

class ManagedApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost/api/v3")
        }
    }

    /**
     * 
     * Apply a blueprint
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return BlueprintInstance
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun managedBlueprintsApplyCreate(instanceUuid: java.util.UUID) : BlueprintInstance {
        val localVarResponse = managedBlueprintsApplyCreateWithHttpInfo(instanceUuid = instanceUuid)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BlueprintInstance
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Apply a blueprint
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return ApiResponse<BlueprintInstance?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun managedBlueprintsApplyCreateWithHttpInfo(instanceUuid: java.util.UUID) : ApiResponse<BlueprintInstance?> {
        val localVariableConfig = managedBlueprintsApplyCreateRequestConfig(instanceUuid = instanceUuid)

        return request<Unit, BlueprintInstance>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation managedBlueprintsApplyCreate
     *
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return RequestConfig
     */
    fun managedBlueprintsApplyCreateRequestConfig(instanceUuid: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/managed/blueprints/{instance_uuid}/apply/".replace("{"+"instance_uuid"+"}", encodeURIComponent(instanceUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * Get blueprints
     * @return kotlin.collections.List<BlueprintFile>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun managedBlueprintsAvailableList() : kotlin.collections.List<BlueprintFile> {
        val localVarResponse = managedBlueprintsAvailableListWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<BlueprintFile>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Get blueprints
     * @return ApiResponse<kotlin.collections.List<BlueprintFile>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun managedBlueprintsAvailableListWithHttpInfo() : ApiResponse<kotlin.collections.List<BlueprintFile>?> {
        val localVariableConfig = managedBlueprintsAvailableListRequestConfig()

        return request<Unit, kotlin.collections.List<BlueprintFile>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation managedBlueprintsAvailableList
     *
     * @return RequestConfig
     */
    fun managedBlueprintsAvailableListRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/managed/blueprints/available/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * Blueprint instances
     * @param blueprintInstanceRequest 
     * @return BlueprintInstance
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun managedBlueprintsCreate(blueprintInstanceRequest: BlueprintInstanceRequest) : BlueprintInstance {
        val localVarResponse = managedBlueprintsCreateWithHttpInfo(blueprintInstanceRequest = blueprintInstanceRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BlueprintInstance
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Blueprint instances
     * @param blueprintInstanceRequest 
     * @return ApiResponse<BlueprintInstance?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun managedBlueprintsCreateWithHttpInfo(blueprintInstanceRequest: BlueprintInstanceRequest) : ApiResponse<BlueprintInstance?> {
        val localVariableConfig = managedBlueprintsCreateRequestConfig(blueprintInstanceRequest = blueprintInstanceRequest)

        return request<BlueprintInstanceRequest, BlueprintInstance>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation managedBlueprintsCreate
     *
     * @param blueprintInstanceRequest 
     * @return RequestConfig
     */
    fun managedBlueprintsCreateRequestConfig(blueprintInstanceRequest: BlueprintInstanceRequest) : RequestConfig<BlueprintInstanceRequest> {
        val localVariableBody = blueprintInstanceRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/managed/blueprints/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * Blueprint instances
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun managedBlueprintsDestroy(instanceUuid: java.util.UUID) : Unit {
        val localVarResponse = managedBlueprintsDestroyWithHttpInfo(instanceUuid = instanceUuid)

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
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Blueprint instances
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun managedBlueprintsDestroyWithHttpInfo(instanceUuid: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = managedBlueprintsDestroyRequestConfig(instanceUuid = instanceUuid)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation managedBlueprintsDestroy
     *
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return RequestConfig
     */
    fun managedBlueprintsDestroyRequestConfig(instanceUuid: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/managed/blueprints/{instance_uuid}/".replace("{"+"instance_uuid"+"}", encodeURIComponent(instanceUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * Blueprint instances
     * @param name  (optional)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param path  (optional)
     * @param search A search term. (optional)
     * @return PaginatedBlueprintInstanceList
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun managedBlueprintsList(name: kotlin.String? = null, ordering: kotlin.String? = null, page: kotlin.Int? = null, pageSize: kotlin.Int? = null, path: kotlin.String? = null, search: kotlin.String? = null) : PaginatedBlueprintInstanceList {
        val localVarResponse = managedBlueprintsListWithHttpInfo(name = name, ordering = ordering, page = page, pageSize = pageSize, path = path, search = search)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaginatedBlueprintInstanceList
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Blueprint instances
     * @param name  (optional)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param path  (optional)
     * @param search A search term. (optional)
     * @return ApiResponse<PaginatedBlueprintInstanceList?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun managedBlueprintsListWithHttpInfo(name: kotlin.String?, ordering: kotlin.String?, page: kotlin.Int?, pageSize: kotlin.Int?, path: kotlin.String?, search: kotlin.String?) : ApiResponse<PaginatedBlueprintInstanceList?> {
        val localVariableConfig = managedBlueprintsListRequestConfig(name = name, ordering = ordering, page = page, pageSize = pageSize, path = path, search = search)

        return request<Unit, PaginatedBlueprintInstanceList>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation managedBlueprintsList
     *
     * @param name  (optional)
     * @param ordering Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param path  (optional)
     * @param search A search term. (optional)
     * @return RequestConfig
     */
    fun managedBlueprintsListRequestConfig(name: kotlin.String?, ordering: kotlin.String?, page: kotlin.Int?, pageSize: kotlin.Int?, path: kotlin.String?, search: kotlin.String?) : RequestConfig<Unit> {
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
                if (path != null) {
                    put("path", listOf(path.toString()))
                }
                if (search != null) {
                    put("search", listOf(search.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/managed/blueprints/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * Blueprint instances
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @param patchedBlueprintInstanceRequest  (optional)
     * @return BlueprintInstance
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun managedBlueprintsPartialUpdate(instanceUuid: java.util.UUID, patchedBlueprintInstanceRequest: PatchedBlueprintInstanceRequest? = null) : BlueprintInstance {
        val localVarResponse = managedBlueprintsPartialUpdateWithHttpInfo(instanceUuid = instanceUuid, patchedBlueprintInstanceRequest = patchedBlueprintInstanceRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BlueprintInstance
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Blueprint instances
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @param patchedBlueprintInstanceRequest  (optional)
     * @return ApiResponse<BlueprintInstance?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun managedBlueprintsPartialUpdateWithHttpInfo(instanceUuid: java.util.UUID, patchedBlueprintInstanceRequest: PatchedBlueprintInstanceRequest?) : ApiResponse<BlueprintInstance?> {
        val localVariableConfig = managedBlueprintsPartialUpdateRequestConfig(instanceUuid = instanceUuid, patchedBlueprintInstanceRequest = patchedBlueprintInstanceRequest)

        return request<PatchedBlueprintInstanceRequest, BlueprintInstance>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation managedBlueprintsPartialUpdate
     *
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @param patchedBlueprintInstanceRequest  (optional)
     * @return RequestConfig
     */
    fun managedBlueprintsPartialUpdateRequestConfig(instanceUuid: java.util.UUID, patchedBlueprintInstanceRequest: PatchedBlueprintInstanceRequest?) : RequestConfig<PatchedBlueprintInstanceRequest> {
        val localVariableBody = patchedBlueprintInstanceRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PATCH,
            path = "/managed/blueprints/{instance_uuid}/".replace("{"+"instance_uuid"+"}", encodeURIComponent(instanceUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * Blueprint instances
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return BlueprintInstance
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun managedBlueprintsRetrieve(instanceUuid: java.util.UUID) : BlueprintInstance {
        val localVarResponse = managedBlueprintsRetrieveWithHttpInfo(instanceUuid = instanceUuid)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BlueprintInstance
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Blueprint instances
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return ApiResponse<BlueprintInstance?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun managedBlueprintsRetrieveWithHttpInfo(instanceUuid: java.util.UUID) : ApiResponse<BlueprintInstance?> {
        val localVariableConfig = managedBlueprintsRetrieveRequestConfig(instanceUuid = instanceUuid)

        return request<Unit, BlueprintInstance>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation managedBlueprintsRetrieve
     *
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return RequestConfig
     */
    fun managedBlueprintsRetrieveRequestConfig(instanceUuid: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/managed/blueprints/{instance_uuid}/".replace("{"+"instance_uuid"+"}", encodeURIComponent(instanceUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * Blueprint instances
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @param blueprintInstanceRequest 
     * @return BlueprintInstance
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun managedBlueprintsUpdate(instanceUuid: java.util.UUID, blueprintInstanceRequest: BlueprintInstanceRequest) : BlueprintInstance {
        val localVarResponse = managedBlueprintsUpdateWithHttpInfo(instanceUuid = instanceUuid, blueprintInstanceRequest = blueprintInstanceRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BlueprintInstance
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Blueprint instances
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @param blueprintInstanceRequest 
     * @return ApiResponse<BlueprintInstance?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun managedBlueprintsUpdateWithHttpInfo(instanceUuid: java.util.UUID, blueprintInstanceRequest: BlueprintInstanceRequest) : ApiResponse<BlueprintInstance?> {
        val localVariableConfig = managedBlueprintsUpdateRequestConfig(instanceUuid = instanceUuid, blueprintInstanceRequest = blueprintInstanceRequest)

        return request<BlueprintInstanceRequest, BlueprintInstance>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation managedBlueprintsUpdate
     *
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @param blueprintInstanceRequest 
     * @return RequestConfig
     */
    fun managedBlueprintsUpdateRequestConfig(instanceUuid: java.util.UUID, blueprintInstanceRequest: BlueprintInstanceRequest) : RequestConfig<BlueprintInstanceRequest> {
        val localVariableBody = blueprintInstanceRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/managed/blueprints/{instance_uuid}/".replace("{"+"instance_uuid"+"}", encodeURIComponent(instanceUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * Get a list of all objects that use this object
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return kotlin.collections.List<UsedBy>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun managedBlueprintsUsedByList(instanceUuid: java.util.UUID) : kotlin.collections.List<UsedBy> {
        val localVarResponse = managedBlueprintsUsedByListWithHttpInfo(instanceUuid = instanceUuid)

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
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Get a list of all objects that use this object
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return ApiResponse<kotlin.collections.List<UsedBy>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun managedBlueprintsUsedByListWithHttpInfo(instanceUuid: java.util.UUID) : ApiResponse<kotlin.collections.List<UsedBy>?> {
        val localVariableConfig = managedBlueprintsUsedByListRequestConfig(instanceUuid = instanceUuid)

        return request<Unit, kotlin.collections.List<UsedBy>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation managedBlueprintsUsedByList
     *
     * @param instanceUuid A UUID string identifying this Blueprint Instance.
     * @return RequestConfig
     */
    fun managedBlueprintsUsedByListRequestConfig(instanceUuid: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/managed/blueprints/{instance_uuid}/used_by/".replace("{"+"instance_uuid"+"}", encodeURIComponent(instanceUuid.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
