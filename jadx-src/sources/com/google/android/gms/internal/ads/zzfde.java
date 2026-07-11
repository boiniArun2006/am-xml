package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfde implements zzikg {
    private final zzfdc zza;

    private zzfde(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfde zzc(zzfdc zzfdcVar) {
        return new zzfde(zzfdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzf());
    }
}
