package com.leo.tlintimes.listing.adapter

import android.view.View
import com.leo.tlintime.common.GenericRecyclerViewHolder
import com.leo.tlintimes.listing.model.Result
import kotlinx.android.synthetic.main.listing_item.view.*

class ListingViewHolder(view: View?) : GenericRecyclerViewHolder<Result>(view) {

    override fun populateView(t: Result?) {
        itemView.article_title.setText(t?.title)
        if(t?.multimedia!!.size > 0) {
            itemView.article_image.setImageURI(t?.multimedia?.get(3)?.url)
        }
    }

}