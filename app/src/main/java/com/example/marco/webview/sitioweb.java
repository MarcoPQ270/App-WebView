package com.example.marco.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class sitioweb extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitioweb);

        wv1 = (WebView)findViewById(R.id.wv1);
        String URL = getIntent().getStringExtra("enlace");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://"+URL);

    }
    public void regresar(View v){
    finish();
    }
//llave final
}
