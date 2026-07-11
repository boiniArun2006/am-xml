package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzaby implements zzadp {
    final /* synthetic */ zzuk zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzacc zzd;

    zzaby(zzacc zzaccVar, zzuk zzukVar, int i2, long j2) {
        this.zza = zzukVar;
        this.zzb = i2;
        this.zzc = j2;
        Objects.requireNonNull(zzaccVar);
        this.zzd = zzaccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zza(long j2) {
        this.zzd.zzay(this.zza, this.zzb, this.zzc, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzb() {
        this.zzd.zzav(this.zza, this.zzb, this.zzc);
    }
}
