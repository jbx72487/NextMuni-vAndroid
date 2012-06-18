package projects.jbx;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient; */


public class NextMuniWebViewActivity extends Activity {
	// WebView mWebView;
	
    /** Called when the activity is first created. */

	/*
    private class NextMuniWebViewClient extends WebViewClient {
    	@Override
    	public boolean shouldOverrideUrlLoading(WebView view, String url) {
    		view.loadUrl(url);
    		return true;
    	}
    }
    */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /*
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setGeolocationEnabled(true);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
*/
        String url = "http://www.nextmuni.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
        
/*        mWebView.loadUrl("http://www.nextmuni.com");
        mWebView.loadUrl("http://www.nextmuni.com/#_routes")
        
        mWebView.setWebViewClient(new NextMuniWebViewClient());
        */
    }
    
    /*
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
    		mWebView.goBack();
    		return true;
    	}
    	return super.onKeyDown(keyCode, event);
    }
    */
    
    
}

