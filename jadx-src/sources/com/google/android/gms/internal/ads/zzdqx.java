package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdqx implements zzgzl {
    final /* synthetic */ zzdxh zza;
    final /* synthetic */ zzdra zzb;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    zzdqx(zzdra zzdraVar, zzdxh zzdxhVar) {
        this.zza = zzdxhVar;
        Objects.requireNonNull(zzdraVar);
        this.zzb = zzdraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zzb.zzd().zze().putLong(this.zza.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
    }
}
