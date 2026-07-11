package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdek implements zzikg {
    private final zzikp zza;

    private zzdek(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdek zzc(zzikp zzikpVar) {
        return new zzdek(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdej zzb() {
        return new zzdej(((zziks) this.zza).zzb());
    }
}
