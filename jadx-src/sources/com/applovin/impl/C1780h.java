package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1780h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48628d;

    protected boolean a(Object obj) {
        return obj instanceof C1780h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1780h)) {
            return false;
        }
        C1780h c1780h = (C1780h) obj;
        return c1780h.a(this) && d() == c1780h.d() && c() == c1780h.c() && b() == c1780h.b() && a() == c1780h.a();
    }

    public int a() {
        return this.f48628d;
    }

    public int b() {
        return this.f48627c;
    }

    public int c() {
        return this.f48626b;
    }

    public int d() {
        return this.f48625a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f48625a));
        map.put("air_num", Integer.valueOf(this.f48626b));
        map.put("fsr_num", Integer.valueOf(this.f48627c));
        map.put("fir_num", Integer.valueOf(this.f48628d));
        return map;
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public C1780h(int i2, int i3, int i5, int i7) {
        this.f48625a = i2;
        this.f48626b = i3;
        this.f48627c = i5;
        this.f48628d = i7;
    }

    public int hashCode() {
        return ((((((d() + 59) * 59) + c()) * 59) + b()) * 59) + a();
    }
}
