package com.example.webview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private WebView testWebView;
  private TextView testTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initWidgets(savedInstanceState);
  }

  private void initWidgets(Bundle savedInstanceState) {
    testWebView = findViewById(R.id.webView);
    testTextView = findViewById(R.id.textView);
    // 1. 开启 WebView 对 js 加载的支持
    testWebView.getSettings().setJavaScriptEnabled(true);
    // 3. WebView 上添加 js 方法的接口实现类(new 实例化)
    testWebView.addJavascriptInterface(new JsInterface(), "JsLauncher");
    // ✅ Java 中定义的接口名，✅ 要在 js 中使用的方法名
    // webView.addJavascriptInterface(new jsMethodsObjectInterface(), "jsMethodsObjectName");
    // 4. 加载 URL (local / http server)
    testWebView.loadUrl("file:///android_asset/index.html");
    // ❓ android_asset
    // testWebView.loadUrl("file:///android_assets/index.html");
    // testWebView.loadUrl("https://cdn.xgqfrms.xyz/index.html");
  }
}
