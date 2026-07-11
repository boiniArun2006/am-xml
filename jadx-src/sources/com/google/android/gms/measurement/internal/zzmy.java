package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmy implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzne zzb;

    zzmy(zzne zzneVar, ComponentName componentName) {
        this.zza = componentName;
        Objects.requireNonNull(zzneVar);
        this.zzb = zzneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzW(this.zza);
    }
}
