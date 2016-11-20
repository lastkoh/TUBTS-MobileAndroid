package org.tulc.tulcbustracker;

import android.content.Context;
import android.webkit.JavascriptInterface;

import com.onesignal.OneSignal;

/**
 * Created by Admin on 13/11/2016.
 */

public class WebAppInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    public WebAppInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void setSubscription(boolean enable) {
        OneSignal.setSubscription(enable);
    }
}
