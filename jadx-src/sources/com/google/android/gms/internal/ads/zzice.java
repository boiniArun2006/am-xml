package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzice {
    static final Charset zza = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);
    public static final byte[] zzb;
    public static final ByteBuffer zzc;

    public static int zzb(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    static int zzc(int i2, byte[] bArr, int i3, int i5) {
        for (int i7 = i3; i7 < i3 + i5; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    static {
        Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzc = ByteBuffer.wrap(bArr);
        zziaq.zzG(bArr, 0, 0, false);
    }

    static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
