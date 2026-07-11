package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzic implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzjc zzb;

    zzic(zzjc zzjcVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzjcVar);
        this.zzb = zzjcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjc zzjcVar = this.zzb;
        zzjcVar.zzL().zzY();
        return zzjcVar.zzL().zzj().zzn(this.zza);
    }
}
