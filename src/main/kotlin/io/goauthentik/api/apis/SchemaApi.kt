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

package io.goauthentik.api.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import io.goauthentik.api.models.GenericError
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

class SchemaApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost/api/v3")
        }
    }

    /**
     * enum for parameter format
     */
     enum class Format_schemaRetrieve(val value: kotlin.String) {
         @Json(name = "json") json("json"),
         @Json(name = "yaml") yaml("yaml"),
     }

    /**
     * enum for parameter lang
     */
     enum class Lang_schemaRetrieve(val value: kotlin.String) {
         @Json(name = "af") af("af"),
         @Json(name = "ar") ar("ar"),
         @Json(name = "ar-dz") arMinusDz("ar-dz"),
         @Json(name = "ast") ast("ast"),
         @Json(name = "az") az("az"),
         @Json(name = "be") be("be"),
         @Json(name = "bg") bg("bg"),
         @Json(name = "bn") bn("bn"),
         @Json(name = "br") br("br"),
         @Json(name = "bs") bs("bs"),
         @Json(name = "ca") ca("ca"),
         @Json(name = "ckb") ckb("ckb"),
         @Json(name = "cs") cs("cs"),
         @Json(name = "cy") cy("cy"),
         @Json(name = "da") da("da"),
         @Json(name = "de") de("de"),
         @Json(name = "dsb") dsb("dsb"),
         @Json(name = "el") el("el"),
         @Json(name = "en") en("en"),
         @Json(name = "en-au") enMinusAu("en-au"),
         @Json(name = "en-gb") enMinusGb("en-gb"),
         @Json(name = "eo") eo("eo"),
         @Json(name = "es") es("es"),
         @Json(name = "es-ar") esMinusAr("es-ar"),
         @Json(name = "es-co") esMinusCo("es-co"),
         @Json(name = "es-mx") esMinusMx("es-mx"),
         @Json(name = "es-ni") esMinusNi("es-ni"),
         @Json(name = "es-ve") esMinusVe("es-ve"),
         @Json(name = "et") et("et"),
         @Json(name = "eu") eu("eu"),
         @Json(name = "fa") fa("fa"),
         @Json(name = "fi") fi("fi"),
         @Json(name = "fr") fr("fr"),
         @Json(name = "fy") fy("fy"),
         @Json(name = "ga") ga("ga"),
         @Json(name = "gd") gd("gd"),
         @Json(name = "gl") gl("gl"),
         @Json(name = "he") he("he"),
         @Json(name = "hi") hi("hi"),
         @Json(name = "hr") hr("hr"),
         @Json(name = "hsb") hsb("hsb"),
         @Json(name = "hu") hu("hu"),
         @Json(name = "hy") hy("hy"),
         @Json(name = "ia") ia("ia"),
         @Json(name = "id") id("id"),
         @Json(name = "ig") ig("ig"),
         @Json(name = "io") io("io"),
         @Json(name = "is") `is`("is"),
         @Json(name = "it") `it`("it"),
         @Json(name = "ja") ja("ja"),
         @Json(name = "ka") ka("ka"),
         @Json(name = "kab") kab("kab"),
         @Json(name = "kk") kk("kk"),
         @Json(name = "km") km("km"),
         @Json(name = "kn") kn("kn"),
         @Json(name = "ko") ko("ko"),
         @Json(name = "ky") ky("ky"),
         @Json(name = "lb") lb("lb"),
         @Json(name = "lt") lt("lt"),
         @Json(name = "lv") lv("lv"),
         @Json(name = "mk") mk("mk"),
         @Json(name = "ml") ml("ml"),
         @Json(name = "mn") mn("mn"),
         @Json(name = "mr") mr("mr"),
         @Json(name = "ms") ms("ms"),
         @Json(name = "my") my("my"),
         @Json(name = "nb") nb("nb"),
         @Json(name = "ne") ne("ne"),
         @Json(name = "nl") nl("nl"),
         @Json(name = "nn") nn("nn"),
         @Json(name = "os") os("os"),
         @Json(name = "pa") pa("pa"),
         @Json(name = "pl") pl("pl"),
         @Json(name = "pt") pt("pt"),
         @Json(name = "pt-br") ptMinusBr("pt-br"),
         @Json(name = "ro") ro("ro"),
         @Json(name = "ru") ru("ru"),
         @Json(name = "sk") sk("sk"),
         @Json(name = "sl") sl("sl"),
         @Json(name = "sq") sq("sq"),
         @Json(name = "sr") sr("sr"),
         @Json(name = "sr-latn") srMinusLatn("sr-latn"),
         @Json(name = "sv") sv("sv"),
         @Json(name = "sw") sw("sw"),
         @Json(name = "ta") ta("ta"),
         @Json(name = "te") te("te"),
         @Json(name = "tg") tg("tg"),
         @Json(name = "th") th("th"),
         @Json(name = "tk") tk("tk"),
         @Json(name = "tr") tr("tr"),
         @Json(name = "tt") tt("tt"),
         @Json(name = "udm") udm("udm"),
         @Json(name = "uk") uk("uk"),
         @Json(name = "ur") ur("ur"),
         @Json(name = "uz") uz("uz"),
         @Json(name = "vi") vi("vi"),
         @Json(name = "zh-hans") zhMinusHans("zh-hans"),
         @Json(name = "zh-hant") zhMinusHant("zh-hant"),
     }

    /**
     * 
     * OpenApi3 schema for this API. Format can be selected via content negotiation.  - YAML: application/vnd.oai.openapi - JSON: application/vnd.oai.openapi+json
     * @param format  (optional)
     * @param lang  (optional)
     * @return kotlin.collections.Map<kotlin.String, kotlin.Any>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun schemaRetrieve(format: Format_schemaRetrieve? = null, lang: Lang_schemaRetrieve? = null) : kotlin.collections.Map<kotlin.String, kotlin.Any> {
        val localVarResponse = schemaRetrieveWithHttpInfo(format = format, lang = lang)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.Map<kotlin.String, kotlin.Any>
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
     * OpenApi3 schema for this API. Format can be selected via content negotiation.  - YAML: application/vnd.oai.openapi - JSON: application/vnd.oai.openapi+json
     * @param format  (optional)
     * @param lang  (optional)
     * @return ApiResponse<kotlin.collections.Map<kotlin.String, kotlin.Any>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun schemaRetrieveWithHttpInfo(format: Format_schemaRetrieve?, lang: Lang_schemaRetrieve?) : ApiResponse<kotlin.collections.Map<kotlin.String, kotlin.Any>?> {
        val localVariableConfig = schemaRetrieveRequestConfig(format = format, lang = lang)

        return request<Unit, kotlin.collections.Map<kotlin.String, kotlin.Any>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation schemaRetrieve
     *
     * @param format  (optional)
     * @param lang  (optional)
     * @return RequestConfig
     */
    fun schemaRetrieveRequestConfig(format: Format_schemaRetrieve?, lang: Lang_schemaRetrieve?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (format != null) {
                    put("format", listOf(format.toString()))
                }
                if (lang != null) {
                    put("lang", listOf(lang.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/vnd.oai.openapi+json, application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/schema/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
