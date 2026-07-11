package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzbr {
    private boolean zza;
    private zzbo zzb;
    private final zzce zzc;
    private zzbu zzd;
    private zzbs zze;

    private zzbr(zzce zzceVar) {
        this.zzb = zzbo.zza;
        this.zzd = null;
        this.zze = null;
        this.zzc = zzceVar;
    }

    public final zzbr zzb() {
        this.zzd = zzbu.zza;
        return this;
    }

    public final zzbr zza() {
        zzbs zzbsVar = this.zze;
        if (zzbsVar != null) {
            zzbsVar.zzb();
        }
        this.zza = true;
        return this;
    }
}
