package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgza extends zzgzb {
    final /* synthetic */ zzgzc zza;
    private final Callable zzc;

    @Override // com.google.android.gms.internal.ads.zzgzv
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final String zzc() {
        return this.zzc.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgza(zzgzc zzgzcVar, Callable callable, Executor executor) {
        super(zzgzcVar, executor);
        Objects.requireNonNull(zzgzcVar);
        this.zza = zzgzcVar;
        this.zzc = callable;
    }
}
