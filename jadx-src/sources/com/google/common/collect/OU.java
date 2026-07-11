package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class OU extends iF implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final iF f59653n;

    @Override // com.google.common.collect.iF
    public iF O() {
        return this.f59653n;
    }

    @Override // com.google.common.collect.iF, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f59653n.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OU) {
            return this.f59653n.equals(((OU) obj).f59653n);
        }
        return false;
    }

    public int hashCode() {
        return -this.f59653n.hashCode();
    }

    public String toString() {
        return this.f59653n + ".reverse()";
    }

    OU(iF iFVar) {
        this.f59653n = (iF) t1.Xo.HI(iFVar);
    }
}
