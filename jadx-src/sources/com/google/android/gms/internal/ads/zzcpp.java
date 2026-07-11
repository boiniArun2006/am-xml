package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcpp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcpp(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcpp zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcpp(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.util.client.zzu(((zzcmj) this.zza).zza(), (String) this.zzb.zzb());
    }
}
