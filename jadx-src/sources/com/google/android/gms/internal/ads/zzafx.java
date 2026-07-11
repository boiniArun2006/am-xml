package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class zzafx implements zzafy {
    private final long zza;
    private final zzafw zzb;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        return this.zzb;
    }

    public zzafx(long j2, long j3) {
        zzafz zzafzVar;
        this.zza = j2;
        if (j3 == 0) {
            zzafzVar = zzafz.zza;
        } else {
            zzafzVar = new zzafz(0L, j3);
        }
        this.zzb = new zzafw(zzafzVar, zzafzVar);
    }
}
