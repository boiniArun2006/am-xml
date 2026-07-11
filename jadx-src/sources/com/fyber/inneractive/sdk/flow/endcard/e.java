package com.fyber.inneractive.sdk.flow.endcard;

import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.n f53594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f53595c = new int[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f53596d = new g1();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/endcard/e;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.f63176p, view, motionEvent);
        return safedk_e_onTouch_09b2f5dae9685246cf1ab3a81f789e70(view, motionEvent);
    }

    public e(int i2, com.fyber.inneractive.sdk.player.ui.n nVar) {
        this.f53593a = i2;
        this.f53594b = nVar;
    }

    public boolean safedk_e_onTouch_09b2f5dae9685246cf1ab3a81f789e70(View p0, MotionEvent p1) {
        if (p1.getActionMasked() != 0) {
            return false;
        }
        p0.getRootView().getLocationOnScreen(this.f53595c);
        float rawX = p1.getRawX() - this.f53595c[0];
        float rawY = p1.getRawY() - this.f53595c[1];
        g1 g1Var = this.f53596d;
        g1Var.f56998a = rawX;
        g1Var.f56999b = rawY;
        ((z) this.f53594b).a(this.f53593a, g1Var);
        return true;
    }
}
