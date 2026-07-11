package com.applovin.impl;

/* JADX INFO: renamed from: com.applovin.impl.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public enum EnumC1781i {
    PUBLISHER_INITIATED("publisher_initiated"),
    SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
    REFRESH("refresh"),
    EXPONENTIAL_RETRY("exponential_retry"),
    EXPIRED("expired"),
    NATIVE_AD_PLACER("native_ad_placer");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48686a;

    public String b() {
        return this.f48686a;
    }

    EnumC1781i(String str) {
        this.f48686a = str;
    }
}
