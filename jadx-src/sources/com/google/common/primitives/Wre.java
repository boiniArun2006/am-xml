package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.UByte;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre extends CN3 {

    private static class j extends AbstractList implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final int f59813O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int[] f59814n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f59815t;

        j(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return super.equals(obj);
            }
            j jVar = (j) obj;
            int size = size();
            if (jVar.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f59814n[this.f59815t + i2] != jVar.f59814n[jVar.f59815t + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        j(int[] iArr, int i2, int i3) {
            this.f59814n = iArr;
            this.f59815t = i2;
            this.f59813O = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && Wre.mUb(this.f59814n, ((Integer) obj).intValue(), this.f59815t, this.f59813O) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iKN = 1;
            for (int i2 = this.f59815t; i2 < this.f59813O; i2++) {
                iKN = (iKN * 31) + Wre.KN(this.f59814n[i2]);
            }
            return iKN;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iMUb;
            if (!(obj instanceof Integer) || (iMUb = Wre.mUb(this.f59814n, ((Integer) obj).intValue(), this.f59815t, this.f59813O)) < 0) {
                return -1;
            }
            return iMUb - this.f59815t;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iGh;
            if (!(obj instanceof Integer) || (iGh = Wre.gh(this.f59814n, ((Integer) obj).intValue(), this.f59815t, this.f59813O)) < 0) {
                return -1;
            }
            return iGh - this.f59815t;
        }

        int[] nr() {
            return Arrays.copyOfRange(this.f59814n, this.f59815t, this.f59813O);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59813O - this.f59815t;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f59814n[this.f59815t]);
            int i2 = this.f59815t;
            while (true) {
                i2++;
                if (i2 >= this.f59813O) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f59814n[i2]);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Integer get(int i2) {
            Xo.az(i2, size());
            return Integer.valueOf(this.f59814n[this.f59815t + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i2, int i3) {
            Xo.Z(i2, i3, size());
            if (i2 == i3) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f59814n;
            int i5 = this.f59815t;
            return new j(iArr, i2 + i5, i5 + i3);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Integer set(int i2, Integer num) {
            Xo.az(i2, size());
            int[] iArr = this.f59814n;
            int i3 = this.f59815t;
            int i5 = iArr[i3 + i2];
            iArr[i3 + i2] = ((Integer) Xo.HI(num)).intValue();
            return Integer.valueOf(i5);
        }
    }

    public static int J2(byte[] bArr) {
        Xo.xMQ(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return Uo(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int KN(int i2) {
        return i2;
    }

    public static int Uo(byte b2, byte b4, byte b5, byte b6) {
        return (b2 << 24) | ((b4 & UByte.MAX_VALUE) << 16) | ((b5 & UByte.MAX_VALUE) << 8) | (b6 & UByte.MAX_VALUE);
    }

    public static int nr(long j2) {
        int i2 = (int) j2;
        Xo.mUb(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static int qie(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static List t(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new j(iArr);
    }

    public static int xMQ(int[] iArr, int i2) {
        return mUb(iArr, i2, 0, iArr.length);
    }

    public static Integer HI(String str) {
        return ck(str, 10);
    }

    public static int O(int i2, int i3, int i5) {
        Xo.xMQ(i3 <= i5, "min (%s) must be less than or equal to max (%s)", i3, i5);
        return Math.min(Math.max(i2, i3), i5);
    }

    public static int[] az(Collection collection) {
        if (collection instanceof j) {
            return ((j) collection).nr();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = ((Number) Xo.HI(array[i2])).intValue();
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int gh(int[] iArr, int i2, int i3, int i5) {
        for (int i7 = i5 - 1; i7 >= i3; i7--) {
            if (iArr[i7] == i2) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mUb(int[] iArr, int i2, int i3, int i5) {
        while (i3 < i5) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static byte[] ty(int i2) {
        return new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2};
    }

    public static Integer ck(String str, int i2) {
        Long lNr = fuX.nr(str, i2);
        if (lNr != null && lNr.longValue() == lNr.intValue()) {
            return Integer.valueOf(lNr.intValue());
        }
        return null;
    }
}
