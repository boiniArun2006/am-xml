package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfkt implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzfkt(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzfkt zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfkt(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfks(((zzcmj) this.zza).zza(), ((zzcnd) this.zzb).zzb());
    }
}
