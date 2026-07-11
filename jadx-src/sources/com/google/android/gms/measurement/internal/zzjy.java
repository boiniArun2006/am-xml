package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzjy implements Runnable {
    final /* synthetic */ zzli zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zza();
    }

    zzjy(zzli zzliVar) {
        Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }
}
