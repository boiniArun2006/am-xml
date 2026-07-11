package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcdq extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcdu zza;

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcdu zzcduVar = this.zza;
        zzbhh zzbhhVar = new zzbhh(zzcduVar.zzz(), zzcduVar.zzA().afmaVersion);
        synchronized (zzcduVar.zzy()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbhk.zza(zzcduVar.zzB(), zzbhhVar);
            } catch (IllegalArgumentException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e2);
            }
        }
    }

    zzcdq(zzcdu zzcduVar) {
        Objects.requireNonNull(zzcduVar);
        this.zza = zzcduVar;
    }
}
