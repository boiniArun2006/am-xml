package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.common.collect.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1897m {
    static Object[] rl(Object... objArr) {
        t(objArr, objArr.length);
        return objArr;
    }

    static Object[] t(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            n(objArr[i3], i3);
        }
        return objArr;
    }

    static Object n(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i2);
    }

    static Object[] J2(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = O(objArr, size);
        }
        nr(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public static Object[] O(Object[] objArr, int i2) {
        return yg.rl(objArr, i2);
    }

    private static Object[] nr(Iterable iterable, Object[] objArr) {
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return objArr;
    }
}
