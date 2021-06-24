package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class SearchResultAddressModel(
    @Json(name = "state_id") var stateId: String?,
    @Json(name = "state_name") var stateName: String?,
    @Json(name = "city_id") var cityId: String?,
    @Json(name = "city_name") var cityName: String?,
)