package com.leo.tlintimes.listing.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.leo.tlintime.common.GenericRecyclerViewAdapter
import com.leo.tlintimes.R
import com.leo.tlintimes.listing.model.Result

class ListingAdapter : GenericRecyclerViewAdapter<ListingViewHolder, Result>() {

    override fun bindView(holder: ListingViewHolder, element: Result?)  = holder.populateView(element)

    override fun createViewHolder(parent: ViewGroup?): ListingViewHolder  =
            ListingViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.listing_item,parent,false))
}