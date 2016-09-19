package com.leo.tlintimes.detail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.leo.tlintimes.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        article_detail.settings.setJavaScriptEnabled(true)
        article_detail.setWebViewClient(WebViewClient())
        article_detail.loadUrl(intent?.getStringExtra("article_url"))

    }
}


