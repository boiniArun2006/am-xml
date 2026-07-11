package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaec {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    final /* synthetic */ long zzb() {
        return this.zzf;
    }

    final /* synthetic */ long zzc() {
        return this.zzg;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ long zzh() {
        return this.zzh;
    }

    protected static long zza(long j2, long j3, long j4, long j5, long j6, long j7) {
        if (j5 + 1 >= j6 || 1 + j3 >= j4) {
            return j5;
        }
        long j9 = (long) ((j2 - j3) * ((j6 - j5) / (j4 - j3)));
        String str = zzfj.zza;
        return Math.max(j5, Math.min(((j5 + j9) - j7) - (j9 / 20), j6 - 1));
    }

    private final void zzi() {
        this.zzh = zza(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }

    final /* synthetic */ void zzf(long j2, long j3) {
        this.zzd = j2;
        this.zzf = j3;
        zzi();
    }

    final /* synthetic */ void zzg(long j2, long j3) {
        this.zze = j2;
        this.zzg = j3;
        zzi();
    }

    protected zzaec(long j2, long j3, long j4, long j5, long j6, long j7, long j9) {
        this.zza = j2;
        this.zzb = j3;
        this.zze = j5;
        this.zzf = j6;
        this.zzg = j7;
        this.zzc = j9;
        this.zzh = zza(j3, 0L, j5, j6, j7, j9);
    }
}
