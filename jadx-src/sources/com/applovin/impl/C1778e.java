package com.applovin.impl;

import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1778e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f48387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f48388d;

    public C1778e(String str, String str2) {
        this(str, str2, null, false);
    }

    public C1778e(String str, String str2, Map map, boolean z2) {
        this.f48385a = str;
        this.f48386b = str2;
        this.f48387c = map;
        this.f48388d = z2;
    }

    public String a() {
        return this.f48386b;
    }

    public Map b() {
        return this.f48387c;
    }

    public String c() {
        return this.f48385a;
    }

    public boolean d() {
        return this.f48388d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f48385a + "', backupUrl='" + this.f48386b + "', headers='" + this.f48387c + "', shouldFireInWebView='" + this.f48388d + "'}";
    }
}
