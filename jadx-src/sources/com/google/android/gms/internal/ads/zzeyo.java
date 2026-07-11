package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzeyo implements zzikg {
    private final zzikp zza;

    private zzeyo(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzeyo zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeyo(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeym zzb() {
        return new zzeym(zzfmk.zzc(), (zzebf) this.zza.zzb());
    }
}
