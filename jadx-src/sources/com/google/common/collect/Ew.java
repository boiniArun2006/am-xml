package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class Ew extends I28 implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Object f59601n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Object f59602t;

    @Override // com.google.common.collect.I28, java.util.Map.Entry
    public final Object getKey() {
        return this.f59601n;
    }

    @Override // com.google.common.collect.I28, java.util.Map.Entry
    public final Object getValue() {
        return this.f59602t;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    Ew(Object obj, Object obj2) {
        this.f59601n = obj;
        this.f59602t = obj2;
    }
}
