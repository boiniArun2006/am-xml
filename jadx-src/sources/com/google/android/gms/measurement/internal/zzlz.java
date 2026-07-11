package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzlz implements Runnable {
    final /* synthetic */ zzma zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzx(null);
    }

    zzlz(zzma zzmaVar) {
        Objects.requireNonNull(zzmaVar);
        this.zza = zzmaVar;
    }
}
