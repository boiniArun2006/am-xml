package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaea implements zzafy {
    private final zzaed zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaea(zzaed zzaedVar, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.zza = zzaedVar;
        this.zzb = j2;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = j6;
        this.zzf = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zze;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        zzafz zzafzVar = new zzafz(j2, zzaec.zza(this.zza.zza(j2), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzafw(zzafzVar, zzafzVar);
    }

    public final long zzd(long j2) {
        return this.zza.zza(j2);
    }
}
