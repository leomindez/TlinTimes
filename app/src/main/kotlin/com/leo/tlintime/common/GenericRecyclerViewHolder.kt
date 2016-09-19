package com.leo.tlintime.common

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class GenericRecyclerViewHolder<T>(itemView: View?): RecyclerView.ViewHolder(itemView) {
    abstract fun populateView(t:T?);
}