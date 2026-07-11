package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f49675c;

    public String a() {
        return this.f49674b;
    }

    public String b() {
        return this.f49673a;
    }

    public boolean c() {
        return this.f49675c;
    }

    p4(String str, String str2, Context context) {
        this.f49673a = str.replace("android.permission.", "");
        this.f49674b = str2;
        this.f49675c = o0.a(str, context);
    }
}
