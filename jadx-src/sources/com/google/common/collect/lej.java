package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class lej {
    private static boolean xMQ(List list, t1.eO eOVar) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Object obj = list.get(i2);
            if (!eOVar.apply(obj)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        mUb(list, eOVar, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        mUb(list, eOVar, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }

    public static boolean KN(Iterable iterable, t1.eO eOVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? xMQ((List) iterable, (t1.eO) t1.Xo.HI(eOVar)) : iwV.r(iterable.iterator(), eOVar);
    }

    public static Object O(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return J2(rv6.n(iterable));
            }
        }
        return iwV.qie(iterable.iterator(), obj);
    }

    public static Object nr(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return iwV.gh(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return J2(list);
    }

    private static Collection rl(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : rv6.xMQ(iterable.iterator());
    }

    private static Object J2(List list) {
        return list.get(list.size() - 1);
    }

    public static Object Uo(Iterable iterable) {
        return iwV.ty(iterable.iterator());
    }

    static Object[] gh(Iterable iterable) {
        return rl(iterable).toArray();
    }

    private static void mUb(List list, t1.eO eOVar, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (eOVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            list.remove(i5);
        }
    }

    public static boolean n(Iterable iterable, t1.eO eOVar) {
        return iwV.rl(iterable.iterator(), eOVar);
    }

    public static Object t(Iterable iterable, Object obj) {
        return iwV.az(iterable.iterator(), obj);
    }
}
