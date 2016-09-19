package com.leo.tlintimes.listing.model

data class TopArticlesResponse (var status: String?,
                                var copyright: String?,
                                var section: String?,
                                var lastUpdated: String?,
                                var numResults: Int?,
                                var results: List<Result>) {
}
