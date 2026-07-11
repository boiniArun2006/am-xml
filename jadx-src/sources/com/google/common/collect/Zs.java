package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Zs extends iF implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Zs f59677n = new Zs();

    private Object readResolve() {
        return f59677n;
    }

    @Override // com.google.common.collect.iF
    public iF O() {
        return mz.f59727n;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    private Zs() {
    }

    @Override // com.google.common.collect.iF, java.util.Comparator
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        t1.Xo.HI(comparable);
        t1.Xo.HI(comparable2);
        return comparable.compareTo(comparable2);
    }
}
