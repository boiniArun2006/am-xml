package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgod implements zzgzl {
    final /* synthetic */ zzgoc zza;

    zzgod(zzgoe zzgoeVar, zzgoc zzgocVar) {
        this.zza = zzgocVar;
        Objects.requireNonNull(zzgoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzgoc zzgocVar = this.zza;
        zzgocVar.zzb(th);
        zzgocVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
