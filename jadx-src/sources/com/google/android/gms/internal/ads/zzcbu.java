package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcbu implements zzgzl {
    final /* synthetic */ com.google.common.util.concurrent.Xo zza;

    zzcbu(zzcbz zzcbzVar, com.google.common.util.concurrent.Xo xo) {
        this.zza = xo;
        Objects.requireNonNull(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcbz.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzcbz.zzc.remove(this.zza);
    }
}
