package sanmiguel.juan.pruebatecnicameli.network.model

data class TransactionModel(
    var total: Int?,
    var canceled: Int?,
    var period: String?,
    var ratings: RatingModel?,
    var completed: Int?,
)