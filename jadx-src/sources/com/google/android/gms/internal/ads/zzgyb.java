package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgyb {
    private static final byte[] zza;

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
        zza = bArr;
    }

    static int zza(char c2) {
        if (c2 < 128) {
            return zza[c2];
        }
        return -1;
    }
}
