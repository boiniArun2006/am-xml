package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhxo {
    public static byte[] zza(String str) {
        if ((str.length() & 1) == 0) {
            int length = str.length() >> 1;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 + i2;
                int iDigit = Character.digit(str.charAt(i3), 16);
                int iDigit2 = Character.digit(str.charAt(i3 + 1), 16);
                if (iDigit != -1 && iDigit2 != -1) {
                    bArr[i2] = (byte) ((iDigit * 16) + iDigit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
