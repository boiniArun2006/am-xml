package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzna implements Runnable {
    final /* synthetic */ zzne zza;

    @Override // java.lang.Runnable
    public final void run() {
        zznk zznkVar = this.zza.zza;
        zzib zzibVar = zznkVar.zzu;
        Context contextZzaY = zzibVar.zzaY();
        zzibVar.zzaU();
        zznkVar.zzW(new ComponentName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementService"));
    }

    zzna(zzne zzneVar) {
        Objects.requireNonNull(zzneVar);
        this.zza = zzneVar;
    }
}
