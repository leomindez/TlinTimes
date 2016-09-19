package com.leo.tlintimes.listing.model


data class Result (var section: String?,
                   var subsection: String?,
                   var title: String?, var abstract: String?,
                   var url: String?,
                   var byline: String?,
                   var itemType: String?,
                   var updatedDate: String?,
                   var createdDate: String?,var publishedDate: String?,
                   var materialTypeFacet: String?,
                   var kicker: String?,
                   var desFacet: List<String>,
                   var orgFacet: List<String>,
                   var perFacet: List<String>,
                   var geoFacet: List<String>,
                   var  multimedia: List<Multimedium>) {
}
