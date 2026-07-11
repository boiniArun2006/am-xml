package com.google.common.collect;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: renamed from: com.google.common.collect.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class AbstractC1900z {
    static int O(int i2) {
        return (i2 < 32 ? 4 : 2) * (i2 + 1);
    }

    static Object n(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i2);
    }

    static int nr(int i2, int i3, int i5) {
        return (i2 & (~i5)) | (i3 & i5);
    }

    static int rl(int i2, int i3) {
        return i2 & (~i3);
    }

    static int t(int i2, int i3) {
        return i2 & i3;
    }

    static int KN(Object obj, int i2) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & UByte.MAX_VALUE : obj instanceof short[] ? ((short[]) obj)[i2] & UShort.MAX_VALUE : ((int[]) obj)[i2];
    }

    static void Uo(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int mUb(int i2) {
        return Math.max(4, afx.n(i2 + 1, 1.0d));
    }

    static void xMQ(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    static int J2(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i5;
        int iT = afx.t(obj);
        int i7 = iT & i2;
        int iKN = KN(obj3, i7);
        if (iKN == 0) {
            return -1;
        }
        int iRl = rl(iT, i2);
        int i8 = -1;
        while (true) {
            i3 = iKN - 1;
            i5 = iArr[i3];
            if (rl(i5, i2) == iRl && t1.C.n(obj, objArr[i3]) && (objArr2 == null || t1.C.n(obj2, objArr2[i3]))) {
                break;
            }
            int iT2 = t(i5, i2);
            if (iT2 == 0) {
                return -1;
            }
            i8 = i3;
            iKN = iT2;
        }
        int iT3 = t(i5, i2);
        if (i8 == -1) {
            xMQ(obj3, i7, iT3);
            return i3;
        }
        iArr[i8] = nr(iArr[i8], iT3, i2);
        return i3;
    }
}
