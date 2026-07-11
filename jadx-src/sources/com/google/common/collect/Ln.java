package com.google.common.collect;

import com.google.common.collect.Z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ln extends Z implements Set {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient nKK f59606t;

    public static class j extends Z.j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f59607O;
        Object[] nr;

        public j() {
            super(4);
        }

        private void gh(Object obj) {
            Objects.requireNonNull(this.nr);
            int length = this.nr.length - 1;
            int iHashCode = obj.hashCode();
            int iRl = afx.rl(iHashCode);
            while (true) {
                int i2 = iRl & length;
                Object[] objArr = this.nr;
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    objArr[i2] = obj;
                    this.f59607O += iHashCode;
                    super.nr(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iRl = i2 + 1;
                }
            }
        }

        public Ln qie() {
            Ln lnQie;
            int i2 = this.rl;
            if (i2 == 0) {
                return Ln.Ik();
            }
            if (i2 == 1) {
                Object obj = this.f59675n[0];
                Objects.requireNonNull(obj);
                return Ln.r(obj);
            }
            if (this.nr == null || Ln.gh(i2) != this.nr.length) {
                lnQie = Ln.qie(this.rl, this.f59675n);
                this.rl = lnQie.size();
            } else {
                Object[] objArrCopyOf = Ln.aYN(this.rl, this.f59675n.length) ? Arrays.copyOf(this.f59675n, this.rl) : this.f59675n;
                lnQie = new l4Z(objArrCopyOf, this.f59607O, this.nr, r5.length - 1, this.rl);
            }
            this.f59676t = true;
            this.nr = null;
            return lnQie;
        }

        public j xMQ(Object... objArr) {
            if (this.nr == null) {
                super.O(objArr);
                return this;
            }
            for (Object obj : objArr) {
                n(obj);
            }
            return this;
        }

        @Override // com.google.common.collect.Z.n
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public j n(Object obj) {
            t1.Xo.HI(obj);
            if (this.nr != null && Ln.gh(this.rl) <= this.nr.length) {
                gh(obj);
                return this;
            }
            this.nr = null;
            super.nr(obj);
            return this;
        }

        public j mUb(Iterable iterable) {
            t1.Xo.HI(iterable);
            if (this.nr != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    n(it.next());
                }
                return this;
            }
            super.rl(iterable);
            return this;
        }
    }

    private static class n implements Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object[] f59608n;

        Object readResolve() {
            return Ln.ty(this.f59608n);
        }

        n(Object[] objArr) {
            this.f59608n = objArr;
        }
    }

    public static Ln S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return qie(5, obj, obj2, obj3, obj4, obj5);
    }

    public static Ln WPU(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        t1.Xo.O(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return qie(length, objArr2);
    }

    public static Ln XQ(Object obj, Object obj2, Object obj3) {
        return qie(3, obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean aYN(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    static int gh(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            t1.Xo.O(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static Ln o(Object obj, Object obj2) {
        return qie(2, obj, obj2);
    }

    public static Ln ty(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? qie(objArr.length, (Object[]) objArr.clone()) : r(objArr[0]) : Ik();
    }

    @Override // com.google.common.collect.Z
    /* JADX INFO: renamed from: KN */
    public abstract xZD iterator();

    boolean ck() {
        return false;
    }

    public static Ln Ik() {
        return l4Z.f59722g;
    }

    public static Ln az(Collection collection) {
        if ((collection instanceof Ln) && !(collection instanceof SortedSet)) {
            Ln ln2 = (Ln) collection;
            if (!ln2.Uo()) {
                return ln2;
            }
        }
        Object[] array = collection.toArray();
        return qie(array.length, array);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ln qie(int i2, Object... objArr) {
        if (i2 == 0) {
            return Ik();
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return r(obj);
        }
        int iGh = gh(i2);
        Object[] objArr2 = new Object[iGh];
        int i3 = iGh - 1;
        int i5 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            Object objN = AbstractC1897m.n(objArr[i8], i8);
            int iHashCode = objN.hashCode();
            int iRl = afx.rl(iHashCode);
            while (true) {
                int i9 = iRl & i3;
                Object obj2 = objArr2[i9];
                if (obj2 == null) {
                    objArr[i7] = objN;
                    objArr2[i9] = objN;
                    i5 += iHashCode;
                    i7++;
                    break;
                }
                if (obj2.equals(objN)) {
                    break;
                }
                iRl++;
            }
        }
        Arrays.fill(objArr, i7, i2, (Object) null);
        if (i7 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new LEl(obj3);
        }
        if (gh(i7) < iGh / 2) {
            return qie(i7, objArr);
        }
        if (aYN(i7, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new l4Z(objArr, i5, objArr2, i3, i7);
    }

    public static Ln r(Object obj) {
        return new LEl(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Ln) && ck() && ((Ln) obj).ck() && hashCode() != obj.hashCode()) {
            return false;
        }
        return O.n(this, obj);
    }

    @Override // com.google.common.collect.Z
    public nKK rl() {
        nKK nkk = this.f59606t;
        if (nkk != null) {
            return nkk;
        }
        nKK nkkHI = HI();
        this.f59606t = nkkHI;
        return nkkHI;
    }

    @Override // com.google.common.collect.Z
    Object writeReplace() {
        return new n(toArray());
    }

    Ln() {
    }

    nKK HI() {
        return nKK.xMQ(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return O.nr(this);
    }
}
