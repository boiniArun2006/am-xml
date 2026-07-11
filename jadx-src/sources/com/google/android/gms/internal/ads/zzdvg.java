package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdvg implements zzikg {
    private final zzikp zza;

    private zzdvg(zzdvf zzdvfVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdvg zza(zzdvf zzdvfVar, zzikp zzikpVar) {
        return new zzdvg(zzdvfVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje(((zzdve) this.zza).zzb(), zzcei.zzf);
    }
}
