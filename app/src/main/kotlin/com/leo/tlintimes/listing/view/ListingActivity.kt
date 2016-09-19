package com.leo.tlintimes.listing.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.leo.tlintime.common.extensions.onItemClickListener
import com.leo.tlintimes.R
import com.leo.tlintimes.detail.DetailActivity
import com.leo.tlintimes.listing.adapter.ListingAdapter
import com.leo.tlintimes.listing.model.Result
import com.leo.tlintimes.listing.presenter.ListingStoriesPresenter
import kotlinx.android.synthetic.main.activity_main.*

class ListingActivity : AppCompatActivity(),ListingView {

   lateinit var listingAdapter:ListingAdapter
    init {
        listingAdapter = ListingAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listingPresenter = ListingStoriesPresenter(this)
        listingPresenter.getStories("home.json")
        top_stories_listing.setLayoutManager(LinearLayoutManager(this))
        top_stories_listing.adapter = listingAdapter
        top_stories_listing.onItemClickListener { view, i ->
            val articleDetailIntent = Intent(this, DetailActivity::class.java)
            articleDetailIntent.putExtra("article_url",listingAdapter.getItem(i!!)?.url)
            startActivity(articleDetailIntent)
        }
    }

    override fun showError() {

    }

    override fun showListingTopStories(stories: List<Result>) {
        listingAdapter.addItems(stories as MutableList<Result>)
    }

}
