package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfdd implements zzikg {
    private final zzfdc zza;

    private zzfdd(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdd zzc(zzfdc zzfdcVar) {
        return new zzfdd(zzfdcVar);
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static String zzd(zzfdc zzfdcVar) {
        String strZza = zzfdcVar.zza();
        zziko.zzb(strZza);
        return strZza;
    }
}
