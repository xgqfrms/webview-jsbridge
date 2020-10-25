package com.example.webview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

//import static android.webkit.WebView.*;

public class MainActivity extends AppCompatActivity {
  private WebView testWebView;
  private TextView testTextView;
  // Android 如何使用 WebView 加载 HTML 字符串和处理转译字符
  private String htmlString = "&lt;body&gt;&lt;header&gt;&lt;h1&gt;隐私保密条款&lt;/h1&gt;&lt;/header&gt;&lt;main&gt;&lt;article&gt;&lt;h3&gt;六、《隐私保密条款》如何更新&lt;/h3&gt;&lt;p&gt;随着法律法规的出台或修订，本网站的《隐私保密条款》可能会发生变更。条款内容变更后，本网站会以公告或站内信的形式通知用户本网站对条款所做的任何变更，或以其他适当方式提醒用户相关内容的更新。&lt;/p&gt;&lt;h3&gt;七、如何联系客服&lt;/h3&gt;&lt;p&gt;如用户对本《隐私权专项条款》内容有任何疑问、意见或建议，用户可通过客服渠道联系，官方客服电话为：&lt;ahref=&quot;tel:+400-099-8987&quot;&gt;400-099-8987&lt;/a&gt;，同时用户也可以联系本网站的“在线客服”。&lt;/p&gt;&lt;h3&gt;八、法律适用、管辖与其他&lt;/h3&gt;&lt;p&gt;8.1条款之效力、解释、变更、执行与争议解决均适用中华人民共和国法律，如无相关法律规定的，则应参照通用国际商业惯例和（或）行业惯例。&lt;/p&gt;&lt;p&gt;8.2因本条款产生之争议，应依照中华人民共和国法律予以处理，并以上海市闵行区人民法院为第一审管辖法院。&lt;/p&gt;&lt;/article&gt;&lt;/main&gt;&lt;footer&gt;&lt;imgsrc=&quot;https://cdn.xgqfrms.xyz/logo/logo.png&quot;alt=&quot;logo.png&quot;&gt;&lt;pclass=&quot;copyright&quot;&gt;copyright&amp;copy;xgqfrms2020~forever&lt;/p&gt;&lt;/footer&gt;&lt;!--js--&gt;&lt;script&gt;constlog=console.log;&lt;/script&gt;&lt;/body&gt;";
  // private static final String htmlString = "
  // &lt;body&gt;
  //   &lt;header&gt;
  //     &lt;h1&gt;隐私保密条款&lt;/h1&gt;
  //   &lt;/header&gt;
  //   &lt;main&gt;
  //     &lt;article&gt;
  //       &lt;h3&gt;六、《隐私保密条款》如何更新&lt;/h3&gt;
  //       &lt;p&gt;随着法律法规的出台或修订，本网站的《隐私保密条款》可能会发生变更。条款内容变更后，本网站会以公告或站内信的形式通知用户本网站对条款所做的任何变更，或以其他适当方式提醒用户相关内容的更新。&lt;/p&gt;
  //       &lt;h3&gt;七、如何联系客服&lt;/h3&gt;
  //       &lt;p&gt;如用户对本《隐私权专项条款》内容有任何疑问、意见或建议，用户可通过客服渠道联系，官方客服电话为：&lt;a href=&quot;tel:+400-099-8987&quot;&gt;400-099-8987&lt;/a&gt; ，同时用户也可以联系本网站的“在线客服”。&lt;/p&gt;
  //       &lt;h3&gt;八、法律适用、管辖与其他&lt;/h3&gt;
  //       &lt;p&gt;8.1 条款之效力、解释、变更、执行与争议解决均适用中华人民共和国法律，如无相关法律规定的，则应参照通用国际商业惯例和（或）行业惯例。&lt;/p&gt;
  //       &lt;p&gt;8.2 因本条款产生之争议，应依照中华人民共和国法律予以处理，并以上海市闵行区人民法院为第一审管辖法院。&lt;/p&gt;
  //     &lt;/article&gt;
  //   &lt;/main&gt;
  //   &lt;footer&gt;
  //     &lt;img src=&quot;https://cdn.xgqfrms.xyz/logo/logo.png&quot; alt=&quot;logo.png&quot;&gt;
  //     &lt;p class=&quot;copyright&quot;&gt;copyright&amp;copy; xgqfrms 2020 ~ forever&lt;/p&gt;
  //   &lt;/footer&gt;
  //   &lt;!-- js --&gt;
  //   &lt;script&gt;
  //     const log = console.log;
  //   &lt;/script&gt;
  // &lt;/body&gt;
  // ";

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
    // 4. 加载 file:///android_asset/ URL (local html)
    testWebView.loadUrl("file:///android_asset/index.html");
    // ❓ android_asset 相对目录, ✅ android_asset !== android_assets ❌
    // 5. 加载 HTTP URL (server html)
    // testWebView.loadUrl("https://www.cnblogs.com/xgqfrms/p/12697742.html");
    // 6. 加载 HTMl 字符串
    // img 自适应 css
    // htmlString = htmlString.replaceAll("width=\"\\d+\"", "width=\"100%\"").replaceAll("height=\"\\d+\"", "height=\"auto\"");
    // htmlString = htmlString.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&quot;", "\"");
    // baseUrl 可以指定HTML代码片段中相关资源的相对根路径
    // public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl);
    // testWebView.loadDataWithBaseURL("https://xgqfrms.xyz", htmlString, "text/html", "UTF-8", null);
    // 🐞 1. 开启 WebView 页面 debug
    // setWebContentsDebuggingEnabled(true);
    testWebView.setWebContentsDebuggingEnabled(true);
    // 🐞 2. 访问 chrome://inspect/#devices
  }
}
