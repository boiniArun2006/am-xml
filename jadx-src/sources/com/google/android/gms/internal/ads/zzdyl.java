package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdyl implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdyl(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdyl zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdyl(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdyk((String) this.zza.zzb(), (zzdye) this.zzb.zzb());
    }
}
