# log


```code
2020-10-26 00:09:25.397 30523-30523/com.example.webview_app D/MainActivity: 主进程 🚀

2020-10-26 00:09:43.090 30523-30523/com.example.webview_app I/chromium: [INFO:CONSOLE(8)] "value =", source: file:///android_asset/app.js (8)
2020-10-26 00:09:43.093 30523-30665/com.example.webview_app D/JsInterface: JS 接口类，WebView 进程 ✅
2020-10-26 00:09:43.093 30523-30665/com.example.webview_app D/JsInterface: setValue: A😀😀😂😂🤣🤣

```


```java
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

```


js 调用 webview SDK 有点复杂

线程不一致问题

webview 调用 js 比较简单

(`javascript; function_name`)
