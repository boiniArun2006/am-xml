package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhl zzb;

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i2, int i3) {
        int i5 = i3 - i2;
        byte b2 = bArr[i2 - 1];
        if (i5 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i5 == 1) {
            byte b4 = bArr[i2];
            if (b2 > -12 || b4 > -65) {
                return -1;
            }
            return (b4 << 8) ^ b2;
        }
        if (i5 != 2) {
            throw new AssertionError();
        }
        byte b5 = bArr[i2];
        byte b6 = bArr[i2 + 1];
        if (b2 > -12 || b5 > -65 || b6 > -65) {
            return -1;
        }
        return (b6 << 16) ^ ((b5 << 8) ^ b2);
    }

    static boolean zzb(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    static boolean zzc(byte[] bArr, int i2, int i3) {
        return zzb.zzb(bArr, i2, i3);
    }

    static {
        if (zzhj.zzu() && zzhj.zzv()) {
            int i2 = zzds.zza;
        }
        zzb = new zzhm();
    }
}
