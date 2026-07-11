package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f53103a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/m;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.f63176p, view);
        safedk_m_onClick_5e21165c27f1f5d634df9f274d2a362b(view);
    }

    public m(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f53103a = inneractiveInternalBrowserActivity;
    }

    public void safedk_m_onClick_5e21165c27f1f5d634df9f274d2a362b(View p0) {
        this.f53103a.finish();
    }
}
