package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f48806a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C1802k c1802k) {
        if (f48806a) {
            return;
        }
        c1802k.D().a(d2.S0, "no_ads_loaded");
    }

    public static void b(final C1802k c1802k) {
        Long l2 = (Long) c1802k.a(r3.n8);
        if (l2.longValue() <= 0) {
            return;
        }
        c1802k.q0().a(new C1797r6(c1802k, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.CM
            @Override // java.lang.Runnable
            public final void run() {
                k2.a(c1802k);
            }
        }), d6.b.OTHER, TimeUnit.SECONDS.toMillis(l2.longValue()));
    }

    public static void a() {
        f48806a = true;
    }
}
