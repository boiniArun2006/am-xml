package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.common.collect.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class C1896c extends iF implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Comparator[] f59678n;

    @Override // com.google.common.collect.iF, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i2 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f59678n;
            if (i2 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i2].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i2++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1896c) {
            return Arrays.equals(this.f59678n, ((C1896c) obj).f59678n);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f59678n);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f59678n) + ")";
    }

    C1896c(Comparator comparator, Comparator comparator2) {
        this.f59678n = new Comparator[]{comparator, comparator2};
    }
}
