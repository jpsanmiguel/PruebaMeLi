package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class ShippingModel(
    @Json(name = "free_shipping") var freeShipping: Boolean?,
    var mode: String?,
    var tags: List<String>?,
    @Json(name = "logistic_type") var logisticType: String?,
    @Json(name = "store_pick_up") var storePickUp: Boolean?,
)