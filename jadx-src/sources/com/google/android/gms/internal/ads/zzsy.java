package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzsy implements zzso {
    protected zzsy(zzsx zzsxVar) {
    }

    protected static int zza(int i2, int i3, int i5) {
        return zzgxz.zza(((((long) i2) * ((long) i3)) * ((long) i5)) / 1000000);
    }

    protected static final int zzb(int i2, int i3, int i5, int i7, int i8, int i9) {
        int iZzc;
        int i10 = 250000;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i3 == 5) {
                    i10 = 500000;
                } else if (i3 == 8) {
                    i10 = 1000000;
                    i3 = 8;
                }
                if (i9 != -1) {
                    iZzc = zzgxs.zzb(i9, 8, RoundingMode.CEILING);
                } else {
                    iZzc = zzc(i3);
                }
                return zzgxz.zza((((long) i10) * ((long) iZzc)) / 1000000);
            }
            return zzgxz.zza((((long) zzc(i3)) * 50000000) / 1000000);
        }
        int iZza = zza(250000, i8, i7);
        int iZza2 = zza(750000, i8, i7);
        String str = zzfj.zza;
        return Math.max(iZza, Math.min(i2 * 4, iZza2));
    }

    private static int zzc(int i2) {
        boolean z2;
        int iZzf = zzaey.zzf(i2);
        if (iZzf != -2147483647) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zzi(z2);
        return iZzf;
    }
}
