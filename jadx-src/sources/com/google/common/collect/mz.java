package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class mz extends iF implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final mz f59727n = new mz();

    private Object readResolve() {
        return f59727n;
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    private mz() {
    }

    @Override // com.google.common.collect.iF, java.util.Comparator
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        t1.Xo.HI(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.iF
    public iF O() {
        return iF.t();
    }
}
