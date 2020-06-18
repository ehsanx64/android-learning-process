package net.ehsanm.learningprocess;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Part_WebView_Main extends AppCompatActivity {
    // This is our main WebView
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_part__web_view__main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        doWebviewStuff();
    }

    private void doWebviewStuff() {
        String googleUrl = "https://google.com";

        // Get it
        webView = findViewById(R.id.webview_main);

        // Enable JavaScript
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient() {
            public void onRecievedError(WebView wv, int errorCode, String description, String failingUrl) {
                Toast.makeText(wv.getContext(), "HTTP Error" + errorCode + ": " + description, Toast.LENGTH_LONG);
            }
        });

        // Load this url
        webView.loadUrl(googleUrl);
    }
}
