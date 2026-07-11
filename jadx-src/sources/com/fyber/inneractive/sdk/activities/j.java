package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f53100a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/j;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.f63176p, view);
        safedk_j_onClick_de0d2565025937b8ee6b9157ff655a60(view);
    }

    public j(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f53100a = inneractiveInternalBrowserActivity;
    }

    public void safedk_j_onClick_de0d2565025937b8ee6b9157ff655a60(View p0) {
        WebView webView = this.f53100a.f53080e;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.f53100a.f53080e.goBack();
    }
}
