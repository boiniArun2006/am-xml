package com.google.common.collect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class LEl extends Ln {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final transient Object f59605O;

    @Override // com.google.common.collect.Z
    boolean Uo() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: KN */
    public xZD iterator() {
        return iwV.o(this.f59605O);
    }

    @Override // com.google.common.collect.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f59605O.equals(obj);
    }

    @Override // com.google.common.collect.Ln, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f59605O.hashCode();
    }

    @Override // com.google.common.collect.Ln, com.google.common.collect.Z
    public nKK rl() {
        return nKK.o(this.f59605O);
    }

    @Override // com.google.common.collect.Z
    int t(Object[] objArr, int i2) {
        objArr[i2] = this.f59605O;
        return i2 + 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f59605O.toString() + ']';
    }

    LEl(Object obj) {
        this.f59605O = t1.Xo.HI(obj);
    }

    @Override // com.google.common.collect.Ln, com.google.common.collect.Z
    Object writeReplace() {
        return super.writeReplace();
    }
}
