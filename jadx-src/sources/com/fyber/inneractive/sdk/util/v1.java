package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUnit f57046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f57048c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u1 f57050e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f57049d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f57051f = 0;

    public final void a(long j2) {
        long jUptimeMillis = (SystemClock.uptimeMillis() - j2) + 50 + this.f57051f;
        this.f57051f = jUptimeMillis;
        if (this.f57050e != null && jUptimeMillis > this.f57046a.toMillis(this.f57047b)) {
            this.f57050e.a();
            return;
        }
        t1 t1Var = this.f57048c;
        if (t1Var == null || this.f57050e == null) {
            return;
        }
        t1Var.removeMessages(1932593528);
        this.f57048c.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public v1(TimeUnit timeUnit, long j2) {
        this.f57047b = j2;
        this.f57046a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j2));
        this.f57048c = new t1(this);
    }
}
