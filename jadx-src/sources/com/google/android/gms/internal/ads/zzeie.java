package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeie implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeie(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzeie zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeie(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeid zzb() {
        return new zzeid((zzehr) this.zza.zzb(), ((zzehw) this.zzb).zzb());
    }
}
