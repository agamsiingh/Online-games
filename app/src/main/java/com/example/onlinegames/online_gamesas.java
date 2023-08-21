package com.example.onlinegames;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class online_gamesas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_gamesas);

        // Find the WebView by its unique ID
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView = findViewById(R.id.web1);

        // loading https://www.geeksforgeeks.org url in the WebView.
        webView.loadUrl("https://poki.com/?campaign=14724960451&adgroup=126257772934&extensionid=&targetid=aud-1875460979642:kwd-11472680&location=9040183&matchtype=e&network=g&device=c&devicemodel=&creative=594129712058&keyword=online%20games&placement=&target=&gclid=CjwKCAjwyqWkBhBMEiwAp2yUFswtwsFZ_WcLbvZK4kbhglsv39iwxmyKOZlfFKoP3gyfcl1B55Ez3hoC6csQAvD_BwE");

        // this will enable the javascript.
        webView.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.setWebViewClient(new WebViewClient());

    }
}