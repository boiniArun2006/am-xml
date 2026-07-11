package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzqq {
    public static final Charset zza = Charset.forName(C.UTF8_NAME);

    public static int zza() {
        int i2 = 0;
        while (i2 == 0) {
            byte[] bArrZza = zzqg.zza(4);
            i2 = (bArrZza[3] & UByte.MAX_VALUE) | ((bArrZza[0] & UByte.MAX_VALUE) << 24) | ((bArrZza[1] & UByte.MAX_VALUE) << 16) | ((bArrZza[2] & UByte.MAX_VALUE) << 8);
        }
        return i2;
    }

    public static final zzaae zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzqo("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i2] = (byte) cCharAt;
        }
        return zzaae.zza(bArr);
    }

    public static final zzaae zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '!' && cCharAt <= '~') {
                bArr[i2] = (byte) cCharAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
        }
        return zzaae.zza(bArr);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        return true;
    }
}
