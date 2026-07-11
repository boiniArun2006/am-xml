package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzehq implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzehq(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzehq zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzehq(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzehp(((zzeib) this.zza).zzb(), ((zzcmd) this.zzb).zzb());
    }
}
