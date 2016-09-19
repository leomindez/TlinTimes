package com.leo.tlintime.common

import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.httpGet

abstract class AbstractApi {
    init {
        FuelManager.instance.basePath = getBaseUrl()
        FuelManager.instance.baseParams = getBaseParams()
    }
    abstract fun getBaseUrl():String
    abstract fun getBaseParams(): List<Pair<String,Any?>>

    fun getFromEndpoint(endpoint:String, response: (result:String) -> Unit) {
            endpoint.httpGet().responseString{
                req, res, result -> response(result.get())
            }
    }

}
