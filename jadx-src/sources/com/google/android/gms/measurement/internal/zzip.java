package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzip implements Callable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzjc zzb;

    zzip(zzjc zzjcVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zzjcVar);
        this.zzb = zzjcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjc zzjcVar = this.zzb;
        zzjcVar.zzL().zzY();
        return new zzao(zzjcVar.zzL().zzy(this.zza.zza));
    }
}
