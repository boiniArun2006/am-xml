package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzeva implements zzikg {
    private final zzikp zza;

    private zzeva(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzeva zzc(zzikp zzikpVar) {
        return new zzeva(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeuy zzb() {
        return new zzeuy(((zzdaw) this.zza).zza());
    }
}
