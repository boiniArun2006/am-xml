package uK;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f74342n = true;
    public static final boolean rl = O();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static n f74343t = null;
    private static boolean nr = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final byte[] f74341O = n("RIFF");
    private static final byte[] J2 = n("WEBP");
    private static final byte[] Uo = n("VP8 ");
    private static final byte[] KN = n("VP8L");
    private static final byte[] xMQ = n("VP8X");

    private static boolean O() {
        return true;
    }

    private static boolean mUb(byte[] bArr, int i2, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i2 > bArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            if (bArr[i3 + i2] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static boolean J2(byte[] bArr, int i2) {
        return mUb(bArr, i2 + 12, KN);
    }

    public static boolean KN(byte[] bArr, int i2, int i3) {
        return i3 >= 20 && mUb(bArr, i2, f74341O) && mUb(bArr, i2 + 8, J2);
    }

    public static boolean Uo(byte[] bArr, int i2) {
        return mUb(bArr, i2 + 12, Uo);
    }

    private static byte[] n(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean nr(byte[] bArr, int i2) {
        return mUb(bArr, i2 + 12, xMQ) && ((bArr[i2 + 20] & 16) == 16);
    }

    public static boolean rl(byte[] bArr, int i2) {
        return mUb(bArr, i2 + 12, xMQ) && ((bArr[i2 + 20] & 2) == 2);
    }

    public static boolean t(byte[] bArr, int i2, int i3) {
        return i3 >= 21 && mUb(bArr, i2 + 12, xMQ);
    }

    public static n xMQ() {
        n nVar;
        if (nr) {
            return f74343t;
        }
        try {
            nVar = (n) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            nVar = null;
        }
        nr = true;
        return nVar;
    }
}
