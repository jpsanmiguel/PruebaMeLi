package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class PriceModel(
    var id: String?,
    var type: String?,
    var amount: Int?,
    @Json(name = "regular_amount") var regularAmount: Int?,
    @Json(name = "currency_id") var currencyId: String?,
    @Json(name = "exchange_rate_context") var exchangeRateContext: Int?,
    @Json(name = "last_updated") var lastUpdated: String?,
)