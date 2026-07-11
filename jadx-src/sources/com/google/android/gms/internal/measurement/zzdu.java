package com.google.android.gms.internal.measurement;

import androidx.annotation.BinderThread;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzdu extends zzcw {
    final /* synthetic */ Runnable zza;

    zzdu(zzdv zzdvVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzdvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcx
    @BinderThread
    public final void zze() {
        this.zza.run();
    }
}
