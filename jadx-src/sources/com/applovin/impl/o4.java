package com.applovin.impl;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f49590b;

    public static o4 a(String str) {
        return a(str, null);
    }

    public static o4 a(String str, Map map) {
        return new o4(str, map);
    }

    public String b() {
        return this.f49589a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f49589a + "'params='" + this.f49590b + "'}";
    }

    private o4(String str, Map map) {
        this.f49589a = str;
        this.f49590b = map;
    }

    public Map a() {
        return this.f49590b;
    }
}
