package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.C1789c;
import com.applovin.impl.mediation.a;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class b implements a.InterfaceC0703a, C1789c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f49218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1789c f49219c;

    public void a() {
        this.f49219c.a();
        this.f49218b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(c3 c3Var) {
        h hVarA;
        if (c3Var == null || (hVarA = c3Var.A()) == null || !c3Var.w().compareAndSet(false, true)) {
            return;
        }
        t2.e(hVarA.c(), c3Var);
    }

    public b(C1802k c1802k) {
        this.f49217a = c1802k;
        this.f49218b = new a(c1802k);
        this.f49219c = new C1789c(c1802k, this);
    }

    @Override // com.applovin.impl.mediation.C1789c.a
    public void a(c3 c3Var) {
        c(c3Var);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0703a
    public void b(final c3 c3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.aC
            @Override // java.lang.Runnable
            public final void run() {
                this.f49079n.c(c3Var);
            }
        }, c3Var.m0());
    }

    public void e(c3 c3Var) {
        long jN0 = c3Var.n0();
        if (jN0 >= 0) {
            this.f49219c.a(c3Var, jN0);
        }
        if (!c3Var.x0() && !c3Var.y0()) {
            return;
        }
        this.f49218b.a(c3Var, this);
    }
}
