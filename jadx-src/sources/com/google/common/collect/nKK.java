package com.google.common.collect;

import com.google.common.collect.Z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class nKK extends Z implements List, RandomAccess {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final M5 f59734t = new n(pO.f59762r, 0);

    class Ml extends nKK {
        final transient int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final transient int f59735O;

        @Override // com.google.common.collect.Z
        boolean Uo() {
            return true;
        }

        @Override // com.google.common.collect.nKK, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        Ml(int i2, int i3) {
            this.f59735O = i2;
            this.J2 = i3;
        }

        @Override // com.google.common.collect.Z
        int J2() {
            return nKK.this.J2() + this.f59735O;
        }

        @Override // com.google.common.collect.Z
        int O() {
            return nKK.this.J2() + this.f59735O + this.J2;
        }

        @Override // com.google.common.collect.nKK, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public nKK subList(int i2, int i3) {
            t1.Xo.Z(i2, i3, this.J2);
            nKK nkk = nKK.this;
            int i5 = this.f59735O;
            return nkk.subList(i2 + i5, i3 + i5);
        }

        @Override // java.util.List
        public Object get(int i2) {
            t1.Xo.az(i2, this.J2);
            return nKK.this.get(i2 + this.f59735O);
        }

        @Override // com.google.common.collect.nKK, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return super.listIterator(i2);
        }

        @Override // com.google.common.collect.Z
        Object[] nr() {
            return nKK.this.nr();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.J2;
        }

        @Override // com.google.common.collect.nKK, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.nKK, com.google.common.collect.Z
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class j extends Z.j {
        public j() {
            this(4);
        }

        public nKK gh() {
            this.f59676t = true;
            return nKK.mUb(this.f59675n, this.rl);
        }

        j(int i2) {
            super(i2);
        }

        @Override // com.google.common.collect.Z.n
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public j n(Object obj) {
            super.nr(obj);
            return this;
        }

        public j mUb(Iterable iterable) {
            super.rl(iterable);
            return this;
        }

        public j xMQ(Object... objArr) {
            super.O(objArr);
            return this;
        }
    }

    static class n extends com.google.common.collect.j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final nKK f59737O;

        @Override // com.google.common.collect.j
        protected Object n(int i2) {
            return this.f59737O.get(i2);
        }

        n(nKK nkk, int i2) {
            super(nkk.size(), i2);
            this.f59737O = nkk;
        }
    }

    static class w6 implements Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object[] f59738n;

        Object readResolve() {
            return nKK.HI(this.f59738n);
        }

        w6(Object[] objArr) {
            this.f59738n = objArr;
        }
    }

    public static nKK HI(Object[] objArr) {
        return objArr.length == 0 ? r() : az((Object[]) objArr.clone());
    }

    static nKK xMQ(Object[] objArr) {
        return mUb(objArr, objArr.length);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public M5 listIterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.Z
    public final nKK rl() {
        return this;
    }

    public static nKK ViF(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        t1.Xo.O(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return az(objArr2);
    }

    public static j gh() {
        return new j();
    }

    static nKK mUb(Object[] objArr, int i2) {
        return i2 == 0 ? r() : new pO(objArr, i2);
    }

    public static j qie(int i2) {
        Pl.rl(i2, "expectedSize");
        return new j(i2);
    }

    public static nKK r() {
        return pO.f59762r;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static nKK ty(Collection collection) {
        if (!(collection instanceof Z)) {
            return az(collection.toArray());
        }
        nKK nkkRl = ((Z) collection).rl();
        return nkkRl.Uo() ? xMQ(nkkRl.toArray()) : nkkRl;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return rv6.nr(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return rv6.J2(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    nKK te(int i2, int i3) {
        return new Ml(i2, i3 - i2);
    }

    @Override // com.google.common.collect.Z
    Object writeReplace() {
        return new w6(toArray());
    }

    nKK() {
    }

    public static nKK S(Object obj, Object obj2, Object obj3) {
        return az(obj, obj2, obj3);
    }

    public static nKK WPU(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return az(obj, obj2, obj3, obj4, obj5);
    }

    public static nKK XQ(Object obj, Object obj2) {
        return az(obj, obj2);
    }

    public static nKK aYN(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return az(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    private static nKK az(Object... objArr) {
        return xMQ(AbstractC1897m.rl(objArr));
    }

    public static nKK nY(Comparator comparator, Iterable iterable) {
        t1.Xo.HI(comparator);
        Object[] objArrGh = lej.gh(iterable);
        AbstractC1897m.rl(objArrGh);
        Arrays.sort(objArrGh, comparator);
        return xMQ(objArrGh);
    }

    public static nKK o(Object obj) {
        return az(obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public M5 listIterator(int i2) {
        t1.Xo.r(i2, size());
        if (isEmpty()) {
            return f59734t;
        }
        return new n(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public xZD iterator() {
        return listIterator();
    }

    @Override // com.google.common.collect.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return rv6.t(this, obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: g */
    public nKK subList(int i2, int i3) {
        t1.Xo.Z(i2, i3, size());
        int i5 = i3 - i2;
        if (i5 == size()) {
            return this;
        }
        if (i5 == 0) {
            return r();
        }
        return te(i2, i3);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~((i2 * 31) + get(i3).hashCode()));
        }
        return i2;
    }

    @Override // com.google.common.collect.Z
    int t(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }
}
