package com.google.common.primitives;

import java.util.Arrays;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class fuX {

    static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final byte[] f59816n;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i2 = 0; i2 < 10; i2++) {
                bArr[i2 + 48] = (byte) i2;
            }
            for (int i3 = 0; i3 < 26; i3++) {
                byte b2 = (byte) (i3 + 10);
                bArr[i3 + 65] = b2;
                bArr[i3 + 97] = b2;
            }
            f59816n = bArr;
        }

        static int n(char c2) {
            if (c2 < 128) {
                return f59816n[c2];
            }
            return -1;
        }
    }

    public static int n(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static long rl(long... jArr) {
        Xo.nr(jArr.length > 0);
        long j2 = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 > j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static long t(long... jArr) {
        Xo.nr(jArr.length > 0);
        long j2 = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static Long nr(String str, int i2) {
        if (((String) Xo.HI(str)).isEmpty()) {
            return null;
        }
        if (i2 < 2 || i2 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i2);
        }
        int i3 = str.charAt(0) == '-' ? 1 : 0;
        if (i3 == str.length()) {
            return null;
        }
        int i5 = i3 + 1;
        int iN = j.n(str.charAt(i3));
        if (iN < 0 || iN >= i2) {
            return null;
        }
        long j2 = -iN;
        long j3 = i2;
        long j4 = Long.MIN_VALUE / j3;
        while (i5 < str.length()) {
            int i7 = i5 + 1;
            int iN2 = j.n(str.charAt(i5));
            if (iN2 < 0 || iN2 >= i2 || j2 < j4) {
                return null;
            }
            long j5 = j2 * j3;
            long j6 = iN2;
            if (j5 < j6 - Long.MIN_VALUE) {
                return null;
            }
            j2 = j5 - j6;
            i5 = i7;
        }
        if (i3 != 0) {
            return Long.valueOf(j2);
        }
        if (j2 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j2);
    }
}
