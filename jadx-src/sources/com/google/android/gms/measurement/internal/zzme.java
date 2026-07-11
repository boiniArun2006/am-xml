package com.google.android.gms.measurement.internal;

import androidx.annotation.BinderThread;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzme extends zzgf {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zznk zzb;

    zzme(zznk zznkVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(zznkVar);
        this.zzb = zznkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgg
    @BinderThread
    public final void zze(zzop zzopVar) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            this.zzb.zzu.zzaV().zzk().zzb("[sgtm] Got upload batches from service. count", Integer.valueOf(zzopVar.zza.size()));
            atomicReference.set(zzopVar);
            atomicReference.notifyAll();
        }
    }
}
