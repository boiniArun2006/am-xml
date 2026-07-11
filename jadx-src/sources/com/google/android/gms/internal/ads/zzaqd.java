package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzaqd {
    public static int zza(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    public static long zzb(zzer zzerVar, int i2, int i3) {
        zzerVar.zzh(i2);
        if (zzerVar.zzd() >= 5) {
            int iZzB = zzerVar.zzB();
            if ((8388608 & iZzB) == 0 && ((iZzB >> 8) & 8191) == i3 && (iZzB & 32) != 0 && zzerVar.zzs() >= 7 && zzerVar.zzd() >= 7 && (zzerVar.zzs() & 16) == 16) {
                byte[] bArr = new byte[6];
                zzerVar.zzm(bArr, 0, 6);
                long j2 = bArr[0];
                long j3 = bArr[1];
                long j4 = bArr[2];
                long j5 = bArr[3] & 255;
                return ((j2 & 255) << 25) | ((j3 & 255) << 17) | ((j4 & 255) << 9) | (j5 + j5) | ((((long) bArr[4]) & 255) >> 7);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}
