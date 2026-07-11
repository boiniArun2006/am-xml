package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzien {
    static /* synthetic */ boolean zza(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }

    static /* synthetic */ void zzb(byte b2, byte b4, char[] cArr, int i2) throws zzicg {
        if (b2 < -62 || zze(b4)) {
            throw new zzicg("Protocol message had invalid UTF-8.");
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b4 & 63));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void zzc(byte b2, byte b4, byte b5, char[] cArr, int i2) throws zzicg {
        if (!zze(b4)) {
            if (b2 == -32) {
                if (b4 >= -96) {
                    b2 = -32;
                    if (b2 == -19) {
                    }
                }
            } else if (b2 == -19) {
                if (b4 < -96) {
                    b2 = -19;
                    if (!zze(b5)) {
                    }
                }
            } else if (!zze(b5)) {
                cArr[i2] = (char) (((b2 & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                return;
            }
        }
        throw new zzicg("Protocol message had invalid UTF-8.");
    }

    static /* synthetic */ void zzd(byte b2, byte b4, byte b5, byte b6, char[] cArr, int i2) throws zzicg {
        if (!zze(b4) && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && !zze(b5) && !zze(b6)) {
            int i3 = ((b2 & 7) << 18) | ((b4 & 63) << 12) | ((b5 & 63) << 6) | (b6 & 63);
            cArr[i2] = (char) ((i3 >>> 10) + 55232);
            cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
            return;
        }
        throw new zzicg("Protocol message had invalid UTF-8.");
    }
}
