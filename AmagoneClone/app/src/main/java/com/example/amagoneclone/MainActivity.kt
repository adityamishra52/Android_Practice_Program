package com.example.amagoneclone

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val WebViewVar = findViewById<WebView>(R.id.Webview)

        Webviewsetup(WebViewVar)



    }
    @SuppressLint("SetJavaScriptEnabled")
    private fun Webviewsetup(a: WebView){
        a.webViewClient = android.webkit.WebViewClient()

            a.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChsSEwjihtO9o8uOAxWxyxYFHVBIJjwYACICCAEQABoCdGw&co=1&ase=2&gclid=CjwKCAjwp_LDBhBCEiwAK7Fnkmq-isNXoDLfFTJDw7qI8pqonEOJz2_pU-IPU5XS6_HG3n7fEoekuxoCoZUQAvD_BwE&ohost=www.google.com&cid=CAESV-D2Wsz55WNnKEAchqb1myBGU887F7vRMu9v90I_WoZanCnSysCzKzMdFtVvTUrpnbsgM8zTkRL5fzI876010IfAqtgo7c37LqRv_UM6dpKHFktXxlLxxA&category=acrcp_v1_40&sig=AOD64_3Z97mqLdrp967dgq6hWx4dhW1Xpg&q&nis=4&adurl&ved=2ahUKEwiKvs69o8uOAxW6j68BHSIdETIQ0Qx6BAgJEAE")
        }
    }
}