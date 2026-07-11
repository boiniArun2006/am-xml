package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzffp implements zzflt {
    public final zzfgi zza;
    public final zzfgk zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzx zzf;
    public final zzflj zzg;

    public zzffp(zzfgi zzfgiVar, zzfgk zzfgkVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzflj zzfljVar) {
        this.zza = zzfgiVar;
        this.zzb = zzfgkVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzxVar;
        this.zzg = zzfljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflt
    public final Executor zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzflt
    public final zzflj zzb() {
        return this.zzg;
    }
}
