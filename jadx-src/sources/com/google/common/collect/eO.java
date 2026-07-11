package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class eO extends AbstractMap implements Serializable {
    private static final Object E2 = new Object();
    transient Object[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    transient Object[] f59679O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private transient Set f59680S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private transient Set f59681Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Collection f59682g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Object f59683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient int f59684o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient int f59685r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    transient int[] f59686t;

    final class CN3 extends com.google.common.collect.I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f59688n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f59689t;

        CN3(int i2) {
            this.f59688n = eO.this.s7N(i2);
            this.f59689t = i2;
        }

        private void n() {
            int i2 = this.f59689t;
            if (i2 == -1 || i2 >= eO.this.size() || !t1.C.n(this.f59688n, eO.this.s7N(this.f59689t))) {
                this.f59689t = eO.this.T(this.f59688n);
            }
        }

        @Override // com.google.common.collect.I28, java.util.Map.Entry
        public Object getKey() {
            return this.f59688n;
        }

        @Override // com.google.common.collect.I28, java.util.Map.Entry
        public Object getValue() {
            Map mapG = eO.this.g();
            if (mapG != null) {
                return P.n(mapG.get(this.f59688n));
            }
            n();
            int i2 = this.f59689t;
            return i2 == -1 ? P.rl() : eO.this.J(i2);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapG = eO.this.g();
            if (mapG != null) {
                return P.n(mapG.put(this.f59688n, obj));
            }
            n();
            int i2 = this.f59689t;
            if (i2 == -1) {
                eO.this.put(this.f59688n, obj);
                return P.rl();
            }
            Object objJ = eO.this.J(i2);
            eO.this.B(this.f59689t, obj);
            return objJ;
        }
    }

    private abstract class I28 implements Iterator {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f59690O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59691n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f59692t;

        private I28() {
            this.f59691n = eO.this.f59685r;
            this.f59692t = eO.this.fD();
            this.f59690O = -1;
        }

        abstract Object rl(int i2);

        private void n() {
            if (eO.this.f59685r != this.f59691n) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f59692t >= 0;
        }

        void t() {
            this.f59691n += 32;
        }

        @Override // java.util.Iterator
        public Object next() {
            n();
            if (hasNext()) {
                int i2 = this.f59692t;
                this.f59690O = i2;
                Object objRl = rl(i2);
                this.f59692t = eO.this.E2(this.f59692t);
                return objRl;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z2;
            n();
            if (this.f59690O >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Pl.t(z2);
            t();
            eO eOVar = eO.this;
            eOVar.remove(eOVar.s7N(this.f59690O));
            this.f59692t = eO.this.r(this.f59692t, this.f59690O);
            this.f59690O = -1;
        }

        /* synthetic */ I28(eO eOVar, j jVar) {
            this();
        }
    }

    class Ml extends AbstractSet {
        Ml() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            eO.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapG = eO.this.g();
            if (mapG != null) {
                return mapG.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iT = eO.this.T(entry.getKey());
                if (iT != -1 && t1.C.n(eO.this.J(iT), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return eO.this.iF();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iE;
            int iJ2;
            Map mapG = eO.this.g();
            if (mapG != null) {
                return mapG.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (eO.this.rV9() || (iJ2 = AbstractC1900z.J2(entry.getKey(), entry.getValue(), (iE = eO.this.e()), eO.this.U(), eO.this.Xw(), eO.this.jB(), eO.this.P5())) == -1) {
                return false;
            }
            eO.this.v(iJ2, iE);
            eO.KN(eO.this);
            eO.this.X();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return eO.this.size();
        }
    }

    class Wre extends AbstractSet {
        Wre() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            eO.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return eO.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return eO.this.wTp();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapG = eO.this.g();
            return mapG != null ? mapG.keySet().remove(obj) : eO.this.bzg(obj) != eO.E2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return eO.this.size();
        }
    }

    class fuX extends AbstractCollection {
        fuX() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            eO.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return eO.this.D();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return eO.this.size();
        }
    }

    class j extends I28 {
        j() {
            super(eO.this, null);
        }

        @Override // com.google.common.collect.eO.I28
        Object rl(int i2) {
            return eO.this.s7N(i2);
        }
    }

    class n extends I28 {
        n() {
            super(eO.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.eO.I28
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public Map.Entry rl(int i2) {
            return eO.this.new CN3(i2);
        }
    }

    class w6 extends I28 {
        w6() {
            super(eO.this, null);
        }

        @Override // com.google.common.collect.eO.I28
        Object rl(int i2) {
            return eO.this.J(i2);
        }
    }

    eO() {
        N(3);
    }

    void Ik(int i2) {
    }

    void N(int i2) {
        t1.Xo.O(i2 >= 0, "Expected size must be >= 0");
        this.f59685r = com.google.common.primitives.Wre.O(i2, 1, 1073741823);
    }

    void nHg(int i2, Object obj, Object obj2, int i3, int i5) {
        E(i2, AbstractC1900z.nr(i3, 0, i5));
        FX(i2, obj);
        B(i2, obj2);
    }

    int r(int i2, int i3) {
        return i2 - 1;
    }

    static /* synthetic */ int KN(eO eOVar) {
        int i2 = eOVar.f59684o;
        eOVar.f59684o = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] P5() {
        Object[] objArr = this.J2;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object U() {
        Object obj = this.f59683n;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static eO XQ() {
        return new eO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] Xw() {
        int[] iArr = this.f59686t;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e() {
        return (1 << (this.f59685r & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] jB() {
        Object[] objArr = this.f59679O;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static eO nY(int i2) {
        return new eO(i2);
    }

    int E2(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f59684o) {
            return i3;
        }
        return -1;
    }

    Set S() {
        return new Ml();
    }

    Collection ViF() {
        return new fuX();
    }

    Map WPU(int i2) {
        return new LinkedHashMap(i2, 1.0f);
    }

    void X() {
        this.f59685r += 32;
    }

    Set aYN() {
        return new Wre();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f59680S;
        if (set != null) {
            return set;
        }
        Set setS = S();
        this.f59680S = setS;
        return setS;
    }

    Map g() {
        Object obj = this.f59683n;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f59681Z;
        if (set != null) {
            return set;
        }
        Set setAYN = aYN();
        this.f59681Z = setAYN;
        return setAYN;
    }

    boolean rV9() {
        return this.f59683n == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f59682g;
        if (collection != null) {
            return collection;
        }
        Collection collectionViF = ViF();
        this.f59682g = collectionViF;
        return collectionViF;
    }

    eO(int i2) {
        N(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i2, Object obj) {
        P5()[i2] = obj;
    }

    private void E(int i2, int i3) {
        Xw()[i2] = i3;
    }

    private void FX(int i2, Object obj) {
        jB()[i2] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object J(int i2) {
        return P5()[i2];
    }

    private void M(int i2) {
        this.f59685r = AbstractC1900z.nr(this.f59685r, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int T(Object obj) {
        if (rV9()) {
            return -1;
        }
        int iT = afx.t(obj);
        int iE = e();
        int iKN = AbstractC1900z.KN(U(), iT & iE);
        if (iKN == 0) {
            return -1;
        }
        int iRl = AbstractC1900z.rl(iT, iE);
        do {
            int i2 = iKN - 1;
            int iTe = te(i2);
            if (AbstractC1900z.rl(iTe, iE) == iRl && t1.C.n(obj, s7N(i2))) {
                return i2;
            }
            iKN = AbstractC1900z.t(iTe, iE);
        } while (iKN != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object bzg(Object obj) {
        if (rV9()) {
            return E2;
        }
        int iE = e();
        int iJ2 = AbstractC1900z.J2(obj, null, iE, U(), Xw(), jB(), null);
        if (iJ2 == -1) {
            return E2;
        }
        Object objJ = J(iJ2);
        v(iJ2, iE);
        this.f59684o--;
        X();
        return objJ;
    }

    private int eF(int i2, int i3, int i5, int i7) {
        Object objN = AbstractC1900z.n(i3);
        int i8 = i3 - 1;
        if (i7 != 0) {
            AbstractC1900z.xMQ(objN, i5 & i8, i7 + 1);
        }
        Object objU = U();
        int[] iArrXw = Xw();
        for (int i9 = 0; i9 <= i2; i9++) {
            int iKN = AbstractC1900z.KN(objU, i9);
            while (iKN != 0) {
                int i10 = iKN - 1;
                int i11 = iArrXw[i10];
                int iRl = AbstractC1900z.rl(i11, i2) | i9;
                int i12 = iRl & i8;
                int iKN2 = AbstractC1900z.KN(objN, i12);
                AbstractC1900z.xMQ(objN, i12, iKN);
                iArrXw[i10] = AbstractC1900z.nr(iRl, iKN2, i8);
                iKN = AbstractC1900z.t(i11, i2);
            }
        }
        this.f59683n = objN;
        M(i8);
        return i8;
    }

    private void p5(int i2) {
        int iMin;
        int length = Xw().length;
        if (i2 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            M7(iMin);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 >= 0) {
            N(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object s7N(int i2) {
        return jB()[i2];
    }

    private int te(int i2) {
        return Xw()[i2];
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itIF = iF();
        while (itIF.hasNext()) {
            Map.Entry entry = (Map.Entry) itIF.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    Iterator D() {
        Map mapG = g();
        if (mapG != null) {
            return mapG.values().iterator();
        }
        return new w6();
    }

    void M7(int i2) {
        this.f59686t = Arrays.copyOf(Xw(), i2);
        this.f59679O = Arrays.copyOf(jB(), i2);
        this.J2 = Arrays.copyOf(P5(), i2);
    }

    Map Z() {
        Map mapWPU = WPU(e() + 1);
        int iFD = fD();
        while (iFD >= 0) {
            mapWPU.put(s7N(iFD), J(iFD));
            iFD = E2(iFD);
        }
        this.f59683n = mapWPU;
        this.f59686t = null;
        this.f59679O = null;
        this.J2 = null;
        X();
        return mapWPU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (rV9()) {
            return;
        }
        X();
        Map mapG = g();
        if (mapG != null) {
            this.f59685r = com.google.common.primitives.Wre.O(size(), 3, 1073741823);
            mapG.clear();
            this.f59683n = null;
            this.f59684o = 0;
            return;
        }
        Arrays.fill(jB(), 0, this.f59684o, (Object) null);
        Arrays.fill(P5(), 0, this.f59684o, (Object) null);
        AbstractC1900z.Uo(U());
        Arrays.fill(Xw(), 0, this.f59684o, 0);
        this.f59684o = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.containsKey(obj);
        }
        if (T(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.f59684o; i2++) {
            if (t1.C.n(obj, J(i2))) {
                return true;
            }
        }
        return false;
    }

    int fD() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.get(obj);
        }
        int iT = T(obj);
        if (iT == -1) {
            return null;
        }
        Ik(iT);
        return J(iT);
    }

    Iterator iF() {
        Map mapG = g();
        if (mapG != null) {
            return mapG.entrySet().iterator();
        }
        return new n();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    int o() {
        t1.Xo.S(rV9(), "Arrays already allocated");
        int i2 = this.f59685r;
        int iMUb = AbstractC1900z.mUb(i2);
        this.f59683n = AbstractC1900z.n(iMUb);
        M(iMUb - 1);
        this.f59686t = new int[i2];
        this.f59679O = new Object[i2];
        this.J2 = new Object[i2];
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (rV9()) {
            o();
        }
        Map mapG = g();
        if (mapG != null) {
            return mapG.put(obj, obj2);
        }
        int[] iArrXw = Xw();
        Object[] objArrJB = jB();
        Object[] objArrP5 = P5();
        int i2 = this.f59684o;
        int i3 = i2 + 1;
        int iT = afx.t(obj);
        int iE = e();
        int i5 = iT & iE;
        int iKN = AbstractC1900z.KN(U(), i5);
        if (iKN == 0) {
            if (i3 > iE) {
                iE = eF(iE, AbstractC1900z.O(iE), iT, i2);
            } else {
                AbstractC1900z.xMQ(U(), i5, i3);
            }
        } else {
            int iRl = AbstractC1900z.rl(iT, iE);
            int i7 = 0;
            while (true) {
                int i8 = iKN - 1;
                int i9 = iArrXw[i8];
                if (AbstractC1900z.rl(i9, iE) == iRl && t1.C.n(obj, objArrJB[i8])) {
                    Object obj3 = objArrP5[i8];
                    objArrP5[i8] = obj2;
                    Ik(i8);
                    return obj3;
                }
                int iT2 = AbstractC1900z.t(i9, iE);
                i7++;
                if (iT2 == 0) {
                    if (i7 >= 9) {
                        return Z().put(obj, obj2);
                    }
                    if (i3 > iE) {
                        iE = eF(iE, AbstractC1900z.O(iE), iT, i2);
                    } else {
                        iArrXw[i8] = AbstractC1900z.nr(i9, i3, iE);
                    }
                } else {
                    obj = obj;
                    obj2 = obj2;
                    iKN = iT2;
                }
            }
        }
        int i10 = iE;
        p5(i3);
        nHg(i2, obj, obj2, iT, i10);
        this.f59684o = i3;
        X();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.remove(obj);
        }
        Object objBzg = bzg(obj);
        if (objBzg == E2) {
            return null;
        }
        return objBzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapG = g();
        if (mapG != null) {
            return mapG.size();
        }
        return this.f59684o;
    }

    void v(int i2, int i3) {
        Object objU = U();
        int[] iArrXw = Xw();
        Object[] objArrJB = jB();
        Object[] objArrP5 = P5();
        int size = size();
        int i5 = size - 1;
        if (i2 < i5) {
            Object obj = objArrJB[i5];
            objArrJB[i2] = obj;
            objArrP5[i2] = objArrP5[i5];
            objArrJB[i5] = null;
            objArrP5[i5] = null;
            iArrXw[i2] = iArrXw[i5];
            iArrXw[i5] = 0;
            int iT = afx.t(obj) & i3;
            int iKN = AbstractC1900z.KN(objU, iT);
            if (iKN == size) {
                AbstractC1900z.xMQ(objU, iT, i2 + 1);
                return;
            }
            while (true) {
                int i7 = iKN - 1;
                int i8 = iArrXw[i7];
                int iT2 = AbstractC1900z.t(i8, i3);
                if (iT2 == size) {
                    iArrXw[i7] = AbstractC1900z.nr(i8, i2 + 1, i3);
                    return;
                }
                iKN = iT2;
            }
        } else {
            objArrJB[i2] = null;
            objArrP5[i2] = null;
            iArrXw[i2] = 0;
        }
    }

    Iterator wTp() {
        Map mapG = g();
        if (mapG != null) {
            return mapG.keySet().iterator();
        }
        return new j();
    }
}
