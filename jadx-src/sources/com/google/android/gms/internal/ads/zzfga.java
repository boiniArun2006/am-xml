package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfga implements zzfgj {
    private final zzfgj zza;

    @Nullable
    private zzdam zzb;

    public zzfga(zzfgj zzfgjVar) {
        this.zza = zzfgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    @Nullable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zzb;
    }

    public final synchronized com.google.common.util.concurrent.Xo zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, @Nullable zzdam zzdamVar) {
        zzbzu zzbzuVar;
        this.zzb = zzdamVar;
        if (zzdamVar == null || (zzbzuVar = zzfgkVar.zza) == null) {
            return ((zzffz) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar);
        }
        zzcxj zzcxjVarZza = zzdamVar.zza();
        return zzcxjVarZza.zzc(zzcxjVarZza.zza(zzgzo.zza(zzbzuVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.Xo zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, @Nullable Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }
}
