package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfng implements zzgzl {
    final /* synthetic */ zzfnb zza;
    final /* synthetic */ zzfnl zzb;

    zzfng(zzfnl zzfnlVar, zzfnb zzfnbVar) {
        this.zza = zzfnbVar;
        Objects.requireNonNull(zzfnlVar);
        this.zzb = zzfnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        this.zzb.zza.zzg().zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
