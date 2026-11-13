package com.fighter.game

import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebSettings
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        
        webView = WebView(this)
        setContentView(webView)
        
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.useWideViewPort = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.cacheMode = WebSettings.LOAD_NO_CACHE
        
        // Load game dari assets
        webView.loadUrl("file:///android_asset/index.html")
    }

    override fun onBackPressed() {
        // Disable back button saat main
    }
}
