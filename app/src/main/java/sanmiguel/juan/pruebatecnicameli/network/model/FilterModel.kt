package sanmiguel.juan.pruebatecnicameli.network.model

data class FilterModel(
    var id: String?,
    var name: String?,
    var type: String?,
    var values: List<FilterValueModel>?,
)