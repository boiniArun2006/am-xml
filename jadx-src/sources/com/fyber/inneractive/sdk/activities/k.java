package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f53101a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/k;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.f63176p, view);
        safedk_k_onClick_ba5f94c7940c4319420d8dfee82a8dac(view);
    }

    public k(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f53101a = inneractiveInternalBrowserActivity;
    }

    public void safedk_k_onClick_ba5f94c7940c4319420d8dfee82a8dac(View p0) {
        WebView webView = this.f53101a.f53080e;
        if (webView == null || !webView.canGoForward()) {
            return;
        }
        this.f53101a.f53080e.goForward();
    }
}
