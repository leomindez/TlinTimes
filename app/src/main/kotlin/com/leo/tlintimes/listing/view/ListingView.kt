package com.leo.tlintimes.listing.view

import com.leo.tlintime.common.view.View
import com.leo.tlintimes.listing.model.Result

interface ListingView:View {
    fun showListingTopStories(stories:List<Result>)
}