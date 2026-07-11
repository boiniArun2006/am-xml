package com.google.common.collect;

import com.google.common.collect.Z;
import com.safedk.android.analytics.brandsafety.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class u implements Map, Serializable {
    static final Map.Entry[] J2 = new Map.Entry[0];

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private transient Z f59787O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Ln f59788n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient Ln f59789t;

    public static class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        C0796j f59790O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Comparator f59791n;
        boolean nr;
        Object[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f59792t;

        /* JADX INFO: renamed from: com.google.common.collect.u$j$j, reason: collision with other inner class name */
        static final class C0796j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Object f59793n;
            private final Object rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final Object f59794t;

            IllegalArgumentException n() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f59793n + l.ae + this.rl + " and " + this.f59793n + l.ae + this.f59794t);
            }

            C0796j(Object obj, Object obj2, Object obj3) {
                this.f59793n = obj;
                this.rl = obj2;
                this.f59794t = obj3;
            }
        }

        public j() {
            this(4);
        }

        public u t() {
            return rl(true);
        }

        j(int i2) {
            this.rl = new Object[i2 * 2];
            this.f59792t = 0;
            this.nr = false;
        }

        private Object[] O(Object[] objArr, int i2) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                Object obj = objArr[i3 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i3);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i2 - bitSet.cardinality()) * 2];
            int i5 = 0;
            int i7 = 0;
            while (i5 < i2 * 2) {
                if (bitSet.get(i5 >>> 1)) {
                    i5 += 2;
                } else {
                    int i8 = i7 + 1;
                    int i9 = i5 + 1;
                    Object obj2 = objArr[i5];
                    Objects.requireNonNull(obj2);
                    objArr2[i7] = obj2;
                    i7 += 2;
                    i5 += 2;
                    Object obj3 = objArr[i9];
                    Objects.requireNonNull(obj3);
                    objArr2[i8] = obj3;
                }
            }
            return objArr2;
        }

        static void mUb(Object[] objArr, int i2, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i5 = i3 * 2;
                Object obj = objArr[i5];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i5 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i3] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i2, iF.rl(comparator).nr(vd.ty()));
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = i7 * 2;
                objArr[i8] = entryArr[i7].getKey();
                objArr[i8 + 1] = entryArr[i7].getValue();
            }
        }

        private void nr(int i2) {
            int i3 = i2 * 2;
            Object[] objArr = this.rl;
            if (i3 > objArr.length) {
                this.rl = Arrays.copyOf(objArr, Z.n.t(objArr.length, i3));
                this.nr = false;
            }
        }

        private u rl(boolean z2) {
            Object[] objArrO;
            C0796j c0796j;
            C0796j c0796j2;
            if (z2 && (c0796j2 = this.f59790O) != null) {
                throw c0796j2.n();
            }
            int length = this.f59792t;
            if (this.f59791n == null) {
                objArrO = this.rl;
            } else {
                if (this.nr) {
                    this.rl = Arrays.copyOf(this.rl, length * 2);
                }
                objArrO = this.rl;
                if (!z2) {
                    objArrO = O(objArrO, this.f59792t);
                    if (objArrO.length < this.rl.length) {
                        length = objArrO.length >>> 1;
                    }
                }
                mUb(objArrO, length, this.f59791n);
            }
            this.nr = true;
            Sis sisS = Sis.S(length, objArrO, this);
            if (!z2 || (c0796j = this.f59790O) == null) {
                return sisS;
            }
            throw c0796j.n();
        }

        public j J2(Object obj, Object obj2) {
            nr(this.f59792t + 1);
            Pl.n(obj, obj2);
            Object[] objArr = this.rl;
            int i2 = this.f59792t;
            objArr[i2 * 2] = obj;
            objArr[(i2 * 2) + 1] = obj2;
            this.f59792t = i2 + 1;
            return this;
        }

        public j KN(Iterable iterable) {
            if (iterable instanceof Collection) {
                nr(this.f59792t + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Uo((Map.Entry) it.next());
            }
            return this;
        }

        public j Uo(Map.Entry entry) {
            return J2(entry.getKey(), entry.getValue());
        }

        public u n() {
            return t();
        }

        public j xMQ(Map map) {
            return KN(map.entrySet());
        }
    }

    static class n implements Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f59795n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Object f59796t;

        final Object n() {
            Object[] objArr = (Object[]) this.f59795n;
            Object[] objArr2 = (Object[]) this.f59796t;
            j jVarRl = rl(objArr.length);
            for (int i2 = 0; i2 < objArr.length; i2++) {
                jVarRl.J2(objArr[i2], objArr2[i2]);
            }
            return jVarRl.t();
        }

        final Object readResolve() {
            Object obj = this.f59795n;
            if (!(obj instanceof Ln)) {
                return n();
            }
            Ln ln2 = (Ln) obj;
            Z z2 = (Z) this.f59796t;
            j jVarRl = rl(ln2.size());
            xZD it = ln2.iterator();
            xZD it2 = z2.iterator();
            while (it.hasNext()) {
                jVarRl.J2(it.next(), it2.next());
            }
            return jVarRl.t();
        }

        j rl(int i2) {
            return new j(i2);
        }

        n(u uVar) {
            Object[] objArr = new Object[uVar.size()];
            Object[] objArr2 = new Object[uVar.size()];
            xZD it = uVar.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i2] = entry.getKey();
                objArr2[i2] = entry.getValue();
                i2++;
            }
            this.f59795n = objArr;
            this.f59796t = objArr2;
        }
    }

    abstract Ln KN();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    abstract Z mUb();

    abstract boolean qie();

    abstract Ln xMQ();

    public static u J2(Iterable iterable) {
        j jVar = new j(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        jVar.KN(iterable);
        return jVar.n();
    }

    public static j O(int i2) {
        Pl.rl(i2, "expectedSize");
        return new j(i2);
    }

    public static u Uo(Map map) {
        if ((map instanceof u) && !(map instanceof SortedMap)) {
            u uVar = (u) map;
            if (!uVar.qie()) {
                return uVar;
            }
        }
        return J2(map.entrySet());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static j t() {
        return new j();
    }

    public static u ty() {
        return Sis.f59655S;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Z values() {
        Z z2 = this.f59787O;
        if (z2 != null) {
            return z2;
        }
        Z zMUb = mUb();
        this.f59787O = zMUb;
        return zMUb;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public Ln keySet() {
        Ln ln2 = this.f59789t;
        if (ln2 != null) {
            return ln2;
        }
        Ln lnXMQ = xMQ();
        this.f59789t = lnXMQ;
        return lnXMQ;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public Ln entrySet() {
        Ln ln2 = this.f59788n;
        if (ln2 != null) {
            return ln2;
        }
        Ln lnKN = KN();
        this.f59788n = lnKN;
        return lnKN;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    Object writeReplace() {
        return new n(this);
    }

    u() {
    }

    public static u HI(Object obj, Object obj2) {
        Pl.n(obj, obj2);
        return Sis.XQ(1, new Object[]{obj, obj2});
    }

    public static u Ik(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Pl.n(obj, obj2);
        Pl.n(obj3, obj4);
        Pl.n(obj5, obj6);
        Pl.n(obj7, obj8);
        return Sis.XQ(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static u ck(Object obj, Object obj2, Object obj3, Object obj4) {
        Pl.n(obj, obj2);
        Pl.n(obj3, obj4);
        return Sis.XQ(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static u o(Map.Entry... entryArr) {
        return J2(Arrays.asList(entryArr));
    }

    public static u r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Pl.n(obj, obj2);
        Pl.n(obj3, obj4);
        Pl.n(obj5, obj6);
        Pl.n(obj7, obj8);
        Pl.n(obj9, obj10);
        return Sis.XQ(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return vd.nr(this, obj);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return O.nr(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return vd.az(this);
    }
}
