package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzalb {
    static final Charset zza;
    public static final byte[] zzb;

    public static int zza(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    static {
        Charset.forName(C.ASCII_NAME);
        zza = Charset.forName(C.UTF8_NAME);
        Charset.forName(C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        zzakb.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int iZza = zza(length, bArr, 0, length);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    static int zza(int i2, byte[] bArr, int i3, int i5) {
        for (int i7 = i3; i7 < i3 + i5; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    static <T> T zza(T t3) {
        t3.getClass();
        return t3;
    }

    static <T> T zza(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    static boolean zza(zzamc zzamcVar) {
        boolean z2 = zzamcVar instanceof zzajh;
        return false;
    }
}
