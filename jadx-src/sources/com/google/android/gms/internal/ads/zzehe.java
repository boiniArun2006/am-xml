package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzehe {
    private final zzbzn zza;

    zzehe(zzbzn zzbznVar) {
        this.zza = zzbznVar;
    }

    public final void zza() {
        com.google.common.util.concurrent.Xo xoZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
            zzcel.zzb(xoZza, "persistFlags");
        } else {
            zzcel.zza(xoZza, "persistFlags");
        }
    }
}
