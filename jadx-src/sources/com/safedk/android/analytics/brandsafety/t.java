package com.safedk.android.analytics.brandsafety;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f62708c;

    public String a() {
        return this.f62707b;
    }

    public void a(String str) {
        this.f62707b = str;
    }

    public long b() {
        return this.f62708c;
    }

    public void a(long j2) {
        this.f62708c = j2;
    }

    private t() {
        this.f62708c = 0L;
    }

    public t(String str, String str2, long j2) {
        this.f62708c = 0L;
        this.f62706a = str;
        this.f62707b = str2;
        this.f62708c = j2;
    }

    public String c() {
        return a(this.f62706a, this.f62708c);
    }

    public static String a(String str, long j2) {
        return str + "_" + j2;
    }
}
