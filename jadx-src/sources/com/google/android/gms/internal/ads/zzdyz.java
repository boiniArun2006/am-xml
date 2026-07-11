package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdyz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdyz(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdyz zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdyz(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdyy((zzdym) this.zza.zzb(), (zzcma) this.zzb.zzb());
    }
}
