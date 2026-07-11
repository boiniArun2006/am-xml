package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdhs implements zzikg {
    private final zzdhf zza;

    private zzdhs(zzdhf zzdhfVar) {
        this.zza = zzdhfVar;
    }

    public static zzdhs zza(zzdhf zzdhfVar) {
        return new zzdhs(zzdhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return this.zza.zzm();
    }

    public static Set zzc(zzdhf zzdhfVar) {
        return zzdhfVar.zzm();
    }
}
