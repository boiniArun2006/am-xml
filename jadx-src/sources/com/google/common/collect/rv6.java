package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class rv6 {

    private static class j extends AbstractList implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final List f59777n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final t1.CN3 f59778t;

        /* JADX INFO: renamed from: com.google.common.collect.rv6$j$j, reason: collision with other inner class name */
        class C0795j extends Mf {
            C0795j(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.KH
            Object n(Object obj) {
                return j.this.f59778t.apply(obj);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            return this.f59778t.apply(this.f59777n.get(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f59777n.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i2) {
            return new C0795j(this.f59777n.listIterator(i2));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i2) {
            return this.f59778t.apply(this.f59777n.remove(i2));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i2, int i3) {
            this.f59777n.subList(i2, i3).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59777n.size();
        }

        j(List list, t1.CN3 cn3) {
            this.f59777n = (List) t1.Xo.HI(list);
            this.f59778t = (t1.CN3) t1.Xo.HI(cn3);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }
    }

    private static class n extends AbstractSequentialList implements Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final List f59780n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final t1.CN3 f59781t;

        class j extends Mf {
            j(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.KH
            Object n(Object obj) {
                return n.this.f59781t.apply(obj);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f59780n.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i2) {
            return new j(this.f59780n.listIterator(i2));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i2, int i3) {
            this.f59780n.subList(i2, i3).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59780n.size();
        }

        n(List list, t1.CN3 cn3) {
            this.f59780n = (List) t1.Xo.HI(list);
            this.f59781t = (t1.CN3) t1.Xo.HI(cn3);
        }
    }

    static int J2(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return Uo(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (t1.C.n(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static ArrayList KN() {
        return new ArrayList();
    }

    private static int Uo(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static List gh(List list, t1.CN3 cn3) {
        return list instanceof RandomAccess ? new j(list, cn3) : new n(list, cn3);
    }

    static List n(Iterable iterable) {
        return (List) iterable;
    }

    static int nr(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return O(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (t1.C.n(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    static int rl(int i2) {
        Pl.rl(i2, "arraySize");
        return com.google.common.primitives.Wre.qie(((long) i2) + 5 + ((long) (i2 / 10)));
    }

    private static int O(List list, Object obj) {
        int size = list.size();
        int i2 = 0;
        if (obj == null) {
            while (i2 < size) {
                if (list.get(i2) == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i2 < size) {
            if (obj.equals(list.get(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList mUb(Object... objArr) {
        t1.Xo.HI(objArr);
        ArrayList arrayList = new ArrayList(rl(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    static boolean t(List list, Object obj) {
        if (obj == t1.Xo.HI(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i2 = 0; i2 < size; i2++) {
                if (!t1.C.n(list.get(i2), list2.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        return iwV.O(list.iterator(), list2.iterator());
    }

    public static ArrayList xMQ(Iterator it) {
        ArrayList arrayListKN = KN();
        iwV.n(arrayListKN, it);
        return arrayListKN;
    }
}
