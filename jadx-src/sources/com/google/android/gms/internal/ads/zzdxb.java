package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdxb implements zzfnv {
    private final Map zza;
    private final zzbgd zzb;

    zzdxb(zzbgd zzbgdVar, Map map) {
        this.zza = map;
        this.zzb = zzbgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdK(zzfno zzfnoVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdL(zzfno zzfnoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            this.zzb.zzc(((zzdxa) map.get(zzfnoVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            this.zzb.zzc(((zzdxa) map.get(zzfnoVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdN(zzfno zzfnoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            this.zzb.zzc(((zzdxa) map.get(zzfnoVar)).zzb);
        }
    }
}
