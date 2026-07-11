package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f53094a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/d;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.f63176p, view);
        safedk_d_onClick_53433ba785fbce6dfb368015a84bf8b7(view);
    }

    public d(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f53094a = inneractiveFullscreenAdActivity;
    }

    public void safedk_d_onClick_53433ba785fbce6dfb368015a84bf8b7(View p0) {
        this.f53094a.dismissAd(true);
    }
}
