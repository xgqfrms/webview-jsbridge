package com.example.webview_app;

import android.util.Log;
import android.webkit.JavascriptInterface;

// 2. 编写 js 接口类
public class JsInterface {
  private static final String TAG = "JsInterface";
  // 注解
  @JavascriptInterface
  public void setValue(String value) {
    // Log.d(tag, msg);
    Log.d("JsInterface", "JS 接口类，WebView 进程 ✅");
    Log.d(TAG, "setValue: " + value);
  }
}
