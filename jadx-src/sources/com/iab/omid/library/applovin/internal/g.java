package com.iab.omid.library.applovin.internal;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f61112b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61113a;

    private g() {
    }

    public static g b() {
        return f61112b;
    }

    public Context a() {
        return this.f61113a;
    }

    public void a(Context context) {
        this.f61113a = context != null ? context.getApplicationContext() : null;
    }
}
