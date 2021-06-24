package sanmiguel.juan.pruebatecnicameli.network

import kotlinx.coroutines.Deferred
import retrofit2.http.*
import sanmiguel.juan.pruebatecnicameli.network.responsemodel.SearchResponseModel

interface MeLiRestApi {

    @GET("search")
    fun searchAsync(
        @Query("q") search: String,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
    ): Deferred<SearchResponseModel>

    object MeLiApiService {
        val meLiApiService: MeLiRestApi by lazy { ApiServiceBuilder.buildService(MeLiRestApi::class.java) }
    }
}