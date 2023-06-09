package com.games.pisau;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;

public class MainActivity extends Activity 
{
    private WebView webview1;
    
    
    @Override
    protected void onCreate(Bundle _savedInstanceState)
    {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.main);
        initialize(_savedInstanceState);
        
        initializeLogic();
    }
    private void initialize(Bundle _savedInstanceState) {
    webview1 = findViewById(R.id.webview1);
        webview1.getSettings().setJavaScriptEnabled(true);
        webview1.getSettings().setSupportZoom(true);
        webview1.setWebViewClient(new WebViewClient() {
            
        @Override
        public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
        final String _url = _param2;

        super.onPageStarted(_param1, _param2, _param3);
     }
        @Override
        public void onPageFinished(WebView _param1, String _param2) {
        final String _url = _param2;

            super.onPageFinished(_param1, _param2);
            }
        });
	}
    private void initializeLogic() {
    webview1.loadUrl("file:///android_asset/index.html");
        webview1.getSettings().setJavaScriptEnabled(true); 
        WebSettings webSettings = webview1.getSettings(); 
        webSettings.setJavaScriptEnabled(true); 
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN) {
        webSettings.setAllowFileAccessFromFileURLs(true); 
            webSettings.setAllowUniversalAccessFromFileURLs(true);
            }
      
      }
}
