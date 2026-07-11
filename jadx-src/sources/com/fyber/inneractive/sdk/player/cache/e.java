package com.fyber.inneractive.sdk.player.cache;

import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f54385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f54387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f54388e;

    public e(g gVar, String str) {
        this.f54388e = gVar;
        this.f54384a = str;
        this.f54385b = new long[gVar.f54397g];
    }

    public final File a(int i2) {
        return new File(this.f54388e.f54391a, this.f54384a + "." + i2);
    }

    public final File b(int i2) {
        return new File(this.f54388e.f54391a, this.f54384a + "." + i2 + ".tmp");
    }
}
