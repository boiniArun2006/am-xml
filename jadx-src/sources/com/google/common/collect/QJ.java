package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class QJ extends iF implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Comparator f59654n;

    @Override // com.google.common.collect.iF, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f59654n.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QJ) {
            return this.f59654n.equals(((QJ) obj).f59654n);
        }
        return false;
    }

    public int hashCode() {
        return this.f59654n.hashCode();
    }

    public String toString() {
        return this.f59654n.toString();
    }

    QJ(Comparator comparator) {
        this.f59654n = (Comparator) t1.Xo.HI(comparator);
    }
}
