package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzftb implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzftc zzb;

    zzftb(zzftc zzftcVar, float f3) {
        this.zza = f3;
        Objects.requireNonNull(zzftcVar);
        this.zzb = zzftcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
