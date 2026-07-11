package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzalj implements zzalp {
    private final zzafh zza;
    private final zzafg zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzalj(zzafh zzafhVar, zzafg zzafgVar) {
        this.zza = zzafhVar;
        this.zzb = zzafgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zza(zzaev zzaevVar) {
        long j2 = this.zzd;
        if (j2 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j2 + 2);
    }

    public final void zzd(long j2) {
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzb(long j2) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfj.zzm(jArr, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzafy zzc() {
        zzgrc.zzi(this.zzc != -1);
        return new zzaff(this.zza, this.zzc);
    }
}
