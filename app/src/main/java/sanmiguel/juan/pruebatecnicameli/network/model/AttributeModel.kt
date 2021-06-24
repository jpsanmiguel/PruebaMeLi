package sanmiguel.juan.pruebatecnicameli.network.model

import com.squareup.moshi.Json

data class AttributeModel(
    @Json(name = "value_id") var valueId: String?,
    @Json(name = "value_name") var valueName: String?,
    @Json(name = "attribute_group_name") var groupName: String?,
    @Json(name = "attribute_group_id") var groupId: String?,
    var source: Long?,
    var id: String?,
    var name: String?,

)