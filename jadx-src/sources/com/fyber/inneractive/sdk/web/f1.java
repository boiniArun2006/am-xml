package com.fyber.inneractive.sdk.web;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f57106a;

    public f1(i1 i1Var) {
        this.f57106a = i1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m mVar;
        m mVar2 = this.f57106a.f57113b;
        if (mVar2 == null) {
            return false;
        }
        mVar2.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f57106a.k();
        i1 i1Var = this.f57106a;
        i1Var.a(new com.fyber.inneractive.sdk.mraid.b0(i1Var.f57154G));
        i1 i1Var2 = this.f57106a;
        if (i1Var2.f57154G == c0.INTERSTITIAL && (mVar = i1Var2.f57113b) != null) {
            mVar.a("if (window.showInterstitial) { showInterstitial(); }");
        }
        this.f57106a.j();
        i1 i1Var3 = this.f57106a;
        i1Var3.a(com.fyber.inneractive.sdk.util.o.a(i1Var3.f57113b), true);
        this.f57106a.n();
        com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(this.f57106a.f57159L, 250L);
        return false;
    }
}
