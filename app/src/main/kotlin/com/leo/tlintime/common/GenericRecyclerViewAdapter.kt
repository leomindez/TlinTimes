package com.leo.tlintime.common

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import java.util.*

abstract class GenericRecyclerViewAdapter<VH : RecyclerView.ViewHolder, I> : RecyclerView.Adapter<VH>() {

   lateinit var itemsAdapter:MutableList<I>
    init{
        itemsAdapter = ArrayList()
    }
    override fun onBindViewHolder(holder: VH, position: Int) = bindView(holder,getItem(position))

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): VH  = createViewHolder(parent)

    override fun getItemCount(): Int =  itemsAdapter.size

    abstract fun bindView(holder:VH,element: I?)
    abstract fun createViewHolder(parent: ViewGroup?):VH

    fun getItem(position: Int) : I? = itemsAdapter.get(position)

    fun addItem(item: I){
        itemsAdapter.add(item)
        notifyDataSetChanged()
    }

    fun deleteItem(position: Int){
        itemsAdapter.removeAt(position)
        notifyDataSetChanged()
    }

    fun addItems(items: MutableList<I>) {
        itemsAdapter.addAll(items)
        notifyDataSetChanged()
    }
}