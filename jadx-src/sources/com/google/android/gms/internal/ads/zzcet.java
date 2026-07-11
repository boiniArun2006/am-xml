package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcet implements zzgzl {
    final /* synthetic */ zzcer zza;
    final /* synthetic */ zzcep zzb;

    zzcet(zzceu zzceuVar, zzcer zzcerVar, zzcep zzcepVar) {
        this.zza = zzcerVar;
        this.zzb = zzcepVar;
        Objects.requireNonNull(zzceuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(@Nullable Object obj) {
        this.zza.zza(obj);
    }
}
