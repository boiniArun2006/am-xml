package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f53708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f53709b;

    public l0(p0 p0Var, long j2) {
        this.f53709b = p0Var;
        this.f53708a = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f53709b.I()) {
            p0 p0Var = this.f53709b;
            p0Var.f53799n = new k0(this);
            long jA = p0Var.a(this.f53708a);
            p0 p0Var2 = this.f53709b;
            p0Var2.getClass();
            v1 v1Var = new v1(TimeUnit.MILLISECONDS, jA);
            p0Var2.f53800o = v1Var;
            v1Var.f57050e = new o0(p0Var2);
            v1Var.f57049d = false;
            v1Var.f57048c.sendEmptyMessage(1932593528);
            p0 p0Var3 = this.f53709b;
            p0Var3.getClass();
            IAlog.a("%sad contains custom close. Will show transparent x in %d", IAlog.a(p0Var3), Long.valueOf(jA));
            this.f53709b.f53797l = null;
        } else {
            p0 p0Var4 = this.f53709b;
            p0Var4.getClass();
            IAlog.a("%sad does not contain custom close. Showing close button", IAlog.a(p0Var4));
            this.f53709b.e(false);
        }
        Runnable runnable = this.f53709b.f53797l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(runnable);
            this.f53709b.f53797l = null;
        }
    }
}
