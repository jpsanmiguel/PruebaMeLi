package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class MetricModel(
    var claims: DefaultMetricModel?,
    @Json(name = "delayed_handling_time") var delayedHandlingTime: DefaultMetricModel?,
    var sales: SalesMetricModel?,
    var cancellations: DefaultMetricModel?,
)