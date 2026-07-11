package com.fyber.inneractive.sdk.network;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f54290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f54291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f54293d = new m1(this);

    public n1(t0 t0Var, Thread thread, int i2) {
        this.f54291b = new WeakReference(t0Var);
        this.f54290a = new WeakReference(thread);
        this.f54292c = i2;
    }
}
