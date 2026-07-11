package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzajt {
    public final zzafr zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;

    @Nullable
    public final long[] zzf;

    private zzajt(zzafr zzafrVar, long j2, long j3, @Nullable long[] jArr, int i2, int i3) {
        this.zza = new zzafr(zzafrVar);
        this.zzb = j2;
        this.zzc = j3;
        this.zzf = jArr;
        this.zzd = i2;
        this.zze = i3;
    }

    public final long zzb() {
        long j2 = this.zzb;
        if (j2 == -1 || j2 == 0) {
            return -9223372036854775807L;
        }
        return zzfj.zzr((j2 * ((long) r4.zzg)) - 1, this.zza.zzd);
    }

    public static zzajt zza(zzafr zzafrVar, zzer zzerVar) {
        int iZzH;
        long jZzz;
        long[] jArr;
        int i2;
        int i3;
        int iZzB = zzerVar.zzB();
        if ((iZzB & 1) != 0) {
            iZzH = zzerVar.zzH();
        } else {
            iZzH = -1;
        }
        if ((iZzB & 2) != 0) {
            jZzz = zzerVar.zzz();
        } else {
            jZzz = -1;
        }
        long j2 = jZzz;
        if ((iZzB & 4) == 4) {
            jArr = new long[100];
            for (int i5 = 0; i5 < 100; i5++) {
                jArr[i5] = zzerVar.zzs();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iZzB & 8) != 0) {
            zzerVar.zzk(4);
        }
        if (zzerVar.zzd() >= 24) {
            zzerVar.zzk(21);
            int iZzx = zzerVar.zzx();
            i3 = iZzx & 4095;
            i2 = iZzx >> 12;
        } else {
            i2 = -1;
            i3 = -1;
        }
        return new zzajt(zzafrVar, iZzH, j2, jArr2, i2, i3);
    }
}
