package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f49906c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49904a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f49907d = System.currentTimeMillis();

    public long a() {
        return this.f49907d;
    }

    public String b() {
        return this.f49904a;
    }

    public String c() {
        return this.f49905b;
    }

    public Map d() {
        return this.f49906c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.f49907d == s1Var.f49907d && Objects.equals(this.f49905b, s1Var.f49905b) && Objects.equals(this.f49906c, s1Var.f49906c)) {
            return Objects.equals(this.f49904a, s1Var.f49904a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f49905b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f49906c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j2 = this.f49907d;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f49904a;
        return i2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f49905b + "', id='" + this.f49904a + "', creationTimestampMillis=" + this.f49907d + ", parameters=" + this.f49906c + '}';
    }

    public s1(String str, Map map) {
        this.f49905b = str;
        this.f49906c = map;
    }
}
