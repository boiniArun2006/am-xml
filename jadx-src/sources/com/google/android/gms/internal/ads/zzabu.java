package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzabu {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final boolean zzb() {
        return this.zzd > 15 && this.zzh == 0;
    }

    public final long zzd() {
        return this.zzf;
    }

    public final void zza() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zzc() {
        long j2 = this.zzd;
        if (j2 == 0) {
            return false;
        }
        return this.zzg[(int) ((j2 - 1) % 15)];
    }

    public final long zze() {
        long j2 = this.zze;
        if (j2 == 0) {
            return 0L;
        }
        return this.zzf / j2;
    }

    public final void zzf(long j2) {
        long j3 = this.zzd;
        if (j3 == 0) {
            this.zza = j2;
        } else if (j3 == 1) {
            long j4 = j2 - this.zza;
            this.zzb = j4;
            this.zzf = j4;
            this.zze = 1L;
        } else {
            long j5 = j2 - this.zzc;
            int i2 = (int) (j3 % 15);
            if (Math.abs(j5 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j5;
                boolean[] zArr = this.zzg;
                if (zArr[i2]) {
                    zArr[i2] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i2]) {
                    zArr2[i2] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j2;
    }
}
