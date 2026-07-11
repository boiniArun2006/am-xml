package com.fyber.inneractive.sdk.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class b3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f56534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f56535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f56536c;

    public b3(e3 e3Var, Map.Entry entry) {
        Comparable comparable = (Comparable) entry.getKey();
        Object value = entry.getValue();
        this.f56536c = e3Var;
        this.f56534a = comparable;
        this.f56535b = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f56534a;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f56535b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f56534a.compareTo(((b3) obj).f56534a);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f56534a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f56535b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f56534a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f56535b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f56536c.a();
        Object obj2 = this.f56535b;
        this.f56535b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f56534a + com.safedk.android.analytics.brandsafety.l.ae + this.f56535b;
    }

    public b3(e3 e3Var, Comparable comparable, Object obj) {
        this.f56536c = e3Var;
        this.f56534a = comparable;
        this.f56535b = obj;
    }
}
