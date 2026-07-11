package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdvq implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdvq(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdvq zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdvq(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvp(((zzcpu) this.zza).zzb(), (zzdvm) this.zzb.zzb());
    }
}
