package com.example.my_map;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize WebView
        myWebView = findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript if necessary

        myWebView.setWebViewClient(new WebViewClient()); // Ensure links open within the WebView
        String url = "https://app.mappedin.com/map/66459bbb8004177ee42bcef7/directions?floor=m_b67679123d0e6de0&location=s_4897bb49696e2aef&departure=e_064bdf1ba0e41e81";
        myWebView.loadUrl(url);
    }
}
