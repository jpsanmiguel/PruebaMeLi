package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class InstallmentModel(
    var quantity: Int?,
    var amount: Double?,
    var rate: Double?,
    @Json(name = "currency_id") var currencyId: String?,
)