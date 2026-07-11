package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzhal extends zzgzv {
    final /* synthetic */ zzhan zza;
    private final zzgyv zzb;

    @Override // com.google.android.gms.internal.ads.zzgzv
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgyv zzgyvVar = this.zzb;
        com.google.common.util.concurrent.Xo xoZza = zzgyvVar.zza();
        zzgrc.zzl(xoZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgyvVar);
        return xoZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((com.google.common.util.concurrent.Xo) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final void zzg(Throwable th) {
        this.zza.zzb(th);
    }

    zzhal(zzhan zzhanVar, zzgyv zzgyvVar) {
        Objects.requireNonNull(zzhanVar);
        this.zza = zzhanVar;
        this.zzb = zzgyvVar;
    }
}
