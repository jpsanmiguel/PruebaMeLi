package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class SellerAddressModel(
    var id: String?,
    var comment: String?,
    @Json(name = "address_line") var addressLine: String?,
    @Json(name = "zip_code") var zipCode: String?,
    var country: DefaultAddressLocationModel?,
    var state: DefaultAddressLocationModel?,
    var city: DefaultAddressLocationModel?,
    var latitude: String?,
    var longitude: String?,
)