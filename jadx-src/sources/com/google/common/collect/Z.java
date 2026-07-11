package com.google.common.collect;

import com.google.common.collect.nKK;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Z extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object[] f59674n = new Object[0];

    static abstract class j extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object[] f59675n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f59676t;

        public n O(Object... objArr) {
            J2(objArr, objArr.length);
            return this;
        }

        private void Uo(int i2) {
            Object[] objArr = this.f59675n;
            int iT = n.t(objArr.length, this.rl + i2);
            if (iT > objArr.length || this.f59676t) {
                this.f59675n = Arrays.copyOf(this.f59675n, iT);
                this.f59676t = false;
            }
        }

        @Override // com.google.common.collect.Z.n
        public n rl(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                Uo(collection.size());
                if (collection instanceof Z) {
                    this.rl = ((Z) collection).t(this.f59675n, this.rl);
                    return this;
                }
            }
            super.rl(iterable);
            return this;
        }

        j(int i2) {
            Pl.rl(i2, "initialCapacity");
            this.f59675n = new Object[i2];
            this.rl = 0;
        }

        final void J2(Object[] objArr, int i2) {
            AbstractC1897m.t(objArr, i2);
            Uo(i2);
            System.arraycopy(objArr, 0, this.f59675n, this.rl, i2);
            this.rl += i2;
        }

        public j nr(Object obj) {
            t1.Xo.HI(obj);
            Uo(1);
            Object[] objArr = this.f59675n;
            int i2 = this.rl;
            this.rl = i2 + 1;
            objArr[i2] = obj;
            return this;
        }
    }

    public static abstract class n {
        public abstract n n(Object obj);

        static int t(int i2, int i3) {
            if (i3 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i3 <= i2) {
                return i2;
            }
            int iHighestOneBit = i2 + (i2 >> 1) + 1;
            if (iHighestOneBit < i3) {
                iHighestOneBit = Integer.highestOneBit(i3 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        n() {
        }

        public n rl(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                n(it.next());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: KN */
    public abstract xZD iterator();

    abstract boolean Uo();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    Object[] nr() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f59674n);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    int J2() {
        throw new UnsupportedOperationException();
    }

    int O() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        t1.Xo.HI(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrNr = nr();
            if (objArrNr != null) {
                return yg.n(objArrNr, J2(), O(), objArr);
            }
            objArr = AbstractC1897m.O(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        t(objArr, 0);
        return objArr;
    }

    Object writeReplace() {
        return new nKK.w6(toArray());
    }

    Z() {
    }

    public nKK rl() {
        if (isEmpty()) {
            return nKK.r();
        }
        return nKK.xMQ(toArray());
    }

    int t(Object[] objArr, int i2) {
        xZD xzdKN = iterator();
        while (xzdKN.hasNext()) {
            objArr[i2] = xzdKN.next();
            i2++;
        }
        return i2;
    }
}
