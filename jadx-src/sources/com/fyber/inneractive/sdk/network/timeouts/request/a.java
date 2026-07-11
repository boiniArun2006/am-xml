package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class a extends com.fyber.inneractive.sdk.network.timeouts.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f54342l;

    public int a(int i2) {
        return 0;
    }

    public abstract int a(k kVar);

    public abstract int a(k kVar, String str);

    public int b() {
        return 0;
    }

    public abstract int b(k kVar, String str);

    public int c() {
        return 0;
    }

    public abstract int c(k kVar, String str);

    public void d(k kVar, String str) {
        int iB = b(kVar, "read");
        int iB2 = b(kVar, "conn");
        int iA = a(kVar, str);
        this.f54335f = a(kVar);
        this.f54340j = c(kVar, "read");
        int iC = c(kVar, "conn");
        this.f54341k = iC;
        int i2 = (this.f54340j * iA) / 100;
        this.f54338h = i2;
        this.f54339i = (iA * iC) / 100;
        this.f54338h = Math.max(iB, i2);
        this.f54339i = Math.max(iB2, this.f54339i);
    }

    public a(String str, k kVar, String str2) {
        this.f54342l = str2;
        d(kVar, str);
    }
}
