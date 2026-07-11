package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zznn implements Runnable {
    final /* synthetic */ zzpf zza;
    final /* synthetic */ Runnable zzb;

    zznn(zzns zznsVar, zzpf zzpfVar, Runnable runnable) {
        this.zza = zzpfVar;
        this.zzb = runnable;
        Objects.requireNonNull(zznsVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzX(this.zzb);
        zzpfVar.zzM();
    }
}
