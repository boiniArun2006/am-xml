package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfdg implements zzikg {
    private final zzfdc zza;

    private zzfdg(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdg zzc(zzfdc zzfdcVar) {
        return new zzfdg(zzfdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzg());
    }

    public static boolean zzd(zzfdc zzfdcVar) {
        return zzfdcVar.zzg();
    }
}
