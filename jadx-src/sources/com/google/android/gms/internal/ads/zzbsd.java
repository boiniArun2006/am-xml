package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbsd implements zzcer {
    final /* synthetic */ zzbsf zza;

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb().zzb();
    }

    zzbsd(zzbsf zzbsfVar) {
        Objects.requireNonNull(zzbsfVar);
        this.zza = zzbsfVar;
    }
}
