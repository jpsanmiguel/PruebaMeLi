package sanmiguel.juan.pruebatecnicameli.network.responsemodel

import com.squareup.moshi.Json
import sanmiguel.juan.pruebatecnicameli.network.model.FilterModel
import sanmiguel.juan.pruebatecnicameli.network.model.PagingModel
import sanmiguel.juan.pruebatecnicameli.network.model.SearchResultModel
import sanmiguel.juan.pruebatecnicameli.network.model.SortModel

data class SearchResponseModel (
    @Json(name = "site_id") var siteId: String?,
    var query: String?,
    var paging: PagingModel?,
    var results: List<SearchResultModel>?,
    @Json(name = "secondary_results") var secondaryResults: List<SearchResultModel>?,
    @Json(name = "related_results") var relatedResults: List<SearchResultModel>?,
    var sort: SortModel?,
    @Json(name = "available_sorts") var availableSorts: List<SortModel>?,
    var filters: List<FilterModel>?,
    @Json(name = "available_filters") var availableFilters: List<FilterModel>?,
)