package com.google.common.collect;

import com.google.common.collect.u;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Sis extends u {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    static final u f59655S = new Sis(null, new Object[0], 0);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final transient int f59656Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final transient Object[] f59657o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final transient Object f59658r;

    static class j extends Ln {
        private final transient Object[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final transient u f59659O;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final transient int f59660o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final transient int f59661r;

        /* JADX INFO: renamed from: com.google.common.collect.Sis$j$j, reason: collision with other inner class name */
        class C0794j extends nKK {
            @Override // com.google.common.collect.Z
            public boolean Uo() {
                return true;
            }

            C0794j() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i2) {
                t1.Xo.az(i2, j.this.f59660o);
                int i3 = i2 * 2;
                Object obj = j.this.J2[j.this.f59661r + i3];
                Objects.requireNonNull(obj);
                Object obj2 = j.this.J2[i3 + (j.this.f59661r ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return j.this.f59660o;
            }

            @Override // com.google.common.collect.nKK, com.google.common.collect.Z
            Object writeReplace() {
                return super.writeReplace();
            }
        }

        @Override // com.google.common.collect.Z
        boolean Uo() {
            return true;
        }

        @Override // com.google.common.collect.Ln
        nKK HI() {
            return new C0794j();
        }

        @Override // com.google.common.collect.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f59659O.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f59660o;
        }

        j(u uVar, Object[] objArr, int i2, int i3) {
            this.f59659O = uVar;
            this.J2 = objArr;
            this.f59661r = i2;
            this.f59660o = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: KN */
        public xZD iterator() {
            return rl().iterator();
        }

        @Override // com.google.common.collect.Z
        int t(Object[] objArr, int i2) {
            return rl().t(objArr, i2);
        }

        @Override // com.google.common.collect.Ln, com.google.common.collect.Z
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class n extends Ln {
        private final transient nKK J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final transient u f59663O;

        @Override // com.google.common.collect.Z
        boolean Uo() {
            return true;
        }

        @Override // com.google.common.collect.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f59663O.get(obj) != null;
        }

        @Override // com.google.common.collect.Ln, com.google.common.collect.Z
        public nKK rl() {
            return this.J2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f59663O.size();
        }

        n(u uVar, nKK nkk) {
            this.f59663O = uVar;
            this.J2 = nkk;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: KN */
        public xZD iterator() {
            return rl().iterator();
        }

        @Override // com.google.common.collect.Z
        int t(Object[] objArr, int i2) {
            return rl().t(objArr, i2);
        }

        @Override // com.google.common.collect.Ln, com.google.common.collect.Z
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class w6 extends nKK {
        private final transient int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final transient Object[] f59664O;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final transient int f59665r;

        @Override // com.google.common.collect.Z
        boolean Uo() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i2) {
            t1.Xo.az(i2, this.f59665r);
            Object obj = this.f59664O[(i2 * 2) + this.J2];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59665r;
        }

        w6(Object[] objArr, int i2, int i3) {
            this.f59664O = objArr;
            this.J2 = i2;
            this.f59665r = i3;
        }

        @Override // com.google.common.collect.nKK, com.google.common.collect.Z
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static Sis XQ(int i2, Object[] objArr) {
        return S(i2, objArr, null);
    }

    static Object aYN(Object obj, Object[] objArr, int i2, int i3, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i2 == 1) {
            Object obj3 = objArr[i3];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iRl = afx.rl(obj2.hashCode());
            while (true) {
                int i5 = iRl & length;
                int i7 = bArr[i5] & UByte.MAX_VALUE;
                if (i7 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iRl = i5 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iRl2 = afx.rl(obj2.hashCode());
            while (true) {
                int i8 = iRl2 & length2;
                int i9 = sArr[i8] & UShort.MAX_VALUE;
                if (i9 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i9])) {
                    return objArr[i9 ^ 1];
                }
                iRl2 = i8 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iRl3 = afx.rl(obj2.hashCode());
            while (true) {
                int i10 = iRl3 & length3;
                int i11 = iArr[i10];
                if (i11 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                iRl3 = i10 + 1;
            }
        }
    }

    @Override // com.google.common.collect.u
    boolean qie() {
        return false;
    }

    static Sis S(int i2, Object[] objArr, u.j jVar) {
        if (i2 == 0) {
            return (Sis) f59655S;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            Pl.n(obj, obj2);
            return new Sis(null, objArr, 1);
        }
        t1.Xo.r(i2, objArr.length >> 1);
        Object objWPU = WPU(objArr, i2, Ln.gh(i2), 0);
        if (objWPU instanceof Object[]) {
            Object[] objArr2 = (Object[]) objWPU;
            u.j.C0796j c0796j = (u.j.C0796j) objArr2[2];
            if (jVar == null) {
                throw c0796j.n();
            }
            jVar.f59790O = c0796j;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objWPU = obj3;
            i2 = iIntValue;
        }
        return new Sis(objWPU, objArr, i2);
    }

    private static Object WPU(Object[] objArr, int i2, int i3, int i5) {
        int i7;
        u.j.C0796j c0796j = null;
        int i8 = 1;
        if (i2 == 1) {
            Object obj = objArr[i5];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i5 ^ 1];
            Objects.requireNonNull(obj2);
            Pl.n(obj, obj2);
            return null;
        }
        int i9 = i3 - 1;
        if (i3 <= 128) {
            byte[] bArr = new byte[i3];
            Arrays.fill(bArr, (byte) -1);
            int i10 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                int i12 = (i11 * 2) + i5;
                int i13 = (i10 * 2) + i5;
                Object obj3 = objArr[i12];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i12 ^ 1];
                Objects.requireNonNull(obj4);
                Pl.n(obj3, obj4);
                int iRl = afx.rl(obj3.hashCode());
                while (true) {
                    int i14 = iRl & i9;
                    int i15 = bArr[i14] & UByte.MAX_VALUE;
                    if (i15 == 255) {
                        bArr[i14] = (byte) i13;
                        if (i10 < i11) {
                            objArr[i13] = obj3;
                            objArr[i13 ^ 1] = obj4;
                        }
                        i10++;
                    } else {
                        if (obj3.equals(objArr[i15])) {
                            int i16 = i15 ^ 1;
                            Object obj5 = objArr[i16];
                            Objects.requireNonNull(obj5);
                            c0796j = new u.j.C0796j(obj3, obj4, obj5);
                            objArr[i16] = obj4;
                            break;
                        }
                        iRl = i14 + 1;
                    }
                }
            }
            return i10 == i2 ? bArr : new Object[]{bArr, Integer.valueOf(i10), c0796j};
        }
        if (i3 <= 32768) {
            short[] sArr = new short[i3];
            Arrays.fill(sArr, (short) -1);
            int i17 = 0;
            for (int i18 = 0; i18 < i2; i18++) {
                int i19 = (i18 * 2) + i5;
                int i20 = (i17 * 2) + i5;
                Object obj6 = objArr[i19];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i19 ^ 1];
                Objects.requireNonNull(obj7);
                Pl.n(obj6, obj7);
                int iRl2 = afx.rl(obj6.hashCode());
                while (true) {
                    int i21 = iRl2 & i9;
                    int i22 = sArr[i21] & UShort.MAX_VALUE;
                    if (i22 == 65535) {
                        sArr[i21] = (short) i20;
                        if (i17 < i18) {
                            objArr[i20] = obj6;
                            objArr[i20 ^ 1] = obj7;
                        }
                        i17++;
                    } else {
                        if (obj6.equals(objArr[i22])) {
                            int i23 = i22 ^ 1;
                            Object obj8 = objArr[i23];
                            Objects.requireNonNull(obj8);
                            c0796j = new u.j.C0796j(obj6, obj7, obj8);
                            objArr[i23] = obj7;
                            break;
                        }
                        iRl2 = i21 + 1;
                    }
                }
            }
            return i17 == i2 ? sArr : new Object[]{sArr, Integer.valueOf(i17), c0796j};
        }
        int[] iArr = new int[i3];
        Arrays.fill(iArr, -1);
        int i24 = 0;
        int i25 = 0;
        while (i24 < i2) {
            int i26 = (i24 * 2) + i5;
            int i27 = (i25 * 2) + i5;
            Object obj9 = objArr[i26];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i26 ^ i8];
            Objects.requireNonNull(obj10);
            Pl.n(obj9, obj10);
            int iRl3 = afx.rl(obj9.hashCode());
            while (true) {
                int i28 = iRl3 & i9;
                int i29 = iArr[i28];
                if (i29 == -1) {
                    iArr[i28] = i27;
                    if (i25 < i24) {
                        objArr[i27] = obj9;
                        objArr[i27 ^ 1] = obj10;
                    }
                    i25++;
                    i7 = i8;
                } else {
                    i7 = i8;
                    if (obj9.equals(objArr[i29])) {
                        int i30 = i29 ^ 1;
                        Object obj11 = objArr[i30];
                        Objects.requireNonNull(obj11);
                        c0796j = new u.j.C0796j(obj9, obj10, obj11);
                        objArr[i30] = obj10;
                        break;
                    }
                    iRl3 = i28 + 1;
                    i8 = i7;
                }
            }
            i24++;
            i8 = i7;
        }
        int i31 = i8;
        if (i25 == i2) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i31] = Integer.valueOf(i25);
        objArr2[2] = c0796j;
        return objArr2;
    }

    @Override // com.google.common.collect.u
    Ln KN() {
        return new j(this, this.f59657o, 0, this.f59656Z);
    }

    @Override // com.google.common.collect.u, java.util.Map
    public Object get(Object obj) {
        Object objAYN = aYN(this.f59658r, this.f59657o, this.f59656Z, 0, obj);
        if (objAYN == null) {
            return null;
        }
        return objAYN;
    }

    @Override // com.google.common.collect.u
    Z mUb() {
        return new w6(this.f59657o, 1, this.f59656Z);
    }

    @Override // java.util.Map
    public int size() {
        return this.f59656Z;
    }

    @Override // com.google.common.collect.u
    Ln xMQ() {
        return new n(this, new w6(this.f59657o, 0, this.f59656Z));
    }

    private Sis(Object obj, Object[] objArr, int i2) {
        this.f59658r = obj;
        this.f59657o = objArr;
        this.f59656Z = i2;
    }

    @Override // com.google.common.collect.u
    Object writeReplace() {
        return super.writeReplace();
    }
}
