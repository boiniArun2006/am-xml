package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaju implements zzajr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;

    @Nullable
    private final long[] zzg;

    private zzaju(long j2, int i2, long j3, int i3, long j4, @Nullable long[] jArr) {
        this.zza = j2;
        this.zzb = i2;
        this.zzc = j3;
        this.zzd = i3;
        this.zze = j4;
        this.zzg = jArr;
        this.zzf = j4 != -1 ? j2 + j4 : -1L;
    }

    private final long zzh(int i2) {
        return (this.zzc * ((long) i2)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zzd;
    }

    @Nullable
    public static zzaju zzd(zzajt zzajtVar, long j2) {
        long jZzb = zzajtVar.zzb();
        if (jZzb == -9223372036854775807L) {
            return null;
        }
        zzafr zzafrVar = zzajtVar.zza;
        return new zzaju(j2, zzafrVar.zzc, jZzb, zzafrVar.zzf, zzajtVar.zzc, zzajtVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        double d2;
        if (!zzb()) {
            zzafz zzafzVar = new zzafz(0L, this.zza + ((long) this.zzb));
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j3 = this.zzc;
        String str = zzfj.zza;
        long jMax = Math.max(0L, Math.min(j2, j3));
        double d4 = (jMax * 100.0d) / j3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i2 = (int) d4;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d6 = jArr[i2];
                if (i2 == 99) {
                    d2 = 256.0d;
                } else {
                    d2 = jArr[i2 + 1];
                }
                d5 = d6 + ((d4 - ((double) i2)) * (d2 - d6));
            }
        }
        long j4 = this.zze;
        zzafz zzafzVar2 = new zzafz(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d5 / 256.0d) * j4), j4 - 1)));
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j2) {
        long j3;
        double d2;
        if (zzb()) {
            long j4 = j2 - this.zza;
            if (j4 > this.zzb) {
                long[] jArr = this.zzg;
                jArr.getClass();
                double d4 = (j4 * 256.0d) / this.zze;
                int iZzm = zzfj.zzm(jArr, (long) d4, true, true);
                long jZzh = zzh(iZzm);
                long j5 = jArr[iZzm];
                int i2 = iZzm + 1;
                long jZzh2 = zzh(i2);
                if (iZzm == 99) {
                    j3 = 256;
                } else {
                    j3 = jArr[i2];
                }
                if (j5 == j3) {
                    d2 = 0.0d;
                } else {
                    d2 = (d4 - j5) / (j3 - j5);
                }
                return jZzh + Math.round(d2 * (jZzh2 - jZzh));
            }
            return 0L;
        }
        return 0L;
    }
}
