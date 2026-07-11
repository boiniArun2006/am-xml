package com.iab.omid.library.applovin.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class i {
    public void a(@NonNull WebView webView, @NonNull String str) {
        WebViewCompat.qie(webView, str);
    }

    public void a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.rl(webView, str, set, webMessageListener);
    }
}
