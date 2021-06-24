package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class SellerReputationModel (
    var transactions: TransactionModel?,
    @Json(name = "power_seller_status") var powerSellerStatus: String?,
    var metrics: MetricModel?,
    @Json(name = "level_id") var levelId: String
)