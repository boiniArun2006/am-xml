package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f54436a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/controller/d0;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.f63176p, view);
        safedk_d0_onClick_551b6fca0ffcd85e1039d424c1c59acc(view);
    }

    public d0(f0 f0Var) {
        this.f54436a = f0Var;
    }

    public void safedk_d0_onClick_551b6fca0ffcd85e1039d424c1c59acc(View p0) {
        this.f54436a.f54456b.dismiss();
        v vVar = this.f54436a.f54455a;
        vVar.f54496b.d(vVar.f54495a);
    }
}
