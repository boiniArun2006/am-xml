package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class i6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f48739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f48740h;

    public static void a(long j2, s4 s4Var, Object obj, String str, C1802k c1802k) {
        if (j2 <= 0) {
            return;
        }
        c1802k.q0().a(new i6(s4Var, obj, str, c1802k), d6.b.TIMEOUT, j2);
    }

    @Override // java.lang.Runnable
    public void run() {
        s4 s4Var = (s4) this.f48739g.get();
        if (s4Var == null || s4Var.d()) {
            return;
        }
        this.f48733a.O();
        if (C1804o.a()) {
            this.f48733a.O().d(this.f48734b, "Attempting to timeout pending task " + s4Var.c() + " with " + this.f48740h);
        }
        s4Var.c(this.f48740h);
    }

    protected i6(s4 s4Var, Object obj, String str, C1802k c1802k) {
        super(str, c1802k);
        this.f48739g = new WeakReference(s4Var);
        this.f48740h = obj;
    }
}
