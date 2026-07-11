package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzit implements Runnable {
    final /* synthetic */ zzpk zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ zzjc zzc;

    zzit(zzjc zzjcVar, zzpk zzpkVar, zzr zzrVar) {
        this.zza = zzpkVar;
        this.zzb = zzrVar;
        Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjc zzjcVar = this.zzc;
        zzjcVar.zzL().zzY();
        zzpk zzpkVar = this.zza;
        if (zzpkVar.zza() != null) {
            zzjcVar.zzL().zzab(zzpkVar, this.zzb);
        } else {
            zzr zzrVar = this.zzb;
            zzjcVar.zzL().zzac(zzpkVar.zzb, zzrVar);
        }
    }
}
