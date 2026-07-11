package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzezh implements zzikg {
    private final zzikp zza;

    private zzezh(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzezh zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzezh(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezf zzb() {
        return new zzezf(zzfmk.zzc(), (zzdzc) this.zza.zzb());
    }
}
