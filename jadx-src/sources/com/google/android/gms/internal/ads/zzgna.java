package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgna implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgna(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgna zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgna(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgmz((zzgnq) this.zza.zzb(), ((zziks) this.zzb).zzb());
    }
}
