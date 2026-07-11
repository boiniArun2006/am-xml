package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class pO extends nKK {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final nKK f59762r = new pO(new Object[0], 0);
    private final transient int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final transient Object[] f59763O;

    @Override // com.google.common.collect.Z
    int J2() {
        return 0;
    }

    @Override // com.google.common.collect.Z
    boolean Uo() {
        return false;
    }

    @Override // com.google.common.collect.Z
    int O() {
        return this.J2;
    }

    @Override // java.util.List
    public Object get(int i2) {
        t1.Xo.az(i2, this.J2);
        Object obj = this.f59763O[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.Z
    Object[] nr() {
        return this.f59763O;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.J2;
    }

    @Override // com.google.common.collect.nKK, com.google.common.collect.Z
    int t(Object[] objArr, int i2) {
        System.arraycopy(this.f59763O, 0, objArr, i2, this.J2);
        return i2 + this.J2;
    }

    pO(Object[] objArr, int i2) {
        this.f59763O = objArr;
        this.J2 = i2;
    }

    @Override // com.google.common.collect.nKK, com.google.common.collect.Z
    Object writeReplace() {
        return super.writeReplace();
    }
}
