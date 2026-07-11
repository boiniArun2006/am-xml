package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeex implements zzikg {
    private final zzikp zza;

    private zzeex(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzeex zzc(zzikp zzikpVar) {
        return new zzeex(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeew zzb() {
        return new zzeew(((zzcmj) this.zza).zza());
    }
}
