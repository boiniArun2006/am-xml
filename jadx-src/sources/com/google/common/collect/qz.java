package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class qz extends iF implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final t1.CN3 f59775n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final iF f59776t;

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qz) {
            qz qzVar = (qz) obj;
            if (this.f59775n.equals(qzVar.f59775n) && this.f59776t.equals(qzVar.f59776t)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.iF, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f59776t.compare(this.f59775n.apply(obj), this.f59775n.apply(obj2));
    }

    public int hashCode() {
        return t1.C.rl(this.f59775n, this.f59776t);
    }

    public String toString() {
        return this.f59776t + ".onResultOf(" + this.f59775n + ")";
    }

    qz(t1.CN3 cn3, iF iFVar) {
        this.f59775n = (t1.CN3) t1.Xo.HI(cn3);
        this.f59776t = (iF) t1.Xo.HI(iFVar);
    }
}
