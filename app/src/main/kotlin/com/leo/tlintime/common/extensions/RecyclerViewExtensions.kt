package com.leo.tlintime.common.extensions

import android.support.v7.widget.RecyclerView
import android.view.View
import com.leo.util.RecyclerViewItemClickListener

fun RecyclerView.onItemClickListener(onItemClick:(view: View?, position:Int?)->Unit) {
    this.addOnItemTouchListener(RecyclerViewItemClickListener(this.context,onItemClick))
}
