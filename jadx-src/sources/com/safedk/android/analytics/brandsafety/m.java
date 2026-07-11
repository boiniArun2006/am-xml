package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f62675a = Long.valueOf(System.currentTimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f62676b = Long.valueOf(SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f62677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f62678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f62679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f62680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f62681g;

    public m(String str, String str2, String str3, String str4, m mVar) {
        this.f62677c = str;
        this.f62678d = str2;
        this.f62679e = str3;
        this.f62680f = str4;
        this.f62681g = mVar;
    }

    public String toString() {
        return "IntentDetails{ " + this.f62676b + ", " + this.f62677c + ", " + this.f62678d + ", " + this.f62679e + ", " + this.f62680f + " }";
    }
}
