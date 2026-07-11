package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzou implements Runnable {
    final /* synthetic */ zzpg zza;
    final /* synthetic */ zzpf zzb;

    zzou(zzpf zzpfVar, zzpg zzpgVar) {
        this.zza = zzpgVar;
        Objects.requireNonNull(zzpfVar);
        this.zzb = zzpfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpf zzpfVar = this.zzb;
        zzpfVar.zzat(this.zza);
        zzpfVar.zzc();
    }
}
