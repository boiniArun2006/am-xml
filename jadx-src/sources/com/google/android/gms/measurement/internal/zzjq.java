package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzjq implements zzgl {
    final /* synthetic */ zzib zza;

    zzjq(zzjr zzjrVar, zzib zzibVar) {
        this.zza = zzibVar;
        Objects.requireNonNull(zzjrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final boolean zza() {
        return Log.isLoggable(this.zza.zzaV().zzn(), 3);
    }
}
