package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzajk extends zzaek implements zzajr {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzajk(long j2, long j3, int i2, int i3, boolean z2) {
        super(j2, j3, i2, i3, false);
        this.zza = j3;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2 != -1 ? j2 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zzb;
    }

    public final zzajk zzh(long j2) {
        return new zzajk(j2, this.zza, this.zzb, this.zzc, false);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j2) {
        return zzd(j2);
    }
}
