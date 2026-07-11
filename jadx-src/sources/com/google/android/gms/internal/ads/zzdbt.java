package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdbt implements zzikg {
    private final zzikp zza;

    private zzdbt(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdbt zzc(zzikp zzikpVar) {
        return new zzdbt(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdbo zzb() {
        return new zzdbo(((zziks) this.zza).zzb());
    }
}
