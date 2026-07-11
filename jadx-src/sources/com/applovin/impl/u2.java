package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class u2 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f50561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e3 f50562d;

    public String a() {
        return this.f50560b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u2 u2Var = (u2) obj;
            String str = this.f50559a;
            if (str == null ? u2Var.f50559a != null : !str.equals(u2Var.f50559a)) {
                return false;
            }
            String str2 = this.f50560b;
            if (str2 == null ? u2Var.f50560b != null : !str2.equals(u2Var.f50560b)) {
                return false;
            }
            if (this.f50561c == u2Var.f50561c) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u2 u2Var) {
        return this.f50560b.compareToIgnoreCase(u2Var.f50560b);
    }

    public List b() {
        List listL = this.f50562d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f50559a) : listL;
    }

    public String c() {
        return this.f50559a;
    }

    public e3 d() {
        return this.f50562d;
    }

    public int hashCode() {
        String str = this.f50559a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f50560b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f50561c ? 1 : 0);
    }

    u2(String str, String str2, boolean z2, e3 e3Var) {
        this.f50559a = str;
        this.f50560b = str2;
        this.f50561c = z2;
        this.f50562d = e3Var;
    }
}
