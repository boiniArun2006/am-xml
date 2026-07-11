package T6s;

import com.safedk.android.analytics.brandsafety.l;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator f10147g = new j();
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    I28 f10148O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private w6 f10149S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private n f10150Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Comparator f10151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final I28 f10152o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f10153r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f10154t;

    static final class I28 implements Map.Entry {
        I28 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        I28 f10155O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f10156S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final boolean f10157Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10158g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        I28 f10159n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final Object f10160o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        I28 f10161r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        I28 f10162t;

        I28(boolean z2) {
            this.f10160o = null;
            this.f10157Z = z2;
            this.f10161r = this;
            this.J2 = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f10160o;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f10156S;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f10160o;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f10156S;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f10160o;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f10156S;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        public I28 n() {
            I28 i28 = this;
            for (I28 i282 = this.f10162t; i282 != null; i282 = i282.f10162t) {
                i28 = i282;
            }
            return i28;
        }

        public I28 rl() {
            I28 i28 = this;
            for (I28 i282 = this.f10155O; i282 != null; i282 = i282.f10155O) {
                i28 = i282;
            }
            return i28;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f10157Z) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f10156S;
            this.f10156S = obj;
            return obj2;
        }

        public String toString() {
            return this.f10160o + l.ae + this.f10156S;
        }

        I28(boolean z2, I28 i28, Object obj, I28 i282, I28 i283) {
            this.f10159n = i28;
            this.f10160o = obj;
            this.f10157Z = z2;
            this.f10158g = 1;
            this.J2 = i282;
            this.f10161r = i283;
            i283.J2 = this;
            i282.f10161r = this;
        }
    }

    private abstract class Ml implements Iterator {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f10163O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        I28 f10164n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        I28 f10165t = null;

        Ml() {
            this.f10164n = CN3.this.f10152o.J2;
            this.f10163O = CN3.this.f10153r;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f10164n != CN3.this.f10152o;
        }

        final I28 n() {
            I28 i28 = this.f10164n;
            CN3 cn3 = CN3.this;
            if (i28 == cn3.f10152o) {
                throw new NoSuchElementException();
            }
            if (cn3.f10153r != this.f10163O) {
                throw new ConcurrentModificationException();
            }
            this.f10164n = i28.J2;
            this.f10165t = i28;
            return i28;
        }

        @Override // java.util.Iterator
        public final void remove() {
            I28 i28 = this.f10165t;
            if (i28 == null) {
                throw new IllegalStateException();
            }
            CN3.this.xMQ(i28, true);
            this.f10165t = null;
            this.f10163O = CN3.this.f10153r;
        }
    }

    class n extends AbstractSet {

        class j extends Ml {
            j() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return n();
            }
        }

        n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CN3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && CN3.this.J2((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            I28 i28J2;
            if (!(obj instanceof Map.Entry) || (i28J2 = CN3.this.J2((Map.Entry) obj)) == null) {
                return false;
            }
            CN3.this.xMQ(i28J2, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CN3.this.J2;
        }
    }

    final class w6 extends AbstractSet {

        class j extends Ml {
            j() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return n().f10160o;
            }
        }

        w6() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CN3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CN3.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return CN3.this.mUb(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CN3.this.J2;
        }
    }

    public CN3() {
        this(f10147g, true);
    }

    I28 Uo(Object obj) {
        if (obj != null) {
            try {
                return O(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f10148O = null;
        this.J2 = 0;
        this.f10153r++;
        I28 i28 = this.f10152o;
        i28.f10161r = i28;
        i28.J2 = i28;
    }

    class j implements Comparator {
        j() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public CN3(boolean z2) {
        this(f10147g, z2);
    }

    private void KN(I28 i28, boolean z2) {
        while (i28 != null) {
            I28 i282 = i28.f10162t;
            I28 i283 = i28.f10155O;
            int i2 = i282 != null ? i282.f10158g : 0;
            int i3 = i283 != null ? i283.f10158g : 0;
            int i5 = i2 - i3;
            if (i5 == -2) {
                I28 i284 = i283.f10162t;
                I28 i285 = i283.f10155O;
                int i7 = (i284 != null ? i284.f10158g : 0) - (i285 != null ? i285.f10158g : 0);
                if (i7 == -1 || (i7 == 0 && !z2)) {
                    qie(i28);
                } else {
                    az(i283);
                    qie(i28);
                }
                if (z2) {
                    return;
                }
            } else if (i5 == 2) {
                I28 i286 = i282.f10162t;
                I28 i287 = i282.f10155O;
                int i8 = (i286 != null ? i286.f10158g : 0) - (i287 != null ? i287.f10158g : 0);
                if (i8 == 1 || (i8 == 0 && !z2)) {
                    az(i28);
                } else {
                    qie(i282);
                    az(i28);
                }
                if (z2) {
                    return;
                }
            } else if (i5 == 0) {
                i28.f10158g = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                i28.f10158g = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            i28 = i28.f10159n;
        }
    }

    private void az(I28 i28) {
        I28 i282 = i28.f10162t;
        I28 i283 = i28.f10155O;
        I28 i284 = i282.f10162t;
        I28 i285 = i282.f10155O;
        i28.f10162t = i285;
        if (i285 != null) {
            i285.f10159n = i28;
        }
        gh(i28, i282);
        i282.f10155O = i28;
        i28.f10159n = i282;
        int iMax = Math.max(i283 != null ? i283.f10158g : 0, i285 != null ? i285.f10158g : 0) + 1;
        i28.f10158g = iMax;
        i282.f10158g = Math.max(iMax, i284 != null ? i284.f10158g : 0) + 1;
    }

    private void gh(I28 i28, I28 i282) {
        I28 i283 = i28.f10159n;
        i28.f10159n = null;
        if (i282 != null) {
            i282.f10159n = i283;
        }
        if (i283 == null) {
            this.f10148O = i282;
        } else if (i283.f10162t == i28) {
            i283.f10162t = i282;
        } else {
            i283.f10155O = i282;
        }
    }

    private void qie(I28 i28) {
        I28 i282 = i28.f10162t;
        I28 i283 = i28.f10155O;
        I28 i284 = i283.f10162t;
        I28 i285 = i283.f10155O;
        i28.f10155O = i284;
        if (i284 != null) {
            i284.f10159n = i28;
        }
        gh(i28, i283);
        i283.f10162t = i28;
        i28.f10159n = i283;
        int iMax = Math.max(i282 != null ? i282.f10158g : 0, i284 != null ? i284.f10158g : 0) + 1;
        i28.f10158g = iMax;
        i283.f10158g = Math.max(iMax, i285 != null ? i285.f10158g : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    I28 O(Object obj, boolean z2) {
        int iCompareTo;
        I28 i28;
        Comparator comparator = this.f10151n;
        I28 i282 = this.f10148O;
        if (i282 != null) {
            Comparable comparable = comparator == f10147g ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(i282.f10160o) : comparator.compare(obj, i282.f10160o);
                if (iCompareTo == 0) {
                    return i282;
                }
                I28 i283 = iCompareTo < 0 ? i282.f10162t : i282.f10155O;
                if (i283 == null) {
                    break;
                }
                i282 = i283;
            }
        } else {
            iCompareTo = 0;
        }
        I28 i284 = i282;
        if (!z2) {
            return null;
        }
        I28 i285 = this.f10152o;
        if (i284 != null) {
            i28 = new I28(this.f10154t, i284, obj, i285, i285.f10161r);
            if (iCompareTo < 0) {
                i284.f10162t = i28;
            } else {
                i284.f10155O = i28;
            }
            KN(i284, true);
        } else {
            if (comparator == f10147g && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            i28 = new I28(this.f10154t, i284, obj, i285, i285.f10161r);
            this.f10148O = i28;
        }
        this.J2++;
        this.f10153r++;
        return i28;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        n nVar = this.f10150Z;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n();
        this.f10150Z = nVar2;
        return nVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        w6 w6Var = this.f10149S;
        if (w6Var != null) {
            return w6Var;
        }
        w6 w6Var2 = new w6();
        this.f10149S = w6Var2;
        return w6Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f10154t) {
            throw new NullPointerException("value == null");
        }
        I28 i28O = O(obj, true);
        Object obj3 = i28O.f10156S;
        i28O.f10156S = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.J2;
    }

    void xMQ(I28 i28, boolean z2) {
        int i2;
        if (z2) {
            I28 i282 = i28.f10161r;
            i282.J2 = i28.J2;
            i28.J2.f10161r = i282;
        }
        I28 i283 = i28.f10162t;
        I28 i284 = i28.f10155O;
        I28 i285 = i28.f10159n;
        int i3 = 0;
        if (i283 == null || i284 == null) {
            if (i283 != null) {
                gh(i28, i283);
                i28.f10162t = null;
            } else if (i284 != null) {
                gh(i28, i284);
                i28.f10155O = null;
            } else {
                gh(i28, null);
            }
            KN(i285, false);
            this.J2--;
            this.f10153r++;
            return;
        }
        I28 i28Rl = i283.f10158g > i284.f10158g ? i283.rl() : i284.n();
        xMQ(i28Rl, false);
        I28 i286 = i28.f10162t;
        if (i286 != null) {
            i2 = i286.f10158g;
            i28Rl.f10162t = i286;
            i286.f10159n = i28Rl;
            i28.f10162t = null;
        } else {
            i2 = 0;
        }
        I28 i287 = i28.f10155O;
        if (i287 != null) {
            i3 = i287.f10158g;
            i28Rl.f10155O = i287;
            i287.f10159n = i28Rl;
            i28.f10155O = null;
        }
        i28Rl.f10158g = Math.max(i2, i3) + 1;
        gh(i28, i28Rl);
    }

    public CN3(Comparator comparator, boolean z2) {
        this.J2 = 0;
        this.f10153r = 0;
        this.f10151n = comparator == null ? f10147g : comparator;
        this.f10154t = z2;
        this.f10152o = new I28(z2);
    }

    private boolean t(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    I28 J2(Map.Entry entry) {
        I28 i28Uo = Uo(entry.getKey());
        if (i28Uo != null && t(i28Uo.f10156S, entry.getValue())) {
            return i28Uo;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (Uo(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        I28 i28Uo = Uo(obj);
        if (i28Uo != null) {
            return i28Uo.f10156S;
        }
        return null;
    }

    I28 mUb(Object obj) {
        I28 i28Uo = Uo(obj);
        if (i28Uo != null) {
            xMQ(i28Uo, true);
        }
        return i28Uo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        I28 i28MUb = mUb(obj);
        if (i28MUb != null) {
            return i28MUb.f10156S;
        }
        return null;
    }
}
