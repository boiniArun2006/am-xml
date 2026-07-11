package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.afx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class C extends afx.j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f60369O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final BloomFilter f60370n;
    private final int nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f60371t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afx.j) {
            afx.j jVar = (afx.j) obj;
            BloomFilter bloomFilter = this.f60370n;
            if (bloomFilter != null ? bloomFilter.equals(jVar.t()) : jVar.t() == null) {
                if (this.rl == jVar.n() && this.f60371t == jVar.J2() && this.nr == jVar.rl() && this.f60369O == jVar.Uo()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.firestore.remote.afx.j
    int J2() {
        return this.f60371t;
    }

    @Override // com.google.firebase.firestore.remote.afx.j
    int Uo() {
        return this.f60369O;
    }

    public int hashCode() {
        BloomFilter bloomFilter = this.f60370n;
        return (((((((((bloomFilter == null ? 0 : bloomFilter.hashCode()) ^ 1000003) * 1000003) ^ (this.rl ? 1231 : 1237)) * 1000003) ^ this.f60371t) * 1000003) ^ this.nr) * 1000003) ^ this.f60369O;
    }

    @Override // com.google.firebase.firestore.remote.afx.j
    boolean n() {
        return this.rl;
    }

    @Override // com.google.firebase.firestore.remote.afx.j
    int rl() {
        return this.nr;
    }

    @Override // com.google.firebase.firestore.remote.afx.j
    BloomFilter t() {
        return this.f60370n;
    }

    public String toString() {
        return "ExistenceFilterBloomFilterInfo{bloomFilter=" + this.f60370n + ", applied=" + this.rl + ", hashCount=" + this.f60371t + ", bitmapLength=" + this.nr + ", padding=" + this.f60369O + "}";
    }

    C(BloomFilter bloomFilter, boolean z2, int i2, int i3, int i5) {
        this.f60370n = bloomFilter;
        this.rl = z2;
        this.f60371t = i2;
        this.nr = i3;
        this.f60369O = i5;
    }
}
