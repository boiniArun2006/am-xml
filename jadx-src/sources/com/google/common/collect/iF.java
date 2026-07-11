package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class iF implements Comparator {
    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public static iF rl(Comparator comparator) {
        return comparator instanceof iF ? (iF) comparator : new QJ(comparator);
    }

    public static iF t() {
        return Zs.f59677n;
    }

    public iF O() {
        return new OU(this);
    }

    public iF n(Comparator comparator) {
        return new C1896c(this, (Comparator) t1.Xo.HI(comparator));
    }

    public iF nr(t1.CN3 cn3) {
        return new qz(cn3, this);
    }

    protected iF() {
    }
}
