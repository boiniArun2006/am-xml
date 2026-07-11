package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class y3 {
    public static boolean a(byte b2) {
        return b2 >= 0;
    }

    public static boolean b(byte b2) {
        return b2 > -65;
    }

    public static void a(byte b2, byte b4, char[] cArr, int i2) throws n1 {
        if (b2 < -62 || b(b4)) {
            throw new n1("Protocol message had invalid UTF-8.");
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b4 & 63));
    }

    public static void a(byte b2, byte b4, byte b5, char[] cArr, int i2) throws n1 {
        if (!b(b4) && ((b2 != -32 || b4 >= -96) && ((b2 != -19 || b4 < -96) && !b(b5)))) {
            cArr[i2] = (char) (((b2 & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
            return;
        }
        throw new n1("Protocol message had invalid UTF-8.");
    }

    public static void a(byte b2, byte b4, byte b5, byte b6, char[] cArr, int i2) throws n1 {
        if (!b(b4)) {
            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !b(b5) && !b(b6)) {
                int i3 = ((b2 & 7) << 18) | ((b4 & 63) << 12) | ((b5 & 63) << 6) | (b6 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw new n1("Protocol message had invalid UTF-8.");
    }
}
