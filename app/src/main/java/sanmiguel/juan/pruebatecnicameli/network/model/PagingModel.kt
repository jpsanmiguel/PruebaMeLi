package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class PagingModel (
    var total: Int?,
    @Json(name = "primary_results") var primaryResults: Int?,
    var offset: Int?,
    var limit: Int?,
)