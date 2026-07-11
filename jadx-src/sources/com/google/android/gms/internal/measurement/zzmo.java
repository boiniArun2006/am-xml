package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzmo {
    static final Charset zza;
    public static final byte[] zzb;

    public static int zzb(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    static int zzc(int i2, byte[] bArr, int i3, int i5) {
        for (int i7 = 0; i7 < i5; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    static {
        Charset.forName(C.ASCII_NAME);
        zza = Charset.forName(C.UTF8_NAME);
        Charset.forName(C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        int i2 = zzli.zza;
        try {
            new zzlh(bArr, 0, 0, false, null).zza(0);
        } catch (zzmq e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    static boolean zzd(zznl zznlVar) {
        if (zznlVar instanceof zzks) {
            throw null;
        }
        return false;
    }
}
