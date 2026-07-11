package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzduh implements zzikg {
    private final zzikp zza;

    private zzduh(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzduh zza(zzikp zzikpVar) {
        return new zzduh(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbgj.zza.EnumC0774zza enumC0774zza = ((zzdaw) this.zza).zza().zzp.zza == 3 ? zzbgj.zza.EnumC0774zza.REWARDED_INTERSTITIAL : zzbgj.zza.EnumC0774zza.REWARD_BASED_VIDEO_AD;
        zziko.zzb(enumC0774zza);
        return enumC0774zza;
    }
}
