package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.g0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;

/* JADX INFO: renamed from: com.applovin.impl.mediation.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class C1789c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f49221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f49222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g0 f49223d;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.c$a */
    public interface a {
        void a(c3 c3Var);
    }

    public void a(final c3 c3Var, long j2) {
        if (C1804o.a()) {
            this.f49221b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j2 + "ms...");
        }
        this.f49223d = g0.a(j2, this.f49220a, new Runnable() { // from class: com.applovin.impl.mediation.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f48970n.a(c3Var);
            }
        });
    }

    C1789c(C1802k c1802k, a aVar) {
        this.f49220a = c1802k;
        this.f49221b = c1802k.O();
        this.f49222c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var) {
        if (C1804o.a()) {
            this.f49221b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f49222c.a(c3Var);
    }

    public void a() {
        if (C1804o.a()) {
            this.f49221b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        g0 g0Var = this.f49223d;
        if (g0Var != null) {
            g0Var.a();
            this.f49223d = null;
        }
    }
}
