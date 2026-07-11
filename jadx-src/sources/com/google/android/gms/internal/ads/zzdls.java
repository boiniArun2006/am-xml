package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdls implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdls(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdls zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdls(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlr((zzddq) this.zza.zzb(), (zzdiy) this.zzb.zzb());
    }
}
