package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.afx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class o extends afx.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final afx.j f60450O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f60451n;
    private final String nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60452t;

    public boolean equals(Object obj) {
        afx.j jVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof afx.n) {
            afx.n nVar = (afx.n) obj;
            if (this.f60451n == nVar.J2() && this.rl == nVar.nr() && this.f60452t.equals(nVar.Uo()) && this.nr.equals(nVar.t()) && ((jVar = this.f60450O) != null ? jVar.equals(nVar.n()) : nVar.n() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.firestore.remote.afx.n
    int J2() {
        return this.f60451n;
    }

    @Override // com.google.firebase.firestore.remote.afx.n
    String Uo() {
        return this.f60452t;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f60451n ^ 1000003) * 1000003) ^ this.rl) * 1000003) ^ this.f60452t.hashCode()) * 1000003) ^ this.nr.hashCode()) * 1000003;
        afx.j jVar = this.f60450O;
        return iHashCode ^ (jVar == null ? 0 : jVar.hashCode());
    }

    @Override // com.google.firebase.firestore.remote.afx.n
    afx.j n() {
        return this.f60450O;
    }

    @Override // com.google.firebase.firestore.remote.afx.n
    int nr() {
        return this.rl;
    }

    @Override // com.google.firebase.firestore.remote.afx.n
    String t() {
        return this.nr;
    }

    public String toString() {
        return "ExistenceFilterMismatchInfo{localCacheCount=" + this.f60451n + ", existenceFilterCount=" + this.rl + ", projectId=" + this.f60452t + ", databaseId=" + this.nr + ", bloomFilter=" + this.f60450O + "}";
    }

    o(int i2, int i3, String str, String str2, afx.j jVar) {
        this.f60451n = i2;
        this.rl = i3;
        if (str != null) {
            this.f60452t = str;
            if (str2 != null) {
                this.nr = str2;
                this.f60450O = jVar;
                return;
            }
            throw new NullPointerException("Null databaseId");
        }
        throw new NullPointerException("Null projectId");
    }
}
