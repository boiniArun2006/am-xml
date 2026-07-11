package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzic {
    private int zza;

    @CallSuper
    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzi(4);
    }

    public final boolean zzc() {
        return zzi(1);
    }

    public final boolean zzd() {
        return zzi(536870912);
    }

    public final boolean zze() {
        return zzi(268435456);
    }

    public final boolean zzf() {
        return zzi(androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON);
    }

    public final void zzg(int i2) {
        this.zza = i2;
    }

    public final void zzh(int i2) {
        this.zza |= 536870912;
    }

    protected final boolean zzi(int i2) {
        return (this.zza & i2) == i2;
    }
}
