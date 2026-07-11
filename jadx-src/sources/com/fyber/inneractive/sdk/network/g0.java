package com.fyber.inneractive.sdk.network;

import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f54259c = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f54260a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p1 f54261b;

    public final h a() {
        String property;
        if (this.f54261b == null) {
            try {
                property = System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (Throwable unused) {
                property = "hurl";
            }
            if (property != null && property.equals("okhttp")) {
                try {
                    OkHttpClient.Companion companion = OkHttpClient.INSTANCE;
                    this.f54261b = new p1();
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        p1 p1Var = this.f54261b;
        return p1Var != null ? p1Var : this.f54260a;
    }
}
