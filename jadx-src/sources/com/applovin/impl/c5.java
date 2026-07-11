package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d5 f48188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f48191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxError f48192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f48193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f48194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f48195h;

    public interface a {
        void a(c5 c5Var);
    }

    private c5(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j2, long j3) {
        this(d5Var, str, maxError, j2, j3, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, long j2, long j3) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new c5(d5Var, hVar, str, null, j2, j3);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.f48194g;
    }

    public MaxError c() {
        return this.f48192e;
    }

    public String d() {
        return this.f48189b;
    }

    public String e() {
        return this.f48191d;
    }

    public d5 f() {
        return this.f48188a;
    }

    public boolean g() {
        return this.f48195h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f48188a);
        sb.append(", mSdkVersion='");
        sb.append(this.f48189b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.f48190c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.f48191d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        MaxError maxError = this.f48192e;
        sb.append(maxError != null ? maxError.getMessage() : "");
        sb.append('}');
        return sb.toString();
    }

    private c5(d5 d5Var, String str, MaxError maxError, long j2, long j3, String str2, String str3, boolean z2) {
        this.f48188a = d5Var;
        this.f48191d = str;
        this.f48192e = maxError;
        this.f48193f = j2;
        this.f48194g = j3;
        this.f48189b = str2;
        this.f48190c = str3;
        this.f48195h = z2;
    }

    public static c5 a(d5 d5Var, MaxError maxError) {
        return a(d5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j2, long j3) {
        if (d5Var != null) {
            return new c5(d5Var, hVar, null, maxError, j2, j3);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static c5 a(c5 c5Var) {
        return new c5(c5Var.f(), c5Var.e(), c5Var.c(), c5Var.f48193f, c5Var.f48194g, c5Var.d(), c5Var.a(), true);
    }

    public String a() {
        return this.f48190c;
    }
}
