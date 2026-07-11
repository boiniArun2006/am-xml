package com.facebook;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class lej {
    public long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f52830O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f52831n;
    public long nr;
    public final GraphRequest rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f52832t;

    public lej(Handler handler, GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f52831n = handler;
        this.rl = request;
        this.f52832t = s4.g();
    }

    public final void n(long j2) {
        long j3 = this.nr + j2;
        this.nr = j3;
        if (j3 >= this.f52830O + this.f52832t || j3 >= this.J2) {
            t();
        }
    }

    public final void rl(long j2) {
        this.J2 += j2;
    }

    public final void t() {
        if (this.nr > this.f52830O) {
            this.rl.HI();
        }
    }
}
