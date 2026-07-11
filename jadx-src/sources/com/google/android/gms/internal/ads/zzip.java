package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzip {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    /* synthetic */ zzip(float f3, float f4, long j2, float f5, long j3, long j4, float f6, byte[] bArr) {
        this.zza = j3;
        this.zzb = j4;
    }

    private final void zzf() {
        long j2;
        long j3 = this.zzc;
        if (j3 != -9223372036854775807L) {
            j2 = this.zzd;
            if (j2 == -9223372036854775807L) {
                long j4 = this.zzf;
                if (j4 != -9223372036854775807L && j3 < j4) {
                    j3 = j4;
                }
                j2 = this.zzg;
                if (j2 == -9223372036854775807L || j3 <= j2) {
                    j2 = j3;
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.zze == j2) {
            return;
        }
        this.zze = j2;
        this.zzh = j2;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j2, long j3, float f3) {
        return (long) ((j2 * 0.999f) + (j3 * 9.999871E-4f));
    }

    public final void zzc() {
        long j2 = this.zzh;
        if (j2 == -9223372036854775807L) {
            return;
        }
        long j3 = j2 + this.zzb;
        this.zzh = j3;
        long j4 = this.zzg;
        if (j4 != -9223372036854775807L && j3 > j4) {
            this.zzh = j4;
        }
        this.zzl = -9223372036854775807L;
    }

    public final long zze() {
        return this.zzh;
    }

    public final void zza(zzaf zzafVar) {
        long j2 = zzafVar.zza;
        this.zzc = zzfj.zzq(-9223372036854775807L);
        this.zzf = zzfj.zzq(-9223372036854775807L);
        this.zzg = zzfj.zzq(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j2) {
        this.zzd = j2;
        zzf();
    }

    public final float zzd(long j2, long j3) {
        float f3;
        long jMax;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j2 - j3;
        long j5 = this.zzm;
        if (j5 == -9223372036854775807L) {
            this.zzm = j4;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j4, zzg(j5, j4, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzg(this.zzn, Math.abs(j4 - jMax2), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j6 = this.zzm + (this.zzn * 3);
        if (this.zzh > j6) {
            float fZzq = zzfj.zzq(1000L);
            f3 = 1.0E-7f;
            long[] jArr = {j6, this.zze, this.zzh - (((long) (fZzq * (this.zzk - 1.0f))) + ((long) ((this.zzi - 1.0f) * fZzq)))};
            jMax = jArr[0];
            for (int i2 = 1; i2 < 3; i2++) {
                long j7 = jArr[i2];
                if (j7 > jMax) {
                    jMax = j7;
                }
            }
            this.zzh = jMax;
        } else {
            f3 = 1.0E-7f;
            long jMax3 = j2 - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j9 = this.zzh;
            String str = zzfj.zza;
            jMax = Math.max(j9, Math.min(jMax3, j6));
            this.zzh = jMax;
            long j10 = this.zzg;
            if (j10 != -9223372036854775807L && jMax > j10) {
                this.zzh = j10;
                jMax = j10;
            }
        }
        long j11 = j2 - jMax;
        if (Math.abs(j11) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j11 * f3) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }
}
