package com.leo.tlintimes.listing.interactor

import com.leo.NewYorkTimesApi
import com.leo.tlintimes.listing.model.Result

class ListingInteractor {

    fun  getTopStories(section: String,result:(List<Result>) -> Unit) {
        NewYorkTimesApi().getStoriesFrom(section,{
            stories -> result(stories)
        })
    }

}