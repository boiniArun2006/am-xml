package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdoo implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdoo(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdoo zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdoo(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdol(((zzcww) this.zza).zza(), ((zzdnf) this.zzb).zza());
    }
}
