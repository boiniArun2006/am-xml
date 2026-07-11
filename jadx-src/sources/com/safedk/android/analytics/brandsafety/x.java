package com.safedk.android.analytics.brandsafety;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v f62721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f62722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f62723g = false;

    public x(String str, String str2, String str3, v vVar, c cVar) {
        this.f62717a = str;
        this.f62718b = str2;
        this.f62720d = str3;
        this.f62721e = vVar;
        this.f62722f = cVar;
    }

    public String a() {
        return this.f62718b;
    }

    public void a(String str) {
        this.f62719c = str;
    }

    public String b() {
        return this.f62719c;
    }

    public String c() {
        return this.f62720d;
    }

    public String d() {
        return this.f62717a;
    }

    public void e() {
        this.f62723g = true;
    }

    public void a(v vVar) {
        this.f62721e = vVar;
    }

    public v f() {
        return this.f62721e;
    }

    public void a(c cVar) {
        this.f62722f = cVar;
    }

    public c g() {
        return this.f62722f;
    }

    public String toString() {
        return "WebviewNavigationTracker{ " + this.f62717a + ", " + this.f62719c + ", " + this.f62720d + " }";
    }
}
