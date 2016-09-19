package com.leo.tlintimes.listing.presenter

import com.leo.tlintimes.listing.interactor.ListingInteractor
import com.leo.tlintimes.listing.view.ListingView


class ListingStoriesPresenter(var view : ListingView) {

    fun getStories(section: String){
        val listingInteractor = ListingInteractor();
        listingInteractor.getTopStories(section,{
            topStories -> view.showListingTopStories(topStories)
        })
    }
}