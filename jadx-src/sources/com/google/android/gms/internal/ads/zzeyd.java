package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzeyd implements zzikg {
    private final zzikp zza;

    private zzeyd(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzeyd zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeyd(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeyb zzb() {
        return new zzeyb(zzfmk.zzc(), ((zzdaw) this.zza).zza());
    }
}
