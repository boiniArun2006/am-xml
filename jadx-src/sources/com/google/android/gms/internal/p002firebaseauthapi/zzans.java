package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzans {
    private static boolean zza(byte b2) {
        return b2 > -65;
    }

    static /* synthetic */ void zza(byte b2, byte b4, byte b5, byte b6, char[] cArr, int i2) throws zzalf {
        if (zza(b4) || (((b2 << 28) + (b4 + 112)) >> 30) != 0 || zza(b5) || zza(b6)) {
            throw zzalf.zzd();
        }
        int i3 = ((b2 & 7) << 18) | ((b4 & 63) << 12) | ((b5 & 63) << 6) | (b6 & 63);
        cArr[i2] = (char) ((i3 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
    }

    static /* synthetic */ void zza(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    static /* synthetic */ void zza(byte b2, byte b4, byte b5, char[] cArr, int i2) throws zzalf {
        if (!zza(b4) && ((b2 != -32 || b4 >= -96) && ((b2 != -19 || b4 < -96) && !zza(b5)))) {
            cArr[i2] = (char) (((b2 & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
            return;
        }
        throw zzalf.zzd();
    }

    static /* synthetic */ void zza(byte b2, byte b4, char[] cArr, int i2) throws zzalf {
        if (b2 >= -62 && !zza(b4)) {
            cArr[i2] = (char) (((b2 & 31) << 6) | (b4 & 63));
            return;
        }
        throw zzalf.zzd();
    }
}
