package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzaqo implements zzafy {
    private final zzaql zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    private final long zzd(long j2) {
        return zzfj.zzt(j2 * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        long j3 = this.zzb;
        zzaql zzaqlVar = this.zza;
        long j4 = (((long) zzaqlVar.zzc) * j2) / (j3 * 1000000);
        String str = zzfj.zza;
        long j5 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j4, j5));
        long j6 = zzaqlVar.zzd;
        long jZzd = zzd(jMax);
        long j7 = this.zzc;
        zzafz zzafzVar = new zzafz(jZzd, (jMax * j6) + j7);
        if (jZzd >= j2 || jMax == j5) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j9 = jMax + 1;
        return new zzafw(zzafzVar, new zzafz(zzd(j9), j7 + (j6 * j9)));
    }

    public zzaqo(zzaql zzaqlVar, int i2, long j2, long j3) {
        this.zza = zzaqlVar;
        this.zzb = i2;
        this.zzc = j2;
        long j4 = (j3 - j2) / ((long) zzaqlVar.zzd);
        this.zzd = j4;
        this.zze = zzd(j4);
    }
}
