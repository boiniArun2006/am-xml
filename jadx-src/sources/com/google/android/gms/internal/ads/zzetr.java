package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzetr {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzetq zzb;

    final void zzc(zzetq zzetqVar) {
        this.zzb = zzetqVar;
    }

    @Nullable
    final zzetq zzd() {
        return this.zzb;
    }

    public final void zza(boolean z2) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }
}
