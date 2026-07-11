package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdat implements zzikg {
    private final zzikp zza;

    private zzdat(zzdao zzdaoVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdat zzc(zzdao zzdaoVar, zzikp zzikpVar) {
        return new zzdat(zzdaoVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String strZzp = ((zzcxv) this.zza.zzb()).zzp();
        zziko.zzb(strZzp);
        return strZzp;
    }
}
