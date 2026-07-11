package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.Constants;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdui implements zzikg {
    private final zzikp zza;

    private zzdui(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdui zza(zzikp zzikpVar) {
        return new zzdui(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdaw) this.zza).zza().zzp.zza == 3 ? "rewarded_interstitial" : Constants.PLACEMENT_TYPE_REWARDED;
    }
}
