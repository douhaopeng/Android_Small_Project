package com.ks.test;

        import android.graphics.Bitmap;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.KeyEvent;
        import android.webkit.WebChromeClient;
        import android.webkit.WebResourceRequest;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {
    private WebView mWVMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mWVMain = (WebView) findViewById(R.id.wv);
       // mWVMain.loadUrl("file://android_assets/404.html");
        mWVMain.getSettings().setJavaScriptEnabled(true);
        mWVMain.setWebViewClient(new MyWebViewClient());

        mWVMain.setWebChromeClient(new MyWebChromeClient());

        mWVMain.loadUrl("https://m.baidu.com/");
    }

    class MyWebViewClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

            view.loadUrl(request.getUrl().toString());
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Log.d("WebView","OnPageStarted...");
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            Log.d("WebView","OnPageFinished...");
            mWVMain.loadUrl("javascript:alert('hello')");
            mWVMain.evaluateJavascript("javascript:alert('hello')",null);
        }
    }

    class MyWebChromeClient extends WebChromeClient{


        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }

        @Override
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            setTitle(title);
        }


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK && mWVMain.canGoBack()){
            mWVMain.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
