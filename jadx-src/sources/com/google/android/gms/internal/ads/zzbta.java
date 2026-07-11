package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbta implements zzcer {
    final /* synthetic */ zzbsf zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcen zzc;
    final /* synthetic */ zzbtd zzd;

    zzbta(zzbtd zzbtdVar, zzbsf zzbsfVar, Object obj, zzcen zzcenVar) {
        this.zza = zzbsfVar;
        this.zzb = obj;
        this.zzc = zzcenVar;
        Objects.requireNonNull(zzbtdVar);
        this.zzd = zzbtdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcen zzcenVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbsm) obj, obj2, zzcenVar);
    }
}
