package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzehf implements zzikg {
    private final zzikp zza;

    private zzehf(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzehf zzc(zzikp zzikpVar) {
        return new zzehf(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehe zzb() {
        return new zzehe(((zzcni) this.zza).zzb());
    }
}
