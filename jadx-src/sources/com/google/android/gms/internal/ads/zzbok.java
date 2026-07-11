package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbok {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized void zza(boolean z2) {
        this.zza = z2;
        this.zzd.set(true);
    }

    public final synchronized void zzb(boolean z2, float f3) {
        this.zzb = z2;
        this.zzc = f3;
    }

    public final synchronized boolean zzc(boolean z2) {
        if (!this.zzd.get()) {
            return z2;
        }
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized float zze() {
        return this.zzc;
    }
}
