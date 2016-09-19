package com.leo

import com.github.salomonbrys.kotson.fromJson
import com.google.gson.Gson
import com.leo.tlintime.common.AbstractApi
import com.leo.tlintimes.listing.model.Result
import com.leo.tlintimes.listing.model.TopArticlesResponse

class NewYorkTimesApi:AbstractApi(){

    override fun getBaseParams(): List<Pair<String, Any?>> = listOf("api-key" to "779d0d44410f15a1305adc3ca7839156:19:74782749")
    override fun getBaseUrl(): String  = "https://api.nytimes.com/svc/topstories/v2/"

    fun getStoriesFrom(section:String,stories:(List<Result>)-> Unit) {
        getFromEndpoint(section,{ response ->
            stories(Gson().fromJson<TopArticlesResponse>(response).results)
        })
    }
}


