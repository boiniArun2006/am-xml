package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class SPz {
    public static final Dsr J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final ByteBuffer f59928O;
    public static final byte[] nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Charset f59929n = Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
    static final Charset rl = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Charset f59930t = Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);

    public interface Ml extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        Ml mutableCopyWithCapacity(int i2);
    }

    public interface j {
    }

    public interface n {
    }

    public interface w6 {
        boolean isInRange(int i2);
    }

    public static int J2(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    static int KN(int i2, byte[] bArr, int i3, int i5) {
        for (int i7 = i3; i7 < i3 + i5; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    public static int nr(byte[] bArr) {
        return O(bArr, 0, bArr.length);
    }

    public static int t(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    static {
        byte[] bArr = new byte[0];
        nr = bArr;
        f59928O = ByteBuffer.wrap(bArr);
        J2 = Dsr.KN(bArr);
    }

    static Object rl(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String xMQ(byte[] bArr) {
        return new String(bArr, rl);
    }

    static int O(byte[] bArr, int i2, int i3) {
        int iKN = KN(i3, bArr, i2, i3);
        if (iKN == 0) {
            return 1;
        }
        return iKN;
    }

    public static boolean Uo(byte[] bArr) {
        return xZD.az(bArr);
    }

    static Object n(Object obj) {
        obj.getClass();
        return obj;
    }
}
