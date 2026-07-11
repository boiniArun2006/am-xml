package com.fyber.inneractive.sdk.web;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.e f57090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d f57091d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f57094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f57095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f57096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f57097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f57098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f57099l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f57089b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f57092e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f57093f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f57088a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.util.b());

    public e(i1 i1Var, String str, boolean z2, String str2, String str3, String str4) {
        this.f57099l = i1Var;
        this.f57094g = str;
        this.f57095h = z2;
        this.f57096i = str2;
        this.f57097j = str3;
        this.f57098k = str4;
    }

    public final Handler a() {
        if (this.f57089b == null) {
            synchronized (this.f57092e) {
                this.f57089b = new Handler(Looper.getMainLooper());
            }
        }
        return this.f57089b;
    }
}
