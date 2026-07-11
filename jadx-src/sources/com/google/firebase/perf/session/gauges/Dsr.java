package com.google.firebase.perf.session.gauges;

import O2.Pl;
import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class Dsr {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final yMa.j f60668O = yMa.j.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runtime f60669n;
    private final Context nr;
    private final ActivityManager rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f60670t;

    Dsr(Context context) {
        this(Runtime.getRuntime(), context);
    }

    Dsr(Runtime runtime, Context context) {
        this.f60669n = runtime;
        this.nr = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.rl = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f60670t = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    public int n() {
        return Pl.t(O2.C.f7237o.rl(this.f60670t.totalMem));
    }

    public int rl() {
        return Pl.t(O2.C.f7237o.rl(this.f60669n.maxMemory()));
    }

    public int t() {
        return Pl.t(O2.C.J2.rl(this.rl.getMemoryClass()));
    }
}
