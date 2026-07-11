package com.google.common.collect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class l4Z extends Ln {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Object[] f59721S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final l4Z f59722g;
    private final transient int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final transient Object[] f59723O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final transient int f59724Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final transient int f59725o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final transient Object[] f59726r;

    static {
        Object[] objArr = new Object[0];
        f59721S = objArr;
        f59722g = new l4Z(objArr, 0, objArr, 0, 0);
    }

    @Override // com.google.common.collect.Z
    int J2() {
        return 0;
    }

    @Override // com.google.common.collect.Z
    boolean Uo() {
        return false;
    }

    @Override // com.google.common.collect.Ln
    boolean ck() {
        return true;
    }

    @Override // com.google.common.collect.Ln
    nKK HI() {
        return nKK.mUb(this.f59723O, this.f59724Z);
    }

    @Override // com.google.common.collect.Z
    int O() {
        return this.f59724Z;
    }

    @Override // com.google.common.collect.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f59726r;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iT = afx.t(obj);
        while (true) {
            int i2 = iT & this.f59725o;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iT = i2 + 1;
        }
    }

    @Override // com.google.common.collect.Ln, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.J2;
    }

    @Override // com.google.common.collect.Z
    Object[] nr() {
        return this.f59723O;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f59724Z;
    }

    @Override // com.google.common.collect.Z
    int t(Object[] objArr, int i2) {
        System.arraycopy(this.f59723O, 0, objArr, i2, this.f59724Z);
        return i2 + this.f59724Z;
    }

    l4Z(Object[] objArr, int i2, Object[] objArr2, int i3, int i5) {
        this.f59723O = objArr;
        this.J2 = i2;
        this.f59726r = objArr2;
        this.f59725o = i3;
        this.f59724Z = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: KN */
    public xZD iterator() {
        return rl().iterator();
    }

    @Override // com.google.common.collect.Ln, com.google.common.collect.Z
    Object writeReplace() {
        return super.writeReplace();
    }
}
