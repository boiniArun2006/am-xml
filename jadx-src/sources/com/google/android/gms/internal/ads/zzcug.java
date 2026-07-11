package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcug implements zzikg {
    private final zzcue zza;

    private zzcug(zzcue zzcueVar) {
        this.zza = zzcueVar;
    }

    public static zzcug zzc(zzcue zzcueVar) {
        return new zzcug(zzcueVar);
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static View zzd(zzcue zzcueVar) {
        View viewZzb = zzcueVar.zzb();
        zziko.zzb(viewZzb);
        return viewZzb;
    }
}
