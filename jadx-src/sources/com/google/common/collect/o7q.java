package com.google.common.collect;

import com.caoccao.javet.exceptions.JavetError;
import com.google.common.collect.Md;
import com.google.common.collect.psW;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class o7q extends fuX implements Serializable {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final transient Wre f59742Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final transient g9s f59743o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final transient CN3 f59744r;

    private static final class CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Object f59745n;

        private CN3() {
        }

        void rl() {
            this.f59745n = null;
        }

        /* synthetic */ CN3(j jVar) {
            this();
        }

        public void n(Object obj, Object obj2) {
            if (this.f59745n != obj) {
                throw new ConcurrentModificationException();
            }
            this.f59745n = obj2;
        }

        public Object t() {
            return this.f59745n;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f59747n = new j("SIZE", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final I28 f59748t = new n("DISTINCT", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ I28[] f59746O = n();

        enum j extends I28 {
            j(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.collect.o7q.I28
            long t(Wre wre) {
                if (wre == null) {
                    return 0L;
                }
                return wre.nr;
            }

            @Override // com.google.common.collect.o7q.I28
            int rl(Wre wre) {
                return wre.rl;
            }
        }

        enum n extends I28 {
            n(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.collect.o7q.I28
            int rl(Wre wre) {
                return 1;
            }

            @Override // com.google.common.collect.o7q.I28
            long t(Wre wre) {
                if (wre == null) {
                    return 0L;
                }
                return wre.f59752t;
            }
        }

        private I28(String str, int i2) {
        }

        abstract int rl(Wre wre);

        abstract long t(Wre wre);

        /* synthetic */ I28(String str, int i2, j jVar) {
            this(str, i2);
        }

        private static /* synthetic */ I28[] n() {
            return new I28[]{f59747n, f59748t};
        }

        public static I28 valueOf(String str) {
            return (I28) Enum.valueOf(I28.class, str);
        }

        public static I28[] values() {
            return (I28[]) f59746O.clone();
        }
    }

    private static final class Wre {
        private Wre J2;
        private Wre KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f59750O;
        private Wre Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f59751n;
        private long nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f59752t;
        private Wre xMQ;

        Wre(Object obj, int i2) {
            t1.Xo.nr(i2 > 0);
            this.f59751n = obj;
            this.rl = i2;
            this.nr = i2;
            this.f59752t = 1;
            this.f59750O = 1;
            this.J2 = null;
            this.Uo = null;
        }

        private Wre Ik(Object obj, int i2) {
            Wre wre = new Wre(obj, i2);
            this.Uo = wre;
            o7q.nY(this, wre, wTp());
            this.f59750O = Math.max(2, this.f59750O);
            this.f59752t++;
            this.nr += (long) i2;
            return this;
        }

        private Wre N() {
            t1.Xo.XQ(this.J2 != null);
            Wre wre = this.J2;
            this.J2 = wre.Uo;
            wre.Uo = this;
            wre.nr = this.nr;
            wre.f59752t = this.f59752t;
            te();
            wre.iF();
            return wre;
        }

        private Wre T() {
            t1.Xo.XQ(this.Uo != null);
            Wre wre = this.Uo;
            this.Uo = wre.J2;
            wre.J2 = this;
            wre.nr = this.nr;
            wre.f59752t = this.f59752t;
            te();
            wre.iF();
            return wre;
        }

        private static int ViF(Wre wre) {
            if (wre == null) {
                return 0;
            }
            return wre.f59750O;
        }

        private Wre X(Wre wre) {
            Wre wre2 = this.J2;
            if (wre2 == null) {
                return this.Uo;
            }
            this.J2 = wre2.X(wre);
            this.f59752t--;
            this.nr -= (long) wre.rl;
            return g();
        }

        private Wre XQ() {
            int i2 = this.rl;
            this.rl = 0;
            o7q.ViF(nY(), wTp());
            Wre wre = this.J2;
            if (wre == null) {
                return this.Uo;
            }
            Wre wre2 = this.Uo;
            if (wre2 == null) {
                return wre;
            }
            if (wre.f59750O >= wre2.f59750O) {
                Wre wreNY = nY();
                wreNY.J2 = this.J2.e(wreNY);
                wreNY.Uo = this.Uo;
                wreNY.f59752t = this.f59752t - 1;
                wreNY.nr = this.nr - ((long) i2);
                return wreNY.g();
            }
            Wre wreWTp = wTp();
            wreWTp.Uo = this.Uo.X(wreWTp);
            wreWTp.J2 = this.J2;
            wreWTp.f59752t = this.f59752t - 1;
            wreWTp.nr = this.nr - ((long) i2);
            return wreWTp.g();
        }

        private Wre ck(Object obj, int i2) {
            this.J2 = new Wre(obj, i2);
            o7q.nY(nY(), this.J2, this);
            this.f59750O = Math.max(2, this.f59750O);
            this.f59752t++;
            this.nr += (long) i2;
            return this;
        }

        private Wre e(Wre wre) {
            Wre wre2 = this.Uo;
            if (wre2 == null) {
                return this.J2;
            }
            this.Uo = wre2.e(wre);
            this.f59752t--;
            this.nr -= (long) wre.rl;
            return g();
        }

        private void fD() {
            this.f59752t = o7q.XQ(this.J2) + 1 + o7q.XQ(this.Uo);
            this.nr = ((long) this.rl) + v(this.J2) + v(this.Uo);
        }

        private void iF() {
            this.f59750O = Math.max(ViF(this.J2), ViF(this.Uo)) + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Wre nY() {
            Wre wre = this.KN;
            Objects.requireNonNull(wre);
            return wre;
        }

        private int r() {
            return ViF(this.J2) - ViF(this.Uo);
        }

        private static long v(Wre wre) {
            if (wre == null) {
                return 0L;
            }
            return wre.nr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Wre wTp() {
            Wre wre = this.xMQ;
            Objects.requireNonNull(wre);
            return wre;
        }

        int WPU() {
            return this.rl;
        }

        Object aYN() {
            return P.n(this.f59751n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Wre S(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, aYN());
            if (iCompare > 0) {
                Wre wre = this.Uo;
                if (wre != null) {
                    return (Wre) t1.Dsr.n(wre.S(comparator, obj), this);
                }
            } else if (iCompare != 0) {
                Wre wre2 = this.J2;
                if (wre2 == null) {
                    return null;
                }
                return wre2.S(comparator, obj);
            }
            return this;
        }

        private Wre g() {
            int iR = r();
            if (iR != -2) {
                if (iR != 2) {
                    iF();
                    return this;
                }
                Objects.requireNonNull(this.J2);
                if (this.J2.r() < 0) {
                    this.J2 = this.J2.T();
                }
                return N();
            }
            Objects.requireNonNull(this.Uo);
            if (this.Uo.r() > 0) {
                this.Uo = this.Uo.N();
            }
            return T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Wre o(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, aYN());
            if (iCompare < 0) {
                Wre wre = this.J2;
                if (wre != null) {
                    return (Wre) t1.Dsr.n(wre.o(comparator, obj), this);
                }
            } else if (iCompare != 0) {
                Wre wre2 = this.Uo;
                if (wre2 == null) {
                    return null;
                }
                return wre2.o(comparator, obj);
            }
            return this;
        }

        private void te() {
            fD();
            iF();
        }

        Wre E2(Comparator comparator, Object obj, int i2, int[] iArr) {
            int iCompare = comparator.compare(obj, aYN());
            if (iCompare < 0) {
                Wre wre = this.J2;
                if (wre == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.J2 = wre.E2(comparator, obj, i2, iArr);
                int i3 = iArr[0];
                if (i3 > 0) {
                    if (i2 >= i3) {
                        this.f59752t--;
                        this.nr -= (long) i3;
                    } else {
                        this.nr -= (long) i2;
                    }
                }
                if (i3 == 0) {
                    return this;
                }
                return g();
            }
            if (iCompare > 0) {
                Wre wre2 = this.Uo;
                if (wre2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.Uo = wre2.E2(comparator, obj, i2, iArr);
                int i5 = iArr[0];
                if (i5 > 0) {
                    if (i2 >= i5) {
                        this.f59752t--;
                        this.nr -= (long) i5;
                    } else {
                        this.nr -= (long) i2;
                    }
                }
                return g();
            }
            int i7 = this.rl;
            iArr[0] = i7;
            if (i2 >= i7) {
                return XQ();
            }
            this.rl = i7 - i2;
            this.nr -= (long) i2;
            return this;
        }

        Wre HI(Comparator comparator, Object obj, int i2, int[] iArr) {
            int iCompare = comparator.compare(obj, aYN());
            boolean z2 = true;
            if (iCompare < 0) {
                Wre wre = this.J2;
                if (wre == null) {
                    iArr[0] = 0;
                    return ck(obj, i2);
                }
                int i3 = wre.f59750O;
                Wre wreHI = wre.HI(comparator, obj, i2, iArr);
                this.J2 = wreHI;
                if (iArr[0] == 0) {
                    this.f59752t++;
                }
                this.nr += (long) i2;
                if (wreHI.f59750O != i3) {
                    return g();
                }
            } else if (iCompare > 0) {
                Wre wre2 = this.Uo;
                if (wre2 == null) {
                    iArr[0] = 0;
                    return Ik(obj, i2);
                }
                int i5 = wre2.f59750O;
                Wre wreHI2 = wre2.HI(comparator, obj, i2, iArr);
                this.Uo = wreHI2;
                if (iArr[0] == 0) {
                    this.f59752t++;
                }
                this.nr += (long) i2;
                if (wreHI2.f59750O != i5) {
                    return g();
                }
            } else {
                int i7 = this.rl;
                iArr[0] = i7;
                long j2 = i2;
                if (((long) i7) + j2 > 2147483647L) {
                    z2 = false;
                }
                t1.Xo.nr(z2);
                this.rl += i2;
                this.nr += j2;
                return this;
            }
            return this;
        }

        int Z(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, aYN());
            if (iCompare < 0) {
                Wre wre = this.J2;
                if (wre == null) {
                    return 0;
                }
                return wre.Z(comparator, obj);
            }
            if (iCompare > 0) {
                Wre wre2 = this.Uo;
                if (wre2 == null) {
                    return 0;
                }
                return wre2.Z(comparator, obj);
            }
            return this.rl;
        }

        Wre nHg(Comparator comparator, Object obj, int i2, int i3, int[] iArr) {
            int iCompare = comparator.compare(obj, aYN());
            if (iCompare < 0) {
                Wre wre = this.J2;
                if (wre == null) {
                    iArr[0] = 0;
                    if (i2 == 0 && i3 > 0) {
                        return ck(obj, i3);
                    }
                } else {
                    this.J2 = wre.nHg(comparator, obj, i2, i3, iArr);
                    int i5 = iArr[0];
                    if (i5 == i2) {
                        if (i3 == 0 && i5 != 0) {
                            this.f59752t--;
                        } else if (i3 > 0 && i5 == 0) {
                            this.f59752t++;
                        }
                        this.nr += (long) (i3 - i5);
                    }
                    return g();
                }
            } else if (iCompare > 0) {
                Wre wre2 = this.Uo;
                if (wre2 == null) {
                    iArr[0] = 0;
                    if (i2 == 0 && i3 > 0) {
                        return Ik(obj, i3);
                    }
                } else {
                    this.Uo = wre2.nHg(comparator, obj, i2, i3, iArr);
                    int i7 = iArr[0];
                    if (i7 == i2) {
                        if (i3 == 0 && i7 != 0) {
                            this.f59752t--;
                        } else if (i3 > 0 && i7 == 0) {
                            this.f59752t++;
                        }
                        this.nr += (long) (i3 - i7);
                    }
                    return g();
                }
            } else {
                int i8 = this.rl;
                iArr[0] = i8;
                if (i2 == i8) {
                    if (i3 == 0) {
                        return XQ();
                    }
                    this.nr += (long) (i3 - i8);
                    this.rl = i3;
                }
            }
            return this;
        }

        Wre s7N(Comparator comparator, Object obj, int i2, int[] iArr) {
            int iCompare = comparator.compare(obj, aYN());
            if (iCompare < 0) {
                Wre wre = this.J2;
                if (wre == null) {
                    iArr[0] = 0;
                    if (i2 > 0) {
                        return ck(obj, i2);
                    }
                } else {
                    this.J2 = wre.s7N(comparator, obj, i2, iArr);
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f59752t--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f59752t++;
                    }
                    this.nr += (long) (i2 - iArr[0]);
                    return g();
                }
            } else if (iCompare > 0) {
                Wre wre2 = this.Uo;
                if (wre2 == null) {
                    iArr[0] = 0;
                    if (i2 > 0) {
                        return Ik(obj, i2);
                    }
                } else {
                    this.Uo = wre2.s7N(comparator, obj, i2, iArr);
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f59752t--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f59752t++;
                    }
                    this.nr += (long) (i2 - iArr[0]);
                    return g();
                }
            } else {
                int i3 = this.rl;
                iArr[0] = i3;
                if (i2 == 0) {
                    return XQ();
                }
                this.nr += (long) (i2 - i3);
                this.rl = i2;
                return this;
            }
            return this;
        }

        public String toString() {
            return Md.J2(aYN(), WPU()).toString();
        }

        Wre() {
            this.f59751n = null;
            this.rl = 1;
        }
    }

    class j extends Md.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f59753n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ o7q f59754t;

        j(o7q o7qVar, Wre wre) {
            this.f59753n = wre;
            this.f59754t = o7qVar;
        }

        @Override // com.google.common.collect.psW.j
        public int getCount() {
            int iWPU = this.f59753n.WPU();
            return iWPU == 0 ? this.f59754t.count(getElement()) : iWPU;
        }

        @Override // com.google.common.collect.psW.j
        public Object getElement() {
            return this.f59753n.aYN();
        }
    }

    class n implements Iterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Wre f59756n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        psW.j f59757t;

        n() {
            this.f59756n = o7q.this.S();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f59756n == null) {
                return false;
            }
            if (!o7q.this.f59743o.qie(this.f59756n.aYN())) {
                return true;
            }
            this.f59756n = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            t1.Xo.S(this.f59757t != null, "no calls to next() since the last call to remove()");
            o7q.this.aYN(this.f59757t.getElement(), 0);
            this.f59757t = null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public psW.j next() {
            if (hasNext()) {
                o7q o7qVar = o7q.this;
                Wre wre = this.f59756n;
                Objects.requireNonNull(wre);
                psW.j jVarG = o7qVar.g(wre);
                this.f59757t = jVarG;
                if (this.f59756n.wTp() == o7q.this.f59742Z) {
                    this.f59756n = null;
                    return jVarG;
                }
                this.f59756n = this.f59756n.wTp();
                return jVarG;
            }
            throw new NoSuchElementException();
        }
    }

    class w6 implements Iterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Wre f59759n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        psW.j f59760t = null;

        w6() {
            this.f59759n = o7q.this.WPU();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f59759n == null) {
                return false;
            }
            if (!o7q.this.f59743o.az(this.f59759n.aYN())) {
                return true;
            }
            this.f59759n = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            t1.Xo.S(this.f59760t != null, "no calls to next() since the last call to remove()");
            o7q.this.aYN(this.f59760t.getElement(), 0);
            this.f59760t = null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public psW.j next() {
            if (hasNext()) {
                Objects.requireNonNull(this.f59759n);
                psW.j jVarG = o7q.this.g(this.f59759n);
                this.f59760t = jVarG;
                if (this.f59759n.nY() == o7q.this.f59742Z) {
                    this.f59759n = null;
                    return jVarG;
                }
                this.f59759n = this.f59759n.nY();
                return jVarG;
            }
            throw new NoSuchElementException();
        }
    }

    o7q(CN3 cn3, g9s g9sVar, Wre wre) {
        super(g9sVar.rl());
        this.f59744r = cn3;
        this.f59743o = g9sVar;
        this.f59742Z = wre;
    }

    @Override // com.google.common.collect.psW
    public int count(Object obj) {
        try {
            Wre wre = (Wre) this.f59744r.t();
            if (this.f59743o.t(obj) && wre != null) {
                return wre.Z(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    static /* synthetic */ class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f59749n;

        static {
            int[] iArr = new int[EnumC1898o.values().length];
            f59749n = iArr;
            try {
                iArr[EnumC1898o.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59749n[EnumC1898o.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private long Ik(I28 i28, Wre wre) {
        long jT2;
        long jIk;
        if (wre == null) {
            return 0L;
        }
        int iCompare = comparator().compare(P.n(this.f59743o.J2()), wre.aYN());
        if (iCompare < 0) {
            return Ik(i28, wre.J2);
        }
        if (iCompare == 0) {
            int i2 = Ml.f59749n[this.f59743o.O().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return i28.t(wre.J2);
                }
                throw new AssertionError();
            }
            jT2 = i28.rl(wre);
            jIk = i28.t(wre.J2);
        } else {
            jT2 = i28.t(wre.J2) + ((long) i28.rl(wre));
            jIk = Ik(i28, wre.Uo);
        }
        return jT2 + jIk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Wre S() {
        Wre wreWTp;
        Wre wre = (Wre) this.f59744r.t();
        if (wre == null) {
            return null;
        }
        if (this.f59743o.xMQ()) {
            Object objN = P.n(this.f59743o.J2());
            wreWTp = wre.o(comparator(), objN);
            if (wreWTp == null) {
                return null;
            }
            if (this.f59743o.O() == EnumC1898o.OPEN && comparator().compare(objN, wreWTp.aYN()) == 0) {
                wreWTp = wreWTp.wTp();
            }
        } else {
            wreWTp = this.f59742Z.wTp();
        }
        if (wreWTp == this.f59742Z || !this.f59743o.t(wreWTp.aYN())) {
            return null;
        }
        return wreWTp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Wre WPU() {
        Wre wreNY;
        Wre wre = (Wre) this.f59744r.t();
        if (wre == null) {
            return null;
        }
        if (this.f59743o.mUb()) {
            Object objN = P.n(this.f59743o.KN());
            wreNY = wre.S(comparator(), objN);
            if (wreNY == null) {
                return null;
            }
            if (this.f59743o.Uo() == EnumC1898o.OPEN && comparator().compare(objN, wreNY.aYN()) == 0) {
                wreNY = wreNY.nY();
            }
        } else {
            wreNY = this.f59742Z.nY();
        }
        if (wreNY == this.f59742Z || !this.f59743o.t(wreNY.aYN())) {
            return null;
        }
        return wreNY;
    }

    static int XQ(Wre wre) {
        if (wre == null) {
            return 0;
        }
        return wre.f59752t;
    }

    private long ck(I28 i28, Wre wre) {
        long jT2;
        long jCk;
        if (wre == null) {
            return 0L;
        }
        int iCompare = comparator().compare(P.n(this.f59743o.KN()), wre.aYN());
        if (iCompare > 0) {
            return ck(i28, wre.Uo);
        }
        if (iCompare == 0) {
            int i2 = Ml.f59749n[this.f59743o.Uo().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return i28.t(wre.Uo);
                }
                throw new AssertionError();
            }
            jT2 = i28.rl(wre);
            jCk = i28.t(wre.Uo);
        } else {
            jT2 = i28.t(wre.Uo) + ((long) i28.rl(wre));
            jCk = ck(i28, wre.J2);
        }
        return jT2 + jCk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public psW.j g(Wre wre) {
        return new j(this, wre);
    }

    public static o7q o() {
        return new o7q(iF.t());
    }

    private long r(I28 i28) {
        Wre wre = (Wre) this.f59744r.t();
        long jT2 = i28.t(wre);
        if (this.f59743o.xMQ()) {
            jT2 -= Ik(i28, wre);
        }
        return this.f59743o.mUb() ? jT2 - ck(i28, wre) : jT2;
    }

    @Override // com.google.common.collect.gnv
    public gnv GD(Object obj, EnumC1898o enumC1898o) {
        return new o7q(this.f59744r, this.f59743o.gh(g9s.nr(comparator(), obj, enumC1898o)), this.f59742Z);
    }

    @Override // com.google.common.collect.fuX
    Iterator KN() {
        return new w6();
    }

    @Override // com.google.common.collect.CN3, com.google.common.collect.psW
    public int M(Object obj, int i2) {
        Pl.rl(i2, "occurrences");
        if (i2 == 0) {
            return count(obj);
        }
        t1.Xo.nr(this.f59743o.t(obj));
        Wre wre = (Wre) this.f59744r.t();
        if (wre != null) {
            int[] iArr = new int[1];
            this.f59744r.n(wre, wre.HI(comparator(), obj, i2, iArr));
            return iArr[0];
        }
        comparator().compare(obj, obj);
        Wre wre2 = new Wre(obj, i2);
        Wre wre3 = this.f59742Z;
        nY(wre3, wre2, wre3);
        this.f59744r.n(wre, wre2);
        return 0;
    }

    @Override // com.google.common.collect.gnv
    public gnv Mx(Object obj, EnumC1898o enumC1898o) {
        return new o7q(this.f59744r, this.f59743o.gh(g9s.ty(comparator(), obj, enumC1898o)), this.f59742Z);
    }

    @Override // com.google.common.collect.CN3
    Iterator O() {
        return new n();
    }

    public int aYN(Object obj, int i2) {
        Pl.rl(i2, JavetError.PARAMETER_COUNT);
        if (!this.f59743o.t(obj)) {
            t1.Xo.nr(i2 == 0);
            return 0;
        }
        Wre wre = (Wre) this.f59744r.t();
        if (wre == null) {
            if (i2 > 0) {
                M(obj, i2);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f59744r.n(wre, wre.s7N(comparator(), obj, i2, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f59743o.xMQ() || this.f59743o.mUb()) {
            iwV.t(O());
            return;
        }
        Wre wreWTp = this.f59742Z.wTp();
        while (true) {
            Wre wre = this.f59742Z;
            if (wreWTp == wre) {
                ViF(wre, wre);
                this.f59744r.rl();
                return;
            }
            Wre wreWTp2 = wreWTp.wTp();
            wreWTp.rl = 0;
            wreWTp.J2 = null;
            wreWTp.Uo = null;
            wreWTp.KN = null;
            wreWTp.xMQ = null;
            wreWTp = wreWTp2;
        }
    }

    @Override // com.google.common.collect.CN3, com.google.common.collect.psW
    public int eF(Object obj, int i2) {
        Pl.rl(i2, "occurrences");
        if (i2 == 0) {
            return count(obj);
        }
        Wre wre = (Wre) this.f59744r.t();
        int[] iArr = new int[1];
        try {
            if (this.f59743o.t(obj) && wre != null) {
                this.f59744r.n(wre, wre.E2(comparator(), obj, i2, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.CN3
    int nr() {
        return com.google.common.primitives.Wre.qie(r(I28.f59748t));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.psW
    public int size() {
        return com.google.common.primitives.Wre.qie(r(I28.f59747n));
    }

    @Override // com.google.common.collect.psW
    public boolean z(Object obj, int i2, int i3) {
        Pl.rl(i3, "newCount");
        Pl.rl(i2, "oldCount");
        t1.Xo.nr(this.f59743o.t(obj));
        Wre wre = (Wre) this.f59744r.t();
        if (wre != null) {
            int[] iArr = new int[1];
            this.f59744r.n(wre, wre.nHg(comparator(), obj, i2, i3, iArr));
            return iArr[0] == i2;
        }
        if (i2 != 0) {
            return false;
        }
        if (i3 > 0) {
            M(obj, i3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ViF(Wre wre, Wre wre2) {
        wre.xMQ = wre2;
        wre2.KN = wre;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void nY(Wre wre, Wre wre2, Wre wre3) {
        ViF(wre, wre2);
        ViF(wre2, wre3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        AbstractC1899p.n(fuX.class, "comparator").rl(this, comparator);
        AbstractC1899p.n(o7q.class, "range").rl(this, g9s.n(comparator));
        AbstractC1899p.n(o7q.class, "rootReference").rl(this, new CN3(null));
        Wre wre = new Wre();
        AbstractC1899p.n(o7q.class, "header").rl(this, wre);
        ViF(wre, wre);
        AbstractC1899p.t(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        AbstractC1899p.Uo(this, objectOutputStream);
    }

    @Override // com.google.common.collect.fuX, com.google.common.collect.gnv
    public /* bridge */ /* synthetic */ gnv FX() {
        return super.FX();
    }

    @Override // com.google.common.collect.fuX, com.google.common.collect.gnv
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.CN3, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.psW
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.fuX, com.google.common.collect.CN3, com.google.common.collect.psW
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.CN3, com.google.common.collect.psW
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.fuX, com.google.common.collect.gnv
    public /* bridge */ /* synthetic */ psW.j firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.CN3, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Md.Uo(this);
    }

    @Override // com.google.common.collect.fuX, com.google.common.collect.gnv
    public /* bridge */ /* synthetic */ psW.j lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.fuX, com.google.common.collect.gnv
    public /* bridge */ /* synthetic */ gnv p5(Object obj, EnumC1898o enumC1898o, Object obj2, EnumC1898o enumC1898o2) {
        return super.p5(obj, enumC1898o, obj2, enumC1898o2);
    }

    @Override // com.google.common.collect.fuX, com.google.common.collect.gnv
    public /* bridge */ /* synthetic */ psW.j pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.fuX, com.google.common.collect.gnv
    public /* bridge */ /* synthetic */ psW.j pollLastEntry() {
        return super.pollLastEntry();
    }

    o7q(Comparator comparator) {
        super(comparator);
        this.f59743o = g9s.n(comparator);
        Wre wre = new Wre();
        this.f59742Z = wre;
        ViF(wre, wre);
        this.f59744r = new CN3(null);
    }
}
