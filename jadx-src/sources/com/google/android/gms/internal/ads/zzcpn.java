package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcpn implements zzikg {
    private final zzikp zza;

    private zzcpn(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcpn zza(zzikp zzikpVar) {
        return new zzcpn(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfvr(((zzcmj) this.zza).zza(), com.google.android.gms.ads.internal.zzt.zzs().zza());
    }
}
