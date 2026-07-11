package com.applovin.impl;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C1816z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f50934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f50935b;

    protected boolean a(Object obj) {
        return obj instanceof C1816z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1816z)) {
            return false;
        }
        C1816z c1816z = (C1816z) obj;
        if (!c1816z.a(this)) {
            return false;
        }
        Map mapA = a();
        Map mapA2 = c1816z.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List listB = b();
        List listB2 = c1816z.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public Map a() {
        return this.f50934a;
    }

    public List b() {
        return this.f50935b;
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + pTYaLzzmJSGAPQ.wlABeDUbg;
    }

    public C1816z(Map map, List list) {
        this.f50934a = map;
        this.f50935b = list;
    }

    public int hashCode() {
        int iHashCode;
        Map mapA = a();
        int iHashCode2 = 43;
        if (mapA == null) {
            iHashCode = 43;
        } else {
            iHashCode = mapA.hashCode();
        }
        List listB = b();
        int i2 = (iHashCode + 59) * 59;
        if (listB != null) {
            iHashCode2 = listB.hashCode();
        }
        return i2 + iHashCode2;
    }
}
