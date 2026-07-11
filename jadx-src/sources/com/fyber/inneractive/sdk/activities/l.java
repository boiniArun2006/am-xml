package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f53102a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/l;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.f63176p, view);
        safedk_l_onClick_d7c7888abfb6187679676e7d36a80bd0(view);
    }

    public l(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f53102a = inneractiveInternalBrowserActivity;
    }

    public void safedk_l_onClick_d7c7888abfb6187679676e7d36a80bd0(View p0) {
        WebView webView = this.f53102a.f53080e;
        if (webView != null) {
            webView.reload();
            int i2 = IAlog.f56974a;
            IAlog.d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f53102a.f53080e.getUrl());
        }
    }
}
