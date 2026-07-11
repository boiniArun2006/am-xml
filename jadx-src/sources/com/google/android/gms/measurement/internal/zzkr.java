package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzkr implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzli zzb;

    zzkr(zzli zzliVar, Boolean bool) {
        this.zza = bool;
        Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzai(this.zza, true);
    }
}
