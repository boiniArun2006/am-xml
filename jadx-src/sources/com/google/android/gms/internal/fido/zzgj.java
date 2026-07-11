package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzgj {
    public static byte[] zza(byte[]... bArr) {
        int i2 = 0;
        int length = 0;
        while (true) {
            if (i2 >= bArr.length) {
                break;
            }
            length += bArr[i2].length;
            i2++;
        }
        byte[] bArr2 = new byte[length];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length2);
            i3 += length2;
        }
        return bArr2;
    }
}
