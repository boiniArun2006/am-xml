package com.google.android.gms.internal.auth;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzfa {
    static final Charset zza = Charset.forName(C.ASCII_NAME);
    static final Charset zzb = Charset.forName(C.UTF8_NAME);
    static final Charset zzc = Charset.forName(C.ISO88591_NAME);
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzej zzf;

    public static int zza(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    static int zzb(int i2, byte[] bArr, int i3, int i5) {
        for (int i7 = 0; i7 < i5; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i2 = zzej.zza;
        zzeh zzehVar = new zzeh(bArr, 0, 0, false, null);
        try {
            zzehVar.zza(0);
            zzf = zzehVar;
        } catch (zzfb e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
