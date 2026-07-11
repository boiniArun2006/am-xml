package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdzp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdzp(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdzp zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdzp(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdzo((zzdzr) this.zza.zzb(), ((zzdzn) this.zzb).zzb());
    }
}
