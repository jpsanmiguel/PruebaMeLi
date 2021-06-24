package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class SellerModel (
    var id: Int?,
    var permalink: String?,
    @Json(name = "registration_date") var registrationDate: String?,
    @Json(name = "car_dealer") var carDealer: Boolean?,
    @Json(name = "real_state_agency") var realStateAgency: Boolean?,
    var tags: List<String>?,
    @Json(name = "seller_reputation") var sellerReputation: SellerReputationModel?,
)