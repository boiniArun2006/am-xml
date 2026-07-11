package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class e0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f54438a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/controller/e0;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.f63176p, view);
        safedk_e0_onClick_4d93ab782816bfab8a321d1b641091a8(view);
    }

    public e0(f0 f0Var) {
        this.f54438a = f0Var;
    }

    public void safedk_e0_onClick_4d93ab782816bfab8a321d1b641091a8(View p0) {
        this.f54438a.f54456b.dismiss();
        this.f54438a.f54455a.getClass();
    }
}
